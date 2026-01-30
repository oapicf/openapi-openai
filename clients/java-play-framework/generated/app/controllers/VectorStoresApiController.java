package controllers;

import apimodels.CreateVectorStoreFileBatchRequest;
import apimodels.CreateVectorStoreFileRequest;
import apimodels.CreateVectorStoreRequest;
import apimodels.DeleteVectorStoreFileResponse;
import apimodels.DeleteVectorStoreResponse;
import apimodels.ListVectorStoreFilesResponse;
import apimodels.ListVectorStoresResponse;
import apimodels.UpdateVectorStoreRequest;
import apimodels.VectorStoreFileBatchObject;
import apimodels.VectorStoreFileObject;
import apimodels.VectorStoreObject;

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
public class VectorStoresApiController extends Controller {
    private final VectorStoresApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private VectorStoresApiController(Config configuration, VectorStoresApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result cancelVectorStoreFileBatch(Http.Request request, String vectorStoreId,String batchId) throws Exception {
        return imp.cancelVectorStoreFileBatchHttp(request, vectorStoreId, batchId);
    }

    @ApiAction
    public Result createVectorStore(Http.Request request) throws Exception {
        JsonNode nodecreateVectorStoreRequest = request.body().asJson();
        CreateVectorStoreRequest createVectorStoreRequest;
        if (nodecreateVectorStoreRequest != null) {
            createVectorStoreRequest = mapper.readValue(nodecreateVectorStoreRequest.toString(), CreateVectorStoreRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createVectorStoreRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateVectorStoreRequest' parameter is required");
        }
        return imp.createVectorStoreHttp(request, createVectorStoreRequest);
    }

    @ApiAction
    public Result createVectorStoreFile(Http.Request request, String vectorStoreId) throws Exception {
        JsonNode nodecreateVectorStoreFileRequest = request.body().asJson();
        CreateVectorStoreFileRequest createVectorStoreFileRequest;
        if (nodecreateVectorStoreFileRequest != null) {
            createVectorStoreFileRequest = mapper.readValue(nodecreateVectorStoreFileRequest.toString(), CreateVectorStoreFileRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createVectorStoreFileRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateVectorStoreFileRequest' parameter is required");
        }
        return imp.createVectorStoreFileHttp(request, vectorStoreId, createVectorStoreFileRequest);
    }

    @ApiAction
    public Result createVectorStoreFileBatch(Http.Request request, String vectorStoreId) throws Exception {
        JsonNode nodecreateVectorStoreFileBatchRequest = request.body().asJson();
        CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest;
        if (nodecreateVectorStoreFileBatchRequest != null) {
            createVectorStoreFileBatchRequest = mapper.readValue(nodecreateVectorStoreFileBatchRequest.toString(), CreateVectorStoreFileBatchRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createVectorStoreFileBatchRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateVectorStoreFileBatchRequest' parameter is required");
        }
        return imp.createVectorStoreFileBatchHttp(request, vectorStoreId, createVectorStoreFileBatchRequest);
    }

    @ApiAction
    public Result deleteVectorStore(Http.Request request, String vectorStoreId) throws Exception {
        return imp.deleteVectorStoreHttp(request, vectorStoreId);
    }

    @ApiAction
    public Result deleteVectorStoreFile(Http.Request request, String vectorStoreId,String fileId) throws Exception {
        return imp.deleteVectorStoreFileHttp(request, vectorStoreId, fileId);
    }

    @ApiAction
    public Result getVectorStore(Http.Request request, String vectorStoreId) throws Exception {
        return imp.getVectorStoreHttp(request, vectorStoreId);
    }

    @ApiAction
    public Result getVectorStoreFile(Http.Request request, String vectorStoreId,String fileId) throws Exception {
        return imp.getVectorStoreFileHttp(request, vectorStoreId, fileId);
    }

    @ApiAction
    public Result getVectorStoreFileBatch(Http.Request request, String vectorStoreId,String batchId) throws Exception {
        return imp.getVectorStoreFileBatchHttp(request, vectorStoreId, batchId);
    }

    @ApiAction
    public Result listFilesInVectorStoreBatch(Http.Request request, String vectorStoreId,String batchId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = "desc";
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuebefore = request.getQueryString("before");
        String before;
        if (valuebefore != null) {
            before = valuebefore;
        } else {
            before = null;
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            filter = null;
        }
        return imp.listFilesInVectorStoreBatchHttp(request, vectorStoreId, batchId, limit, order, after, before, filter);
    }

    @ApiAction
    public Result listVectorStoreFiles(Http.Request request, String vectorStoreId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = "desc";
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuebefore = request.getQueryString("before");
        String before;
        if (valuebefore != null) {
            before = valuebefore;
        } else {
            before = null;
        }
        String valuefilter = request.getQueryString("filter");
        String filter;
        if (valuefilter != null) {
            filter = valuefilter;
        } else {
            filter = null;
        }
        return imp.listVectorStoreFilesHttp(request, vectorStoreId, limit, order, after, before, filter);
    }

    @ApiAction
    public Result listVectorStores(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = "desc";
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuebefore = request.getQueryString("before");
        String before;
        if (valuebefore != null) {
            before = valuebefore;
        } else {
            before = null;
        }
        return imp.listVectorStoresHttp(request, limit, order, after, before);
    }

    @ApiAction
    public Result modifyVectorStore(Http.Request request, String vectorStoreId) throws Exception {
        JsonNode nodeupdateVectorStoreRequest = request.body().asJson();
        UpdateVectorStoreRequest updateVectorStoreRequest;
        if (nodeupdateVectorStoreRequest != null) {
            updateVectorStoreRequest = mapper.readValue(nodeupdateVectorStoreRequest.toString(), UpdateVectorStoreRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(updateVectorStoreRequest);
            }
        } else {
            throw new IllegalArgumentException("'UpdateVectorStoreRequest' parameter is required");
        }
        return imp.modifyVectorStoreHttp(request, vectorStoreId, updateVectorStoreRequest);
    }

}
