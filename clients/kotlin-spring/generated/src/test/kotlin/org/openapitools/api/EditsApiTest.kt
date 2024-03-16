package org.openapitools.api

import org.openapitools.model.CreateEditRequest
import org.openapitools.model.CreateEditResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class EditsApiTest {

    private val api: EditsApiController = EditsApiController()

    /**
     * To test EditsApiController.createEdit
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createEditTest() {
        val createEditRequest: CreateEditRequest = TODO()
        val response: ResponseEntity<CreateEditResponse> = api.createEdit(createEditRequest)

        // TODO: test validations
    }
}
