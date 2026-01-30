package controllers;

import apimodels.Batch;
import apimodels.CreateBatchRequest;
import apimodels.ListBatchesResponse;

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
public class BatchApiController extends Controller {
    private final BatchApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BatchApiController(Config configuration, BatchApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result cancelBatch(Http.Request request, String batchId) throws Exception {
        return imp.cancelBatchHttp(request, batchId);
    }

    @ApiAction
    public Result createBatch(Http.Request request) throws Exception {
        JsonNode nodecreateBatchRequest = request.body().asJson();
        CreateBatchRequest createBatchRequest;
        if (nodecreateBatchRequest != null) {
            createBatchRequest = mapper.readValue(nodecreateBatchRequest.toString(), CreateBatchRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createBatchRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateBatchRequest' parameter is required");
        }
        return imp.createBatchHttp(request, createBatchRequest);
    }

    @ApiAction
    public Result listBatches(Http.Request request) throws Exception {
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
        return imp.listBatchesHttp(request, after, limit);
    }

    @ApiAction
    public Result retrieveBatch(Http.Request request, String batchId) throws Exception {
        return imp.retrieveBatchHttp(request, batchId);
    }

}
