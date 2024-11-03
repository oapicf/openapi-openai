package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequest;
import org.openapitools.model.CreateTranscription200Response;
import org.openapitools.model.CreateTranscriptionRequestModel;
import org.openapitools.model.CreateTranslation200Response;
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


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-03T11:08:31.248726961Z[Etc/UTC]", comments = "Generator version: 7.9.0")

public class AudioApi  {

  @Context SecurityContext securityContext;

  @Inject AudioApiService delegate;


    @POST
    @Path("/speech")
    @Consumes({ "application/json" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Generates audio from the input text.", notes = "", response = java.io.InputStream.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Audio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = java.io.InputStream.class) })
    public Response createSpeech(@ApiParam(value = "" ,required=true) CreateSpeechRequest createSpeechRequest) {
        return delegate.createSpeech(createSpeechRequest, securityContext);
    }

    @POST
    @Path("/transcriptions")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Transcribes audio into the input language.", notes = "", response = CreateTranscription200Response.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Audio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranscription200Response.class) })
    public Response createTranscription( @Multipart(value = "file") InputStream _fileInputStream, @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "model")  CreateTranscriptionRequestModel model, @Multipart(value = "language", required = false)  String language, @Multipart(value = "prompt", required = false)  String prompt, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "temperature", required = false)  BigDecimal temperature, @Multipart(value = "timestamp_granularities[]", required = false)  List<String> timestampGranularities) {
        return delegate.createTranscription(_fileInputStream, _fileDetail, model, language, prompt, responseFormat, temperature, timestampGranularities, securityContext);
    }

    @POST
    @Path("/translations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Translates audio into English.", notes = "", response = CreateTranslation200Response.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Audio" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateTranslation200Response.class) })
    public Response createTranslation( @Multipart(value = "file") InputStream _fileInputStream, @Multipart(value = "file" ) Attachment _fileDetail, @Multipart(value = "model")  CreateTranscriptionRequestModel model, @Multipart(value = "prompt", required = false)  String prompt, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "temperature", required = false)  BigDecimal temperature) {
        return delegate.createTranslation(_fileInputStream, _fileDetail, model, prompt, responseFormat, temperature, securityContext);
    }
}
