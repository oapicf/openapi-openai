package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateChatCompletionRequest;
import org.openapitools.vertxweb.server.model.CreateChatCompletionResponse;

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

public class ChatApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ChatApiHandler.class);

    private final ChatApi api;

    public ChatApiHandler(ChatApi api) {
        this.api = api;
    }

    @Deprecated
    public ChatApiHandler() {
        this(new ChatApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createChatCompletion").handler(this::createChatCompletion);
    }

    private void createChatCompletion(RoutingContext routingContext) {
        logger.info("createChatCompletion()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateChatCompletionRequest createChatCompletionRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateChatCompletionRequest>(){}) : null;

        logger.debug("Parameter createChatCompletionRequest is {}", createChatCompletionRequest);

        api.createChatCompletion(createChatCompletionRequest)
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
