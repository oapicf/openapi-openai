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
import org.openapitools.server.api.model.CreateCompletionRequest
import org.openapitools.server.api.model.CreateCompletionResponse

@MiskTest(startService = true)
internal class CompletionsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var completionsApi: CompletionsApiAction

    /**
     * To test CompletionsApiAction.createCompletion
     */
    @Test
    fun `should handle createCompletion`() {
        val createCompletionRequest = TODO()
        val response: CreateCompletionResponse = completionsApi.createCompletion(createCompletionRequest)
    }
}
