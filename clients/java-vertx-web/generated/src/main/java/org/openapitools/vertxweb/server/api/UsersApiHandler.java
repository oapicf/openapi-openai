package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.User;
import org.openapitools.vertxweb.server.model.UserDeleteResponse;
import org.openapitools.vertxweb.server.model.UserListResponse;
import org.openapitools.vertxweb.server.model.UserRoleUpdateRequest;

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

public class UsersApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(UsersApiHandler.class);

    private final UsersApi api;

    public UsersApiHandler(UsersApi api) {
        this.api = api;
    }

    @Deprecated
    public UsersApiHandler() {
        this(new UsersApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("deleteUser").handler(this::deleteUser);
        builder.operation("listUsers").handler(this::listUsers);
        builder.operation("modifyUser").handler(this::modifyUser);
        builder.operation("retrieveUser").handler(this::retrieveUser);
    }

    private void deleteUser(RoutingContext routingContext) {
        logger.info("deleteUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getString() : null;

        logger.debug("Parameter userId is {}", userId);

        api.deleteUser(userId)
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

    private void listUsers(RoutingContext routingContext) {
        logger.info("listUsers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter after is {}", after);

        api.listUsers(limit, after)
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

    private void modifyUser(RoutingContext routingContext) {
        logger.info("modifyUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getString() : null;
        RequestParameter body = requestParameters.body();
        UserRoleUpdateRequest userRoleUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<UserRoleUpdateRequest>(){}) : null;

        logger.debug("Parameter userId is {}", userId);
        logger.debug("Parameter userRoleUpdateRequest is {}", userRoleUpdateRequest);

        api.modifyUser(userId, userRoleUpdateRequest)
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

    private void retrieveUser(RoutingContext routingContext) {
        logger.info("retrieveUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getString() : null;

        logger.debug("Parameter userId is {}", userId);

        api.retrieveUser(userId)
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
