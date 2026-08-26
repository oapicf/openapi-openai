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
import org.openapitools.server.api.model.CreateModerationRequest
import org.openapitools.server.api.model.CreateModerationResponse

@MiskTest(startService = true)
internal class ModerationsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var moderationsApi: ModerationsApiAction

    /**
     * To test ModerationsApiAction.createModeration
     */
    @Test
    fun `should handle createModeration`() {
        val createModerationRequest = TODO()
        val response: CreateModerationResponse = moderationsApi.createModeration(createModerationRequest)
    }
}
