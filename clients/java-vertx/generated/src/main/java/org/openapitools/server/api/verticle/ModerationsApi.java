package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateModerationRequest;
import org.openapitools.server.api.model.CreateModerationResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ModerationsApi  {
    //createModeration
    void createModeration(CreateModerationRequest createModerationRequest, Handler<AsyncResult<CreateModerationResponse>> handler);

}
