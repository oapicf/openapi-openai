package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdminApiKey;
import org.openapitools.vertxweb.server.model.AdminApiKeysCreateRequest;
import org.openapitools.vertxweb.server.model.AdminApiKeysDelete200Response;
import org.openapitools.vertxweb.server.model.ApiKeyList;

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

public class DefaultApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(DefaultApiHandler.class);

    private final DefaultApi api;

    public DefaultApiHandler(DefaultApi api) {
        this.api = api;
    }

    @Deprecated
    public DefaultApiHandler() {
        this(new DefaultApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("adminApiKeysCreate").handler(this::adminApiKeysCreate);
        builder.operation("adminApiKeysDelete").handler(this::adminApiKeysDelete);
        builder.operation("adminApiKeysGet").handler(this::adminApiKeysGet);
        builder.operation("adminApiKeysList").handler(this::adminApiKeysList);
    }

    private void adminApiKeysCreate(RoutingContext routingContext) {
        logger.info("adminApiKeysCreate()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        AdminApiKeysCreateRequest adminApiKeysCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<AdminApiKeysCreateRequest>(){}) : null;

        logger.debug("Parameter adminApiKeysCreateRequest is {}", adminApiKeysCreateRequest);

        api.adminApiKeysCreate(adminApiKeysCreateRequest)
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

    private void adminApiKeysDelete(RoutingContext routingContext) {
        logger.info("adminApiKeysDelete()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String keyId = requestParameters.pathParameter("key_id") != null ? requestParameters.pathParameter("key_id").getString() : null;

        logger.debug("Parameter keyId is {}", keyId);

        api.adminApiKeysDelete(keyId)
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

    private void adminApiKeysGet(RoutingContext routingContext) {
        logger.info("adminApiKeysGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String keyId = requestParameters.pathParameter("key_id") != null ? requestParameters.pathParameter("key_id").getString() : null;

        logger.debug("Parameter keyId is {}", keyId);

        api.adminApiKeysGet(keyId)
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

    private void adminApiKeysList(RoutingContext routingContext) {
        logger.info("adminApiKeysList()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : "asc";
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;

        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter limit is {}", limit);

        api.adminApiKeysList(after, order, limit)
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
