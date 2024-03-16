package org.openapitools.vertxweb.server.api;

import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequest;
import org.openapitools.vertxweb.server.model.CreateChatCompletionResponse;
import org.openapitools.vertxweb.server.model.CreateCompletionRequest;
import org.openapitools.vertxweb.server.model.CreateCompletionResponse;
import org.openapitools.vertxweb.server.model.CreateEditRequest;
import org.openapitools.vertxweb.server.model.CreateEditResponse;
import org.openapitools.vertxweb.server.model.CreateEmbeddingRequest;
import org.openapitools.vertxweb.server.model.CreateEmbeddingResponse;
import org.openapitools.vertxweb.server.model.CreateFineTuneRequest;
import org.openapitools.vertxweb.server.model.CreateImageRequest;
import org.openapitools.vertxweb.server.model.CreateModerationRequest;
import org.openapitools.vertxweb.server.model.CreateModerationResponse;
import org.openapitools.vertxweb.server.model.CreateTranscriptionRequestModel;
import org.openapitools.vertxweb.server.model.CreateTranscriptionResponse;
import org.openapitools.vertxweb.server.model.CreateTranslationResponse;
import org.openapitools.vertxweb.server.model.DeleteFileResponse;
import org.openapitools.vertxweb.server.model.DeleteModelResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.FineTune;
import org.openapitools.vertxweb.server.model.ImagesResponse;
import org.openapitools.vertxweb.server.model.ListFilesResponse;
import org.openapitools.vertxweb.server.model.ListFineTuneEventsResponse;
import org.openapitools.vertxweb.server.model.ListFineTunesResponse;
import org.openapitools.vertxweb.server.model.ListModelsResponse;
import org.openapitools.vertxweb.server.model.Model;
import org.openapitools.vertxweb.server.model.OpenAIFile;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface OpenAiApi  {
    Future<ApiResponse<FineTune>> cancelFineTune(String fineTuneId);
    Future<ApiResponse<CreateChatCompletionResponse>> createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest);
    Future<ApiResponse<CreateCompletionResponse>> createCompletion(CreateCompletionRequest createCompletionRequest);
    Future<ApiResponse<CreateEditResponse>> createEdit(CreateEditRequest createEditRequest);
    Future<ApiResponse<CreateEmbeddingResponse>> createEmbedding(CreateEmbeddingRequest createEmbeddingRequest);
    Future<ApiResponse<OpenAIFile>> createFile(FileUpload _file);
    Future<ApiResponse<FineTune>> createFineTune(CreateFineTuneRequest createFineTuneRequest);
    Future<ApiResponse<ImagesResponse>> createImage(CreateImageRequest createImageRequest);
    Future<ApiResponse<ImagesResponse>> createImageEdit(FileUpload image, FileUpload mask);
    Future<ApiResponse<ImagesResponse>> createImageVariation(FileUpload image);
    Future<ApiResponse<CreateModerationResponse>> createModeration(CreateModerationRequest createModerationRequest);
    Future<ApiResponse<CreateTranscriptionResponse>> createTranscription(FileUpload _file);
    Future<ApiResponse<CreateTranslationResponse>> createTranslation(FileUpload _file);
    Future<ApiResponse<DeleteFileResponse>> deleteFile(String fileId);
    Future<ApiResponse<DeleteModelResponse>> deleteModel(String model);
    Future<ApiResponse<String>> downloadFile(String fileId);
    Future<ApiResponse<ListFilesResponse>> listFiles();
    Future<ApiResponse<ListFineTuneEventsResponse>> listFineTuneEvents(String fineTuneId, Boolean stream);
    Future<ApiResponse<ListFineTunesResponse>> listFineTunes();
    Future<ApiResponse<ListModelsResponse>> listModels();
    Future<ApiResponse<OpenAIFile>> retrieveFile(String fileId);
    Future<ApiResponse<FineTune>> retrieveFineTune(String fineTuneId);
    Future<ApiResponse<Model>> retrieveModel(String model);
}
