package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CreateModerationRequest;
import org.openapitools.server.api.model.CreateModerationResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class ModerationsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ModerationsApiVerticle.class);

    static final String CREATEMODERATION_SERVICE_ID = "createModeration";
    
    final ModerationsApi service;

    public ModerationsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ModerationsApiImpl");
            service = (ModerationsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ModerationsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for createModeration
        vertx.eventBus().<JsonObject> consumer(CREATEMODERATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createModeration";
                JsonObject createModerationRequestParam = message.body().getJsonObject("CreateModerationRequest");
                if (createModerationRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateModerationRequest is required"), serviceId);
                    return;
                }
                CreateModerationRequest createModerationRequest = Json.mapper.readValue(createModerationRequestParam.encode(), CreateModerationRequest.class);
                service.createModeration(createModerationRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createModeration");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createModeration", e);
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
