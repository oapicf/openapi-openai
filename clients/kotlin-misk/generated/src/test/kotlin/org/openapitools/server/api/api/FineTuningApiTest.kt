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
import org.openapitools.server.api.model.CreateFineTuningJobRequest
import org.openapitools.server.api.model.FineTuningJob
import org.openapitools.server.api.model.ListFineTuningJobCheckpointsResponse
import org.openapitools.server.api.model.ListFineTuningJobEventsResponse
import org.openapitools.server.api.model.ListPaginatedFineTuningJobsResponse

@MiskTest(startService = true)
internal class FineTuningApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var fineTuningApi: FineTuningApiAction

    /**
     * To test FineTuningApiAction.cancelFineTuningJob
     */
    @Test
    fun `should handle cancelFineTuningJob`() {
        val fineTuningJobId = TODO()
        val response: FineTuningJob = fineTuningApi.cancelFineTuningJob(fineTuningJobId)
    }

    /**
     * To test FineTuningApiAction.createFineTuningJob
     */
    @Test
    fun `should handle createFineTuningJob`() {
        val createFineTuningJobRequest = TODO()
        val response: FineTuningJob = fineTuningApi.createFineTuningJob(createFineTuningJobRequest)
    }

    /**
     * To test FineTuningApiAction.listFineTuningEvents
     */
    @Test
    fun `should handle listFineTuningEvents`() {
        val fineTuningJobId = TODO()
        val after = TODO()
        val limit = TODO()
        val response: ListFineTuningJobEventsResponse = fineTuningApi.listFineTuningEvents(fineTuningJobId, after, limit)
    }

    /**
     * To test FineTuningApiAction.listFineTuningJobCheckpoints
     */
    @Test
    fun `should handle listFineTuningJobCheckpoints`() {
        val fineTuningJobId = TODO()
        val after = TODO()
        val limit = TODO()
        val response: ListFineTuningJobCheckpointsResponse = fineTuningApi.listFineTuningJobCheckpoints(fineTuningJobId, after, limit)
    }

    /**
     * To test FineTuningApiAction.listPaginatedFineTuningJobs
     */
    @Test
    fun `should handle listPaginatedFineTuningJobs`() {
        val after = TODO()
        val limit = TODO()
        val response: ListPaginatedFineTuningJobsResponse = fineTuningApi.listPaginatedFineTuningJobs(after, limit)
    }

    /**
     * To test FineTuningApiAction.retrieveFineTuningJob
     */
    @Test
    fun `should handle retrieveFineTuningJob`() {
        val fineTuningJobId = TODO()
        val response: FineTuningJob = fineTuningApi.retrieveFineTuningJob(fineTuningJobId)
    }
}
