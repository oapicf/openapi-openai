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
import org.openapitools.server.api.model.CreateChatCompletionRequest
import org.openapitools.server.api.model.CreateChatCompletionResponse

@MiskTest(startService = true)
internal class ChatApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var chatApi: ChatApiAction

    /**
     * To test ChatApiAction.createChatCompletion
     */
    @Test
    fun `should handle createChatCompletion`() {
        val createChatCompletionRequest = TODO()
        val response: CreateChatCompletionResponse = chatApi.createChatCompletion(createChatCompletionRequest)
    }
}
