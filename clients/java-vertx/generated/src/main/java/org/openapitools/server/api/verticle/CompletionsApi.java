package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateCompletionRequest;
import org.openapitools.server.api.model.CreateCompletionResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface CompletionsApi  {
    //createCompletion
    void createCompletion(CreateCompletionRequest createCompletionRequest, Handler<AsyncResult<CreateCompletionResponse>> handler);

}
