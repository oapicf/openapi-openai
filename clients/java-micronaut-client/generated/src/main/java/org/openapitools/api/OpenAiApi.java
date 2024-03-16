/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
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
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-03-16T01:12:32.706318857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Client("${openapi-micronaut-client-base-path}")
public interface OpenAiApi {
    /**
     * Immediately cancel a fine-tune job. 
     *
     * @param fineTuneId The ID of the fine-tune job to cancel  (required)
     * @return FineTune
     */
    @Post(uri="/fine-tunes/{fine_tune_id}/cancel")
    @Consumes({"application/json"})
    Mono<FineTune> cancelFineTune(
        @PathVariable(name="fine_tune_id") @NotNull String fineTuneId
    );

    /**
     * Creates a model response for the given chat conversation.
     *
     * @param createChatCompletionRequest  (required)
     * @return CreateChatCompletionResponse
     */
    @Post(uri="/chat/completions")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<CreateChatCompletionResponse> createChatCompletion(
        @Body @NotNull @Valid CreateChatCompletionRequest createChatCompletionRequest
    );

    /**
     * Creates a completion for the provided prompt and parameters.
     *
     * @param createCompletionRequest  (required)
     * @return CreateCompletionResponse
     */
    @Post(uri="/completions")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<CreateCompletionResponse> createCompletion(
        @Body @NotNull @Valid CreateCompletionRequest createCompletionRequest
    );

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     *
     * @param createEditRequest  (required)
     * @return CreateEditResponse
     */
    @Post(uri="/edits")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<CreateEditResponse> createEdit(
        @Body @NotNull @Valid CreateEditRequest createEditRequest
    );

    /**
     * Creates an embedding vector representing the input text.
     *
     * @param createEmbeddingRequest  (required)
     * @return CreateEmbeddingResponse
     */
    @Post(uri="/embeddings")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<CreateEmbeddingResponse> createEmbedding(
        @Body @NotNull @Valid CreateEmbeddingRequest createEmbeddingRequest
    );

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     *
     * @param _file Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  (required)
     * @param purpose The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  (required)
     * @return OpenAIFile
     */
    @Post(uri="/files")
    @Consumes({"application/json"})
    @Produces({"multipart/form-data"})
    Mono<OpenAIFile> createFile(
        @NotNull File _file, 
        @NotNull String purpose
    );

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     *
     * @param createFineTuneRequest  (required)
     * @return FineTune
     */
    @Post(uri="/fine-tunes")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<FineTune> createFineTune(
        @Body @NotNull @Valid CreateFineTuneRequest createFineTuneRequest
    );

    /**
     * Creates an image given a prompt.
     *
     * @param createImageRequest  (required)
     * @return ImagesResponse
     */
    @Post(uri="/images/generations")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<ImagesResponse> createImage(
        @Body @NotNull @Valid CreateImageRequest createImageRequest
    );

    /**
     * Creates an edited or extended image given an original image and a prompt.
     *
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. (required)
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters. (required)
     * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. (optional)
     * @param n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to 1024x1024)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to url)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @return ImagesResponse
     */
    @Post(uri="/images/edits")
    @Consumes({"application/json"})
    @Produces({"multipart/form-data"})
    Mono<ImagesResponse> createImageEdit(
        @NotNull File image, 
        @NotNull String prompt, 
        @Nullable File mask, 
        @Nullable @Min(1) @Max(10) Integer n, 
        @Nullable String size, 
        @Nullable String responseFormat, 
        @Nullable String user
    );

    /**
     * Creates a variation of a given image.
     *
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. (required)
     * @param n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to 1024x1024)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to url)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @return ImagesResponse
     */
    @Post(uri="/images/variations")
    @Consumes({"application/json"})
    @Produces({"multipart/form-data"})
    Mono<ImagesResponse> createImageVariation(
        @NotNull File image, 
        @Nullable @Min(1) @Max(10) Integer n, 
        @Nullable String size, 
        @Nullable String responseFormat, 
        @Nullable String user
    );

    /**
     * Classifies if text violates OpenAI&#39;s Content Policy
     *
     * @param createModerationRequest  (required)
     * @return CreateModerationResponse
     */
    @Post(uri="/moderations")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<CreateModerationResponse> createModeration(
        @Body @NotNull @Valid CreateModerationRequest createModerationRequest
    );

