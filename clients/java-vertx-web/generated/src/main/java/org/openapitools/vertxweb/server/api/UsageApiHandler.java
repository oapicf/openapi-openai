package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.UsageResponse;

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

public class UsageApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(UsageApiHandler.class);

    private final UsageApi api;

    public UsageApiHandler(UsageApi api) {
        this.api = api;
    }

    @Deprecated
    public UsageApiHandler() {
        this(new UsageApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("usageAudioSpeeches").handler(this::usageAudioSpeeches);
        builder.operation("usageAudioTranscriptions").handler(this::usageAudioTranscriptions);
        builder.operation("usageCodeInterpreterSessions").handler(this::usageCodeInterpreterSessions);
        builder.operation("usageCompletions").handler(this::usageCompletions);
        builder.operation("usageCosts").handler(this::usageCosts);
        builder.operation("usageEmbeddings").handler(this::usageEmbeddings);
        builder.operation("usageImages").handler(this::usageImages);
        builder.operation("usageModerations").handler(this::usageModerations);
        builder.operation("usageVectorStores").handler(this::usageVectorStores);
    }

    private void usageAudioSpeeches(RoutingContext routingContext) {
        logger.info("usageAudioSpeeches()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer startTime = requestParameters.queryParameter("start_time") != null ? requestParameters.queryParameter("start_time").getInteger() : null;
        Integer endTime = requestParameters.queryParameter("end_time") != null ? requestParameters.queryParameter("end_time").getInteger() : null;
        String bucketWidth = requestParameters.queryParameter("bucket_width") != null ? requestParameters.queryParameter("bucket_width").getString() : "1d";
        List<String> projectIds = requestParameters.queryParameter("project_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("project_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> userIds = requestParameters.queryParameter("user_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("user_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> apiKeyIds = requestParameters.queryParameter("api_key_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("api_key_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> models = requestParameters.queryParameter("models") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("models").get(), new TypeReference<List<String>>(){}) : null;
        List<String> groupBy = requestParameters.queryParameter("group_by") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("group_by").get(), new TypeReference<List<String>>(){}) : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        String page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getString() : null;

        logger.debug("Parameter startTime is {}", startTime);
        logger.debug("Parameter endTime is {}", endTime);
        logger.debug("Parameter bucketWidth is {}", bucketWidth);
        logger.debug("Parameter projectIds is {}", projectIds);
        logger.debug("Parameter userIds is {}", userIds);
        logger.debug("Parameter apiKeyIds is {}", apiKeyIds);
        logger.debug("Parameter models is {}", models);
        logger.debug("Parameter groupBy is {}", groupBy);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter page is {}", page);

        api.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
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

    private void usageAudioTranscriptions(RoutingContext routingContext) {
        logger.info("usageAudioTranscriptions()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer startTime = requestParameters.queryParameter("start_time") != null ? requestParameters.queryParameter("start_time").getInteger() : null;
        Integer endTime = requestParameters.queryParameter("end_time") != null ? requestParameters.queryParameter("end_time").getInteger() : null;
        String bucketWidth = requestParameters.queryParameter("bucket_width") != null ? requestParameters.queryParameter("bucket_width").getString() : "1d";
        List<String> projectIds = requestParameters.queryParameter("project_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("project_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> userIds = requestParameters.queryParameter("user_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("user_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> apiKeyIds = requestParameters.queryParameter("api_key_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("api_key_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> models = requestParameters.queryParameter("models") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("models").get(), new TypeReference<List<String>>(){}) : null;
        List<String> groupBy = requestParameters.queryParameter("group_by") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("group_by").get(), new TypeReference<List<String>>(){}) : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        String page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getString() : null;

        logger.debug("Parameter startTime is {}", startTime);
        logger.debug("Parameter endTime is {}", endTime);
        logger.debug("Parameter bucketWidth is {}", bucketWidth);
        logger.debug("Parameter projectIds is {}", projectIds);
        logger.debug("Parameter userIds is {}", userIds);
        logger.debug("Parameter apiKeyIds is {}", apiKeyIds);
        logger.debug("Parameter models is {}", models);
        logger.debug("Parameter groupBy is {}", groupBy);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter page is {}", page);

        api.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
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

    private void usageCodeInterpreterSessions(RoutingContext routingContext) {
        logger.info("usageCodeInterpreterSessions()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer startTime = requestParameters.queryParameter("start_time") != null ? requestParameters.queryParameter("start_time").getInteger() : null;
        Integer endTime = requestParameters.queryParameter("end_time") != null ? requestParameters.queryParameter("end_time").getInteger() : null;
        String bucketWidth = requestParameters.queryParameter("bucket_width") != null ? requestParameters.queryParameter("bucket_width").getString() : "1d";
        List<String> projectIds = requestParameters.queryParameter("project_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("project_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> groupBy = requestParameters.queryParameter("group_by") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("group_by").get(), new TypeReference<List<String>>(){}) : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        String page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getString() : null;

        logger.debug("Parameter startTime is {}", startTime);
        logger.debug("Parameter endTime is {}", endTime);
        logger.debug("Parameter bucketWidth is {}", bucketWidth);
        logger.debug("Parameter projectIds is {}", projectIds);
        logger.debug("Parameter groupBy is {}", groupBy);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter page is {}", page);

        api.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
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

    private void usageCompletions(RoutingContext routingContext) {
        logger.info("usageCompletions()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer startTime = requestParameters.queryParameter("start_time") != null ? requestParameters.queryParameter("start_time").getInteger() : null;
        Integer endTime = requestParameters.queryParameter("end_time") != null ? requestParameters.queryParameter("end_time").getInteger() : null;
        String bucketWidth = requestParameters.queryParameter("bucket_width") != null ? requestParameters.queryParameter("bucket_width").getString() : "1d";
        List<String> projectIds = requestParameters.queryParameter("project_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("project_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> userIds = requestParameters.queryParameter("user_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("user_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> apiKeyIds = requestParameters.queryParameter("api_key_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("api_key_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> models = requestParameters.queryParameter("models") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("models").get(), new TypeReference<List<String>>(){}) : null;
        Boolean batch = requestParameters.queryParameter("batch") != null ? requestParameters.queryParameter("batch").getBoolean() : null;
        List<String> groupBy = requestParameters.queryParameter("group_by") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("group_by").get(), new TypeReference<List<String>>(){}) : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        String page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getString() : null;

        logger.debug("Parameter startTime is {}", startTime);
        logger.debug("Parameter endTime is {}", endTime);
        logger.debug("Parameter bucketWidth is {}", bucketWidth);
        logger.debug("Parameter projectIds is {}", projectIds);
        logger.debug("Parameter userIds is {}", userIds);
        logger.debug("Parameter apiKeyIds is {}", apiKeyIds);
        logger.debug("Parameter models is {}", models);
        logger.debug("Parameter batch is {}", batch);
        logger.debug("Parameter groupBy is {}", groupBy);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter page is {}", page);

        api.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page)
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

    private void usageCosts(RoutingContext routingContext) {
        logger.info("usageCosts()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer startTime = requestParameters.queryParameter("start_time") != null ? requestParameters.queryParameter("start_time").getInteger() : null;
        Integer endTime = requestParameters.queryParameter("end_time") != null ? requestParameters.queryParameter("end_time").getInteger() : null;
        String bucketWidth = requestParameters.queryParameter("bucket_width") != null ? requestParameters.queryParameter("bucket_width").getString() : "1d";
        List<String> projectIds = requestParameters.queryParameter("project_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("project_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> groupBy = requestParameters.queryParameter("group_by") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("group_by").get(), new TypeReference<List<String>>(){}) : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 7;
        String page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getString() : null;

        logger.debug("Parameter startTime is {}", startTime);
        logger.debug("Parameter endTime is {}", endTime);
        logger.debug("Parameter bucketWidth is {}", bucketWidth);
        logger.debug("Parameter projectIds is {}", projectIds);
        logger.debug("Parameter groupBy is {}", groupBy);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter page is {}", page);

        api.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
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

    private void usageEmbeddings(RoutingContext routingContext) {
        logger.info("usageEmbeddings()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer startTime = requestParameters.queryParameter("start_time") != null ? requestParameters.queryParameter("start_time").getInteger() : null;
        Integer endTime = requestParameters.queryParameter("end_time") != null ? requestParameters.queryParameter("end_time").getInteger() : null;
        String bucketWidth = requestParameters.queryParameter("bucket_width") != null ? requestParameters.queryParameter("bucket_width").getString() : "1d";
        List<String> projectIds = requestParameters.queryParameter("project_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("project_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> userIds = requestParameters.queryParameter("user_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("user_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> apiKeyIds = requestParameters.queryParameter("api_key_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("api_key_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> models = requestParameters.queryParameter("models") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("models").get(), new TypeReference<List<String>>(){}) : null;
        List<String> groupBy = requestParameters.queryParameter("group_by") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("group_by").get(), new TypeReference<List<String>>(){}) : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        String page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getString() : null;

        logger.debug("Parameter startTime is {}", startTime);
        logger.debug("Parameter endTime is {}", endTime);
        logger.debug("Parameter bucketWidth is {}", bucketWidth);
        logger.debug("Parameter projectIds is {}", projectIds);
        logger.debug("Parameter userIds is {}", userIds);
        logger.debug("Parameter apiKeyIds is {}", apiKeyIds);
        logger.debug("Parameter models is {}", models);
        logger.debug("Parameter groupBy is {}", groupBy);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter page is {}", page);

        api.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
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

    private void usageImages(RoutingContext routingContext) {
        logger.info("usageImages()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer startTime = requestParameters.queryParameter("start_time") != null ? requestParameters.queryParameter("start_time").getInteger() : null;
        Integer endTime = requestParameters.queryParameter("end_time") != null ? requestParameters.queryParameter("end_time").getInteger() : null;
        String bucketWidth = requestParameters.queryParameter("bucket_width") != null ? requestParameters.queryParameter("bucket_width").getString() : "1d";
        List<String> sources = requestParameters.queryParameter("sources") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("sources").get(), new TypeReference<List<String>>(){}) : null;
        List<String> sizes = requestParameters.queryParameter("sizes") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("sizes").get(), new TypeReference<List<String>>(){}) : null;
        List<String> projectIds = requestParameters.queryParameter("project_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("project_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> userIds = requestParameters.queryParameter("user_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("user_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> apiKeyIds = requestParameters.queryParameter("api_key_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("api_key_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> models = requestParameters.queryParameter("models") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("models").get(), new TypeReference<List<String>>(){}) : null;
        List<String> groupBy = requestParameters.queryParameter("group_by") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("group_by").get(), new TypeReference<List<String>>(){}) : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        String page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getString() : null;

        logger.debug("Parameter startTime is {}", startTime);
        logger.debug("Parameter endTime is {}", endTime);
        logger.debug("Parameter bucketWidth is {}", bucketWidth);
        logger.debug("Parameter sources is {}", sources);
        logger.debug("Parameter sizes is {}", sizes);
        logger.debug("Parameter projectIds is {}", projectIds);
        logger.debug("Parameter userIds is {}", userIds);
        logger.debug("Parameter apiKeyIds is {}", apiKeyIds);
        logger.debug("Parameter models is {}", models);
        logger.debug("Parameter groupBy is {}", groupBy);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter page is {}", page);

        api.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
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

    private void usageModerations(RoutingContext routingContext) {
        logger.info("usageModerations()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer startTime = requestParameters.queryParameter("start_time") != null ? requestParameters.queryParameter("start_time").getInteger() : null;
        Integer endTime = requestParameters.queryParameter("end_time") != null ? requestParameters.queryParameter("end_time").getInteger() : null;
        String bucketWidth = requestParameters.queryParameter("bucket_width") != null ? requestParameters.queryParameter("bucket_width").getString() : "1d";
        List<String> projectIds = requestParameters.queryParameter("project_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("project_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> userIds = requestParameters.queryParameter("user_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("user_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> apiKeyIds = requestParameters.queryParameter("api_key_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("api_key_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> models = requestParameters.queryParameter("models") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("models").get(), new TypeReference<List<String>>(){}) : null;
        List<String> groupBy = requestParameters.queryParameter("group_by") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("group_by").get(), new TypeReference<List<String>>(){}) : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        String page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getString() : null;

        logger.debug("Parameter startTime is {}", startTime);
        logger.debug("Parameter endTime is {}", endTime);
        logger.debug("Parameter bucketWidth is {}", bucketWidth);
        logger.debug("Parameter projectIds is {}", projectIds);
        logger.debug("Parameter userIds is {}", userIds);
        logger.debug("Parameter apiKeyIds is {}", apiKeyIds);
        logger.debug("Parameter models is {}", models);
        logger.debug("Parameter groupBy is {}", groupBy);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter page is {}", page);

        api.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page)
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

    private void usageVectorStores(RoutingContext routingContext) {
        logger.info("usageVectorStores()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer startTime = requestParameters.queryParameter("start_time") != null ? requestParameters.queryParameter("start_time").getInteger() : null;
        Integer endTime = requestParameters.queryParameter("end_time") != null ? requestParameters.queryParameter("end_time").getInteger() : null;
        String bucketWidth = requestParameters.queryParameter("bucket_width") != null ? requestParameters.queryParameter("bucket_width").getString() : "1d";
        List<String> projectIds = requestParameters.queryParameter("project_ids") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("project_ids").get(), new TypeReference<List<String>>(){}) : null;
        List<String> groupBy = requestParameters.queryParameter("group_by") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("group_by").get(), new TypeReference<List<String>>(){}) : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : null;
        String page = requestParameters.queryParameter("page") != null ? requestParameters.queryParameter("page").getString() : null;

        logger.debug("Parameter startTime is {}", startTime);
        logger.debug("Parameter endTime is {}", endTime);
        logger.debug("Parameter bucketWidth is {}", bucketWidth);
        logger.debug("Parameter projectIds is {}", projectIds);
        logger.debug("Parameter groupBy is {}", groupBy);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter page is {}", page);

        api.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page)
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
