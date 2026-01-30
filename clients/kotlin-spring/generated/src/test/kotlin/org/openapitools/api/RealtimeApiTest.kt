package org.openapitools.api

import org.openapitools.model.RealtimeSessionCreateRequest
import org.openapitools.model.RealtimeSessionCreateResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class RealtimeApiTest {

    private val api: RealtimeApiController = RealtimeApiController()

    /**
     * To test RealtimeApiController.createRealtimeSession
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createRealtimeSessionTest() {
        val realtimeSessionCreateRequest: RealtimeSessionCreateRequest = TODO()
        
        val response: ResponseEntity<RealtimeSessionCreateResponse> = api.createRealtimeSession(realtimeSessionCreateRequest)

        // TODO: test validations
    }
}
