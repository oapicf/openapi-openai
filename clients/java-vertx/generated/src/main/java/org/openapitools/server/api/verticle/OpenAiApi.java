package org.openapitools.server.api.verticle;

import java.math.BigDecimal;
import org.openapitools.server.api.model.CreateChatCompletionRequest;
import org.openapitools.server.api.model.CreateChatCompletionResponse;
import org.openapitools.server.api.model.CreateCompletionRequest;
import org.openapitools.server.api.model.CreateCompletionResponse;
import org.openapitools.server.api.model.CreateEditRequest;
import org.openapitools.server.api.model.CreateEditResponse;
import org.openapitools.server.api.model.CreateEmbeddingRequest;
import org.openapitools.server.api.model.CreateEmbeddingResponse;
import org.openapitools.server.api.model.CreateFineTuneRequest;
import org.openapitools.server.api.model.CreateImageRequest;
import org.openapitools.server.api.model.CreateModerationRequest;
import org.openapitools.server.api.model.CreateModerationResponse;
import org.openapitools.server.api.model.CreateTranscriptionRequestModel;
import org.openapitools.server.api.model.CreateTranscriptionResponse;
import org.openapitools.server.api.model.CreateTranslationResponse;
import org.openapitools.server.api.model.DeleteFileResponse;
import org.openapitools.server.api.model.DeleteModelResponse;
import java.io.File;
import org.openapitools.server.api.model.FineTune;
import org.openapitools.server.api.model.ImagesResponse;
import org.openapitools.server.api.model.ListFilesResponse;
import org.openapitools.server.api.model.ListFineTuneEventsResponse;
import org.openapitools.server.api.model.ListFineTunesResponse;
import org.openapitools.server.api.model.ListModelsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Model;
import org.openapitools.server.api.model.OpenAIFile;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface OpenAiApi  {
    //cancelFineTune
    void cancelFineTune(String fineTuneId, Handler<AsyncResult<FineTune>> handler);

    //createChatCompletion
    void createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest, Handler<AsyncResult<CreateChatCompletionResponse>> handler);

    //createCompletion
    void createCompletion(CreateCompletionRequest createCompletionRequest, Handler<AsyncResult<CreateCompletionResponse>> handler);

    //createEdit
    void createEdit(CreateEditRequest createEditRequest, Handler<AsyncResult<CreateEditResponse>> handler);

    //createEmbedding
    void createEmbedding(CreateEmbeddingRequest createEmbeddingRequest, Handler<AsyncResult<CreateEmbeddingResponse>> handler);

    //createFile
    void createFile(File _file, String purpose, Handler<AsyncResult<OpenAIFile>> handler);

    //createFineTune
    void createFineTune(CreateFineTuneRequest createFineTuneRequest, Handler<AsyncResult<FineTune>> handler);

    //createImage
    void createImage(CreateImageRequest createImageRequest, Handler<AsyncResult<ImagesResponse>> handler);

    //createImageEdit
    void createImageEdit(File image, String prompt, File mask, Integer n, String size, String responseFormat, String user, Handler<AsyncResult<ImagesResponse>> handler);

    //createImageVariation
    void createImageVariation(File image, Integer n, String size, String responseFormat, String user, Handler<AsyncResult<ImagesResponse>> handler);

    //createModeration
    void createModeration(CreateModerationRequest createModerationRequest, Handler<AsyncResult<CreateModerationResponse>> handler);

    //createTranscription
    void createTranscription(File _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, String language, Handler<AsyncResult<CreateTranscriptionResponse>> handler);

    //createTranslation
    void createTranslation(File _file, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, Handler<AsyncResult<CreateTranslationResponse>> handler);

    //deleteFile
    void deleteFile(String fileId, Handler<AsyncResult<DeleteFileResponse>> handler);

    //deleteModel
    void deleteModel(String model, Handler<AsyncResult<DeleteModelResponse>> handler);

    //downloadFile
    void downloadFile(String fileId, Handler<AsyncResult<String>> handler);

    //listFiles
    void listFiles(Handler<AsyncResult<ListFilesResponse>> handler);

    //listFineTuneEvents
    void listFineTuneEvents(String fineTuneId, Boolean stream, Handler<AsyncResult<ListFineTuneEventsResponse>> handler);

    //listFineTunes
    void listFineTunes(Handler<AsyncResult<ListFineTunesResponse>> handler);

    //listModels
    void listModels(Handler<AsyncResult<ListModelsResponse>> handler);

    //retrieveFile
    void retrieveFile(String fileId, Handler<AsyncResult<OpenAIFile>> handler);

    //retrieveFineTune
    void retrieveFineTune(String fineTuneId, Handler<AsyncResult<FineTune>> handler);

    //retrieveModel
    void retrieveModel(String model, Handler<AsyncResult<Model>> handler);

}
