package org.openapitools.api;

import org.openapitools.model.AudioResponseFormat;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import java.io.File;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
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
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
@Path("/audio")
@Api(value = "/", description = "")
public interface AudioApi  {

    /**
     * Generates audio from the input text.
     *
     */
    @POST
    @Path("/speech")
    @Consumes({ "application/json" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Generates audio from the input text.", tags={ "Audio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = File.class) })
    public File createSpeech(@Valid @NotNull CreateSpeechRequest createSpeechRequest);

    /**
     * Transcribes audio into the input language.
     *
     */
    @POST
    @Path("/transcriptions")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Transcribes audio into the input language.", tags={ "Audio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranscription200Response.class) })
    public CreateTranscription200Response createTranscription( @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "model")  CreateTranscriptionRequestModel model, @Multipart(value = "language", required = false)  String language, @Multipart(value = "prompt", required = false)  String prompt, @Multipart(value = "response_format", required = false)  AudioResponseFormat responseFormat, @Multipart(value = "temperature", required = false)  BigDecimal temperature, @Multipart(value = "timestamp_granularities[]", required = false)  List<String> timestampGranularities);

    /**
     * Translates audio into English.
     *
     */
    @POST
    @Path("/translations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Translates audio into English.", tags={ "Audio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranslation200Response.class) })
    public CreateTranslation200Response createTranslation( @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "model")  CreateTranscriptionRequestModel model, @Multipart(value = "prompt", required = false)  String prompt, @Multipart(value = "response_format", required = false)  AudioResponseFormat responseFormat, @Multipart(value = "temperature", required = false)  BigDecimal temperature);
}
