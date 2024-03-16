package org.openapitools.api

import org.openapitools.model.CreateCompletionRequest
import org.openapitools.model.CreateCompletionResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class CompletionsApiTest {

    private val api: CompletionsApiController = CompletionsApiController()

    /**
     * To test CompletionsApiController.createCompletion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createCompletionTest() {
        val createCompletionRequest: CreateCompletionRequest = TODO()
        val response: ResponseEntity<CreateCompletionResponse> = api.createCompletion(createCompletionRequest)

        // TODO: test validations
    }
}
