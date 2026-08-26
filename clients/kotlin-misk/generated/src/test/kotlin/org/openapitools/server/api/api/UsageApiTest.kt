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
import org.openapitools.server.api.model.UsageResponse

@MiskTest(startService = true)
internal class UsageApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var usageApi: UsageApiAction

    /**
     * To test UsageApiAction.usageAudioSpeeches
     */
    @Test
    fun `should handle usageAudioSpeeches`() {
        val startTime = TODO()
        val endTime = TODO()
        val bucketWidth = TODO()
        val projectIds = TODO()
        val userIds = TODO()
        val apiKeyIds = TODO()
        val models = TODO()
        val groupBy = TODO()
        val limit = TODO()
        val page = TODO()
        val response: UsageResponse = usageApi.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    }

    /**
     * To test UsageApiAction.usageAudioTranscriptions
     */
    @Test
    fun `should handle usageAudioTranscriptions`() {
        val startTime = TODO()
        val endTime = TODO()
        val bucketWidth = TODO()
        val projectIds = TODO()
        val userIds = TODO()
        val apiKeyIds = TODO()
        val models = TODO()
        val groupBy = TODO()
        val limit = TODO()
        val page = TODO()
        val response: UsageResponse = usageApi.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    }

    /**
     * To test UsageApiAction.usageCodeInterpreterSessions
     */
    @Test
    fun `should handle usageCodeInterpreterSessions`() {
        val startTime = TODO()
        val endTime = TODO()
        val bucketWidth = TODO()
        val projectIds = TODO()
        val groupBy = TODO()
        val limit = TODO()
        val page = TODO()
        val response: UsageResponse = usageApi.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    }

    /**
     * To test UsageApiAction.usageCompletions
     */
    @Test
    fun `should handle usageCompletions`() {
        val startTime = TODO()
        val endTime = TODO()
        val bucketWidth = TODO()
        val projectIds = TODO()
        val userIds = TODO()
        val apiKeyIds = TODO()
        val models = TODO()
        val batch = TODO()
        val groupBy = TODO()
        val limit = TODO()
        val page = TODO()
        val response: UsageResponse = usageApi.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page)
    }

    /**
     * To test UsageApiAction.usageCosts
     */
    @Test
    fun `should handle usageCosts`() {
        val startTime = TODO()
        val endTime = TODO()
        val bucketWidth = TODO()
        val projectIds = TODO()
        val groupBy = TODO()
        val limit = TODO()
        val page = TODO()
        val response: UsageResponse = usageApi.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    }

    /**
     * To test UsageApiAction.usageEmbeddings
     */
    @Test
    fun `should handle usageEmbeddings`() {
        val startTime = TODO()
        val endTime = TODO()
        val bucketWidth = TODO()
        val projectIds = TODO()
        val userIds = TODO()
        val apiKeyIds = TODO()
        val models = TODO()
        val groupBy = TODO()
        val limit = TODO()
        val page = TODO()
        val response: UsageResponse = usageApi.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    }

    /**
     * To test UsageApiAction.usageImages
     */
    @Test
    fun `should handle usageImages`() {
        val startTime = TODO()
        val endTime = TODO()
        val bucketWidth = TODO()
        val sources = TODO()
        val sizes = TODO()
        val projectIds = TODO()
        val userIds = TODO()
        val apiKeyIds = TODO()
        val models = TODO()
        val groupBy = TODO()
        val limit = TODO()
        val page = TODO()
        val response: UsageResponse = usageApi.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    }

    /**
     * To test UsageApiAction.usageModerations
     */
    @Test
    fun `should handle usageModerations`() {
        val startTime = TODO()
        val endTime = TODO()
        val bucketWidth = TODO()
        val projectIds = TODO()
        val userIds = TODO()
        val apiKeyIds = TODO()
        val models = TODO()
        val groupBy = TODO()
        val limit = TODO()
        val page = TODO()
        val response: UsageResponse = usageApi.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
    }

    /**
     * To test UsageApiAction.usageVectorStores
     */
    @Test
    fun `should handle usageVectorStores`() {
        val startTime = TODO()
        val endTime = TODO()
        val bucketWidth = TODO()
        val projectIds = TODO()
        val groupBy = TODO()
        val limit = TODO()
        val page = TODO()
        val response: UsageResponse = usageApi.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
    }
}
