/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI document version: 2.0.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>Immediately cancel a fine-tune job. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/fine-tunes/{fine_tune_id}/cancel" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>fine_tune_id</b>"
     * <p>The ID of the fine-tune job to cancel </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FineTune}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler cancelFineTune();

    /**
     * <p>Creates a model response for the given chat conversation.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/chat/completions" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateChatCompletionRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateChatCompletionResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createChatCompletion();

    /**
     * <p>Creates a completion for the provided prompt and parameters.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/completions" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateCompletionRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateCompletionResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createCompletion();

    /**
     * <p>Creates a new edit for the provided input, instruction, and parameters.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/edits" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateEditRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateEditResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createEdit();

    /**
     * <p>Creates an embedding vector representing the input text.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/embeddings" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateEmbeddingRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateEmbeddingResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createEmbedding();

    /**
     * <p>Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/files" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file</b>"
     * <p>Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). </p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>purpose</b>"
     * <p>The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link OpenAIFile}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createFile();

    /**
     * <p>Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/fine-tunes" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateFineTuneRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FineTune}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createFineTune();

    /**
     * <p>Creates an image given a prompt.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/images/generations" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateImageRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ImagesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createImage();

    /**
     * <p>Creates an edited or extended image given an original image and a prompt.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/images/edits" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>image</b>"
     * <p>The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.</p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>prompt</b>"
     * <p>A text description of the desired image(s). The maximum length is 1000 characters.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>mask</b>"
     * <p>An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.</p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>n</b>"
     * <p>The number of images to generate. Must be between 1 and 10.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>size</b>"
     * <p>The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>1024x1024</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>response_format</b>"
     * <p>The format in which the generated images are returned. Must be one of `url` or `b64_json`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>url</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user</b>"
     * <p>A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ImagesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createImageEdit();

    /**
     * <p>Creates a variation of a given image.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/images/variations" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>image</b>"
     * <p>The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.</p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>n</b>"
     * <p>The number of images to generate. Must be between 1 and 10.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>size</b>"
     * <p>The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>1024x1024</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>response_format</b>"
     * <p>The format in which the generated images are returned. Must be one of `url` or `b64_json`.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>url</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>user</b>"
     * <p>A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ImagesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createImageVariation();

    /**
     * <p>Classifies if text violates OpenAI's Content Policy</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/moderations" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateModerationRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateModerationResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createModeration();

    /**
     * <p>Transcribes audio into the input language.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/audio/transcriptions" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file</b>"
     * <p>The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. </p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>model</b>"
     * <p>
     * - Parameter type: <b>{@link CreateTranscriptionRequestModel}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>prompt</b>"
     * <p>An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>response_format</b>"
     * <p>The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>json</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>temperature</b>"
     * <p>The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. </p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>0</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>language</b>"
     * <p>The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateTranscriptionResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createTranscription();

    /**
     * <p>Translates audio into English.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v1/audio/translations" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file</b>"
     * <p>The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. </p>
     * <p>
     * - Parameter type: <b>BinaryFile</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>model</b>"
     * <p>
     * - Parameter type: <b>{@link CreateTranscriptionRequestModel}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>prompt</b>"
     * <p>An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>response_format</b>"
     * <p>The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>json</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>temperature</b>"
     * <p>The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. </p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Default value: <b>0</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=multipart/form-data}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateTranslationResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createTranslation();

    /**
     * <p>Delete a file.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/files/{file_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file_id</b>"
     * <p>The ID of the file to use for this request</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteFileResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteFile();

    /**
     * <p>Delete a fine-tuned model. You must have the Owner role in your organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v1/models/{model}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>model</b>"
     * <p>The model to delete</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteModelResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteModel();

    /**
     * <p>Returns the contents of the specified file</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/files/{file_id}/content" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file_id</b>"
     * <p>The ID of the file to use for this request</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link String}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler downloadFile();

    /**
     * <p>Returns a list of files that belong to the user's organization.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/files" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListFilesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listFiles();

    /**
     * <p>Get fine-grained status updates for a fine-tune job. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/fine-tunes/{fine_tune_id}/events" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>fine_tune_id</b>"
     * <p>The ID of the fine-tune job to get events for. </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>stream</b>"
     * <p>Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. </p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListFineTuneEventsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listFineTuneEvents();

    /**
     * <p>List your organization's fine-tuning jobs </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/fine-tunes" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListFineTunesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listFineTunes();

    /**
     * <p>Lists the currently available models, and provides basic information about each one such as the owner and availability.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/models" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ListModelsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler listModels();

    /**
     * <p>Returns information about a specific file.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/files/{file_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>file_id</b>"
     * <p>The ID of the file to use for this request</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link OpenAIFile}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveFile();

    /**
     * <p>Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/fine-tunes/{fine_tune_id}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>fine_tune_id</b>"
     * <p>The ID of the fine-tune job </p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FineTune}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveFineTune();

    /**
     * <p>Retrieves a model instance, providing basic information about the model such as the owner and permissioning.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/models/{model}" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>model</b>"
     * <p>The ID of the model to use for this request</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Model}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler retrieveModel();
}
