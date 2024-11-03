package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateChatCompletionRequest;
import org.openapitools.vertxweb.server.model.CreateChatCompletionResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ChatApiImpl implements ChatApi {
    public Future<ApiResponse<CreateChatCompletionResponse>> createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
