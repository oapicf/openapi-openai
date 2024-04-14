package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.CreateImageEditRequestModel;
import org.openapitools.server.api.model.CreateImageRequest;
import java.io.File;
import org.openapitools.server.api.model.ImagesResponse;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class ImagesApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(ImagesApiVerticle.class);

    static final String CREATEIMAGE_SERVICE_ID = "createImage";
    static final String CREATEIMAGEEDIT_SERVICE_ID = "createImageEdit";
    static final String CREATEIMAGEVARIATION_SERVICE_ID = "createImageVariation";
    
    final ImagesApi service;

    public ImagesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.ImagesApiImpl");
            service = (ImagesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("ImagesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for createImage
        vertx.eventBus().<JsonObject> consumer(CREATEIMAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createImage";
                JsonObject createImageRequestParam = message.body().getJsonObject("CreateImageRequest");
                if (createImageRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateImageRequest is required"), serviceId);
                    return;
                }
                CreateImageRequest createImageRequest = Json.mapper.readValue(createImageRequestParam.encode(), CreateImageRequest.class);
                service.createImage(createImageRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createImage");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createImage", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createImageEdit
        vertx.eventBus().<JsonObject> consumer(CREATEIMAGEEDIT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createImageEdit";
                String imageParam = message.body().getString("image");
                if(imageParam == null) {
                    manageError(message, new MainApiException(400, "image is required"), serviceId);
                    return;
                }
                File image = Json.mapper.readValue(imageParam, File.class);
                String promptParam = message.body().getString("prompt");
                if(promptParam == null) {
                    manageError(message, new MainApiException(400, "prompt is required"), serviceId);
                    return;
                }
                String prompt = promptParam;
                String maskParam = message.body().getString("mask");
                File mask = (maskParam == null) ? null : Json.mapper.readValue(maskParam, File.class);
                JsonObject modelParam = message.body().getJsonObject("model");
                if (modelParam == null) {
                    manageError(message, new MainApiException(400, "model is required"), serviceId);
                    return;
                }
                CreateImageEditRequestModel model = Json.mapper.readValue(modelParam.encode(), CreateImageEditRequestModel.class);
                String nParam = message.body().getString("n");
                Integer n = (nParam == null) ? 1 : Json.mapper.readValue(nParam, Integer.class);
                String sizeParam = message.body().getString("size");
                String size = (sizeParam == null) ? "1024x1024" : sizeParam;
                String responseFormatParam = message.body().getString("response_format");
                String responseFormat = (responseFormatParam == null) ? "url" : responseFormatParam;
                String userParam = message.body().getString("user");
                String user = (userParam == null) ? null : userParam;
                service.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createImageEdit");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createImageEdit", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createImageVariation
        vertx.eventBus().<JsonObject> consumer(CREATEIMAGEVARIATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createImageVariation";
                String imageParam = message.body().getString("image");
                if(imageParam == null) {
                    manageError(message, new MainApiException(400, "image is required"), serviceId);
                    return;
                }
                File image = Json.mapper.readValue(imageParam, File.class);
                JsonObject modelParam = message.body().getJsonObject("model");
                if (modelParam == null) {
                    manageError(message, new MainApiException(400, "model is required"), serviceId);
                    return;
                }
                CreateImageEditRequestModel model = Json.mapper.readValue(modelParam.encode(), CreateImageEditRequestModel.class);
                String nParam = message.body().getString("n");
                Integer n = (nParam == null) ? 1 : Json.mapper.readValue(nParam, Integer.class);
                String responseFormatParam = message.body().getString("response_format");
                String responseFormat = (responseFormatParam == null) ? "url" : responseFormatParam;
                String sizeParam = message.body().getString("size");
                String size = (sizeParam == null) ? "1024x1024" : sizeParam;
                String userParam = message.body().getString("user");
                String user = (userParam == null) ? null : userParam;
                service.createImageVariation(image, model, n, responseFormat, size, user, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createImageVariation");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createImageVariation", e);
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
