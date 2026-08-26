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
import org.openapitools.server.api.model.CompleteUploadRequest
import org.openapitools.server.api.model.CreateUploadRequest
import org.openapitools.server.api.model.Upload
import org.openapitools.server.api.model.UploadPart

@MiskTest(startService = true)
internal class UploadsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var uploadsApi: UploadsApiAction

    /**
     * To test UploadsApiAction.addUploadPart
     */
    @Test
    fun `should handle addUploadPart`() {
        val uploadId = TODO()
        val `data` = TODO()
        val response: UploadPart = uploadsApi.addUploadPart(uploadId, `data`)
    }

    /**
     * To test UploadsApiAction.cancelUpload
     */
    @Test
    fun `should handle cancelUpload`() {
        val uploadId = TODO()
        val response: Upload = uploadsApi.cancelUpload(uploadId)
    }

    /**
     * To test UploadsApiAction.completeUpload
     */
    @Test
    fun `should handle completeUpload`() {
        val uploadId = TODO()
        val completeUploadRequest = TODO()
        val response: Upload = uploadsApi.completeUpload(uploadId, completeUploadRequest)
    }

    /**
     * To test UploadsApiAction.createUpload
     */
    @Test
    fun `should handle createUpload`() {
        val createUploadRequest = TODO()
        val response: Upload = uploadsApi.createUpload(createUploadRequest)
    }
}
