package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateEmbeddingRequest;
import org.openapitools.vertxweb.server.model.CreateEmbeddingResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface EmbeddingsApi  {
    Future<ApiResponse<CreateEmbeddingResponse>> createEmbedding(CreateEmbeddingRequest createEmbeddingRequest);
}
