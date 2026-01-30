package org.openapitools.api

import org.openapitools.model.Batch
import org.openapitools.model.CreateBatchRequest
import org.openapitools.model.ListBatchesResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class BatchesApiTest {

    private val api: BatchesApiController = BatchesApiController()

    /**
     * To test BatchesApiController.cancelBatch
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun cancelBatchTest() {
        val batchId: kotlin.String = TODO()
        
        val response: ResponseEntity<Batch> = api.cancelBatch(batchId)

        // TODO: test validations
    }

    /**
     * To test BatchesApiController.createBatch
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createBatchTest() {
        val createBatchRequest: CreateBatchRequest = TODO()
        
        val response: ResponseEntity<Batch> = api.createBatch(createBatchRequest)

        // TODO: test validations
    }

    /**
     * To test BatchesApiController.listBatches
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listBatchesTest() {
        val after: kotlin.String? = TODO()
        val limit: kotlin.Int = TODO()
        
        val response: ResponseEntity<ListBatchesResponse> = api.listBatches(after, limit)

        // TODO: test validations
    }

    /**
     * To test BatchesApiController.retrieveBatch
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveBatchTest() {
        val batchId: kotlin.String = TODO()
        
        val response: ResponseEntity<Batch> = api.retrieveBatch(batchId)

        // TODO: test validations
    }
}
