package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateEmbeddingRequest;
import org.openapitools.server.api.model.CreateEmbeddingResponse;
import org.openapitools.server.api.MainApiException;

public final class EmbeddingsApiException extends MainApiException {
    public EmbeddingsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final EmbeddingsApiException Embeddings_createEmbedding_200_Exception = new EmbeddingsApiException(200, "OK");
    

}