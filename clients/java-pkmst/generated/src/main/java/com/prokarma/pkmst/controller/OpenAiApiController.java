package com.prokarma.pkmst.controller;

import java.math.BigDecimal;
import com.prokarma.pkmst.model.CreateChatCompletionRequest;
import com.prokarma.pkmst.model.CreateChatCompletionResponse;
import com.prokarma.pkmst.model.CreateCompletionRequest;
import com.prokarma.pkmst.model.CreateCompletionResponse;
import com.prokarma.pkmst.model.CreateEditRequest;
import com.prokarma.pkmst.model.CreateEditResponse;
import com.prokarma.pkmst.model.CreateEmbeddingRequest;
import com.prokarma.pkmst.model.CreateEmbeddingResponse;
import com.prokarma.pkmst.model.CreateFineTuneRequest;
import com.prokarma.pkmst.model.CreateImageRequest;
import com.prokarma.pkmst.model.CreateModerationRequest;
import com.prokarma.pkmst.model.CreateModerationResponse;
import com.prokarma.pkmst.model.CreateTranscriptionRequestModel;
import com.prokarma.pkmst.model.CreateTranscriptionResponse;
import com.prokarma.pkmst.model.CreateTranslationResponse;
import com.prokarma.pkmst.model.DeleteFileResponse;
import com.prokarma.pkmst.model.DeleteModelResponse;
import java.io.File;
import com.prokarma.pkmst.model.FineTune;
import com.prokarma.pkmst.model.ImagesResponse;
import com.prokarma.pkmst.model.ListFilesResponse;
import com.prokarma.pkmst.model.ListFineTuneEventsResponse;
import com.prokarma.pkmst.model.ListFineTunesResponse;
import com.prokarma.pkmst.model.ListModelsResponse;
import com.prokarma.pkmst.model.Model;
import com.prokarma.pkmst.model.OpenAIFile;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-16T01:12:49.513446343Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
public class OpenAiApiController implements OpenAiApi {
    private final ObjectMapper objectMapper;
@Autowired
    public OpenAiApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<FineTune> cancelFineTune(@ApiParam(value = "The ID of the fine-tune job to cancel ",required=true ) @PathVariable("fine_tune_id") String fineTuneId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FineTune>(objectMapper.readValue("", FineTune.class), HttpStatus.OK);
        }

