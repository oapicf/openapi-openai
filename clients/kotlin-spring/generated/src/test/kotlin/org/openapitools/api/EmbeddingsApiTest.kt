package org.openapitools.api

import org.openapitools.model.CreateEmbeddingRequest
import org.openapitools.model.CreateEmbeddingResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class EmbeddingsApiTest {

    private val api: EmbeddingsApiController = EmbeddingsApiController()

    /**
     * To test EmbeddingsApiController.createEmbedding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createEmbeddingTest() {
        val createEmbeddingRequest: CreateEmbeddingRequest = TODO()
        val response: ResponseEntity<CreateEmbeddingResponse> = api.createEmbedding(createEmbeddingRequest)

        // TODO: test validations
    }
}
