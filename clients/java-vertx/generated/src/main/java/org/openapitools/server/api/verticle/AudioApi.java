package org.openapitools.server.api.verticle;

import java.math.BigDecimal;
import org.openapitools.server.api.model.CreateSpeechRequest;
import org.openapitools.server.api.model.CreateTranscription200Response;
import org.openapitools.server.api.model.CreateTranscriptionRequestModel;
import org.openapitools.server.api.model.CreateTranslation200Response;
import java.io.File;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AudioApi  {
    //createSpeech
    void createSpeech(CreateSpeechRequest createSpeechRequest, Handler<AsyncResult<File>> handler);

    //createTranscription
    void createTranscription(File _file, CreateTranscriptionRequestModel model, String language, String prompt, String responseFormat, BigDecimal temperature, List<String> timestampGranularities, Handler<AsyncResult<CreateTranscription200Response>> handler);

    //createTranslation
    void createTranslation(File _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, Handler<AsyncResult<CreateTranslation200Response>> handler);

}
