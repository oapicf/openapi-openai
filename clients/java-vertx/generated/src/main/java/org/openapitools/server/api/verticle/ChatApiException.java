package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateChatCompletionRequest;
import org.openapitools.server.api.model.CreateChatCompletionResponse;
import org.openapitools.server.api.MainApiException;

public final class ChatApiException extends MainApiException {
    public ChatApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ChatApiException Chat_createChatCompletion_200_Exception = new ChatApiException(200, "OK");
    

}