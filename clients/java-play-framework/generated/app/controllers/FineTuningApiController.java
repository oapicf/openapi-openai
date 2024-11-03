package controllers;

import apimodels.CreateFineTuningJobRequest;
import apimodels.FineTuningJob;
import apimodels.ListFineTuningJobCheckpointsResponse;
import apimodels.ListFineTuningJobEventsResponse;
import apimodels.ListPaginatedFineTuningJobsResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-03T11:07:27.411323426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FineTuningApiController extends Controller {
    private final FineTuningApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private FineTuningApiController(Config configuration, FineTuningApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result cancelFineTuningJob(Http.Request request, String fineTuningJobId) throws Exception {
        return imp.cancelFineTuningJobHttp(request, fineTuningJobId);
    }

    @ApiAction
    public Result createFineTuningJob(Http.Request request) throws Exception {
        JsonNode nodecreateFineTuningJobRequest = request.body().asJson();
        CreateFineTuningJobRequest createFineTuningJobRequest;
        if (nodecreateFineTuningJobRequest != null) {
            createFineTuningJobRequest = mapper.readValue(nodecreateFineTuningJobRequest.toString(), CreateFineTuningJobRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createFineTuningJobRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateFineTuningJobRequest' parameter is required");
        }
        return imp.createFineTuningJobHttp(request, createFineTuningJobRequest);
    }

    @ApiAction
    public Result listFineTuningEvents(Http.Request request, String fineTuningJobId) throws Exception {
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.listFineTuningEventsHttp(request, fineTuningJobId, after, limit);
    }

    @ApiAction
    public Result listFineTuningJobCheckpoints(Http.Request request, String fineTuningJobId) throws Exception {
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 10;
        }
        return imp.listFineTuningJobCheckpointsHttp(request, fineTuningJobId, after, limit);
    }

    @ApiAction
    public Result listPaginatedFineTuningJobs(Http.Request request) throws Exception {
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        return imp.listPaginatedFineTuningJobsHttp(request, after, limit);
    }

    @ApiAction
    public Result retrieveFineTuningJob(Http.Request request, String fineTuningJobId) throws Exception {
        return imp.retrieveFineTuningJobHttp(request, fineTuningJobId);
    }

}
