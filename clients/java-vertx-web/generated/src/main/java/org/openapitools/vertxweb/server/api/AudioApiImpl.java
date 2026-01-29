package org.openapitools.vertxweb.server.api;

import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.CreateSpeechRequest;
import org.openapitools.vertxweb.server.model.CreateTranscription200Response;
import org.openapitools.vertxweb.server.model.CreateTranscriptionRequestModel;
import org.openapitools.vertxweb.server.model.CreateTranslation200Response;
import io.vertx.ext.web.FileUpload;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AudioApiImpl implements AudioApi {
    public Future<ApiResponse<FileUpload>> createSpeech(CreateSpeechRequest createSpeechRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateTranscription200Response>> createTranscription(FileUpload _file) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateTranslation200Response>> createTranslation(FileUpload _file) {
        return Future.failedFuture(new HttpException(501));
    }

}
