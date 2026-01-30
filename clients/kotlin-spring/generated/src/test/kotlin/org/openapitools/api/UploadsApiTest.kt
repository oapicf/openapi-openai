package org.openapitools.api

import org.openapitools.model.CompleteUploadRequest
import org.openapitools.model.CreateUploadRequest
import org.openapitools.model.Upload
import org.openapitools.model.UploadPart
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class UploadsApiTest {

    private val api: UploadsApiController = UploadsApiController()

    /**
     * To test UploadsApiController.addUploadPart
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun addUploadPartTest() {
        val uploadId: kotlin.String = TODO()
        val `data`: org.springframework.web.multipart.MultipartFile = TODO()
        
        val response: ResponseEntity<UploadPart> = api.addUploadPart(uploadId, `data`)

        // TODO: test validations
    }

    /**
     * To test UploadsApiController.cancelUpload
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun cancelUploadTest() {
        val uploadId: kotlin.String = TODO()
        
        val response: ResponseEntity<Upload> = api.cancelUpload(uploadId)

        // TODO: test validations
    }

    /**
     * To test UploadsApiController.completeUpload
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun completeUploadTest() {
        val uploadId: kotlin.String = TODO()
        val completeUploadRequest: CompleteUploadRequest = TODO()
        
        val response: ResponseEntity<Upload> = api.completeUpload(uploadId, completeUploadRequest)

        // TODO: test validations
    }

    /**
     * To test UploadsApiController.createUpload
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createUploadTest() {
        val createUploadRequest: CreateUploadRequest = TODO()
        
        val response: ResponseEntity<Upload> = api.createUpload(createUploadRequest)

        // TODO: test validations
    }
}
