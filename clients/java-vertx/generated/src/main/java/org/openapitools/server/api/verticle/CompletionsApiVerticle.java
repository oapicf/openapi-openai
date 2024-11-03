package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CreateCompletionRequest;
import org.openapitools.server.api.model.CreateCompletionResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class CompletionsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(CompletionsApiVerticle.class);

    static final String CREATECOMPLETION_SERVICE_ID = "createCompletion";
    
    final CompletionsApi service;

    public CompletionsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.CompletionsApiImpl");
            service = (CompletionsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("CompletionsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for createCompletion
        vertx.eventBus().<JsonObject> consumer(CREATECOMPLETION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createCompletion";
                JsonObject createCompletionRequestParam = message.body().getJsonObject("CreateCompletionRequest");
                if (createCompletionRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateCompletionRequest is required"), serviceId);
                    return;
                }
                CreateCompletionRequest createCompletionRequest = Json.mapper.readValue(createCompletionRequestParam.encode(), CreateCompletionRequest.class);
                service.createCompletion(createCompletionRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createCompletion");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createCompletion", e);
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
