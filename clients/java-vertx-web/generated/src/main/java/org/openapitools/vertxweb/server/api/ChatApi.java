package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateChatCompletionRequest;
import org.openapitools.vertxweb.server.model.CreateChatCompletionResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ChatApi  {
    Future<ApiResponse<CreateChatCompletionResponse>> createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest);
}
