package controllers;

import apimodels.DeleteFileResponse;
import java.io.InputStream;
import apimodels.ListFilesResponse;
import apimodels.OpenAIFile;

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
public class FilesApiController extends Controller {
    private final FilesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private FilesApiController(Config configuration, FilesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createFile(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> body_file = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> _file = body_file.getFile("file");
        if ((_file == null || _file.getFileSize() == 0)) {
            throw new IllegalArgumentException("'file' file cannot be empty");
        }
        String[] valuepurpose = request.body().asMultipartFormData().asFormUrlEncoded().get("purpose");
        String purpose;
        if (valuepurpose != null) {
            purpose = valuepurpose[0];
        } else {
            throw new IllegalArgumentException("'purpose' parameter is required");
        }
        return imp.createFileHttp(request, _file, purpose);
    }

    @ApiAction
    public Result deleteFile(Http.Request request, String fileId) throws Exception {
        return imp.deleteFileHttp(request, fileId);
    }

    @ApiAction
    public Result downloadFile(Http.Request request, String fileId) throws Exception {
        return imp.downloadFileHttp(request, fileId);
    }

    @ApiAction
    public Result listFiles(Http.Request request) throws Exception {
        String valuepurpose = request.getQueryString("purpose");
        String purpose;
        if (valuepurpose != null) {
            purpose = valuepurpose;
        } else {
            purpose = null;
        }
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 10000;
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
        return imp.listFilesHttp(request, purpose, limit, order, after);
    }

    @ApiAction
    public Result retrieveFile(Http.Request request, String fileId) throws Exception {
        return imp.retrieveFileHttp(request, fileId);
    }

}
