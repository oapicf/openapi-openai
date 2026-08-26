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
import org.openapitools.server.api.model.CreateVectorStoreFileBatchRequest
import org.openapitools.server.api.model.CreateVectorStoreFileRequest
import org.openapitools.server.api.model.CreateVectorStoreRequest
import org.openapitools.server.api.model.DeleteVectorStoreFileResponse
import org.openapitools.server.api.model.DeleteVectorStoreResponse
import org.openapitools.server.api.model.ListVectorStoreFilesResponse
import org.openapitools.server.api.model.ListVectorStoresResponse
import org.openapitools.server.api.model.UpdateVectorStoreRequest
import org.openapitools.server.api.model.VectorStoreFileBatchObject
import org.openapitools.server.api.model.VectorStoreFileObject
import org.openapitools.server.api.model.VectorStoreObject

@MiskTest(startService = true)
internal class VectorStoresApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var vectorStoresApi: VectorStoresApiAction

    /**
     * To test VectorStoresApiAction.cancelVectorStoreFileBatch
     */
    @Test
    fun `should handle cancelVectorStoreFileBatch`() {
        val vectorStoreId = TODO()
        val batchId = TODO()
        val response: VectorStoreFileBatchObject = vectorStoresApi.cancelVectorStoreFileBatch(vectorStoreId, batchId)
    }

    /**
     * To test VectorStoresApiAction.createVectorStore
     */
    @Test
    fun `should handle createVectorStore`() {
        val createVectorStoreRequest = TODO()
        val response: VectorStoreObject = vectorStoresApi.createVectorStore(createVectorStoreRequest)
    }

    /**
     * To test VectorStoresApiAction.createVectorStoreFile
     */
    @Test
    fun `should handle createVectorStoreFile`() {
        val vectorStoreId = TODO()
        val createVectorStoreFileRequest = TODO()
        val response: VectorStoreFileObject = vectorStoresApi.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)
    }

    /**
     * To test VectorStoresApiAction.createVectorStoreFileBatch
     */
    @Test
    fun `should handle createVectorStoreFileBatch`() {
        val vectorStoreId = TODO()
        val createVectorStoreFileBatchRequest = TODO()
        val response: VectorStoreFileBatchObject = vectorStoresApi.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)
    }

    /**
     * To test VectorStoresApiAction.deleteVectorStore
     */
    @Test
    fun `should handle deleteVectorStore`() {
        val vectorStoreId = TODO()
        val response: DeleteVectorStoreResponse = vectorStoresApi.deleteVectorStore(vectorStoreId)
    }

    /**
     * To test VectorStoresApiAction.deleteVectorStoreFile
     */
    @Test
    fun `should handle deleteVectorStoreFile`() {
        val vectorStoreId = TODO()
        val fileId = TODO()
        val response: DeleteVectorStoreFileResponse = vectorStoresApi.deleteVectorStoreFile(vectorStoreId, fileId)
    }

    /**
     * To test VectorStoresApiAction.getVectorStore
     */
    @Test
    fun `should handle getVectorStore`() {
        val vectorStoreId = TODO()
        val response: VectorStoreObject = vectorStoresApi.getVectorStore(vectorStoreId)
    }

    /**
     * To test VectorStoresApiAction.getVectorStoreFile
     */
    @Test
    fun `should handle getVectorStoreFile`() {
        val vectorStoreId = TODO()
        val fileId = TODO()
        val response: VectorStoreFileObject = vectorStoresApi.getVectorStoreFile(vectorStoreId, fileId)
    }

    /**
     * To test VectorStoresApiAction.getVectorStoreFileBatch
     */
    @Test
    fun `should handle getVectorStoreFileBatch`() {
        val vectorStoreId = TODO()
        val batchId = TODO()
        val response: VectorStoreFileBatchObject = vectorStoresApi.getVectorStoreFileBatch(vectorStoreId, batchId)
    }

    /**
     * To test VectorStoresApiAction.listFilesInVectorStoreBatch
     */
    @Test
    fun `should handle listFilesInVectorStoreBatch`() {
        val vectorStoreId = TODO()
        val batchId = TODO()
        val limit = TODO()
        val order = TODO()
        val after = TODO()
        val before = TODO()
        val filter = TODO()
        val response: ListVectorStoreFilesResponse = vectorStoresApi.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)
    }

    /**
     * To test VectorStoresApiAction.listVectorStoreFiles
     */
    @Test
    fun `should handle listVectorStoreFiles`() {
        val vectorStoreId = TODO()
        val limit = TODO()
        val order = TODO()
        val after = TODO()
        val before = TODO()
        val filter = TODO()
        val response: ListVectorStoreFilesResponse = vectorStoresApi.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)
    }

    /**
     * To test VectorStoresApiAction.listVectorStores
     */
    @Test
    fun `should handle listVectorStores`() {
        val limit = TODO()
        val order = TODO()
        val after = TODO()
        val before = TODO()
        val response: ListVectorStoresResponse = vectorStoresApi.listVectorStores(limit, order, after, before)
    }

    /**
     * To test VectorStoresApiAction.modifyVectorStore
     */
    @Test
    fun `should handle modifyVectorStore`() {
        val vectorStoreId = TODO()
        val updateVectorStoreRequest = TODO()
        val response: VectorStoreObject = vectorStoresApi.modifyVectorStore(vectorStoreId, updateVectorStoreRequest)
    }
}
