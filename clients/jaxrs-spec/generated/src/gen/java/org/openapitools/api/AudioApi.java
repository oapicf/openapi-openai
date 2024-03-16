package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranscriptionResponse;
import org.openapitools.model.CreateTranslationResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AudioApi {

    @POST
    @Path("/transcriptions")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Transcribes audio into the input language.", notes = "", response = CreateTranscriptionResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranscriptionResponse.class)
    })
    public Response createTranscription( @FormParam(value = "file") InputStream _fileInputStream,@FormParam(value = "model")  CreateTranscriptionRequestModel model,@FormParam(value = "prompt")  String prompt,@FormParam(value = "response_format")  String responseFormat,@FormParam(value = "temperature")  BigDecimal temperature,@FormParam(value = "language")  String language) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/translations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Translates audio into English.", notes = "", response = CreateTranslationResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranslationResponse.class)
    })
    public Response createTranslation( @FormParam(value = "file") InputStream _fileInputStream,@FormParam(value = "model")  CreateTranscriptionRequestModel model,@FormParam(value = "prompt")  String prompt,@FormParam(value = "response_format")  String responseFormat,@FormParam(value = "temperature")  BigDecimal temperature) {
        return Response.ok().entity("magic!").build();
    }
}
