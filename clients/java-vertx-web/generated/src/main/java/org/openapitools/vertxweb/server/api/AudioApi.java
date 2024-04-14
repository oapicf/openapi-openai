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

import java.util.List;
import java.util.Map;

public interface AudioApi  {
    Future<ApiResponse<FileUpload>> createSpeech(CreateSpeechRequest createSpeechRequest);
    Future<ApiResponse<CreateTranscription200Response>> createTranscription(FileUpload _file);
    Future<ApiResponse<CreateTranslation200Response>> createTranslation(FileUpload _file);
}
