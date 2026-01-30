package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AuditLogEventType
import org.openapitools.model.ListAuditLogsEffectiveAtParameter
import org.openapitools.model.ListAuditLogsResponse

class AuditLogsApi {
    String basePath = "https://api.openai.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def listAuditLogs ( ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/organization/audit_logs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (effectiveAt != null) {
            queryParams.put("effective_at", effectiveAt)
        }
        if (projectIds != null) {
            queryParams.put("project_ids[]", projectIds)
        }
        if (eventTypes != null) {
            queryParams.put("event_types[]", eventTypes)
        }
        if (actorIds != null) {
            queryParams.put("actor_ids[]", actorIds)
        }
        if (actorEmails != null) {
            queryParams.put("actor_emails[]", actorEmails)
        }
        if (resourceIds != null) {
            queryParams.put("resource_ids[]", resourceIds)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ListAuditLogsResponse.class )

    }

}
