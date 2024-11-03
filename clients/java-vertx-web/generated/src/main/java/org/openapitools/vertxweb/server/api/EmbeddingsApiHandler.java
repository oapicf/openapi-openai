package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateEmbeddingRequest;
import org.openapitools.vertxweb.server.model.CreateEmbeddingResponse;

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

public class EmbeddingsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(EmbeddingsApiHandler.class);

    private final EmbeddingsApi api;

    public EmbeddingsApiHandler(EmbeddingsApi api) {
        this.api = api;
    }

    @Deprecated
    public EmbeddingsApiHandler() {
        this(new EmbeddingsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("createEmbedding").handler(this::createEmbedding);
    }

    private void createEmbedding(RoutingContext routingContext) {
        logger.info("createEmbedding()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateEmbeddingRequest createEmbeddingRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateEmbeddingRequest>(){}) : null;

        logger.debug("Parameter createEmbeddingRequest is {}", createEmbeddingRequest);

        api.createEmbedding(createEmbeddingRequest)
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
