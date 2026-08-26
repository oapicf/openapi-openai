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
import org.openapitools.server.api.model.AuditLogEventType
import org.openapitools.server.api.model.ListAuditLogsEffectiveAtParameter
import org.openapitools.server.api.model.ListAuditLogsResponse

@MiskTest(startService = true)
internal class AuditLogsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var auditLogsApi: AuditLogsApiAction

    /**
     * To test AuditLogsApiAction.listAuditLogs
     */
    @Test
    fun `should handle listAuditLogs`() {
        val effectiveAt = TODO()
        val projectIds = TODO()
        val eventTypes = TODO()
        val actorIds = TODO()
        val actorEmails = TODO()
        val resourceIds = TODO()
        val limit = TODO()
        val after = TODO()
        val before = TODO()
        val response: ListAuditLogsResponse = auditLogsApi.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before)
    }
}
