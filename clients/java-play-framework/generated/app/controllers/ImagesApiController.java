package controllers;

import apimodels.CreateImageEditRequestModel;
import apimodels.CreateImageRequest;
import apimodels.ImagesResponse;
import java.io.InputStream;

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
public class ImagesApiController extends Controller {
    private final ImagesApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ImagesApiController(Config configuration, ImagesApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createImage(Http.Request request) throws Exception {
        JsonNode nodecreateImageRequest = request.body().asJson();
        CreateImageRequest createImageRequest;
        if (nodecreateImageRequest != null) {
            createImageRequest = mapper.readValue(nodecreateImageRequest.toString(), CreateImageRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createImageRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateImageRequest' parameter is required");
        }
        return imp.createImageHttp(request, createImageRequest);
    }

    @ApiAction
    public Result createImageEdit(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> bodyimage = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> image = bodyimage.getFile("image");
        if ((image == null || image.getFileSize() == 0)) {
            throw new IllegalArgumentException("'image' file cannot be empty");
        }
        String[] valueprompt = request.body().asMultipartFormData().asFormUrlEncoded().get("prompt");
        String prompt;
        if (valueprompt != null) {
            prompt = valueprompt[0];
        } else {
            throw new IllegalArgumentException("'prompt' parameter is required");
        }
        Http.MultipartFormData<TemporaryFile> bodymask = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> mask = bodymask.getFile("mask");
        String[] valuemodel = request.body().asMultipartFormData().asFormUrlEncoded().get("model");
        CreateImageEditRequestModel model;
        if (valuemodel != null) {
            model = valuemodel[0];
        } else {
            model = dall-e-2;
        }
        String[] valuen = request.body().asMultipartFormData().asFormUrlEncoded().get("n");
        Integer n;
        if (valuen != null) {
            n = Integer.parseInt(valuen[0]);
        } else {
            n = 1;
        }
        String[] valuesize = request.body().asMultipartFormData().asFormUrlEncoded().get("size");
        String size;
        if (valuesize != null) {
            size = valuesize[0];
        } else {
            size = "1024x1024";
        }
        String[] valueresponseFormat = request.body().asMultipartFormData().asFormUrlEncoded().get("response_format");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat[0];
        } else {
            responseFormat = "url";
        }
        String[] valueuser = request.body().asMultipartFormData().asFormUrlEncoded().get("user");
        String user;
        if (valueuser != null) {
            user = valueuser[0];
        } else {
            user = null;
        }
        return imp.createImageEditHttp(request, image, prompt, mask, model, n, size, responseFormat, user);
    }

    @ApiAction
    public Result createImageVariation(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> bodyimage = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> image = bodyimage.getFile("image");
        if ((image == null || image.getFileSize() == 0)) {
            throw new IllegalArgumentException("'image' file cannot be empty");
        }
        String[] valuemodel = request.body().asMultipartFormData().asFormUrlEncoded().get("model");
        CreateImageEditRequestModel model;
        if (valuemodel != null) {
            model = valuemodel[0];
        } else {
            model = dall-e-2;
        }
        String[] valuen = request.body().asMultipartFormData().asFormUrlEncoded().get("n");
        Integer n;
        if (valuen != null) {
            n = Integer.parseInt(valuen[0]);
        } else {
            n = 1;
        }
        String[] valueresponseFormat = request.body().asMultipartFormData().asFormUrlEncoded().get("response_format");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat[0];
        } else {
            responseFormat = "url";
        }
        String[] valuesize = request.body().asMultipartFormData().asFormUrlEncoded().get("size");
        String size;
        if (valuesize != null) {
            size = valuesize[0];
        } else {
            size = "1024x1024";
        }
        String[] valueuser = request.body().asMultipartFormData().asFormUrlEncoded().get("user");
        String user;
        if (valueuser != null) {
            user = valueuser[0];
        } else {
            user = null;
        }
        return imp.createImageVariationHttp(request, image, model, n, responseFormat, size, user);
    }

}
