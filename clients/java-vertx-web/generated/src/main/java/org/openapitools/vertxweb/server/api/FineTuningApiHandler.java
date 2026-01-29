package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateFineTuningJobRequest;
import org.openapitools.vertxweb.server.model.FineTuningJob;
import org.openapitools.vertxweb.server.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.vertxweb.server.model.ListFineTuningJobEventsResponse;
import org.openapitools.vertxweb.server.model.ListPaginatedFineTuningJobsResponse;

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

public class FineTuningApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(FineTuningApiHandler.class);

    private final FineTuningApi api;

    public FineTuningApiHandler(FineTuningApi api) {
        this.api = api;
    }

    @Deprecated
    public FineTuningApiHandler() {
        this(new FineTuningApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("cancelFineTuningJob").handler(this::cancelFineTuningJob);
        builder.operation("createFineTuningJob").handler(this::createFineTuningJob);
        builder.operation("listFineTuningEvents").handler(this::listFineTuningEvents);
        builder.operation("listFineTuningJobCheckpoints").handler(this::listFineTuningJobCheckpoints);
        builder.operation("listPaginatedFineTuningJobs").handler(this::listPaginatedFineTuningJobs);
        builder.operation("retrieveFineTuningJob").handler(this::retrieveFineTuningJob);
    }

    private void cancelFineTuningJob(RoutingContext routingContext) {
        logger.info("cancelFineTuningJob()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fineTuningJobId = requestParameters.pathParameter("fine_tuning_job_id") != null ? requestParameters.pathParameter("fine_tuning_job_id").getString() : null;

        logger.debug("Parameter fineTuningJobId is {}", fineTuningJobId);

        api.cancelFineTuningJob(fineTuningJobId)
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

    private void createFineTuningJob(RoutingContext routingContext) {
        logger.info("createFineTuningJob()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateFineTuningJobRequest createFineTuningJobRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateFineTuningJobRequest>(){}) : null;

        logger.debug("Parameter createFineTuningJobRequest is {}", createFineTuningJobRequest);

        api.createFineTuningJob(createFineTuningJobRequest)
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

    private void listFineTuningEvents(RoutingContext routingContext) {
        logger.info("listFineTuningEvents()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fineTuningJobId = requestParameters.pathParameter("fine_tuning_job_id") != null ? requestParameters.pathParameter("fine_tuning_job_id").getString() : null;
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;

        logger.debug("Parameter fineTuningJobId is {}", fineTuningJobId);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter limit is {}", limit);

        api.listFineTuningEvents(fineTuningJobId, after, limit)
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

    private void listFineTuningJobCheckpoints(RoutingContext routingContext) {
        logger.info("listFineTuningJobCheckpoints()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fineTuningJobId = requestParameters.pathParameter("fine_tuning_job_id") != null ? requestParameters.pathParameter("fine_tuning_job_id").getString() : null;
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 10;

        logger.debug("Parameter fineTuningJobId is {}", fineTuningJobId);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter limit is {}", limit);

        api.listFineTuningJobCheckpoints(fineTuningJobId, after, limit)
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

    private void listPaginatedFineTuningJobs(RoutingContext routingContext) {
        logger.info("listPaginatedFineTuningJobs()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;

        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter limit is {}", limit);

        api.listPaginatedFineTuningJobs(after, limit)
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

    private void retrieveFineTuningJob(RoutingContext routingContext) {
        logger.info("retrieveFineTuningJob()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String fineTuningJobId = requestParameters.pathParameter("fine_tuning_job_id") != null ? requestParameters.pathParameter("fine_tuning_job_id").getString() : null;

        logger.debug("Parameter fineTuningJobId is {}", fineTuningJobId);

        api.retrieveFineTuningJob(fineTuningJobId)
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
