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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
        return imp.listFilesHttp(request, purpose);
    }

    @ApiAction
    public Result retrieveFile(Http.Request request, String fileId) throws Exception {
        return imp.retrieveFileHttp(request, fileId);
    }

}
