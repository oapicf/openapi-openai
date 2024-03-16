package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import java.math.BigDecimal;
import org.openapitools.server.api.model.CreateChatCompletionRequest;
import org.openapitools.server.api.model.CreateChatCompletionResponse;
import org.openapitools.server.api.model.CreateCompletionRequest;
import org.openapitools.server.api.model.CreateCompletionResponse;
import org.openapitools.server.api.model.CreateEditRequest;
import org.openapitools.server.api.model.CreateEditResponse;
import org.openapitools.server.api.model.CreateEmbeddingRequest;
import org.openapitools.server.api.model.CreateEmbeddingResponse;
import org.openapitools.server.api.model.CreateFineTuneRequest;
import org.openapitools.server.api.model.CreateImageRequest;
import org.openapitools.server.api.model.CreateModerationRequest;
import org.openapitools.server.api.model.CreateModerationResponse;
import org.openapitools.server.api.model.CreateTranscriptionRequestModel;
import org.openapitools.server.api.model.CreateTranscriptionResponse;
import org.openapitools.server.api.model.CreateTranslationResponse;
import org.openapitools.server.api.model.DeleteFileResponse;
import org.openapitools.server.api.model.DeleteModelResponse;
import java.io.File;
import org.openapitools.server.api.model.FineTune;
import org.openapitools.server.api.model.ImagesResponse;
import org.openapitools.server.api.model.ListFilesResponse;
import org.openapitools.server.api.model.ListFineTuneEventsResponse;
import org.openapitools.server.api.model.ListFineTunesResponse;
import org.openapitools.server.api.model.ListModelsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Model;
import org.openapitools.server.api.model.OpenAIFile;

import java.util.List;
import java.util.Map;

