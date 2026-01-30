package controllers;

import apimodels.CompleteUploadRequest;
import apimodels.CreateUploadRequest;
import java.io.InputStream;
import apimodels.Upload;
import apimodels.UploadPart;

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
public class UploadsApiController extends Controller {
    private final UploadsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private UploadsApiController(Config configuration, UploadsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result addUploadPart(Http.Request request, String uploadId) throws Exception {
        Http.MultipartFormData<TemporaryFile> bodydata = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> data = bodydata.getFile("data");
        if ((data == null || data.getFileSize() == 0)) {
            throw new IllegalArgumentException("'data' file cannot be empty");
        }
        return imp.addUploadPartHttp(request, uploadId, data);
    }

    @ApiAction
    public Result cancelUpload(Http.Request request, String uploadId) throws Exception {
        return imp.cancelUploadHttp(request, uploadId);
    }

    @ApiAction
    public Result completeUpload(Http.Request request, String uploadId) throws Exception {
        JsonNode nodecompleteUploadRequest = request.body().asJson();
        CompleteUploadRequest completeUploadRequest;
        if (nodecompleteUploadRequest != null) {
            completeUploadRequest = mapper.readValue(nodecompleteUploadRequest.toString(), CompleteUploadRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(completeUploadRequest);
            }
        } else {
            throw new IllegalArgumentException("'CompleteUploadRequest' parameter is required");
        }
        return imp.completeUploadHttp(request, uploadId, completeUploadRequest);
    }

    @ApiAction
    public Result createUpload(Http.Request request) throws Exception {
        JsonNode nodecreateUploadRequest = request.body().asJson();
        CreateUploadRequest createUploadRequest;
        if (nodecreateUploadRequest != null) {
            createUploadRequest = mapper.readValue(nodecreateUploadRequest.toString(), CreateUploadRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createUploadRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateUploadRequest' parameter is required");
        }
        return imp.createUploadHttp(request, createUploadRequest);
    }

}
