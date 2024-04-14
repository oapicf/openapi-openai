package com.prokarma.pkmst.controller;

import java.math.BigDecimal;
import com.prokarma.pkmst.model.CreateSpeechRequest;
import com.prokarma.pkmst.model.CreateTranscription200Response;
import com.prokarma.pkmst.model.CreateTranscriptionRequestModel;
import com.prokarma.pkmst.model.CreateTranslation200Response;
import java.io.File;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-04-14T13:39:11.640510243Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
public class AudioApiController implements AudioApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AudioApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<File> createSpeech(@ApiParam(value = "" ,required=true )   @RequestBody CreateSpeechRequest createSpeechRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }

    public ResponseEntity<CreateTranscription200Response> createTranscription(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile file,
        @ApiParam(value = "", required=true) @RequestPart(value="model", required=true)  CreateTranscriptionRequestModel model,
        @ApiParam(value = "The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ") @RequestPart(value="language", required=false)  String language,
        @ApiParam(value = "An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. ") @RequestPart(value="prompt", required=false)  String prompt,
        @ApiParam(value = "The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. ", allowableValues="json, text, srt, verbose_json, vtt", defaultValue="json") @RequestPart(value="response_format", required=false)  String responseFormat,
        @ApiParam(value = "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ", defaultValue="0") @RequestPart(value="temperature", required=false)  BigDecimal temperature,
        @ApiParam(value = "The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. ", allowableValues="word, segment") @RequestPart(value="timestamp_granularities[]", required=false)  List<String> timestampGranularities,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateTranscription200Response>(objectMapper.readValue("", CreateTranscription200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateTranscription200Response>(HttpStatus.OK);
    }

    public ResponseEntity<CreateTranslation200Response> createTranslation(@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile file,
        @ApiParam(value = "", required=true) @RequestPart(value="model", required=true)  CreateTranscriptionRequestModel model,
        @ApiParam(value = "An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. ") @RequestPart(value="prompt", required=false)  String prompt,
        @ApiParam(value = "The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. ", defaultValue="json") @RequestPart(value="response_format", required=false)  String responseFormat,
        @ApiParam(value = "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ", defaultValue="0") @RequestPart(value="temperature", required=false)  BigDecimal temperature,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CreateTranslation200Response>(objectMapper.readValue("", CreateTranslation200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<CreateTranslation200Response>(HttpStatus.OK);
    }

}
