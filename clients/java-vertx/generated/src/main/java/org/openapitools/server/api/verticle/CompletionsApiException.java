package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateCompletionRequest;
import org.openapitools.server.api.model.CreateCompletionResponse;
import org.openapitools.server.api.MainApiException;

public final class CompletionsApiException extends MainApiException {
    public CompletionsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final CompletionsApiException Completions_createCompletion_200_Exception = new CompletionsApiException(200, "OK");
    

}