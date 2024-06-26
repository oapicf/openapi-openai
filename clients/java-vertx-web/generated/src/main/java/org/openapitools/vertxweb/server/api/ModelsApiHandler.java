package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.DeleteModelResponse;
import org.openapitools.vertxweb.server.model.ListModelsResponse;
import org.openapitools.vertxweb.server.model.Model;

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

public class ModelsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ModelsApiHandler.class);

    private final ModelsApi api;

    public ModelsApiHandler(ModelsApi api) {
        this.api = api;
    }

    @Deprecated
    public ModelsApiHandler() {
        this(new ModelsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("deleteModel").handler(this::deleteModel);
        builder.operation("listModels").handler(this::listModels);
        builder.operation("retrieveModel").handler(this::retrieveModel);
    }

    private void deleteModel(RoutingContext routingContext) {
        logger.info("deleteModel()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String model = requestParameters.pathParameter("model") != null ? requestParameters.pathParameter("model").getString() : null;

        logger.debug("Parameter model is {}", model);

        api.deleteModel(model)
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

    private void listModels(RoutingContext routingContext) {
        logger.info("listModels()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.listModels()
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

    private void retrieveModel(RoutingContext routingContext) {
        logger.info("retrieveModel()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String model = requestParameters.pathParameter("model") != null ? requestParameters.pathParameter("model").getString() : null;

        logger.debug("Parameter model is {}", model);

        api.retrieveModel(model)
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
