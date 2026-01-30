package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.RealtimeSessionCreateRequest;
import org.openapitools.vertxweb.server.model.RealtimeSessionCreateResponse;

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

public class RealtimeApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(RealtimeApiHandler.class);

    private final RealtimeApi api;

    public RealtimeApiHandler(RealtimeApi api) {
        this.api = api;
    }

    @Deprecated
    public RealtimeApiHandler() {
        this(new RealtimeApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createRealtimeSession").handler(this::createRealtimeSession);
    }

    private void createRealtimeSession(RoutingContext routingContext) {
        logger.info("createRealtimeSession()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        RealtimeSessionCreateRequest realtimeSessionCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<RealtimeSessionCreateRequest>(){}) : null;

        logger.debug("Parameter realtimeSessionCreateRequest is {}", realtimeSessionCreateRequest);

        api.createRealtimeSession(realtimeSessionCreateRequest)
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
