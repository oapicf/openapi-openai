package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import java.math.BigDecimal;
import org.openapitools.server.api.model.CreateSpeechRequest;
import org.openapitools.server.api.model.CreateTranscription200Response;
import org.openapitools.server.api.model.CreateTranscriptionRequestModel;
import org.openapitools.server.api.model.CreateTranslation200Response;
import java.io.File;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class AudioApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AudioApiVerticle.class);

    static final String CREATESPEECH_SERVICE_ID = "createSpeech";
    static final String CREATETRANSCRIPTION_SERVICE_ID = "createTranscription";
    static final String CREATETRANSLATION_SERVICE_ID = "createTranslation";
    
    final AudioApi service;

    public AudioApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AudioApiImpl");
            service = (AudioApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AudioApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for createSpeech
        vertx.eventBus().<JsonObject> consumer(CREATESPEECH_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createSpeech";
                JsonObject createSpeechRequestParam = message.body().getJsonObject("CreateSpeechRequest");
                if (createSpeechRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateSpeechRequest is required"), serviceId);
                    return;
                }
                CreateSpeechRequest createSpeechRequest = Json.mapper.readValue(createSpeechRequestParam.encode(), CreateSpeechRequest.class);
                service.createSpeech(createSpeechRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createSpeech");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createSpeech", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createTranscription
        vertx.eventBus().<JsonObject> consumer(CREATETRANSCRIPTION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createTranscription";
                String _fileParam = message.body().getString("file");
                if(_fileParam == null) {
                    manageError(message, new MainApiException(400, "file is required"), serviceId);
                    return;
                }
                File _file = Json.mapper.readValue(_fileParam, File.class);
                JsonObject modelParam = message.body().getJsonObject("model");
                if (modelParam == null) {
                    manageError(message, new MainApiException(400, "model is required"), serviceId);
                    return;
                }
                CreateTranscriptionRequestModel model = Json.mapper.readValue(modelParam.encode(), CreateTranscriptionRequestModel.class);
                String languageParam = message.body().getString("language");
                String language = (languageParam == null) ? null : languageParam;
                String promptParam = message.body().getString("prompt");
                String prompt = (promptParam == null) ? null : promptParam;
                String responseFormatParam = message.body().getString("response_format");
                String responseFormat = (responseFormatParam == null) ? "json" : responseFormatParam;
                String temperatureParam = message.body().getString("temperature");
                BigDecimal temperature = (temperatureParam == null) ? 0 : Json.mapper.readValue(temperatureParam, BigDecimal.class);
                JsonArray timestampGranularitiesParam = message.body().getJsonArray("timestamp_granularities[]");
                List<String> timestampGranularities = (timestampGranularitiesParam == null) ? null : Json.mapper.readValue(timestampGranularitiesParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, String.class));
                service.createTranscription(_file, model, language, prompt, responseFormat, temperature, timestampGranularities, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createTranscription");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createTranscription", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createTranslation
        vertx.eventBus().<JsonObject> consumer(CREATETRANSLATION_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createTranslation";
                String _fileParam = message.body().getString("file");
                if(_fileParam == null) {
                    manageError(message, new MainApiException(400, "file is required"), serviceId);
                    return;
                }
                File _file = Json.mapper.readValue(_fileParam, File.class);
                JsonObject modelParam = message.body().getJsonObject("model");
                if (modelParam == null) {
                    manageError(message, new MainApiException(400, "model is required"), serviceId);
                    return;
                }
                CreateTranscriptionRequestModel model = Json.mapper.readValue(modelParam.encode(), CreateTranscriptionRequestModel.class);
                String promptParam = message.body().getString("prompt");
                String prompt = (promptParam == null) ? null : promptParam;
                String responseFormatParam = message.body().getString("response_format");
                String responseFormat = (responseFormatParam == null) ? json : responseFormatParam;
                String temperatureParam = message.body().getString("temperature");
                BigDecimal temperature = (temperatureParam == null) ? 0 : Json.mapper.readValue(temperatureParam, BigDecimal.class);
                service.createTranslation(_file, model, prompt, responseFormat, temperature, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createTranslation");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createTranslation", e);
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
