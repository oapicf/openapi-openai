package org.openapitools.api;

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
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OpenAI API
 *
 * <p>APIs for sampling from and fine-tuning language models
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface OpenAiApi  {

    /**
     * Immediately cancel a fine-tune job. 
     *
     */
    @POST
    @Path("/fine-tunes/{fine_tune_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Immediately cancel a fine-tune job. ", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTune.class) })
    public FineTune cancelFineTune(@PathParam("fine_tune_id") String fineTuneId);

    /**
     * Creates a model response for the given chat conversation.
     *
     */
    @POST
    @Path("/chat/completions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a model response for the given chat conversation.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateChatCompletionResponse.class) })
    public CreateChatCompletionResponse createChatCompletion(@Valid CreateChatCompletionRequest createChatCompletionRequest);

    /**
     * Creates a completion for the provided prompt and parameters.
     *
     */
    @POST
    @Path("/completions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a completion for the provided prompt and parameters.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateCompletionResponse.class) })
    public CreateCompletionResponse createCompletion(@Valid CreateCompletionRequest createCompletionRequest);

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     *
     */
    @POST
    @Path("/edits")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a new edit for the provided input, instruction, and parameters.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateEditResponse.class) })
    public CreateEditResponse createEdit(@Valid CreateEditRequest createEditRequest);

    /**
     * Creates an embedding vector representing the input text.
     *
     */
    @POST
    @Path("/embeddings")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an embedding vector representing the input text.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateEmbeddingResponse.class) })
    public CreateEmbeddingResponse createEmbedding(@Valid CreateEmbeddingRequest createEmbeddingRequest);

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     *
     */
    @POST
    @Path("/files")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. ", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public OpenAIFile createFile( @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "purpose")  String purpose);

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     *
     */
    @POST
    @Path("/fine-tunes")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTune.class) })
    public FineTune createFineTune(@Valid CreateFineTuneRequest createFineTuneRequest);

    /**
     * Creates an image given a prompt.
     *
     */
    @POST
    @Path("/images/generations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an image given a prompt.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public ImagesResponse createImage(@Valid CreateImageRequest createImageRequest);

    /**
     * Creates an edited or extended image given an original image and a prompt.
     *
     */
    @POST
    @Path("/images/edits")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an edited or extended image given an original image and a prompt.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public ImagesResponse createImageEdit( @Multipart(value = "image" ) Attachment imageDetail, @Multipart(value = "prompt")  String prompt,  @Multipart(value = "mask" , required = false) Attachment maskDetail, @Multipart(value = "n", required = false)  Integer n, @Multipart(value = "size", required = false)  String size, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "user", required = false)  String user);

    /**
     * Creates a variation of a given image.
     *
     */
    @POST
    @Path("/images/variations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a variation of a given image.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public ImagesResponse createImageVariation( @Multipart(value = "image" ) Attachment imageDetail, @Multipart(value = "n", required = false)  Integer n, @Multipart(value = "size", required = false)  String size, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "user", required = false)  String user);

    /**
     * Classifies if text violates OpenAI&#39;s Content Policy
     *
     */
    @POST
    @Path("/moderations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Classifies if text violates OpenAI's Content Policy", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateModerationResponse.class) })
    public CreateModerationResponse createModeration(@Valid CreateModerationRequest createModerationRequest);

    /**
     * Transcribes audio into the input language.
     *
     */
    @POST
    @Path("/audio/transcriptions")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Transcribes audio into the input language.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranscriptionResponse.class) })
    public CreateTranscriptionResponse createTranscription( @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "model")  CreateTranscriptionRequestModel model, @Multipart(value = "prompt", required = false)  String prompt, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "temperature", required = false)  BigDecimal temperature, @Multipart(value = "language", required = false)  String language);

    /**
     * Translates audio into English.
     *
     */
    @POST
    @Path("/audio/translations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Translates audio into English.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranslationResponse.class) })
    public CreateTranslationResponse createTranslation( @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "model")  CreateTranscriptionRequestModel model, @Multipart(value = "prompt", required = false)  String prompt, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "temperature", required = false)  BigDecimal temperature);

    /**
     * Delete a file.
     *
     */
    @DELETE
    @Path("/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a file.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteFileResponse.class) })
    public DeleteFileResponse deleteFile(@PathParam("file_id") String fileId);

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     *
     */
    @DELETE
    @Path("/models/{model}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a fine-tuned model. You must have the Owner role in your organization.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteModelResponse.class) })
    public DeleteModelResponse deleteModel(@PathParam("model") String model);

    /**
     * Returns the contents of the specified file
     *
     */
    @GET
    @Path("/files/{file_id}/content")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns the contents of the specified file", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public String downloadFile(@PathParam("file_id") String fileId);

    /**
     * Returns a list of files that belong to the user&#39;s organization.
     *
     */
    @GET
    @Path("/files")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of files that belong to the user's organization.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFilesResponse.class) })
    public ListFilesResponse listFiles();

    /**
     * Get fine-grained status updates for a fine-tune job. 
     *
     */
    @GET
    @Path("/fine-tunes/{fine_tune_id}/events")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get fine-grained status updates for a fine-tune job. ", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFineTuneEventsResponse.class) })
    public ListFineTuneEventsResponse listFineTuneEvents(@PathParam("fine_tune_id") String fineTuneId, @QueryParam("stream") @DefaultValue("false") Boolean stream);

    /**
     * List your organization&#39;s fine-tuning jobs 
     *
     */
    @GET
    @Path("/fine-tunes")
    @Produces({ "application/json" })
    @ApiOperation(value = "List your organization's fine-tuning jobs ", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFineTunesResponse.class) })
    public ListFineTunesResponse listFineTunes();

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     */
    @GET
    @Path("/models")
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists the currently available models, and provides basic information about each one such as the owner and availability.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListModelsResponse.class) })
    public ListModelsResponse listModels();

    /**
     * Returns information about a specific file.
     *
     */
    @GET
    @Path("/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns information about a specific file.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OpenAIFile.class) })
    public OpenAIFile retrieveFile(@PathParam("file_id") String fileId);

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     *
     */
    @GET
    @Path("/fine-tunes/{fine_tune_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTune.class) })
    public FineTune retrieveFineTune(@PathParam("fine_tune_id") String fineTuneId);

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     */
    @GET
    @Path("/models/{model}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.", tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Model.class) })
    public Model retrieveModel(@PathParam("model") String model);
}
