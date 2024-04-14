package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateEmbeddingRequest;
import org.openapitools.server.api.model.CreateEmbeddingResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface EmbeddingsApi  {
    //createEmbedding
    void createEmbedding(CreateEmbeddingRequest createEmbeddingRequest, Handler<AsyncResult<CreateEmbeddingResponse>> handler);

}
