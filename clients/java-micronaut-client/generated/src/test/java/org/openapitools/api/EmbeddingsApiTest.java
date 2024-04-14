package org.openapitools.api;

import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for EmbeddingsApi
 */
@MicronautTest
public class EmbeddingsApiTest {

    @Inject
    EmbeddingsApi api;

    
    /**
     * Creates an embedding vector representing the input text.
     */
    @Test
    @Disabled("Not Implemented")
    public void createEmbeddingTest() {
        // given
        CreateEmbeddingRequest createEmbeddingRequest = new CreateEmbeddingRequest(null, null);

        // when
        CreateEmbeddingResponse body = api.createEmbedding(createEmbeddingRequest).block();

        // then
        // TODO implement the createEmbeddingTest()
    }

    
}
