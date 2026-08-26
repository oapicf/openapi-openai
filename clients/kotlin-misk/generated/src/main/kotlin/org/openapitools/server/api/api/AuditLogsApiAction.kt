package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.AuditLogEventType
import org.openapitools.server.api.model.ListAuditLogsEffectiveAtParameter
import org.openapitools.server.api.model.ListAuditLogsResponse

/**
* @TODO("Fill out implementation")
*/
@Singleton
class AuditLogsApiAction @Inject constructor(
) : WebAction {

    @Get("/organization/audit_logs")
    @Description("List user actions and configuration changes within this organization.")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun listAuditLogs(
         effectiveAt: ListAuditLogsEffectiveAtParameter?, 
         @QueryParam(value = "project_ids[]") projectIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "event_types[]") eventTypes: kotlin.collections.List<AuditLogEventType>?, 
         @QueryParam(value = "actor_ids[]") actorIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "actor_emails[]") actorEmails: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "resource_ids[]") resourceIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "after") after: kotlin.String?, 
         @QueryParam(value = "before") before: kotlin.String?
    ): ListAuditLogsResponse {
        TODO()
    }
}
