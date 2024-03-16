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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class OpenAiApiImpl implements OpenAiApi {
    public Future<ApiResponse<FineTune>> cancelFineTune(String fineTuneId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateChatCompletionResponse>> createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateCompletionResponse>> createCompletion(CreateCompletionRequest createCompletionRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateEditResponse>> createEdit(CreateEditRequest createEditRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateEmbeddingResponse>> createEmbedding(CreateEmbeddingRequest createEmbeddingRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<OpenAIFile>> createFile(FileUpload _file) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FineTune>> createFineTune(CreateFineTuneRequest createFineTuneRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ImagesResponse>> createImage(CreateImageRequest createImageRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ImagesResponse>> createImageEdit(FileUpload image, FileUpload mask) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ImagesResponse>> createImageVariation(FileUpload image) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateModerationResponse>> createModeration(CreateModerationRequest createModerationRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateTranscriptionResponse>> createTranscription(FileUpload _file) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateTranslationResponse>> createTranslation(FileUpload _file) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteFileResponse>> deleteFile(String fileId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteModelResponse>> deleteModel(String model) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> downloadFile(String fileId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListFilesResponse>> listFiles() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListFineTuneEventsResponse>> listFineTuneEvents(String fineTuneId, Boolean stream) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListFineTunesResponse>> listFineTunes() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListModelsResponse>> listModels() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<OpenAIFile>> retrieveFile(String fileId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FineTune>> retrieveFineTune(String fineTuneId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Model>> retrieveModel(String model) {
        return Future.failedFuture(new HttpException(501));
    }

}
