package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import org.openapitools.model.CreateChatCompletionRequest;
import org.openapitools.model.CreateChatCompletionResponse;
import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;
import org.openapitools.model.CreateEditRequest;
import org.openapitools.model.CreateEditResponse;
import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;
import org.openapitools.model.CreateFineTuneRequest;
import org.openapitools.model.CreateImageRequest;
import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranscriptionResponse;
import org.openapitools.model.CreateTranslationResponse;
import org.openapitools.model.DeleteFileResponse;
import org.openapitools.model.DeleteModelResponse;
import java.io.File;
import org.openapitools.model.FineTune;
import org.openapitools.model.ImagesResponse;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.ListFineTuneEventsResponse;
import org.openapitools.model.ListFineTunesResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;
import org.openapitools.model.OpenAIFile;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * OpenAI API
 *
 * <p>APIs for sampling from and fine-tuning language models
 *
 */
public class OpenAiApiServiceImpl implements OpenAiApi {
    /**
     * Immediately cancel a fine-tune job. 
     *
     */
    public FineTune cancelFineTune(String fineTuneId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates a model response for the given chat conversation.
     *
     */
    public CreateChatCompletionResponse createChatCompletion(CreateChatCompletionRequest createChatCompletionRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     *
     */
    public CreateCompletionResponse createCompletion(CreateCompletionRequest createCompletionRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     *
     */
    public CreateEditResponse createEdit(CreateEditRequest createEditRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates an embedding vector representing the input text.
     *
     */
    public CreateEmbeddingResponse createEmbedding(CreateEmbeddingRequest createEmbeddingRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     *
     */
    public OpenAIFile createFile( Attachment _fileDetail, String purpose) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     *
     */
    public FineTune createFineTune(CreateFineTuneRequest createFineTuneRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates an image given a prompt.
     *
     */
    public ImagesResponse createImage(CreateImageRequest createImageRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     *
     */
    public ImagesResponse createImageEdit( Attachment imageDetail, String prompt,  Attachment maskDetail, Integer n, String size, String responseFormat, String user) {
        // TODO: Implement...

        return null;
    }

    /**
     * Creates a variation of a given image.
     *
     */
    public ImagesResponse createImageVariation( Attachment imageDetail, Integer n, String size, String responseFormat, String user) {
        // TODO: Implement...

        return null;
    }

    /**
     * Classifies if text violates OpenAI&#39;s Content Policy
     *
     */
    public CreateModerationResponse createModeration(CreateModerationRequest createModerationRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Transcribes audio into the input language.
     *
     */
    public CreateTranscriptionResponse createTranscription( Attachment _fileDetail, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature, String language) {
        // TODO: Implement...

        return null;
    }

    /**
     * Translates audio into English.
     *
     */
    public CreateTranslationResponse createTranslation( Attachment _fileDetail, CreateTranscriptionRequestModel model, String prompt, String responseFormat, BigDecimal temperature) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete a file.
     *
     */
    public DeleteFileResponse deleteFile(String fileId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     *
     */
    public DeleteModelResponse deleteModel(String model) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns the contents of the specified file
     *
     */
    public String downloadFile(String fileId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns a list of files that belong to the user&#39;s organization.
     *
     */
    public ListFilesResponse listFiles() {
        // TODO: Implement...

        return null;
    }

    /**
     * Get fine-grained status updates for a fine-tune job. 
     *
     */
    public ListFineTuneEventsResponse listFineTuneEvents(String fineTuneId, Boolean stream) {
        // TODO: Implement...

        return null;
    }

    /**
     * List your organization&#39;s fine-tuning jobs 
     *
     */
    public ListFineTunesResponse listFineTunes() {
        // TODO: Implement...

        return null;
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     */
    public ListModelsResponse listModels() {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns information about a specific file.
     *
     */
    public OpenAIFile retrieveFile(String fileId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     *
     */
    public FineTune retrieveFineTune(String fineTuneId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     */
    public Model retrieveModel(String model) {
        // TODO: Implement...

        return null;
    }

}
