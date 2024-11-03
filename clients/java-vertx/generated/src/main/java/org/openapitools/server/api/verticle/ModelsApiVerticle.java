package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.DeleteModelResponse;
import org.openapitools.server.api.model.ListModelsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Model;

import java.util.List;
import java.util.Map;

public class ModelsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ModelsApiVerticle.class);

    static final String DELETEMODEL_SERVICE_ID = "deleteModel";
    static final String LISTMODELS_SERVICE_ID = "listModels";
    static final String RETRIEVEMODEL_SERVICE_ID = "retrieveModel";
    
    final ModelsApi service;

    public ModelsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ModelsApiImpl");
            service = (ModelsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ModelsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for deleteModel
        vertx.eventBus().<JsonObject> consumer(DELETEMODEL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteModel";
                String modelParam = message.body().getString("model");
                if(modelParam == null) {
                    manageError(message, new MainApiException(400, "model is required"), serviceId);
                    return;
                }
                String model = modelParam;
                service.deleteModel(model, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteModel");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteModel", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listModels
        vertx.eventBus().<JsonObject> consumer(LISTMODELS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listModels";
                service.listModels(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listModels");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listModels", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for retrieveModel
        vertx.eventBus().<JsonObject> consumer(RETRIEVEMODEL_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "retrieveModel";
                String modelParam = message.body().getString("model");
                if(modelParam == null) {
                    manageError(message, new MainApiException(400, "model is required"), serviceId);
                    return;
                }
                String model = modelParam;
                service.retrieveModel(model, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "retrieveModel");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("retrieveModel", e);
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
