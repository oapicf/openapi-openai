package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AudioApiService;
import org.openapitools.api.factories.AudioApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AudioResponseFormat;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/audio")


@io.swagger.annotations.Api(description = "the audio API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AudioApi  {
   private final AudioApiService delegate = AudioApiServiceFactory.getAudioApi();

    @POST
    @Path("/speech")
    @Consumes({ "application/json" })
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "Generates audio from the input text.", notes = "", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Audio", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = File.class) })
    public Response createSpeech(@ApiParam(value = "" ,required=true) CreateSpeechRequest createSpeechRequest
)
    throws NotFoundException {
        return delegate.createSpeech(createSpeechRequest);
    }
    @POST
    @Path("/transcriptions")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Transcribes audio into the input language.", notes = "", response = CreateTranscription200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Audio", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateTranscription200Response.class) })
    public Response createTranscription(
            @FormDataParam("file") InputStream _fileInputStream,
            @FormDataParam("file") FileInfo _fileDetail
,@ApiParam(value = "", required=true)@FormDataParam("model")  CreateTranscriptionRequestModel model
,@ApiParam(value = "The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. ")@FormDataParam("language")  String language
,@ApiParam(value = "An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should match the audio language. ")@FormDataParam("prompt")  String prompt
,@ApiParam(value = "", allowableValues="json, text, srt, verbose_json, vtt", defaultValue="json")@FormDataParam("response_format")  AudioResponseFormat responseFormat
,@ApiParam(value = "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ", defaultValue="0")@FormDataParam("temperature")  BigDecimal temperature
,@ApiParam(value = "The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. ", allowableValues="word, segment")@FormDataParam("timestamp_granularities[]")  List<String> timestampGranularities
)
    throws NotFoundException {
        return delegate.createTranscription(_fileInputStream, _fileDetail,model,language,prompt,responseFormat,temperature,timestampGranularities);
    }
    @POST
    @Path("/translations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Translates audio into English.", notes = "", response = CreateTranslation200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Audio", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateTranslation200Response.class) })
    public Response createTranslation(
            @FormDataParam("file") InputStream _fileInputStream,
            @FormDataParam("file") FileInfo _fileDetail
,@ApiParam(value = "", required=true)@FormDataParam("model")  CreateTranscriptionRequestModel model
,@ApiParam(value = "An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text#prompting) should be in English. ")@FormDataParam("prompt")  String prompt
,@ApiParam(value = "", allowableValues="json, text, srt, verbose_json, vtt", defaultValue="json")@FormDataParam("response_format")  AudioResponseFormat responseFormat
,@ApiParam(value = "The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. ", defaultValue="0")@FormDataParam("temperature")  BigDecimal temperature
)
    throws NotFoundException {
        return delegate.createTranslation(_fileInputStream, _fileDetail,model,prompt,responseFormat,temperature);
    }
}
