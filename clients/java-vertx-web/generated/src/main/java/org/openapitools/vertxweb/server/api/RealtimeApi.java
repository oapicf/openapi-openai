package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.RealtimeSessionCreateRequest;
import org.openapitools.vertxweb.server.model.RealtimeSessionCreateResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface RealtimeApi  {
    Future<ApiResponse<RealtimeSessionCreateResponse>> createRealtimeSession(RealtimeSessionCreateRequest realtimeSessionCreateRequest);
}
