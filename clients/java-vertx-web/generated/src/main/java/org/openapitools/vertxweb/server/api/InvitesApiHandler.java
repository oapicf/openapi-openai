package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Invite;
import org.openapitools.vertxweb.server.model.InviteDeleteResponse;
import org.openapitools.vertxweb.server.model.InviteListResponse;
import org.openapitools.vertxweb.server.model.InviteRequest;

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

public class InvitesApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(InvitesApiHandler.class);

    private final InvitesApi api;

    public InvitesApiHandler(InvitesApi api) {
        this.api = api;
    }

    @Deprecated
    public InvitesApiHandler() {
        this(new InvitesApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("deleteInvite").handler(this::deleteInvite);
        builder.operation("inviteUser").handler(this::inviteUser);
        builder.operation("listInvites").handler(this::listInvites);
        builder.operation("retrieveInvite").handler(this::retrieveInvite);
    }

    private void deleteInvite(RoutingContext routingContext) {
        logger.info("deleteInvite()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String inviteId = requestParameters.pathParameter("invite_id") != null ? requestParameters.pathParameter("invite_id").getString() : null;

        logger.debug("Parameter inviteId is {}", inviteId);

        api.deleteInvite(inviteId)
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

    private void inviteUser(RoutingContext routingContext) {
        logger.info("inviteUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        InviteRequest inviteRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<InviteRequest>(){}) : null;

        logger.debug("Parameter inviteRequest is {}", inviteRequest);

        api.inviteUser(inviteRequest)
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

    private void listInvites(RoutingContext routingContext) {
        logger.info("listInvites()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter after is {}", after);

        api.listInvites(limit, after)
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

    private void retrieveInvite(RoutingContext routingContext) {
        logger.info("retrieveInvite()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String inviteId = requestParameters.pathParameter("invite_id") != null ? requestParameters.pathParameter("invite_id").getString() : null;

        logger.debug("Parameter inviteId is {}", inviteId);

        api.retrieveInvite(inviteId)
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
