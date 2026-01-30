package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Batch;
import org.openapitools.vertxweb.server.model.CreateBatchRequest;
import org.openapitools.vertxweb.server.model.ListBatchesResponse;

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

public class BatchApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(BatchApiHandler.class);

    private final BatchApi api;

    public BatchApiHandler(BatchApi api) {
        this.api = api;
    }

    @Deprecated
    public BatchApiHandler() {
        this(new BatchApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("cancelBatch").handler(this::cancelBatch);
        builder.operation("createBatch").handler(this::createBatch);
        builder.operation("listBatches").handler(this::listBatches);
        builder.operation("retrieveBatch").handler(this::retrieveBatch);
    }

    private void cancelBatch(RoutingContext routingContext) {
        logger.info("cancelBatch()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String batchId = requestParameters.pathParameter("batch_id") != null ? requestParameters.pathParameter("batch_id").getString() : null;

        logger.debug("Parameter batchId is {}", batchId);

        api.cancelBatch(batchId)
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

    private void createBatch(RoutingContext routingContext) {
        logger.info("createBatch()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateBatchRequest createBatchRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateBatchRequest>(){}) : null;

        logger.debug("Parameter createBatchRequest is {}", createBatchRequest);

        api.createBatch(createBatchRequest)
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

    private void listBatches(RoutingContext routingContext) {
        logger.info("listBatches()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;

        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter limit is {}", limit);

        api.listBatches(after, limit)
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

    private void retrieveBatch(RoutingContext routingContext) {
        logger.info("retrieveBatch()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String batchId = requestParameters.pathParameter("batch_id") != null ? requestParameters.pathParameter("batch_id").getString() : null;

        logger.debug("Parameter batchId is {}", batchId);

        api.retrieveBatch(batchId)
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
