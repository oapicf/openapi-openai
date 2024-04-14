package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import java.io.File;

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
    @ApiOperation(value = "Generates audio from the input text.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = File.class) })
    public File createSpeech(CreateSpeechRequest createSpeechRequest);

    /**
     * Transcribes audio into the input language.
     *
     */
    @POST
    @Path("/transcriptions")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Transcribes audio into the input language.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranscription200Response.class) })
    public CreateTranscription200Response createTranscription( @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "model")  CreateTranscriptionRequestModel model, @Multipart(value = "language", required = false)  String language, @Multipart(value = "prompt", required = false)  String prompt, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "temperature", required = false)  BigDecimal temperature, @Multipart(value = "timestamp_granularities[]", required = false)  List<String> timestampGranularities);

    /**
     * Translates audio into English.
     *
     */
    @POST
    @Path("/translations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Translates audio into English.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranslation200Response.class) })
    public CreateTranslation200Response createTranslation( @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "model")  CreateTranscriptionRequestModel model, @Multipart(value = "prompt", required = false)  String prompt, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "temperature", required = false)  BigDecimal temperature);
}
