@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class AuditLogsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation listAuditLogs.
     *
     * @param effectiveAt query parameter effectiveAt pattern.
     * @param projectIds query parameter projectIds pattern.
     * @param eventTypes query parameter eventTypes pattern.
     * @param actorIds query parameter actorIds pattern.
     * @param actorEmails query parameter actorEmails pattern.
     * @param resourceIds query parameter resourceIds pattern.
     * @param limit query parameter limit pattern.
     * @param after query parameter after pattern.
     * @param before query parameter before pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListAuditLogsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listAuditLogs(effectiveAt: StringValuePattern? = null, projectIds: StringValuePattern? = null, eventTypes: StringValuePattern? = null, actorIds: StringValuePattern? = null, actorEmails: StringValuePattern? = null, resourceIds: StringValuePattern? = null, limit: StringValuePattern? = null, after: StringValuePattern? = null, before: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListAuditLogsStubBuilder =
        ListAuditLogsStubBuilder(objectMapper, get(urlPathTemplate("/organization/audit_logs"))
            .apply { effectiveAt?.let { withQueryParam("effective_at", it) } }
            .apply { projectIds?.let { withQueryParam("project_ids[]", it) } }
            .apply { eventTypes?.let { withQueryParam("event_types[]", it) } }
            .apply { actorIds?.let { withQueryParam("actor_ids[]", it) } }
            .apply { actorEmails?.let { withQueryParam("actor_emails[]", it) } }
            .apply { resourceIds?.let { withQueryParam("resource_ids[]", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { before?.let { withQueryParam("before", it) } }
            .configurer()
        )
}
