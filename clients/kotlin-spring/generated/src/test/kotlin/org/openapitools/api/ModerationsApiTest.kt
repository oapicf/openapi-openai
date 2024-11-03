package org.openapitools.api

import org.openapitools.model.CreateModerationRequest
import org.openapitools.model.CreateModerationResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ModerationsApiTest {

    private val api: ModerationsApiController = ModerationsApiController()

    /**
     * To test ModerationsApiController.createModeration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createModerationTest() {
        val createModerationRequest: CreateModerationRequest = TODO()
        val response: ResponseEntity<CreateModerationResponse> = api.createModeration(createModerationRequest)

        // TODO: test validations
    }
}
