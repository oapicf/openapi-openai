package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateChatCompletionRequest;
import org.openapitools.server.api.model.CreateChatCompletionResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ChatApi  {
    //createChatCompletion
    void createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest, Handler<AsyncResult<CreateChatCompletionResponse>> handler);

}