        return new ResponseEntity<FineTune>(HttpStatus.OK);
    }

    public ResponseEntity<CreateChatCompletionResponse> createChatCompletion(@ApiParam(value = "" ,required=true )   @RequestBody CreateChatCompletionRequest createChatCompletionRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateChatCompletionResponse>(objectMapper.readValue("", CreateChatCompletionResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateChatCompletionResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CreateCompletionResponse> createCompletion(@ApiParam(value = "" ,required=true )   @RequestBody CreateCompletionRequest createCompletionRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateCompletionResponse>(objectMapper.readValue("", CreateCompletionResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateCompletionResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CreateEditResponse> createEdit(@ApiParam(value = "" ,required=true )   @RequestBody CreateEditRequest createEditRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateEditResponse>(objectMapper.readValue("", CreateEditResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateEditResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CreateEmbeddingResponse> createEmbedding(@ApiParam(value = "" ,required=true )   @RequestBody CreateEmbeddingRequest createEmbeddingRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateEmbeddingResponse>(objectMapper.readValue("", CreateEmbeddingResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateEmbeddingResponse>(HttpStatus.OK);
    }

    public ResponseEntity<OpenAIFile> createFile(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile file,
        @ApiParam(value = "The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. ", required=true) @RequestPart(value="purpose", required=true)  String purpose,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OpenAIFile>(objectMapper.readValue("", OpenAIFile.class), HttpStatus.OK);
        }

        return new ResponseEntity<OpenAIFile>(HttpStatus.OK);
    }

    public ResponseEntity<FineTune> createFineTune(@ApiParam(value = "" ,required=true )   @RequestBody CreateFineTuneRequest createFineTuneRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FineTune>(objectMapper.readValue("", FineTune.class), HttpStatus.OK);
        }

        return new ResponseEntity<FineTune>(HttpStatus.OK);
    }

    public ResponseEntity<ImagesResponse> createImage(@ApiParam(value = "" ,required=true )   @RequestBody CreateImageRequest createImageRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ImagesResponse>(objectMapper.readValue("", ImagesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ImagesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ImagesResponse> createImageEdit(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile image,
        @ApiParam(value = "A text description of the desired image(s). The maximum length is 1000 characters.", required=true) @RequestPart(value="prompt", required=true)  String prompt,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile mask,
        @ApiParam(value = "The number of images to generate. Must be between 1 and 10.", defaultValue="1") @RequestPart(value="n", required=false)  Integer n,
        @ApiParam(value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", allowableValues="256x256, 512x512, 1024x1024", defaultValue="1024x1024") @RequestPart(value="size", required=false)  String size,
        @ApiParam(value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.", allowableValues="url, b64_json", defaultValue="url") @RequestPart(value="response_format", required=false)  String responseFormat,
        @ApiParam(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ") @RequestPart(value="user", required=false)  String user,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ImagesResponse>(objectMapper.readValue("", ImagesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ImagesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ImagesResponse> createImageVariation(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile image,
        @ApiParam(value = "The number of images to generate. Must be between 1 and 10.", defaultValue="1") @RequestPart(value="n", required=false)  Integer n,
        @ApiParam(value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", allowableValues="256x256, 512x512, 1024x1024", defaultValue="1024x1024") @RequestPart(value="size", required=false)  String size,
        @ApiParam(value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.", allowableValues="url, b64_json", defaultValue="url") @RequestPart(value="response_format", required=false)  String responseFormat,
        @ApiParam(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ") @RequestPart(value="user", required=false)  String user,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ImagesResponse>(objectMapper.readValue("", ImagesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ImagesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CreateModerationResponse> createModeration(@ApiParam(value = "" ,required=true )   @RequestBody CreateModerationRequest createModerationRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateModerationResponse>(objectMapper.readValue("", CreateModerationResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateModerationResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CreateTranscriptionResponse> createTranscription(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile file,
        @ApiParam(value = "", required=true) @RequestPart(value="model", required=true)  CreateTranscriptionRequestModel model,
        @ApiParam(value = "An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. ") @RequestPart(value="prompt", required=false)  String prompt,
        @ApiParam(value = "The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. ", defaultValue="json") @RequestPart(value="response_format", required=false)  String responseFormat,
        @ApiParam(value = "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ", defaultValue="0") @RequestPart(value="temperature", required=false)  BigDecimal temperature,
        @ApiParam(value = "The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ") @RequestPart(value="language", required=false)  String language,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateTranscriptionResponse>(objectMapper.readValue("", CreateTranscriptionResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateTranscriptionResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CreateTranslationResponse> createTranslation(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile file,
        @ApiParam(value = "", required=true) @RequestPart(value="model", required=true)  CreateTranscriptionRequestModel model,
        @ApiParam(value = "An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. ") @RequestPart(value="prompt", required=false)  String prompt,
        @ApiParam(value = "The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. ", defaultValue="json") @RequestPart(value="response_format", required=false)  String responseFormat,
        @ApiParam(value = "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ", defaultValue="0") @RequestPart(value="temperature", required=false)  BigDecimal temperature,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateTranslationResponse>(objectMapper.readValue("", CreateTranslationResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateTranslationResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteFileResponse> deleteFile(@ApiParam(value = "The ID of the file to use for this request",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteFileResponse>(objectMapper.readValue("", DeleteFileResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteFileResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteModelResponse> deleteModel(@ApiParam(value = "The model to delete",required=true ) @PathVariable("model") String model,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteModelResponse>(objectMapper.readValue("", DeleteModelResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteModelResponse>(HttpStatus.OK);
    }

    public ResponseEntity<String> downloadFile(@ApiParam(value = "The ID of the file to use for this request",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    public ResponseEntity<ListFilesResponse> listFiles(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListFilesResponse>(objectMapper.readValue("", ListFilesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListFilesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListFineTuneEventsResponse> listFineTuneEvents(@ApiParam(value = "The ID of the fine-tune job to get events for. ",required=true ) @PathVariable("fine_tune_id") String fineTuneId,
        @ApiParam(value = "Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. ", defaultValue = "false")  @RequestParam(value = "stream", required = false, defaultValue="false") Boolean stream,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListFineTuneEventsResponse>(objectMapper.readValue("", ListFineTuneEventsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListFineTuneEventsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListFineTunesResponse> listFineTunes(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListFineTunesResponse>(objectMapper.readValue("", ListFineTunesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListFineTunesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ListModelsResponse> listModels(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ListModelsResponse>(objectMapper.readValue("", ListModelsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ListModelsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<OpenAIFile> retrieveFile(@ApiParam(value = "The ID of the file to use for this request",required=true ) @PathVariable("file_id") String fileId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<OpenAIFile>(objectMapper.readValue("", OpenAIFile.class), HttpStatus.OK);
        }

        return new ResponseEntity<OpenAIFile>(HttpStatus.OK);
    }

    public ResponseEntity<FineTune> retrieveFineTune(@ApiParam(value = "The ID of the fine-tune job ",required=true ) @PathVariable("fine_tune_id") String fineTuneId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<FineTune>(objectMapper.readValue("", FineTune.class), HttpStatus.OK);
        }

        return new ResponseEntity<FineTune>(HttpStatus.OK);
    }

    public ResponseEntity<Model> retrieveModel(@ApiParam(value = "The ID of the model to use for this request",required=true ) @PathVariable("model") String model,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Model>(objectMapper.readValue("", Model.class), HttpStatus.OK);
        }

        return new ResponseEntity<Model>(HttpStatus.OK);
    }

}
