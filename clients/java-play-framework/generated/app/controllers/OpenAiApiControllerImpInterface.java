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
public abstract class OpenAiApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result cancelFineTuneHttp(Http.Request request, String fineTuneId) throws Exception {
        FineTune obj = cancelFineTune(request, fineTuneId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FineTune cancelFineTune(Http.Request request, String fineTuneId) throws Exception;

    public Result createChatCompletionHttp(Http.Request request, CreateChatCompletionRequest createChatCompletionRequest) throws Exception {
        CreateChatCompletionResponse obj = createChatCompletion(request, createChatCompletionRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateChatCompletionResponse createChatCompletion(Http.Request request, CreateChatCompletionRequest createChatCompletionRequest) throws Exception;

    public Result createCompletionHttp(Http.Request request, CreateCompletionRequest createCompletionRequest) throws Exception {
        CreateCompletionResponse obj = createCompletion(request, createCompletionRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateCompletionResponse createCompletion(Http.Request request, CreateCompletionRequest createCompletionRequest) throws Exception;

    public Result createEditHttp(Http.Request request, CreateEditRequest createEditRequest) throws Exception {
        CreateEditResponse obj = createEdit(request, createEditRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateEditResponse createEdit(Http.Request request, CreateEditRequest createEditRequest) throws Exception;

    public Result createEmbeddingHttp(Http.Request request, CreateEmbeddingRequest createEmbeddingRequest) throws Exception {
        CreateEmbeddingResponse obj = createEmbedding(request, createEmbeddingRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateEmbeddingResponse createEmbedding(Http.Request request, CreateEmbeddingRequest createEmbeddingRequest) throws Exception;

    public Result createFileHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, String purpose) throws Exception {
        OpenAIFile obj = createFile(request, _file, purpose);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OpenAIFile createFile(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, String purpose) throws Exception;

    public Result createFineTuneHttp(Http.Request request, CreateFineTuneRequest createFineTuneRequest) throws Exception {
        FineTune obj = createFineTune(request, createFineTuneRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FineTune createFineTune(Http.Request request, CreateFineTuneRequest createFineTuneRequest) throws Exception;

    public Result createImageHttp(Http.Request request, CreateImageRequest createImageRequest) throws Exception {
        ImagesResponse obj = createImage(request, createImageRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ImagesResponse createImage(Http.Request request, CreateImageRequest createImageRequest) throws Exception;

    public Result createImageEditHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, String prompt, Http.MultipartFormData.FilePart<TemporaryFile> mask, Integer n, String size, String responseFormat, String user) throws Exception {
        ImagesResponse obj = createImageEdit(request, image, prompt, mask, n, size, responseFormat, user);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ImagesResponse createImageEdit(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, String prompt, Http.MultipartFormData.FilePart<TemporaryFile> mask, Integer n, String size, String responseFormat, String user) throws Exception;

    public Result createImageVariationHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, Integer n, String size, String responseFormat, String user) throws Exception {
        ImagesResponse obj = createImageVariation(request, image, n, size, responseFormat, user);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ImagesResponse createImageVariation(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, Integer n, String size, String responseFormat, String user) throws Exception;

    public Result createModerationHttp(Http.Request request, CreateModerationRequest createModerationRequest) throws Exception {
        CreateModerationResponse obj = createModeration(request, createModerationRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateModerationResponse createModeration(Http.Request request, CreateModerationRequest createModerationRequest) throws Exception;

    public Result createTranscriptionHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, String language) throws Exception {
        CreateTranscriptionResponse obj = createTranscription(request, _file, model, prompt, responseFormat, temperature, language);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateTranscriptionResponse createTranscription(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, String language) throws Exception;

    public Result createTranslationHttp(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature) throws Exception {
        CreateTranslationResponse obj = createTranslation(request, _file, model, prompt, responseFormat, temperature);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract CreateTranslationResponse createTranslation(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature) throws Exception;

    public Result deleteFileHttp(Http.Request request, String fileId) throws Exception {
        DeleteFileResponse obj = deleteFile(request, fileId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteFileResponse deleteFile(Http.Request request, String fileId) throws Exception;

    public Result deleteModelHttp(Http.Request request, String model) throws Exception {
        DeleteModelResponse obj = deleteModel(request, model);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteModelResponse deleteModel(Http.Request request, String model) throws Exception;

    public Result downloadFileHttp(Http.Request request, String fileId) throws Exception {
        String obj = downloadFile(request, fileId);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract String downloadFile(Http.Request request, String fileId) throws Exception;

    public Result listFilesHttp(Http.Request request) throws Exception {
        ListFilesResponse obj = listFiles(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListFilesResponse listFiles(Http.Request request) throws Exception;

    public Result listFineTuneEventsHttp(Http.Request request, String fineTuneId, Boolean stream) throws Exception {
        ListFineTuneEventsResponse obj = listFineTuneEvents(request, fineTuneId, stream);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListFineTuneEventsResponse listFineTuneEvents(Http.Request request, String fineTuneId, Boolean stream) throws Exception;

    public Result listFineTunesHttp(Http.Request request) throws Exception {
        ListFineTunesResponse obj = listFineTunes(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListFineTunesResponse listFineTunes(Http.Request request) throws Exception;

    public Result listModelsHttp(Http.Request request) throws Exception {
        ListModelsResponse obj = listModels(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListModelsResponse listModels(Http.Request request) throws Exception;

    public Result retrieveFileHttp(Http.Request request, String fileId) throws Exception {
        OpenAIFile obj = retrieveFile(request, fileId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract OpenAIFile retrieveFile(Http.Request request, String fileId) throws Exception;

    public Result retrieveFineTuneHttp(Http.Request request, String fineTuneId) throws Exception {
        FineTune obj = retrieveFineTune(request, fineTuneId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract FineTune retrieveFineTune(Http.Request request, String fineTuneId) throws Exception;

    public Result retrieveModelHttp(Http.Request request, String model) throws Exception {
        Model obj = retrieveModel(request, model);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Model retrieveModel(Http.Request request, String model) throws Exception;

}
