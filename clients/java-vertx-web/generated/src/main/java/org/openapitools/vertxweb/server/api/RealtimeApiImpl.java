package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.RealtimeSessionCreateRequest;
import org.openapitools.vertxweb.server.model.RealtimeSessionCreateResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class RealtimeApiImpl implements RealtimeApi {
    public Future<ApiResponse<RealtimeSessionCreateResponse>> createRealtimeSession(RealtimeSessionCreateRequest realtimeSessionCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
