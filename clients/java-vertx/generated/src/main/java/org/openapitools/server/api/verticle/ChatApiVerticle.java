package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CreateChatCompletionRequest;
import org.openapitools.server.api.model.CreateChatCompletionResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class ChatApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ChatApiVerticle.class);

    static final String CREATECHATCOMPLETION_SERVICE_ID = "createChatCompletion";
    
    final ChatApi service;

    public ChatApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ChatApiImpl");
            service = (ChatApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ChatApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for createChatCompletion
        vertx.eventBus().<JsonObject> consumer(CREATECHATCOMPLETION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createChatCompletion";
                JsonObject createChatCompletionRequestParam = message.body().getJsonObject("CreateChatCompletionRequest");
                if (createChatCompletionRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateChatCompletionRequest is required"), serviceId);
                    return;
                }
                CreateChatCompletionRequest createChatCompletionRequest = Json.mapper.readValue(createChatCompletionRequestParam.encode(), CreateChatCompletionRequest.class);
                service.createChatCompletion(createChatCompletionRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createChatCompletion");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createChatCompletion", e);
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
