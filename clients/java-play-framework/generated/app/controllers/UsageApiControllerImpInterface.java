package controllers;

import apimodels.UsageResponse;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class UsageApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result usageAudioSpeechesHttp(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception {
        UsageResponse obj = usageAudioSpeeches(request, startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UsageResponse usageAudioSpeeches(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception;

    public Result usageAudioTranscriptionsHttp(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception {
        UsageResponse obj = usageAudioTranscriptions(request, startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UsageResponse usageAudioTranscriptions(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception;

    public Result usageCodeInterpreterSessionsHttp(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) throws Exception {
        UsageResponse obj = usageCodeInterpreterSessions(request, startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UsageResponse usageCodeInterpreterSessions(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) throws Exception;

    public Result usageCompletionsHttp(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, Boolean batch, List<String> groupBy, Integer limit, String page) throws Exception {
        UsageResponse obj = usageCompletions(request, startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UsageResponse usageCompletions(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, Boolean batch, List<String> groupBy, Integer limit, String page) throws Exception;

    public Result usageCostsHttp(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) throws Exception {
        UsageResponse obj = usageCosts(request, startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UsageResponse usageCosts(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) throws Exception;

    public Result usageEmbeddingsHttp(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception {
        UsageResponse obj = usageEmbeddings(request, startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UsageResponse usageEmbeddings(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception;

    public Result usageImagesHttp(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> sources, List<String> sizes, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception {
        UsageResponse obj = usageImages(request, startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UsageResponse usageImages(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> sources, List<String> sizes, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception;

    public Result usageModerationsHttp(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception {
        UsageResponse obj = usageModerations(request, startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UsageResponse usageModerations(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> userIds, List<String> apiKeyIds, List<String> models, List<String> groupBy, Integer limit, String page) throws Exception;

    public Result usageVectorStoresHttp(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) throws Exception {
        UsageResponse obj = usageVectorStores(request, startTime, endTime, bucketWidth, projectIds, groupBy, limit, page);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UsageResponse usageVectorStores(Http.Request request, @NotNull Integer startTime, Integer endTime, String bucketWidth, List<String> projectIds, List<String> groupBy, Integer limit, String page) throws Exception;

}
