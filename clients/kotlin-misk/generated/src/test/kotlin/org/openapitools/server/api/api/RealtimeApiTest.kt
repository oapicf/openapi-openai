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
import org.openapitools.server.api.model.RealtimeSessionCreateRequest
import org.openapitools.server.api.model.RealtimeSessionCreateResponse

@MiskTest(startService = true)
internal class RealtimeApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var realtimeApi: RealtimeApiAction

    /**
     * To test RealtimeApiAction.createRealtimeSession
     */
    @Test
    fun `should handle createRealtimeSession`() {
        val realtimeSessionCreateRequest = TODO()
        val response: RealtimeSessionCreateResponse = realtimeApi.createRealtimeSession(realtimeSessionCreateRequest)
    }
}
