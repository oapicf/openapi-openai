package org.openapitools.api

import org.openapitools.model.DeleteFileResponse
import org.openapitools.model.ListFilesResponse
import org.openapitools.model.OpenAIFile
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class FilesApiTest {

    private val api: FilesApiController = FilesApiController()

    /**
     * To test FilesApiController.createFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createFileTest() {
        val file: org.springframework.web.multipart.MultipartFile = TODO()
        val purpose: kotlin.String = TODO()
        
        val response: ResponseEntity<OpenAIFile> = api.createFile(file, purpose)

        // TODO: test validations
    }

    /**
     * To test FilesApiController.deleteFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteFileTest() {
        val fileId: kotlin.String = TODO()
        
        val response: ResponseEntity<DeleteFileResponse> = api.deleteFile(fileId)

        // TODO: test validations
    }

    /**
     * To test FilesApiController.downloadFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun downloadFileTest() {
        val fileId: kotlin.String = TODO()
        
        val response: ResponseEntity<kotlin.String> = api.downloadFile(fileId)

        // TODO: test validations
    }

    /**
     * To test FilesApiController.listFiles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listFilesTest() {
        val purpose: kotlin.String? = TODO()
        
        val response: ResponseEntity<ListFilesResponse> = api.listFiles(purpose)

        // TODO: test validations
    }

    /**
     * To test FilesApiController.retrieveFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveFileTest() {
        val fileId: kotlin.String = TODO()
        
        val response: ResponseEntity<OpenAIFile> = api.retrieveFile(fileId)

        // TODO: test validations
    }
}
