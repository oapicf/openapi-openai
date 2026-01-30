package controllers;

import apimodels.DeleteFileResponse;
import java.io.InputStream;
import apimodels.ListFilesResponse;
import apimodels.OpenAIFile;

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
public abstract class FilesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createFileHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, String purpose) throws Exception {
        OpenAIFile obj = createFile(request, _file, purpose);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OpenAIFile createFile(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, String purpose) throws Exception;

    public Result deleteFileHttp(Http.Request request, String fileId) throws Exception {
        DeleteFileResponse obj = deleteFile(request, fileId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteFileResponse deleteFile(Http.Request request, String fileId) throws Exception;

    public Result downloadFileHttp(Http.Request request, String fileId) throws Exception {
        String obj = downloadFile(request, fileId);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String downloadFile(Http.Request request, String fileId) throws Exception;

    public Result listFilesHttp(Http.Request request, String purpose, Integer limit, String order, String after) throws Exception {
        ListFilesResponse obj = listFiles(request, purpose, limit, order, after);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListFilesResponse listFiles(Http.Request request, String purpose, Integer limit, String order, String after) throws Exception;

    public Result retrieveFileHttp(Http.Request request, String fileId) throws Exception {
        OpenAIFile obj = retrieveFile(request, fileId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OpenAIFile retrieveFile(Http.Request request, String fileId) throws Exception;

}
