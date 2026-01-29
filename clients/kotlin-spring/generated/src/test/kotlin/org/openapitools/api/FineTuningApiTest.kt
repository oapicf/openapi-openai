package org.openapitools.api

import org.openapitools.model.CreateFineTuningJobRequest
import org.openapitools.model.FineTuningJob
import org.openapitools.model.ListFineTuningJobCheckpointsResponse
import org.openapitools.model.ListFineTuningJobEventsResponse
import org.openapitools.model.ListPaginatedFineTuningJobsResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class FineTuningApiTest {

    private val api: FineTuningApiController = FineTuningApiController()

    /**
     * To test FineTuningApiController.cancelFineTuningJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun cancelFineTuningJobTest() {
        val fineTuningJobId: kotlin.String = TODO()
        
        val response: ResponseEntity<FineTuningJob> = api.cancelFineTuningJob(fineTuningJobId)

        // TODO: test validations
    }

    /**
     * To test FineTuningApiController.createFineTuningJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createFineTuningJobTest() {
        val createFineTuningJobRequest: CreateFineTuningJobRequest = TODO()
        
        val response: ResponseEntity<FineTuningJob> = api.createFineTuningJob(createFineTuningJobRequest)

        // TODO: test validations
    }

    /**
     * To test FineTuningApiController.listFineTuningEvents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listFineTuningEventsTest() {
        val fineTuningJobId: kotlin.String = TODO()
        val after: kotlin.String? = TODO()
        val limit: kotlin.Int = TODO()
        
        val response: ResponseEntity<ListFineTuningJobEventsResponse> = api.listFineTuningEvents(fineTuningJobId, after, limit)

        // TODO: test validations
    }

    /**
     * To test FineTuningApiController.listFineTuningJobCheckpoints
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listFineTuningJobCheckpointsTest() {
        val fineTuningJobId: kotlin.String = TODO()
        val after: kotlin.String? = TODO()
        val limit: kotlin.Int = TODO()
        
        val response: ResponseEntity<ListFineTuningJobCheckpointsResponse> = api.listFineTuningJobCheckpoints(fineTuningJobId, after, limit)

        // TODO: test validations
    }

    /**
     * To test FineTuningApiController.listPaginatedFineTuningJobs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listPaginatedFineTuningJobsTest() {
        val after: kotlin.String? = TODO()
        val limit: kotlin.Int = TODO()
        
        val response: ResponseEntity<ListPaginatedFineTuningJobsResponse> = api.listPaginatedFineTuningJobs(after, limit)

        // TODO: test validations
    }

    /**
     * To test FineTuningApiController.retrieveFineTuningJob
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun retrieveFineTuningJobTest() {
        val fineTuningJobId: kotlin.String = TODO()
        
        val response: ResponseEntity<FineTuningJob> = api.retrieveFineTuningJob(fineTuningJobId)

        // TODO: test validations
    }
}
