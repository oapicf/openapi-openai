package org.openapitools.api

import org.openapitools.model.CreateChatCompletionRequest
import org.openapitools.model.CreateChatCompletionResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ChatApiTest {

    private val api: ChatApiController = ChatApiController()

    /**
     * To test ChatApiController.createChatCompletion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createChatCompletionTest() {
        val createChatCompletionRequest: CreateChatCompletionRequest = TODO()
        val response: ResponseEntity<CreateChatCompletionResponse> = api.createChatCompletion(createChatCompletionRequest)

        // TODO: test validations
    }
}
