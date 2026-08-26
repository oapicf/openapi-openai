package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.CreateEmbeddingRequest
import org.openapitools.server.api.model.CreateEmbeddingResponse

@MiskTest(startService = true)
internal class EmbeddingsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var embeddingsApi: EmbeddingsApiAction

    /**
     * To test EmbeddingsApiAction.createEmbedding
     */
    @Test
    fun `should handle createEmbedding`() {
        val createEmbeddingRequest = TODO()
        val response: CreateEmbeddingResponse = embeddingsApi.createEmbedding(createEmbeddingRequest)
    }
}
