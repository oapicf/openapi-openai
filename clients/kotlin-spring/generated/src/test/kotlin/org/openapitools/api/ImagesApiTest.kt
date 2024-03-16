package org.openapitools.api

import org.openapitools.model.CreateImageRequest
import org.openapitools.model.ImagesResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ImagesApiTest {

    private val api: ImagesApiController = ImagesApiController()

    /**
     * To test ImagesApiController.createImage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createImageTest() {
        val createImageRequest: CreateImageRequest = TODO()
        val response: ResponseEntity<ImagesResponse> = api.createImage(createImageRequest)

        // TODO: test validations
    }

    /**
     * To test ImagesApiController.createImageEdit
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createImageEditTest() {
        val image: org.springframework.core.io.Resource = TODO()
        val prompt: kotlin.String = TODO()
        val mask: org.springframework.core.io.Resource? = TODO()
        val n: kotlin.Int = TODO()
        val size: kotlin.String = TODO()
        val responseFormat: kotlin.String = TODO()
        val user: kotlin.String? = TODO()
        val response: ResponseEntity<ImagesResponse> = api.createImageEdit(image, prompt, mask, n, size, responseFormat, user)

        // TODO: test validations
    }

    /**
     * To test ImagesApiController.createImageVariation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createImageVariationTest() {
        val image: org.springframework.core.io.Resource = TODO()
        val n: kotlin.Int = TODO()
        val size: kotlin.String = TODO()
        val responseFormat: kotlin.String = TODO()
        val user: kotlin.String? = TODO()
        val response: ResponseEntity<ImagesResponse> = api.createImageVariation(image, n, size, responseFormat, user)

        // TODO: test validations
    }
}
