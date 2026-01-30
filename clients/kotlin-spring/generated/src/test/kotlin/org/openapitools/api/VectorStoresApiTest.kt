package org.openapitools.api

import org.openapitools.model.CreateVectorStoreFileBatchRequest
import org.openapitools.model.CreateVectorStoreFileRequest
import org.openapitools.model.CreateVectorStoreRequest
import org.openapitools.model.DeleteVectorStoreFileResponse
import org.openapitools.model.DeleteVectorStoreResponse
import org.openapitools.model.ListVectorStoreFilesResponse
import org.openapitools.model.ListVectorStoresResponse
import org.openapitools.model.UpdateVectorStoreRequest
import org.openapitools.model.VectorStoreFileBatchObject
import org.openapitools.model.VectorStoreFileObject
import org.openapitools.model.VectorStoreObject
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class VectorStoresApiTest {

    private val api: VectorStoresApiController = VectorStoresApiController()

    /**
     * To test VectorStoresApiController.cancelVectorStoreFileBatch
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun cancelVectorStoreFileBatchTest() {
        val vectorStoreId: kotlin.String = TODO()
        val batchId: kotlin.String = TODO()
        
        val response: ResponseEntity<VectorStoreFileBatchObject> = api.cancelVectorStoreFileBatch(vectorStoreId, batchId)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.createVectorStore
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createVectorStoreTest() {
        val createVectorStoreRequest: CreateVectorStoreRequest = TODO()
        
        val response: ResponseEntity<VectorStoreObject> = api.createVectorStore(createVectorStoreRequest)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.createVectorStoreFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createVectorStoreFileTest() {
        val vectorStoreId: kotlin.String = TODO()
        val createVectorStoreFileRequest: CreateVectorStoreFileRequest = TODO()
        
        val response: ResponseEntity<VectorStoreFileObject> = api.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.createVectorStoreFileBatch
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createVectorStoreFileBatchTest() {
        val vectorStoreId: kotlin.String = TODO()
        val createVectorStoreFileBatchRequest: CreateVectorStoreFileBatchRequest = TODO()
        
        val response: ResponseEntity<VectorStoreFileBatchObject> = api.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.deleteVectorStore
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteVectorStoreTest() {
        val vectorStoreId: kotlin.String = TODO()
        
        val response: ResponseEntity<DeleteVectorStoreResponse> = api.deleteVectorStore(vectorStoreId)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.deleteVectorStoreFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteVectorStoreFileTest() {
        val vectorStoreId: kotlin.String = TODO()
        val fileId: kotlin.String = TODO()
        
        val response: ResponseEntity<DeleteVectorStoreFileResponse> = api.deleteVectorStoreFile(vectorStoreId, fileId)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.getVectorStore
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getVectorStoreTest() {
        val vectorStoreId: kotlin.String = TODO()
        
        val response: ResponseEntity<VectorStoreObject> = api.getVectorStore(vectorStoreId)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.getVectorStoreFile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getVectorStoreFileTest() {
        val vectorStoreId: kotlin.String = TODO()
        val fileId: kotlin.String = TODO()
        
        val response: ResponseEntity<VectorStoreFileObject> = api.getVectorStoreFile(vectorStoreId, fileId)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.getVectorStoreFileBatch
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getVectorStoreFileBatchTest() {
        val vectorStoreId: kotlin.String = TODO()
        val batchId: kotlin.String = TODO()
        
        val response: ResponseEntity<VectorStoreFileBatchObject> = api.getVectorStoreFileBatch(vectorStoreId, batchId)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.listFilesInVectorStoreBatch
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listFilesInVectorStoreBatchTest() {
        val vectorStoreId: kotlin.String = TODO()
        val batchId: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        val order: kotlin.String = TODO()
        val after: kotlin.String? = TODO()
        val before: kotlin.String? = TODO()
        val filter: kotlin.String? = TODO()
        
        val response: ResponseEntity<ListVectorStoreFilesResponse> = api.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.listVectorStoreFiles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listVectorStoreFilesTest() {
        val vectorStoreId: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        val order: kotlin.String = TODO()
        val after: kotlin.String? = TODO()
        val before: kotlin.String? = TODO()
        val filter: kotlin.String? = TODO()
        
        val response: ResponseEntity<ListVectorStoreFilesResponse> = api.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.listVectorStores
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listVectorStoresTest() {
        val limit: kotlin.Int = TODO()
        val order: kotlin.String = TODO()
        val after: kotlin.String? = TODO()
        val before: kotlin.String? = TODO()
        
        val response: ResponseEntity<ListVectorStoresResponse> = api.listVectorStores(limit, order, after, before)

        // TODO: test validations
    }

    /**
     * To test VectorStoresApiController.modifyVectorStore
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun modifyVectorStoreTest() {
        val vectorStoreId: kotlin.String = TODO()
        val updateVectorStoreRequest: UpdateVectorStoreRequest = TODO()
        
        val response: ResponseEntity<VectorStoreObject> = api.modifyVectorStore(vectorStoreId, updateVectorStoreRequest)

        // TODO: test validations
    }
}
