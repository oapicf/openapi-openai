package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.server.api.model.ListFilesResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OpenAIFile;

import java.util.List;
import java.util.Map;

public class FilesApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(FilesApiVerticle.class);

    static final String CREATEFILE_SERVICE_ID = "createFile";
    static final String DELETEFILE_SERVICE_ID = "deleteFile";
    static final String DOWNLOADFILE_SERVICE_ID = "downloadFile";
    static final String LISTFILES_SERVICE_ID = "listFiles";
    static final String RETRIEVEFILE_SERVICE_ID = "retrieveFile";
    
    final FilesApi service;

    public FilesApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.FilesApiImpl");
            service = (FilesApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("FilesApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
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
                String purposeParam = message.body().getString("purpose");
                String purpose = (purposeParam == null) ? null : purposeParam;
                service.listFiles(purpose, result -> {
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
