package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateModerationRequest;
import org.openapitools.vertxweb.server.model.CreateModerationResponse;

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

public class ModerationsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ModerationsApiHandler.class);

    private final ModerationsApi api;

    public ModerationsApiHandler(ModerationsApi api) {
        this.api = api;
    }

    @Deprecated
    public ModerationsApiHandler() {
        this(new ModerationsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createModeration").handler(this::createModeration);
    }

    private void createModeration(RoutingContext routingContext) {
        logger.info("createModeration()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateModerationRequest createModerationRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateModerationRequest>(){}) : null;

        logger.debug("Parameter createModerationRequest is {}", createModerationRequest);

        api.createModeration(createModerationRequest)
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
