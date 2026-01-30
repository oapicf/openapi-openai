package controllers;

import apimodels.CompleteUploadRequest;
import apimodels.CreateUploadRequest;
import java.io.InputStream;
import apimodels.Upload;
import apimodels.UploadPart;

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
public abstract class UploadsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result addUploadPartHttp(Http.Request request, String uploadId, Http.MultipartFormData.FilePart<TemporaryFile> data) throws Exception {
        UploadPart obj = addUploadPart(request, uploadId, data);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UploadPart addUploadPart(Http.Request request, String uploadId, Http.MultipartFormData.FilePart<TemporaryFile> data) throws Exception;

    public Result cancelUploadHttp(Http.Request request, String uploadId) throws Exception {
        Upload obj = cancelUpload(request, uploadId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Upload cancelUpload(Http.Request request, String uploadId) throws Exception;

    public Result completeUploadHttp(Http.Request request, String uploadId, CompleteUploadRequest completeUploadRequest) throws Exception {
        Upload obj = completeUpload(request, uploadId, completeUploadRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Upload completeUpload(Http.Request request, String uploadId, CompleteUploadRequest completeUploadRequest) throws Exception;

    public Result createUploadHttp(Http.Request request, CreateUploadRequest createUploadRequest) throws Exception {
        Upload obj = createUpload(request, createUploadRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Upload createUpload(Http.Request request, CreateUploadRequest createUploadRequest) throws Exception;

}
