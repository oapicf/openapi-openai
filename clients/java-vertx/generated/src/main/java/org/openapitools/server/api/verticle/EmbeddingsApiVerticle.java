package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CreateEmbeddingRequest;
import org.openapitools.server.api.model.CreateEmbeddingResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class EmbeddingsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(EmbeddingsApiVerticle.class);

    static final String CREATEEMBEDDING_SERVICE_ID = "createEmbedding";
    
    final EmbeddingsApi service;

    public EmbeddingsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.EmbeddingsApiImpl");
            service = (EmbeddingsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("EmbeddingsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for createEmbedding
        vertx.eventBus().<JsonObject> consumer(CREATEEMBEDDING_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createEmbedding";
                JsonObject createEmbeddingRequestParam = message.body().getJsonObject("CreateEmbeddingRequest");
                if (createEmbeddingRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateEmbeddingRequest is required"), serviceId);
                    return;
                }
                CreateEmbeddingRequest createEmbeddingRequest = Json.mapper.readValue(createEmbeddingRequestParam.encode(), CreateEmbeddingRequest.class);
                service.createEmbedding(createEmbeddingRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createEmbedding");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createEmbedding", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
