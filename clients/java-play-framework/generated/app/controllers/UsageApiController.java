package controllers;

import apimodels.UsageResponse;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UsageApiController extends Controller {
    private final UsageApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private UsageApiController(Config configuration, UsageApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result usageAudioSpeeches(Http.Request request) throws Exception {
        String valuestartTime = request.getQueryString("start_time");
        Integer startTime;
        if (valuestartTime != null) {
            startTime = Integer.parseInt(valuestartTime);
        } else {
            throw new IllegalArgumentException("'start_time' parameter is required");
        }
        String valueendTime = request.getQueryString("end_time");
        Integer endTime;
        if (valueendTime != null) {
            endTime = Integer.parseInt(valueendTime);
        } else {
            endTime = null;
        }
        String valuebucketWidth = request.getQueryString("bucket_width");
        String bucketWidth;
        if (valuebucketWidth != null) {
            bucketWidth = valuebucketWidth;
        } else {
            bucketWidth = "1d";
        }
        String[] projectIdsArray = request.queryString().get("project_ids");
        List<String> projectIdsList = OpenAPIUtils.parametersToList("multi", projectIdsArray);
        List<String> projectIds = new ArrayList<>();
        for (String curParam : projectIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                projectIds.add(curParam);
            }
        }
        String[] userIdsArray = request.queryString().get("user_ids");
        List<String> userIdsList = OpenAPIUtils.parametersToList("multi", userIdsArray);
        List<String> userIds = new ArrayList<>();
        for (String curParam : userIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                userIds.add(curParam);
            }
        }
        String[] apiKeyIdsArray = request.queryString().get("api_key_ids");
        List<String> apiKeyIdsList = OpenAPIUtils.parametersToList("multi", apiKeyIdsArray);
        List<String> apiKeyIds = new ArrayList<>();
        for (String curParam : apiKeyIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                apiKeyIds.add(curParam);
            }
        }
        String[] modelsArray = request.queryString().get("models");
        List<String> modelsList = OpenAPIUtils.parametersToList("multi", modelsArray);
        List<String> models = new ArrayList<>();
        for (String curParam : modelsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                models.add(curParam);
            }
        }
        String[] groupByArray = request.queryString().get("group_by");
        List<String> groupByList = OpenAPIUtils.parametersToList("multi", groupByArray);
        List<String> groupBy = new ArrayList<>();
        for (String curParam : groupByList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                groupBy.add(curParam);
            }
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuepage = request.getQueryString("page");
        String page;
        if (valuepage != null) {
            page = valuepage;
        } else {
            page = null;
        }
        return imp.usageAudioSpeechesHttp(request, startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
    }

    @ApiAction
    public Result usageAudioTranscriptions(Http.Request request) throws Exception {
        String valuestartTime = request.getQueryString("start_time");
        Integer startTime;
        if (valuestartTime != null) {
            startTime = Integer.parseInt(valuestartTime);
        } else {
            throw new IllegalArgumentException("'start_time' parameter is required");
        }
        String valueendTime = request.getQueryString("end_time");
        Integer endTime;
        if (valueendTime != null) {
            endTime = Integer.parseInt(valueendTime);
        } else {
            endTime = null;
        }
        String valuebucketWidth = request.getQueryString("bucket_width");
        String bucketWidth;
        if (valuebucketWidth != null) {
            bucketWidth = valuebucketWidth;
        } else {
            bucketWidth = "1d";
        }
        String[] projectIdsArray = request.queryString().get("project_ids");
        List<String> projectIdsList = OpenAPIUtils.parametersToList("multi", projectIdsArray);
        List<String> projectIds = new ArrayList<>();
        for (String curParam : projectIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                projectIds.add(curParam);
            }
        }
        String[] userIdsArray = request.queryString().get("user_ids");
        List<String> userIdsList = OpenAPIUtils.parametersToList("multi", userIdsArray);
        List<String> userIds = new ArrayList<>();
        for (String curParam : userIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                userIds.add(curParam);
            }
        }
        String[] apiKeyIdsArray = request.queryString().get("api_key_ids");
        List<String> apiKeyIdsList = OpenAPIUtils.parametersToList("multi", apiKeyIdsArray);
        List<String> apiKeyIds = new ArrayList<>();
        for (String curParam : apiKeyIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                apiKeyIds.add(curParam);
            }
        }
        String[] modelsArray = request.queryString().get("models");
        List<String> modelsList = OpenAPIUtils.parametersToList("multi", modelsArray);
        List<String> models = new ArrayList<>();
        for (String curParam : modelsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                models.add(curParam);
            }
        }
        String[] groupByArray = request.queryString().get("group_by");
        List<String> groupByList = OpenAPIUtils.parametersToList("multi", groupByArray);
        List<String> groupBy = new ArrayList<>();
        for (String curParam : groupByList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                groupBy.add(curParam);
            }
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuepage = request.getQueryString("page");
        String page;
        if (valuepage != null) {
            page = valuepage;
        } else {
            page = null;
        }
        return imp.usageAudioTranscriptionsHttp(request, startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
    }

    @ApiAction
    public Result usageCodeInterpreterSessions(Http.Request request) throws Exception {
        String valuestartTime = request.getQueryString("start_time");
        Integer startTime;
        if (valuestartTime != null) {
            startTime = Integer.parseInt(valuestartTime);
        } else {
            throw new IllegalArgumentException("'start_time' parameter is required");
        }
        String valueendTime = request.getQueryString("end_time");
        Integer endTime;
        if (valueendTime != null) {
            endTime = Integer.parseInt(valueendTime);
        } else {
            endTime = null;
        }
        String valuebucketWidth = request.getQueryString("bucket_width");
        String bucketWidth;
        if (valuebucketWidth != null) {
            bucketWidth = valuebucketWidth;
        } else {
            bucketWidth = "1d";
        }
        String[] projectIdsArray = request.queryString().get("project_ids");
        List<String> projectIdsList = OpenAPIUtils.parametersToList("multi", projectIdsArray);
        List<String> projectIds = new ArrayList<>();
        for (String curParam : projectIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                projectIds.add(curParam);
            }
        }
        String[] groupByArray = request.queryString().get("group_by");
        List<String> groupByList = OpenAPIUtils.parametersToList("multi", groupByArray);
        List<String> groupBy = new ArrayList<>();
        for (String curParam : groupByList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                groupBy.add(curParam);
            }
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuepage = request.getQueryString("page");
        String page;
        if (valuepage != null) {
            page = valuepage;
        } else {
            page = null;
        }
        return imp.usageCodeInterpreterSessionsHttp(request, startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
    }

    @ApiAction
    public Result usageCompletions(Http.Request request) throws Exception {
        String valuestartTime = request.getQueryString("start_time");
        Integer startTime;
        if (valuestartTime != null) {
            startTime = Integer.parseInt(valuestartTime);
        } else {
            throw new IllegalArgumentException("'start_time' parameter is required");
        }
        String valueendTime = request.getQueryString("end_time");
        Integer endTime;
        if (valueendTime != null) {
            endTime = Integer.parseInt(valueendTime);
        } else {
            endTime = null;
        }
        String valuebucketWidth = request.getQueryString("bucket_width");
        String bucketWidth;
        if (valuebucketWidth != null) {
            bucketWidth = valuebucketWidth;
        } else {
            bucketWidth = "1d";
        }
        String[] projectIdsArray = request.queryString().get("project_ids");
        List<String> projectIdsList = OpenAPIUtils.parametersToList("multi", projectIdsArray);
        List<String> projectIds = new ArrayList<>();
        for (String curParam : projectIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                projectIds.add(curParam);
            }
        }
        String[] userIdsArray = request.queryString().get("user_ids");
        List<String> userIdsList = OpenAPIUtils.parametersToList("multi", userIdsArray);
        List<String> userIds = new ArrayList<>();
        for (String curParam : userIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                userIds.add(curParam);
            }
        }
        String[] apiKeyIdsArray = request.queryString().get("api_key_ids");
        List<String> apiKeyIdsList = OpenAPIUtils.parametersToList("multi", apiKeyIdsArray);
        List<String> apiKeyIds = new ArrayList<>();
        for (String curParam : apiKeyIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                apiKeyIds.add(curParam);
            }
        }
        String[] modelsArray = request.queryString().get("models");
        List<String> modelsList = OpenAPIUtils.parametersToList("multi", modelsArray);
        List<String> models = new ArrayList<>();
        for (String curParam : modelsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                models.add(curParam);
            }
        }
        String valuebatch = request.getQueryString("batch");
        Boolean batch;
        if (valuebatch != null) {
            batch = Boolean.valueOf(valuebatch);
        } else {
            batch = null;
        }
        String[] groupByArray = request.queryString().get("group_by");
        List<String> groupByList = OpenAPIUtils.parametersToList("multi", groupByArray);
        List<String> groupBy = new ArrayList<>();
        for (String curParam : groupByList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                groupBy.add(curParam);
            }
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuepage = request.getQueryString("page");
        String page;
        if (valuepage != null) {
            page = valuepage;
        } else {
            page = null;
        }
        return imp.usageCompletionsHttp(request, startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page);
    }

    @ApiAction
    public Result usageCosts(Http.Request request) throws Exception {
        String valuestartTime = request.getQueryString("start_time");
        Integer startTime;
        if (valuestartTime != null) {
            startTime = Integer.parseInt(valuestartTime);
        } else {
            throw new IllegalArgumentException("'start_time' parameter is required");
        }
        String valueendTime = request.getQueryString("end_time");
        Integer endTime;
        if (valueendTime != null) {
            endTime = Integer.parseInt(valueendTime);
        } else {
            endTime = null;
        }
        String valuebucketWidth = request.getQueryString("bucket_width");
        String bucketWidth;
        if (valuebucketWidth != null) {
            bucketWidth = valuebucketWidth;
        } else {
            bucketWidth = "1d";
        }
        String[] projectIdsArray = request.queryString().get("project_ids");
        List<String> projectIdsList = OpenAPIUtils.parametersToList("multi", projectIdsArray);
        List<String> projectIds = new ArrayList<>();
        for (String curParam : projectIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                projectIds.add(curParam);
            }
        }
        String[] groupByArray = request.queryString().get("group_by");
        List<String> groupByList = OpenAPIUtils.parametersToList("multi", groupByArray);
        List<String> groupBy = new ArrayList<>();
        for (String curParam : groupByList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                groupBy.add(curParam);
            }
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 7;
        }
        String valuepage = request.getQueryString("page");
        String page;
        if (valuepage != null) {
            page = valuepage;
        } else {
            page = null;
        }
        return imp.usageCostsHttp(request, startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
    }

    @ApiAction
    public Result usageEmbeddings(Http.Request request) throws Exception {
        String valuestartTime = request.getQueryString("start_time");
        Integer startTime;
        if (valuestartTime != null) {
            startTime = Integer.parseInt(valuestartTime);
        } else {
            throw new IllegalArgumentException("'start_time' parameter is required");
        }
        String valueendTime = request.getQueryString("end_time");
        Integer endTime;
        if (valueendTime != null) {
            endTime = Integer.parseInt(valueendTime);
        } else {
            endTime = null;
        }
        String valuebucketWidth = request.getQueryString("bucket_width");
        String bucketWidth;
        if (valuebucketWidth != null) {
            bucketWidth = valuebucketWidth;
        } else {
            bucketWidth = "1d";
        }
        String[] projectIdsArray = request.queryString().get("project_ids");
        List<String> projectIdsList = OpenAPIUtils.parametersToList("multi", projectIdsArray);
        List<String> projectIds = new ArrayList<>();
        for (String curParam : projectIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                projectIds.add(curParam);
            }
        }
        String[] userIdsArray = request.queryString().get("user_ids");
        List<String> userIdsList = OpenAPIUtils.parametersToList("multi", userIdsArray);
        List<String> userIds = new ArrayList<>();
        for (String curParam : userIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                userIds.add(curParam);
            }
        }
        String[] apiKeyIdsArray = request.queryString().get("api_key_ids");
        List<String> apiKeyIdsList = OpenAPIUtils.parametersToList("multi", apiKeyIdsArray);
        List<String> apiKeyIds = new ArrayList<>();
        for (String curParam : apiKeyIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                apiKeyIds.add(curParam);
            }
        }
        String[] modelsArray = request.queryString().get("models");
        List<String> modelsList = OpenAPIUtils.parametersToList("multi", modelsArray);
        List<String> models = new ArrayList<>();
        for (String curParam : modelsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                models.add(curParam);
            }
        }
        String[] groupByArray = request.queryString().get("group_by");
        List<String> groupByList = OpenAPIUtils.parametersToList("multi", groupByArray);
        List<String> groupBy = new ArrayList<>();
        for (String curParam : groupByList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                groupBy.add(curParam);
            }
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuepage = request.getQueryString("page");
        String page;
        if (valuepage != null) {
            page = valuepage;
        } else {
            page = null;
        }
        return imp.usageEmbeddingsHttp(request, startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
    }

    @ApiAction
    public Result usageImages(Http.Request request) throws Exception {
        String valuestartTime = request.getQueryString("start_time");
        Integer startTime;
        if (valuestartTime != null) {
            startTime = Integer.parseInt(valuestartTime);
        } else {
            throw new IllegalArgumentException("'start_time' parameter is required");
        }
        String valueendTime = request.getQueryString("end_time");
        Integer endTime;
        if (valueendTime != null) {
            endTime = Integer.parseInt(valueendTime);
        } else {
            endTime = null;
        }
        String valuebucketWidth = request.getQueryString("bucket_width");
        String bucketWidth;
        if (valuebucketWidth != null) {
            bucketWidth = valuebucketWidth;
        } else {
            bucketWidth = "1d";
        }
        String[] sourcesArray = request.queryString().get("sources");
        List<String> sourcesList = OpenAPIUtils.parametersToList("multi", sourcesArray);
        List<String> sources = new ArrayList<>();
        for (String curParam : sourcesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                sources.add(curParam);
            }
        }
        String[] sizesArray = request.queryString().get("sizes");
        List<String> sizesList = OpenAPIUtils.parametersToList("multi", sizesArray);
        List<String> sizes = new ArrayList<>();
        for (String curParam : sizesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                sizes.add(curParam);
            }
        }
        String[] projectIdsArray = request.queryString().get("project_ids");
        List<String> projectIdsList = OpenAPIUtils.parametersToList("multi", projectIdsArray);
        List<String> projectIds = new ArrayList<>();
        for (String curParam : projectIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                projectIds.add(curParam);
            }
        }
        String[] userIdsArray = request.queryString().get("user_ids");
        List<String> userIdsList = OpenAPIUtils.parametersToList("multi", userIdsArray);
        List<String> userIds = new ArrayList<>();
        for (String curParam : userIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                userIds.add(curParam);
            }
        }
        String[] apiKeyIdsArray = request.queryString().get("api_key_ids");
        List<String> apiKeyIdsList = OpenAPIUtils.parametersToList("multi", apiKeyIdsArray);
        List<String> apiKeyIds = new ArrayList<>();
        for (String curParam : apiKeyIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                apiKeyIds.add(curParam);
            }
        }
        String[] modelsArray = request.queryString().get("models");
        List<String> modelsList = OpenAPIUtils.parametersToList("multi", modelsArray);
        List<String> models = new ArrayList<>();
        for (String curParam : modelsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                models.add(curParam);
            }
        }
        String[] groupByArray = request.queryString().get("group_by");
        List<String> groupByList = OpenAPIUtils.parametersToList("multi", groupByArray);
        List<String> groupBy = new ArrayList<>();
        for (String curParam : groupByList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                groupBy.add(curParam);
            }
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuepage = request.getQueryString("page");
        String page;
        if (valuepage != null) {
            page = valuepage;
        } else {
            page = null;
        }
        return imp.usageImagesHttp(request, startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
    }

    @ApiAction
    public Result usageModerations(Http.Request request) throws Exception {
        String valuestartTime = request.getQueryString("start_time");
        Integer startTime;
        if (valuestartTime != null) {
            startTime = Integer.parseInt(valuestartTime);
        } else {
            throw new IllegalArgumentException("'start_time' parameter is required");
        }
        String valueendTime = request.getQueryString("end_time");
        Integer endTime;
        if (valueendTime != null) {
            endTime = Integer.parseInt(valueendTime);
        } else {
            endTime = null;
        }
        String valuebucketWidth = request.getQueryString("bucket_width");
        String bucketWidth;
        if (valuebucketWidth != null) {
            bucketWidth = valuebucketWidth;
        } else {
            bucketWidth = "1d";
        }
        String[] projectIdsArray = request.queryString().get("project_ids");
        List<String> projectIdsList = OpenAPIUtils.parametersToList("multi", projectIdsArray);
        List<String> projectIds = new ArrayList<>();
        for (String curParam : projectIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                projectIds.add(curParam);
            }
        }
        String[] userIdsArray = request.queryString().get("user_ids");
        List<String> userIdsList = OpenAPIUtils.parametersToList("multi", userIdsArray);
        List<String> userIds = new ArrayList<>();
        for (String curParam : userIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                userIds.add(curParam);
            }
        }
        String[] apiKeyIdsArray = request.queryString().get("api_key_ids");
        List<String> apiKeyIdsList = OpenAPIUtils.parametersToList("multi", apiKeyIdsArray);
        List<String> apiKeyIds = new ArrayList<>();
        for (String curParam : apiKeyIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                apiKeyIds.add(curParam);
            }
        }
        String[] modelsArray = request.queryString().get("models");
        List<String> modelsList = OpenAPIUtils.parametersToList("multi", modelsArray);
        List<String> models = new ArrayList<>();
        for (String curParam : modelsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                models.add(curParam);
            }
        }
        String[] groupByArray = request.queryString().get("group_by");
        List<String> groupByList = OpenAPIUtils.parametersToList("multi", groupByArray);
        List<String> groupBy = new ArrayList<>();
        for (String curParam : groupByList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                groupBy.add(curParam);
            }
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuepage = request.getQueryString("page");
        String page;
        if (valuepage != null) {
            page = valuepage;
        } else {
            page = null;
        }
        return imp.usageModerationsHttp(request, startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);
    }

    @ApiAction
    public Result usageVectorStores(Http.Request request) throws Exception {
        String valuestartTime = request.getQueryString("start_time");
        Integer startTime;
        if (valuestartTime != null) {
            startTime = Integer.parseInt(valuestartTime);
        } else {
            throw new IllegalArgumentException("'start_time' parameter is required");
        }
        String valueendTime = request.getQueryString("end_time");
        Integer endTime;
        if (valueendTime != null) {
            endTime = Integer.parseInt(valueendTime);
        } else {
            endTime = null;
        }
        String valuebucketWidth = request.getQueryString("bucket_width");
        String bucketWidth;
        if (valuebucketWidth != null) {
            bucketWidth = valuebucketWidth;
        } else {
            bucketWidth = "1d";
        }
        String[] projectIdsArray = request.queryString().get("project_ids");
        List<String> projectIdsList = OpenAPIUtils.parametersToList("multi", projectIdsArray);
        List<String> projectIds = new ArrayList<>();
        for (String curParam : projectIdsList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                projectIds.add(curParam);
            }
        }
        String[] groupByArray = request.queryString().get("group_by");
        List<String> groupByList = OpenAPIUtils.parametersToList("multi", groupByArray);
        List<String> groupBy = new ArrayList<>();
        for (String curParam : groupByList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                groupBy.add(curParam);
            }
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = null;
        }
        String valuepage = request.getQueryString("page");
        String page;
        if (valuepage != null) {
            page = valuepage;
        } else {
            page = null;
        }
        return imp.usageVectorStoresHttp(request, startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);
    }

}