    /**
     * Transcribes audio into the input language.
     *
     * @param _file The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  (required)
     * @param model  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
     * @return CreateTranscriptionResponse
     */
    @Post(uri="/audio/transcriptions")
    @Consumes({"application/json"})
    @Produces({"multipart/form-data"})
    Mono<CreateTranscriptionResponse> createTranscription(
        @NotNull File _file, 
        @NotNull @Valid CreateTranscriptionRequestModel model, 
        @Nullable String prompt, 
        @Nullable String responseFormat, 
        @Nullable BigDecimal temperature, 
        @Nullable String language
    );

    /**
     * Translates audio into English.
     *
     * @param _file The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  (required)
     * @param model  (required)
     * @param prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional, default to json)
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional, default to 0)
     * @return CreateTranslationResponse
     */
    @Post(uri="/audio/translations")
    @Consumes({"application/json"})
    @Produces({"multipart/form-data"})
    Mono<CreateTranslationResponse> createTranslation(
        @NotNull File _file, 
        @NotNull @Valid CreateTranscriptionRequestModel model, 
        @Nullable String prompt, 
        @Nullable String responseFormat, 
        @Nullable BigDecimal temperature
    );

    /**
     * Delete a file.
     *
     * @param fileId The ID of the file to use for this request (required)
     * @return DeleteFileResponse
     */
    @Delete(uri="/files/{file_id}")
    @Consumes({"application/json"})
    Mono<DeleteFileResponse> deleteFile(
        @PathVariable(name="file_id") @NotNull String fileId
    );

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     *
     * @param model The model to delete (required)
     * @return DeleteModelResponse
     */
    @Delete(uri="/models/{model}")
    @Consumes({"application/json"})
    Mono<DeleteModelResponse> deleteModel(
        @PathVariable(name="model") @NotNull String model
    );

    /**
     * Returns the contents of the specified file
     *
     * @param fileId The ID of the file to use for this request (required)
     * @return String
     */
    @Get(uri="/files/{file_id}/content")
    @Consumes({"application/json"})
    Mono<String> downloadFile(
        @PathVariable(name="file_id") @NotNull String fileId
    );

    /**
     * Returns a list of files that belong to the user&#39;s organization.
     *
     * @return ListFilesResponse
     */
    @Get(uri="/files")
    @Consumes({"application/json"})
    Mono<ListFilesResponse> listFiles();

    /**
     * Get fine-grained status updates for a fine-tune job. 
     *
     * @param fineTuneId The ID of the fine-tune job to get events for.  (required)
     * @param stream Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional, default to false)
     * @return ListFineTuneEventsResponse
     */
    @Get(uri="/fine-tunes/{fine_tune_id}/events")
    @Consumes({"application/json"})
    Mono<ListFineTuneEventsResponse> listFineTuneEvents(
        @PathVariable(name="fine_tune_id") @NotNull String fineTuneId, 
        @QueryValue(value="stream", defaultValue="false") @Nullable Boolean stream
    );

    /**
     * List your organization&#39;s fine-tuning jobs 
     *
     * @return ListFineTunesResponse
     */
    @Get(uri="/fine-tunes")
    @Consumes({"application/json"})
    Mono<ListFineTunesResponse> listFineTunes();

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     * @return ListModelsResponse
     */
    @Get(uri="/models")
    @Consumes({"application/json"})
    Mono<ListModelsResponse> listModels();

    /**
     * Returns information about a specific file.
     *
     * @param fileId The ID of the file to use for this request (required)
     * @return OpenAIFile
     */
    @Get(uri="/files/{file_id}")
    @Consumes({"application/json"})
    Mono<OpenAIFile> retrieveFile(
        @PathVariable(name="file_id") @NotNull String fileId
    );

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     *
     * @param fineTuneId The ID of the fine-tune job  (required)
     * @return FineTune
     */
    @Get(uri="/fine-tunes/{fine_tune_id}")
    @Consumes({"application/json"})
    Mono<FineTune> retrieveFineTune(
        @PathVariable(name="fine_tune_id") @NotNull String fineTuneId
    );

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     * @param model The ID of the model to use for this request (required)
     * @return Model
     */
    @Get(uri="/models/{model}")
    @Consumes({"application/json"})
    Mono<Model> retrieveModel(
        @PathVariable(name="model") @NotNull String model
    );

}
