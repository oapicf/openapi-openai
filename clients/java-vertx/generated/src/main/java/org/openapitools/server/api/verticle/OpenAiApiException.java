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

public final class OpenAiApiException extends MainApiException {
    public OpenAiApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OpenAiApiException OpenAi_cancelFineTune_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createChatCompletion_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createCompletion_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createEdit_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createEmbedding_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createFile_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createFineTune_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createImage_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createImageEdit_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createImageVariation_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createModeration_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createTranscription_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_createTranslation_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_deleteFile_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_deleteModel_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_downloadFile_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_listFiles_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_listFineTuneEvents_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_listFineTunes_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_listModels_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_retrieveFile_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_retrieveFineTune_200_Exception = new OpenAiApiException(200, "OK");
    public static final OpenAiApiException OpenAi_retrieveModel_200_Exception = new OpenAiApiException(200, "OK");
    

}