public class OpenAiApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(OpenAiApiVerticle.class);

    static final String CANCELFINETUNE_SERVICE_ID = "cancelFineTune";
    static final String CREATECHATCOMPLETION_SERVICE_ID = "createChatCompletion";
    static final String CREATECOMPLETION_SERVICE_ID = "createCompletion";
    static final String CREATEEDIT_SERVICE_ID = "createEdit";
    static final String CREATEEMBEDDING_SERVICE_ID = "createEmbedding";
    static final String CREATEFILE_SERVICE_ID = "createFile";
    static final String CREATEFINETUNE_SERVICE_ID = "createFineTune";
    static final String CREATEIMAGE_SERVICE_ID = "createImage";
    static final String CREATEIMAGEEDIT_SERVICE_ID = "createImageEdit";
    static final String CREATEIMAGEVARIATION_SERVICE_ID = "createImageVariation";
    static final String CREATEMODERATION_SERVICE_ID = "createModeration";
    static final String CREATETRANSCRIPTION_SERVICE_ID = "createTranscription";
    static final String CREATETRANSLATION_SERVICE_ID = "createTranslation";
    static final String DELETEFILE_SERVICE_ID = "deleteFile";
    static final String DELETEMODEL_SERVICE_ID = "deleteModel";
    static final String DOWNLOADFILE_SERVICE_ID = "downloadFile";
    static final String LISTFILES_SERVICE_ID = "listFiles";
    static final String LISTFINETUNEEVENTS_SERVICE_ID = "listFineTuneEvents";
    static final String LISTFINETUNES_SERVICE_ID = "listFineTunes";
    static final String LISTMODELS_SERVICE_ID = "listModels";
    static final String RETRIEVEFILE_SERVICE_ID = "retrieveFile";
    static final String RETRIEVEFINETUNE_SERVICE_ID = "retrieveFineTune";
    static final String RETRIEVEMODEL_SERVICE_ID = "retrieveModel";
    
    final OpenAiApi service;

    public OpenAiApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.OpenAiApiImpl");
            service = (OpenAiApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("OpenAiApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for cancelFineTune
        vertx.eventBus().<JsonObject> consumer(CANCELFINETUNE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "cancelFineTune";
                String fineTuneIdParam = message.body().getString("fine_tune_id");
                if(fineTuneIdParam == null) {
                    manageError(message, new MainApiException(400, "fine_tune_id is required"), serviceId);
                    return;
                }
                String fineTuneId = fineTuneIdParam;
                service.cancelFineTune(fineTuneId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "cancelFineTune");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("cancelFineTune", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
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
        
        //Consumer for createEdit
        vertx.eventBus().<JsonObject> consumer(CREATEEDIT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createEdit";
                JsonObject createEditRequestParam = message.body().getJsonObject("CreateEditRequest");
                if (createEditRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateEditRequest is required"), serviceId);
                    return;
                }
                CreateEditRequest createEditRequest = Json.mapper.readValue(createEditRequestParam.encode(), CreateEditRequest.class);
                service.createEdit(createEditRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createEdit");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createEdit", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
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
        
        //Consumer for createFile
        vertx.eventBus().<JsonObject> consumer(CREATEFILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createFile";
                String _fileParam = message.body().getString("file");
                if(_fileParam == null) {
                    manageError(message, new MainApiException(400, "file is required"), serviceId);
                    return;
                }
                File _file = Json.mapper.readValue(_fileParam, File.class);
                String purposeParam = message.body().getString("purpose");
                if(purposeParam == null) {
                    manageError(message, new MainApiException(400, "purpose is required"), serviceId);
                    return;
                }
                String purpose = purposeParam;
                service.createFile(_file, purpose, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createFile");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createFile", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createFineTune
        vertx.eventBus().<JsonObject> consumer(CREATEFINETUNE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createFineTune";
                JsonObject createFineTuneRequestParam = message.body().getJsonObject("CreateFineTuneRequest");
                if (createFineTuneRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateFineTuneRequest is required"), serviceId);
                    return;
                }
                CreateFineTuneRequest createFineTuneRequest = Json.mapper.readValue(createFineTuneRequestParam.encode(), CreateFineTuneRequest.class);
                service.createFineTune(createFineTuneRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createFineTune");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createFineTune", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
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
                String nParam = message.body().getString("n");
                Integer n = (nParam == null) ? 1 : Json.mapper.readValue(nParam, Integer.class);
                String sizeParam = message.body().getString("size");
                String size = (sizeParam == null) ? "1024x1024" : sizeParam;
                String responseFormatParam = message.body().getString("response_format");
                String responseFormat = (responseFormatParam == null) ? "url" : responseFormatParam;
                String userParam = message.body().getString("user");
                String user = (userParam == null) ? null : userParam;
                service.createImageEdit(image, prompt, mask, n, size, responseFormat, user, result -> {
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
                String nParam = message.body().getString("n");
                Integer n = (nParam == null) ? 1 : Json.mapper.readValue(nParam, Integer.class);
                String sizeParam = message.body().getString("size");
                String size = (sizeParam == null) ? "1024x1024" : sizeParam;
                String responseFormatParam = message.body().getString("response_format");
                String responseFormat = (responseFormatParam == null) ? "url" : responseFormatParam;
                String userParam = message.body().getString("user");
                String user = (userParam == null) ? null : userParam;
                service.createImageVariation(image, n, size, responseFormat, user, result -> {
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
                String promptParam = message.body().getString("prompt");
                String prompt = (promptParam == null) ? null : promptParam;
                String responseFormatParam = message.body().getString("response_format");
                String responseFormat = (responseFormatParam == null) ? json : responseFormatParam;
                String temperatureParam = message.body().getString("temperature");
                BigDecimal temperature = (temperatureParam == null) ? 0 : Json.mapper.readValue(temperatureParam, BigDecimal.class);
                String languageParam = message.body().getString("language");
                String language = (languageParam == null) ? null : languageParam;
                service.createTranscription(_file, model, prompt, responseFormat, temperature, language, result -> {
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
        
        //Consumer for deleteFile
        vertx.eventBus().<JsonObject> consumer(DELETEFILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteFile";
                String fileIdParam = message.body().getString("file_id");
                if(fileIdParam == null) {
                    manageError(message, new MainApiException(400, "file_id is required"), serviceId);
                    return;
                }
                String fileId = fileIdParam;
                service.deleteFile(fileId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteFile");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteFile", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
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
        
        //Consumer for downloadFile
        vertx.eventBus().<JsonObject> consumer(DOWNLOADFILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "downloadFile";
                String fileIdParam = message.body().getString("file_id");
                if(fileIdParam == null) {
                    manageError(message, new MainApiException(400, "file_id is required"), serviceId);
                    return;
                }
                String fileId = fileIdParam;
                service.downloadFile(fileId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "downloadFile");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("downloadFile", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listFiles
        vertx.eventBus().<JsonObject> consumer(LISTFILES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listFiles";
                service.listFiles(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listFiles");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listFiles", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listFineTuneEvents
        vertx.eventBus().<JsonObject> consumer(LISTFINETUNEEVENTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listFineTuneEvents";
                String fineTuneIdParam = message.body().getString("fine_tune_id");
                if(fineTuneIdParam == null) {
                    manageError(message, new MainApiException(400, "fine_tune_id is required"), serviceId);
                    return;
                }
                String fineTuneId = fineTuneIdParam;
                String streamParam = message.body().getString("stream");
                Boolean stream = (streamParam == null) ? false : Json.mapper.readValue(streamParam, Boolean.class);
                service.listFineTuneEvents(fineTuneId, stream, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listFineTuneEvents");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listFineTuneEvents", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listFineTunes
        vertx.eventBus().<JsonObject> consumer(LISTFINETUNES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listFineTunes";
                service.listFineTunes(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listFineTunes");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listFineTunes", e);
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
        
        //Consumer for retrieveFile
        vertx.eventBus().<JsonObject> consumer(RETRIEVEFILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "retrieveFile";
                String fileIdParam = message.body().getString("file_id");
                if(fileIdParam == null) {
                    manageError(message, new MainApiException(400, "file_id is required"), serviceId);
                    return;
                }
                String fileId = fileIdParam;
                service.retrieveFile(fileId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "retrieveFile");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("retrieveFile", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for retrieveFineTune
        vertx.eventBus().<JsonObject> consumer(RETRIEVEFINETUNE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "retrieveFineTune";
                String fineTuneIdParam = message.body().getString("fine_tune_id");
                if(fineTuneIdParam == null) {
                    manageError(message, new MainApiException(400, "fine_tune_id is required"), serviceId);
                    return;
                }
                String fineTuneId = fineTuneIdParam;
                service.retrieveFineTune(fineTuneId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "retrieveFineTune");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("retrieveFineTune", e);
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
