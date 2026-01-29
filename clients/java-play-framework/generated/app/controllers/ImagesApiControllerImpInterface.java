package controllers;

import apimodels.CreateImageEditRequestModel;
import apimodels.CreateImageRequest;
import apimodels.ImagesResponse;
import java.io.InputStream;

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
public abstract class ImagesApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createImageHttp(Http.Request request, CreateImageRequest createImageRequest) throws Exception {
        ImagesResponse obj = createImage(request, createImageRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ImagesResponse createImage(Http.Request request, CreateImageRequest createImageRequest) throws Exception;

    public Result createImageEditHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, String prompt, Http.MultipartFormData.FilePart<TemporaryFile> mask, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user) throws Exception {
        ImagesResponse obj = createImageEdit(request, image, prompt, mask, model, n, size, responseFormat, user);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ImagesResponse createImageEdit(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, String prompt, Http.MultipartFormData.FilePart<TemporaryFile> mask, CreateImageEditRequestModel model, Integer n, String size, String responseFormat, String user) throws Exception;

    public Result createImageVariationHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user) throws Exception {
        ImagesResponse obj = createImageVariation(request, image, model, n, responseFormat, size, user);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ImagesResponse createImageVariation(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, CreateImageEditRequestModel model, Integer n, String responseFormat, String size, String user) throws Exception;

}
