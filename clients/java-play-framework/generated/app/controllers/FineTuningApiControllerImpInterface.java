package controllers;

import apimodels.CreateFineTuningJobRequest;
import apimodels.FineTuningJob;
import apimodels.ListFineTuningJobCheckpointsResponse;
import apimodels.ListFineTuningJobEventsResponse;
import apimodels.ListPaginatedFineTuningJobsResponse;

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
public abstract class FineTuningApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result cancelFineTuningJobHttp(Http.Request request, String fineTuningJobId) throws Exception {
        FineTuningJob obj = cancelFineTuningJob(request, fineTuningJobId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FineTuningJob cancelFineTuningJob(Http.Request request, String fineTuningJobId) throws Exception;

    public Result createFineTuningJobHttp(Http.Request request, CreateFineTuningJobRequest createFineTuningJobRequest) throws Exception {
        FineTuningJob obj = createFineTuningJob(request, createFineTuningJobRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FineTuningJob createFineTuningJob(Http.Request request, CreateFineTuningJobRequest createFineTuningJobRequest) throws Exception;

    public Result listFineTuningEventsHttp(Http.Request request, String fineTuningJobId, String after, Integer limit) throws Exception {
        ListFineTuningJobEventsResponse obj = listFineTuningEvents(request, fineTuningJobId, after, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListFineTuningJobEventsResponse listFineTuningEvents(Http.Request request, String fineTuningJobId, String after, Integer limit) throws Exception;

    public Result listFineTuningJobCheckpointsHttp(Http.Request request, String fineTuningJobId, String after, Integer limit) throws Exception {
        ListFineTuningJobCheckpointsResponse obj = listFineTuningJobCheckpoints(request, fineTuningJobId, after, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(Http.Request request, String fineTuningJobId, String after, Integer limit) throws Exception;

    public Result listPaginatedFineTuningJobsHttp(Http.Request request, String after, Integer limit) throws Exception {
        ListPaginatedFineTuningJobsResponse obj = listPaginatedFineTuningJobs(request, after, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(Http.Request request, String after, Integer limit) throws Exception;

    public Result retrieveFineTuningJobHttp(Http.Request request, String fineTuningJobId) throws Exception {
        FineTuningJob obj = retrieveFineTuningJob(request, fineTuningJobId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FineTuningJob retrieveFineTuningJob(Http.Request request, String fineTuningJobId) throws Exception;

}
