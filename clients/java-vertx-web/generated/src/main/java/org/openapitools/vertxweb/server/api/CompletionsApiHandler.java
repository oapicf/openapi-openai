package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateCompletionRequest;
import org.openapitools.vertxweb.server.model.CreateCompletionResponse;

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

public class CompletionsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(CompletionsApiHandler.class);

    private final CompletionsApi api;

    public CompletionsApiHandler(CompletionsApi api) {
        this.api = api;
    }

    @Deprecated
    public CompletionsApiHandler() {
        this(new CompletionsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createCompletion").handler(this::createCompletion);
    }

    private void createCompletion(RoutingContext routingContext) {
        logger.info("createCompletion()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateCompletionRequest createCompletionRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateCompletionRequest>(){}) : null;

        logger.debug("Parameter createCompletionRequest is {}", createCompletionRequest);

        api.createCompletion(createCompletionRequest)
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
