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

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OpenAiApiControllerImp extends OpenAiApiControllerImpInterface {
    @Override
    public FineTune cancelFineTune(Http.Request request, String fineTuneId) throws Exception {
        //Do your magic!!!
        return new FineTune();
    }

    @Override
    public CreateChatCompletionResponse createChatCompletion(Http.Request request, CreateChatCompletionRequest createChatCompletionRequest) throws Exception {
        //Do your magic!!!
        return new CreateChatCompletionResponse();
    }

    @Override
    public CreateCompletionResponse createCompletion(Http.Request request, CreateCompletionRequest createCompletionRequest) throws Exception {
        //Do your magic!!!
        return new CreateCompletionResponse();
    }

    @Override
    public CreateEditResponse createEdit(Http.Request request, CreateEditRequest createEditRequest) throws Exception {
        //Do your magic!!!
        return new CreateEditResponse();
    }

    @Override
    public CreateEmbeddingResponse createEmbedding(Http.Request request, CreateEmbeddingRequest createEmbeddingRequest) throws Exception {
        //Do your magic!!!
        return new CreateEmbeddingResponse();
    }

    @Override
    public OpenAIFile createFile(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, String purpose) throws Exception {
        //Do your magic!!!
        return new OpenAIFile();
    }

    @Override
    public FineTune createFineTune(Http.Request request, CreateFineTuneRequest createFineTuneRequest) throws Exception {
        //Do your magic!!!
        return new FineTune();
    }

    @Override
    public ImagesResponse createImage(Http.Request request, CreateImageRequest createImageRequest) throws Exception {
        //Do your magic!!!
        return new ImagesResponse();
    }

    @Override
    public ImagesResponse createImageEdit(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, String prompt, Http.MultipartFormData.FilePart<TemporaryFile> mask, Integer n, String size, String responseFormat, String user) throws Exception {
        //Do your magic!!!
        return new ImagesResponse();
    }

    @Override
    public ImagesResponse createImageVariation(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> image, Integer n, String size, String responseFormat, String user) throws Exception {
        //Do your magic!!!
        return new ImagesResponse();
    }

    @Override
    public CreateModerationResponse createModeration(Http.Request request, CreateModerationRequest createModerationRequest) throws Exception {
        //Do your magic!!!
        return new CreateModerationResponse();
    }

    @Override
    public CreateTranscriptionResponse createTranscription(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, String language) throws Exception {
        //Do your magic!!!
        return new CreateTranscriptionResponse();
    }

    @Override
    public CreateTranslationResponse createTranslation(Http.Request request, Http.MultipartFormData.FilePart<TemporaryFile> _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature) throws Exception {
        //Do your magic!!!
        return new CreateTranslationResponse();
    }

    @Override
    public DeleteFileResponse deleteFile(Http.Request request, String fileId) throws Exception {
        //Do your magic!!!
        return new DeleteFileResponse();
    }

    @Override
    public DeleteModelResponse deleteModel(Http.Request request, String model) throws Exception {
        //Do your magic!!!
        return new DeleteModelResponse();
    }

    @Override
    public String downloadFile(Http.Request request, String fileId) throws Exception {
        //Do your magic!!!
        return new String();
    }

    @Override
    public ListFilesResponse listFiles(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ListFilesResponse();
    }

    @Override
    public ListFineTuneEventsResponse listFineTuneEvents(Http.Request request, String fineTuneId, Boolean stream) throws Exception {
        //Do your magic!!!
        return new ListFineTuneEventsResponse();
    }

    @Override
    public ListFineTunesResponse listFineTunes(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ListFineTunesResponse();
    }

    @Override
    public ListModelsResponse listModels(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ListModelsResponse();
    }

    @Override
    public OpenAIFile retrieveFile(Http.Request request, String fileId) throws Exception {
        //Do your magic!!!
        return new OpenAIFile();
    }

    @Override
    public FineTune retrieveFineTune(Http.Request request, String fineTuneId) throws Exception {
        //Do your magic!!!
        return new FineTune();
    }

    @Override
    public Model retrieveModel(Http.Request request, String model) throws Exception {
        //Do your magic!!!
        return new Model();
    }

}
