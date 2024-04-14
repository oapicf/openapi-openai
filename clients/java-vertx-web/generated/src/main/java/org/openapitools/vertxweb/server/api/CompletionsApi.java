package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateCompletionRequest;
import org.openapitools.vertxweb.server.model.CreateCompletionResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CompletionsApi  {
    Future<ApiResponse<CreateCompletionResponse>> createCompletion(CreateCompletionRequest createCompletionRequest);
}
