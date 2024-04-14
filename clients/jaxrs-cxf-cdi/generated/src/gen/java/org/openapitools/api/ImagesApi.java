package org.openapitools.api;

import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import org.openapitools.model.ImagesResponse;
import org.openapitools.api.ImagesApiService;

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
@Path("/images")
@RequestScoped

@Api(description = "the images API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-04-14T13:41:22.441879330Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class ImagesApi  {

  @Context SecurityContext securityContext;

  @Inject ImagesApiService delegate;


    @POST
    @Path("/generations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an image given a prompt.", notes = "", response = ImagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Images" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public Response createImage(@ApiParam(value = "" ,required=true) CreateImageRequest createImageRequest) {
        return delegate.createImage(createImageRequest, securityContext);
    }

    @POST
    @Path("/edits")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an edited or extended image given an original image and a prompt.", notes = "", response = ImagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Images" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public Response createImageEdit( @Multipart(value = "image") InputStream imageInputStream, @Multipart(value = "image" ) Attachment imageDetail, @Multipart(value = "prompt")  String prompt,  @Multipart(value = "mask", required = false) InputStream maskInputStream, @Multipart(value = "mask" , required = false) Attachment maskDetail, @Multipart(value = "model", required = false)  CreateImageEditRequestModel model, @Multipart(value = "n", required = false)  Integer n, @Multipart(value = "size", required = false)  String size, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "user", required = false)  String user) {
        return delegate.createImageEdit(imageInputStream, imageDetail, prompt, maskInputStream, maskDetail, model, n, size, responseFormat, user, securityContext);
    }

    @POST
    @Path("/variations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a variation of a given image.", notes = "", response = ImagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Images" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public Response createImageVariation( @Multipart(value = "image") InputStream imageInputStream, @Multipart(value = "image" ) Attachment imageDetail, @Multipart(value = "model", required = false)  CreateImageEditRequestModel model, @Multipart(value = "n", required = false)  Integer n, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "size", required = false)  String size, @Multipart(value = "user", required = false)  String user) {
        return delegate.createImageVariation(imageInputStream, imageDetail, model, n, responseFormat, size, user, securityContext);
    }
}
