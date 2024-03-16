package controllers;

import java.math.BigDecimal;
import apimodels.CreateChatCompletionRequest;
import apimodels.CreateChatCompletionResponse;
import apimodels.CreateCompletionRequest;
import apimodels.CreateCompletionResponse;
import apimodels.CreateEditRequest;
import apimodels.CreateEditResponse;
import apimodels.CreateEmbeddingRequest;
import apimodels.CreateEmbeddingResponse;
import apimodels.CreateFineTuneRequest;
import apimodels.CreateImageRequest;
import apimodels.CreateModerationRequest;
import apimodels.CreateModerationResponse;
import apimodels.CreateTranscriptionRequestModel;
import apimodels.CreateTranscriptionResponse;
import apimodels.CreateTranslationResponse;
import apimodels.DeleteFileResponse;
import apimodels.DeleteModelResponse;
import apimodels.FineTune;
import apimodels.ImagesResponse;
import java.io.InputStream;
import apimodels.ListFilesResponse;
import apimodels.ListFineTuneEventsResponse;
import apimodels.ListFineTunesResponse;
import apimodels.ListModelsResponse;
import apimodels.Model;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OpenAiApiController extends Controller {
    private final OpenAiApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private OpenAiApiController(Config configuration, OpenAiApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result cancelFineTune(Http.Request request, String fineTuneId) throws Exception {
        return imp.cancelFineTuneHttp(request, fineTuneId);
    }

    @ApiAction
    public Result createChatCompletion(Http.Request request) throws Exception {
        JsonNode nodecreateChatCompletionRequest = request.body().asJson();
        CreateChatCompletionRequest createChatCompletionRequest;
        if (nodecreateChatCompletionRequest != null) {
            createChatCompletionRequest = mapper.readValue(nodecreateChatCompletionRequest.toString(), CreateChatCompletionRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createChatCompletionRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateChatCompletionRequest' parameter is required");
        }
        return imp.createChatCompletionHttp(request, createChatCompletionRequest);
    }

    @ApiAction
    public Result createCompletion(Http.Request request) throws Exception {
        JsonNode nodecreateCompletionRequest = request.body().asJson();
        CreateCompletionRequest createCompletionRequest;
        if (nodecreateCompletionRequest != null) {
            createCompletionRequest = mapper.readValue(nodecreateCompletionRequest.toString(), CreateCompletionRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createCompletionRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateCompletionRequest' parameter is required");
        }
        return imp.createCompletionHttp(request, createCompletionRequest);
    }

    @ApiAction
    public Result createEdit(Http.Request request) throws Exception {
        JsonNode nodecreateEditRequest = request.body().asJson();
        CreateEditRequest createEditRequest;
        if (nodecreateEditRequest != null) {
            createEditRequest = mapper.readValue(nodecreateEditRequest.toString(), CreateEditRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createEditRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateEditRequest' parameter is required");
        }
        return imp.createEditHttp(request, createEditRequest);
    }

    @ApiAction
    public Result createEmbedding(Http.Request request) throws Exception {
        JsonNode nodecreateEmbeddingRequest = request.body().asJson();
        CreateEmbeddingRequest createEmbeddingRequest;
        if (nodecreateEmbeddingRequest != null) {
            createEmbeddingRequest = mapper.readValue(nodecreateEmbeddingRequest.toString(), CreateEmbeddingRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createEmbeddingRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateEmbeddingRequest' parameter is required");
        }
        return imp.createEmbeddingHttp(request, createEmbeddingRequest);
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
    public Result createFineTune(Http.Request request) throws Exception {
        JsonNode nodecreateFineTuneRequest = request.body().asJson();
        CreateFineTuneRequest createFineTuneRequest;
        if (nodecreateFineTuneRequest != null) {
            createFineTuneRequest = mapper.readValue(nodecreateFineTuneRequest.toString(), CreateFineTuneRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createFineTuneRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateFineTuneRequest' parameter is required");
        }
        return imp.createFineTuneHttp(request, createFineTuneRequest);
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
        Http.MultipartFormData<TemporaryFile> bodymask = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> mask = bodymask.getFile("mask");
        String[] valueprompt = request.body().asMultipartFormData().asFormUrlEncoded().get("prompt");
        String prompt;
        if (valueprompt != null) {
            prompt = valueprompt[0];
        } else {
            throw new IllegalArgumentException("'prompt' parameter is required");
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
        return imp.createImageEditHttp(request, image, prompt, mask, n, size, responseFormat, user);
    }

    @ApiAction
    public Result createImageVariation(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> bodyimage = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> image = bodyimage.getFile("image");
        if ((image == null || image.getFileSize() == 0)) {
            throw new IllegalArgumentException("'image' file cannot be empty");
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
        return imp.createImageVariationHttp(request, image, n, size, responseFormat, user);
    }

    @ApiAction
    public Result createModeration(Http.Request request) throws Exception {
        JsonNode nodecreateModerationRequest = request.body().asJson();
        CreateModerationRequest createModerationRequest;
        if (nodecreateModerationRequest != null) {
            createModerationRequest = mapper.readValue(nodecreateModerationRequest.toString(), CreateModerationRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createModerationRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateModerationRequest' parameter is required");
        }
        return imp.createModerationHttp(request, createModerationRequest);
    }

    @ApiAction
    public Result createTranscription(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> body_file = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> _file = body_file.getFile("file");
        if ((_file == null || _file.getFileSize() == 0)) {
            throw new IllegalArgumentException("'file' file cannot be empty");
        }
        String[] valuemodel = request.body().asMultipartFormData().asFormUrlEncoded().get("model");
        CreateTranscriptionRequestModel model;
        if (valuemodel != null) {
            model = valuemodel[0];
        } else {
            throw new IllegalArgumentException("'model' parameter is required");
        }
        String[] valueprompt = request.body().asMultipartFormData().asFormUrlEncoded().get("prompt");
        String prompt;
        if (valueprompt != null) {
            prompt = valueprompt[0];
        } else {
            prompt = null;
        }
        String[] valueresponseFormat = request.body().asMultipartFormData().asFormUrlEncoded().get("response_format");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat[0];
        } else {
            responseFormat = "json";
        }
        String[] valuetemperature = request.body().asMultipartFormData().asFormUrlEncoded().get("temperature");
        BigDecimal temperature;
        if (valuetemperature != null) {
            temperature = new BigDecimal(valuetemperature[0]);
        } else {
            temperature = 0;
        }
        String[] valuelanguage = request.body().asMultipartFormData().asFormUrlEncoded().get("language");
        String language;
        if (valuelanguage != null) {
            language = valuelanguage[0];
        } else {
            language = null;
        }
        return imp.createTranscriptionHttp(request, _file, model, prompt, responseFormat, temperature, language);
    }

    @ApiAction
    public Result createTranslation(Http.Request request) throws Exception {
        Http.MultipartFormData<TemporaryFile> body_file = request.body().asMultipartFormData();
        Http.MultipartFormData.FilePart<TemporaryFile> _file = body_file.getFile("file");
        if ((_file == null || _file.getFileSize() == 0)) {
            throw new IllegalArgumentException("'file' file cannot be empty");
        }
        String[] valuemodel = request.body().asMultipartFormData().asFormUrlEncoded().get("model");
        CreateTranscriptionRequestModel model;
        if (valuemodel != null) {
            model = valuemodel[0];
        } else {
            throw new IllegalArgumentException("'model' parameter is required");
        }
        String[] valueprompt = request.body().asMultipartFormData().asFormUrlEncoded().get("prompt");
        String prompt;
        if (valueprompt != null) {
            prompt = valueprompt[0];
        } else {
            prompt = null;
        }
        String[] valueresponseFormat = request.body().asMultipartFormData().asFormUrlEncoded().get("response_format");
        String responseFormat;
        if (valueresponseFormat != null) {
            responseFormat = valueresponseFormat[0];
        } else {
            responseFormat = "json";
        }
        String[] valuetemperature = request.body().asMultipartFormData().asFormUrlEncoded().get("temperature");
        BigDecimal temperature;
        if (valuetemperature != null) {
            temperature = new BigDecimal(valuetemperature[0]);
        } else {
            temperature = 0;
        }
        return imp.createTranslationHttp(request, _file, model, prompt, responseFormat, temperature);
    }

    @ApiAction
    public Result deleteFile(Http.Request request, String fileId) throws Exception {
        return imp.deleteFileHttp(request, fileId);
    }

    @ApiAction
    public Result deleteModel(Http.Request request, String model) throws Exception {
        return imp.deleteModelHttp(request, model);
    }

    @ApiAction
    public Result downloadFile(Http.Request request, String fileId) throws Exception {
        return imp.downloadFileHttp(request, fileId);
    }

    @ApiAction
    public Result listFiles(Http.Request request) throws Exception {
        return imp.listFilesHttp(request);
    }

    @ApiAction
    public Result listFineTuneEvents(Http.Request request, String fineTuneId) throws Exception {
        String valuestream = request.getQueryString("stream");
        Boolean stream;
        if (valuestream != null) {
            stream = Boolean.valueOf(valuestream);
        } else {
            stream = false;
        }
        return imp.listFineTuneEventsHttp(request, fineTuneId, stream);
    }

    @ApiAction
    public Result listFineTunes(Http.Request request) throws Exception {
        return imp.listFineTunesHttp(request);
    }

    @ApiAction
    public Result listModels(Http.Request request) throws Exception {
        return imp.listModelsHttp(request);
    }

    @ApiAction
    public Result retrieveFile(Http.Request request, String fileId) throws Exception {
        return imp.retrieveFileHttp(request, fileId);
    }

    @ApiAction
    public Result retrieveFineTune(Http.Request request, String fineTuneId) throws Exception {
        return imp.retrieveFineTuneHttp(request, fineTuneId);
    }

    @ApiAction
    public Result retrieveModel(Http.Request request, String model) throws Exception {
        return imp.retrieveModelHttp(request, model);
    }

}
