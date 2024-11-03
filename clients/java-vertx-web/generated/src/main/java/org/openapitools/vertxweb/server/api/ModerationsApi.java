package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateModerationRequest;
import org.openapitools.vertxweb.server.model.CreateModerationResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ModerationsApi  {
    Future<ApiResponse<CreateModerationResponse>> createModeration(CreateModerationRequest createModerationRequest);
}
