package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateEmbeddingRequest;
import org.openapitools.vertxweb.server.model.CreateEmbeddingResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class EmbeddingsApiImpl implements EmbeddingsApi {
    public Future<ApiResponse<CreateEmbeddingResponse>> createEmbedding(CreateEmbeddingRequest createEmbeddingRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
