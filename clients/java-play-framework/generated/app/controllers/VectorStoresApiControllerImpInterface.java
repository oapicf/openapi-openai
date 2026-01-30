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
public abstract class VectorStoresApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result cancelVectorStoreFileBatchHttp(Http.Request request, String vectorStoreId, String batchId) throws Exception {
        VectorStoreFileBatchObject obj = cancelVectorStoreFileBatch(request, vectorStoreId, batchId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VectorStoreFileBatchObject cancelVectorStoreFileBatch(Http.Request request, String vectorStoreId, String batchId) throws Exception;

    public Result createVectorStoreHttp(Http.Request request, CreateVectorStoreRequest createVectorStoreRequest) throws Exception {
        VectorStoreObject obj = createVectorStore(request, createVectorStoreRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VectorStoreObject createVectorStore(Http.Request request, CreateVectorStoreRequest createVectorStoreRequest) throws Exception;

    public Result createVectorStoreFileHttp(Http.Request request, String vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest) throws Exception {
        VectorStoreFileObject obj = createVectorStoreFile(request, vectorStoreId, createVectorStoreFileRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VectorStoreFileObject createVectorStoreFile(Http.Request request, String vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest) throws Exception;

    public Result createVectorStoreFileBatchHttp(Http.Request request, String vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest) throws Exception {
        VectorStoreFileBatchObject obj = createVectorStoreFileBatch(request, vectorStoreId, createVectorStoreFileBatchRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VectorStoreFileBatchObject createVectorStoreFileBatch(Http.Request request, String vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest) throws Exception;

    public Result deleteVectorStoreHttp(Http.Request request, String vectorStoreId) throws Exception {
        DeleteVectorStoreResponse obj = deleteVectorStore(request, vectorStoreId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteVectorStoreResponse deleteVectorStore(Http.Request request, String vectorStoreId) throws Exception;

    public Result deleteVectorStoreFileHttp(Http.Request request, String vectorStoreId, String fileId) throws Exception {
        DeleteVectorStoreFileResponse obj = deleteVectorStoreFile(request, vectorStoreId, fileId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteVectorStoreFileResponse deleteVectorStoreFile(Http.Request request, String vectorStoreId, String fileId) throws Exception;

    public Result getVectorStoreHttp(Http.Request request, String vectorStoreId) throws Exception {
        VectorStoreObject obj = getVectorStore(request, vectorStoreId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VectorStoreObject getVectorStore(Http.Request request, String vectorStoreId) throws Exception;

    public Result getVectorStoreFileHttp(Http.Request request, String vectorStoreId, String fileId) throws Exception {
        VectorStoreFileObject obj = getVectorStoreFile(request, vectorStoreId, fileId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VectorStoreFileObject getVectorStoreFile(Http.Request request, String vectorStoreId, String fileId) throws Exception;

    public Result getVectorStoreFileBatchHttp(Http.Request request, String vectorStoreId, String batchId) throws Exception {
        VectorStoreFileBatchObject obj = getVectorStoreFileBatch(request, vectorStoreId, batchId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VectorStoreFileBatchObject getVectorStoreFileBatch(Http.Request request, String vectorStoreId, String batchId) throws Exception;

    public Result listFilesInVectorStoreBatchHttp(Http.Request request, String vectorStoreId, String batchId, Integer limit, String order, String after, String before, String filter) throws Exception {
        ListVectorStoreFilesResponse obj = listFilesInVectorStoreBatch(request, vectorStoreId, batchId, limit, order, after, before, filter);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListVectorStoreFilesResponse listFilesInVectorStoreBatch(Http.Request request, String vectorStoreId, String batchId, Integer limit, String order, String after, String before, String filter) throws Exception;

    public Result listVectorStoreFilesHttp(Http.Request request, String vectorStoreId, Integer limit, String order, String after, String before, String filter) throws Exception {
        ListVectorStoreFilesResponse obj = listVectorStoreFiles(request, vectorStoreId, limit, order, after, before, filter);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListVectorStoreFilesResponse listVectorStoreFiles(Http.Request request, String vectorStoreId, Integer limit, String order, String after, String before, String filter) throws Exception;

    public Result listVectorStoresHttp(Http.Request request, Integer limit, String order, String after, String before) throws Exception {
        ListVectorStoresResponse obj = listVectorStores(request, limit, order, after, before);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListVectorStoresResponse listVectorStores(Http.Request request, Integer limit, String order, String after, String before) throws Exception;

    public Result modifyVectorStoreHttp(Http.Request request, String vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest) throws Exception {
        VectorStoreObject obj = modifyVectorStore(request, vectorStoreId, updateVectorStoreRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VectorStoreObject modifyVectorStore(Http.Request request, String vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest) throws Exception;

}
