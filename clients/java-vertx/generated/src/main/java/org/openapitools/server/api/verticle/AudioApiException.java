package org.openapitools.server.api.verticle;

import java.math.BigDecimal;
import org.openapitools.server.api.model.CreateSpeechRequest;
import org.openapitools.server.api.model.CreateTranscription200Response;
import org.openapitools.server.api.model.CreateTranscriptionRequestModel;
import org.openapitools.server.api.model.CreateTranslation200Response;
import java.io.File;
import org.openapitools.server.api.MainApiException;

public final class AudioApiException extends MainApiException {
    public AudioApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final AudioApiException Audio_createSpeech_200_Exception = new AudioApiException(200, "OK");
    public static final AudioApiException Audio_createTranscription_200_Exception = new AudioApiException(200, "OK");
    public static final AudioApiException Audio_createTranslation_200_Exception = new AudioApiException(200, "OK");
    

}