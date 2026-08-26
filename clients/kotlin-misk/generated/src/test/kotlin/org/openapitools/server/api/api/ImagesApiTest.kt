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
import org.openapitools.server.api.model.CreateImageEditRequestModel
import org.openapitools.server.api.model.CreateImageRequest
import org.openapitools.server.api.model.ImagesResponse

@MiskTest(startService = true)
internal class ImagesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var imagesApi: ImagesApiAction

    /**
     * To test ImagesApiAction.createImage
     */
    @Test
    fun `should handle createImage`() {
        val createImageRequest = TODO()
        val response: ImagesResponse = imagesApi.createImage(createImageRequest)
    }

    /**
     * To test ImagesApiAction.createImageEdit
     */
    @Test
    fun `should handle createImageEdit`() {
        val image = TODO()
        val prompt = TODO()
        val mask = TODO()
        val model = TODO()
        val n = TODO()
        val size = TODO()
        val responseFormat = TODO()
        val user = TODO()
        val response: ImagesResponse = imagesApi.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user)
    }

    /**
     * To test ImagesApiAction.createImageVariation
     */
    @Test
    fun `should handle createImageVariation`() {
        val image = TODO()
        val model = TODO()
        val n = TODO()
        val responseFormat = TODO()
        val size = TODO()
        val user = TODO()
        val response: ImagesResponse = imagesApi.createImageVariation(image, model, n, responseFormat, size, user)
    }
}
