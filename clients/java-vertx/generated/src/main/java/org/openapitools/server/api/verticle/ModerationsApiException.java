package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateModerationRequest;
import org.openapitools.server.api.model.CreateModerationResponse;
import org.openapitools.server.api.MainApiException;

public final class ModerationsApiException extends MainApiException {
    public ModerationsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ModerationsApiException Moderations_createModeration_200_Exception = new ModerationsApiException(200, "OK");
    

}