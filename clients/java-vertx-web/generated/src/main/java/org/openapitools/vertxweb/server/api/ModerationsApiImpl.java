package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateModerationRequest;
import org.openapitools.vertxweb.server.model.CreateModerationResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ModerationsApiImpl implements ModerationsApi {
    public Future<ApiResponse<CreateModerationResponse>> createModeration(CreateModerationRequest createModerationRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
