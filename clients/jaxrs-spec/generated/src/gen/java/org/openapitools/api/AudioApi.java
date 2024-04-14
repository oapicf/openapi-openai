package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
import java.io.File;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/audio")
@Api(description = "the audio API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-04-14T13:42:15.676976801Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudioApi {

    @POST
    @Path("/speech")
    @Consumes({ "application/json" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Generates audio from the input text.", notes = "", response = File.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Audio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = File.class)
    })
    public Response createSpeech(@Valid @NotNull CreateSpeechRequest createSpeechRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/transcriptions")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Transcribes audio into the input language.", notes = "", response = CreateTranscription200Response.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Audio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranscription200Response.class)
    })
    public Response createTranscription( @FormParam(value = "file") InputStream _fileInputStream,@FormParam(value = "model")  CreateTranscriptionRequestModel model,@FormParam(value = "language")  String language,@FormParam(value = "prompt")  String prompt,@FormParam(value = "response_format")  String responseFormat,@FormParam(value = "temperature")  BigDecimal temperature,@FormParam(value = "timestamp_granularities[]")  List<String> timestampGranularities) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/translations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Translates audio into English.", notes = "", response = CreateTranslation200Response.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Audio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranslation200Response.class)
    })
    public Response createTranslation( @FormParam(value = "file") InputStream _fileInputStream,@FormParam(value = "model")  CreateTranscriptionRequestModel model,@FormParam(value = "prompt")  String prompt,@FormParam(value = "response_format")  String responseFormat,@FormParam(value = "temperature")  BigDecimal temperature) {
        return Response.ok().entity("magic!").build();
    }
}
