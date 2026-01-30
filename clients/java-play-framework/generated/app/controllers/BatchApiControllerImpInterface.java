package controllers;

import apimodels.Batch;
import apimodels.CreateBatchRequest;
import apimodels.ListBatchesResponse;

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
public abstract class BatchApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result cancelBatchHttp(Http.Request request, String batchId) throws Exception {
        Batch obj = cancelBatch(request, batchId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Batch cancelBatch(Http.Request request, String batchId) throws Exception;

    public Result createBatchHttp(Http.Request request, CreateBatchRequest createBatchRequest) throws Exception {
        Batch obj = createBatch(request, createBatchRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Batch createBatch(Http.Request request, CreateBatchRequest createBatchRequest) throws Exception;

    public Result listBatchesHttp(Http.Request request, String after, Integer limit) throws Exception {
        ListBatchesResponse obj = listBatches(request, after, limit);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListBatchesResponse listBatches(Http.Request request, String after, Integer limit) throws Exception;

    public Result retrieveBatchHttp(Http.Request request, String batchId) throws Exception {
        Batch obj = retrieveBatch(request, batchId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Batch retrieveBatch(Http.Request request, String batchId) throws Exception;

}
