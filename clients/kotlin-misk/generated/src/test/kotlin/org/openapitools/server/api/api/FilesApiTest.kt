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
import org.openapitools.server.api.model.DeleteFileResponse
import org.openapitools.server.api.model.ListFilesResponse
import org.openapitools.server.api.model.OpenAIFile

@MiskTest(startService = true)
internal class FilesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var filesApi: FilesApiAction

    /**
     * To test FilesApiAction.createFile
     */
    @Test
    fun `should handle createFile`() {
        val file = TODO()
        val purpose = TODO()
        val response: OpenAIFile = filesApi.createFile(file, purpose)
    }

    /**
     * To test FilesApiAction.deleteFile
     */
    @Test
    fun `should handle deleteFile`() {
        val fileId = TODO()
        val response: DeleteFileResponse = filesApi.deleteFile(fileId)
    }

    /**
     * To test FilesApiAction.downloadFile
     */
    @Test
    fun `should handle downloadFile`() {
        val fileId = TODO()
        val response: kotlin.String = filesApi.downloadFile(fileId)
    }

    /**
     * To test FilesApiAction.listFiles
     */
    @Test
    fun `should handle listFiles`() {
        val purpose = TODO()
        val limit = TODO()
        val order = TODO()
        val after = TODO()
        val response: ListFilesResponse = filesApi.listFiles(purpose, limit, order, after)
    }

    /**
     * To test FilesApiAction.retrieveFile
     */
    @Test
    fun `should handle retrieveFile`() {
        val fileId = TODO()
        val response: OpenAIFile = filesApi.retrieveFile(fileId)
    }
}
