package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranscriptionResponse;
import org.openapitools.model.CreateTranslationResponse;
import org.openapitools.api.AudioApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/audio")
@RequestScoped

@Api(description = "the audio API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-16T01:13:26.699737416Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class AudioApi  {

  @Context SecurityContext securityContext;

  @Inject AudioApiService delegate;


    @POST
    @Path("/transcriptions")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Transcribes audio into the input language.", notes = "", response = CreateTranscriptionResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranscriptionResponse.class) })
    public Response createTranscription( @Multipart(value = "file") InputStream _fileInputStream, @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "model")  CreateTranscriptionRequestModel model, @Multipart(value = "prompt", required = false)  String prompt, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "temperature", required = false)  BigDecimal temperature, @Multipart(value = "language", required = false)  String language) {
        return delegate.createTranscription(_fileInputStream, _fileDetail, model, prompt, responseFormat, temperature, language, securityContext);
    }

    @POST
    @Path("/translations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Translates audio into English.", notes = "", response = CreateTranslationResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranslationResponse.class) })
    public Response createTranslation( @Multipart(value = "file") InputStream _fileInputStream, @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "model")  CreateTranscriptionRequestModel model, @Multipart(value = "prompt", required = false)  String prompt, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "temperature", required = false)  BigDecimal temperature) {
        return delegate.createTranslation(_fileInputStream, _fileDetail, model, prompt, responseFormat, temperature, securityContext);
    }
}
