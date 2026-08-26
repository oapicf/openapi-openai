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
import org.openapitools.server.api.model.Batch
import org.openapitools.server.api.model.CreateBatchRequest
import org.openapitools.server.api.model.ListBatchesResponse

@MiskTest(startService = true)
internal class BatchApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var batchApi: BatchApiAction

    /**
     * To test BatchApiAction.cancelBatch
     */
    @Test
    fun `should handle cancelBatch`() {
        val batchId = TODO()
        val response: Batch = batchApi.cancelBatch(batchId)
    }

    /**
     * To test BatchApiAction.createBatch
     */
    @Test
    fun `should handle createBatch`() {
        val createBatchRequest = TODO()
        val response: Batch = batchApi.createBatch(createBatchRequest)
    }

    /**
     * To test BatchApiAction.listBatches
     */
    @Test
    fun `should handle listBatches`() {
        val after = TODO()
        val limit = TODO()
        val response: ListBatchesResponse = batchApi.listBatches(after, limit)
    }

    /**
     * To test BatchApiAction.retrieveBatch
     */
    @Test
    fun `should handle retrieveBatch`() {
        val batchId = TODO()
        val response: Batch = batchApi.retrieveBatch(batchId)
    }
}
