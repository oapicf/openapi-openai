package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AuditLogEventType;
import org.openapitools.vertxweb.server.model.ListAuditLogsEffectiveAtParameter;
import org.openapitools.vertxweb.server.model.ListAuditLogsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AuditLogsApiImpl implements AuditLogsApi {
    public Future<ApiResponse<ListAuditLogsResponse>> listAuditLogs(ListAuditLogsEffectiveAtParameter effectiveAt, List<String> projectIds, List<AuditLogEventType> eventTypes, List<String> actorIds, List<String> actorEmails, List<String> resourceIds, Integer limit, String after, String before) {
        return Future.failedFuture(new HttpException(501));
    }

}
