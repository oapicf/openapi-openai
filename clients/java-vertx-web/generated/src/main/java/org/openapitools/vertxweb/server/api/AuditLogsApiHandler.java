package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AuditLogEventType;
import org.openapitools.vertxweb.server.model.ListAuditLogsEffectiveAtParameter;
import org.openapitools.vertxweb.server.model.ListAuditLogsResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class AuditLogsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AuditLogsApiHandler.class);

    private final AuditLogsApi api;

    public AuditLogsApiHandler(AuditLogsApi api) {
        this.api = api;
    }

    @Deprecated
    public AuditLogsApiHandler() {
        this(new AuditLogsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("listAuditLogs").handler(this::listAuditLogs);
    }

    private void listAuditLogs(RoutingContext routingContext) {
        logger.info("listAuditLogs()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        ListAuditLogsEffectiveAtParameter effectiveAt = requestParameters.queryParameter("effective_at") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("effective_at").get(), new TypeReference<ListAuditLogsEffectiveAtParameter>(){}) : null;
        List<String> projectIds = requestParameters.queryParameter("project_ids[]") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("project_ids[]").get(), new TypeReference<List<String>>(){}) : null;
        List<AuditLogEventType> eventTypes = requestParameters.queryParameter("event_types[]") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("event_types[]").get(), new TypeReference<List<AuditLogEventType>>(){}) : null;
        List<String> actorIds = requestParameters.queryParameter("actor_ids[]") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("actor_ids[]").get(), new TypeReference<List<String>>(){}) : null;
        List<String> actorEmails = requestParameters.queryParameter("actor_emails[]") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("actor_emails[]").get(), new TypeReference<List<String>>(){}) : null;
        List<String> resourceIds = requestParameters.queryParameter("resource_ids[]") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("resource_ids[]").get(), new TypeReference<List<String>>(){}) : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        String before = requestParameters.queryParameter("before") != null ? requestParameters.queryParameter("before").getString() : null;

        logger.debug("Parameter effectiveAt is {}", effectiveAt);
        logger.debug("Parameter projectIds is {}", projectIds);
        logger.debug("Parameter eventTypes is {}", eventTypes);
        logger.debug("Parameter actorIds is {}", actorIds);
        logger.debug("Parameter actorEmails is {}", actorEmails);
        logger.debug("Parameter resourceIds is {}", resourceIds);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter before is {}", before);

        api.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
