package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ImagesApiService;
import org.openapitools.api.factories.ImagesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateImageRequest;
import java.io.File;
import org.openapitools.model.ImagesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/images")


@io.swagger.annotations.Api(description = "the images API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ImagesApi  {
   private final ImagesApiService delegate = ImagesApiServiceFactory.getImagesApi();

    @POST
    @Path("/generations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates an image given a prompt.", notes = "", response = ImagesResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public Response createImage(@ApiParam(value = "" ,required=true) CreateImageRequest createImageRequest
)
    throws NotFoundException {
        return delegate.createImage(createImageRequest);
    }
    @POST
    @Path("/edits")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates an edited or extended image given an original image and a prompt.", notes = "", response = ImagesResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public Response createImageEdit(
            @FormDataParam("image") InputStream imageInputStream,
            @FormDataParam("image") FileInfo imageDetail
,@ApiParam(value = "A text description of the desired image(s). The maximum length is 1000 characters.", required=true)@FormDataParam("prompt")  String prompt
,
            @FormDataParam("mask") InputStream maskInputStream,
            @FormDataParam("mask") FileInfo maskDetail
,@ApiParam(value = "The number of images to generate. Must be between 1 and 10.", defaultValue="1")@FormDataParam("n")  Integer n
,@ApiParam(value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", allowableValues="256x256, 512x512, 1024x1024", defaultValue="1024x1024")@FormDataParam("size")  String size
,@ApiParam(value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.", allowableValues="url, b64_json", defaultValue="url")@FormDataParam("response_format")  String responseFormat
,@ApiParam(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")@FormDataParam("user")  String user
)
    throws NotFoundException {
        return delegate.createImageEdit(imageInputStream, imageDetail,prompt,maskInputStream, maskDetail,n,size,responseFormat,user);
    }
    @POST
    @Path("/variations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a variation of a given image.", notes = "", response = ImagesResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public Response createImageVariation(
            @FormDataParam("image") InputStream imageInputStream,
            @FormDataParam("image") FileInfo imageDetail
,@ApiParam(value = "The number of images to generate. Must be between 1 and 10.", defaultValue="1")@FormDataParam("n")  Integer n
,@ApiParam(value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", allowableValues="256x256, 512x512, 1024x1024", defaultValue="1024x1024")@FormDataParam("size")  String size
,@ApiParam(value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`.", allowableValues="url, b64_json", defaultValue="url")@FormDataParam("response_format")  String responseFormat
,@ApiParam(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")@FormDataParam("user")  String user
)
    throws NotFoundException {
        return delegate.createImageVariation(imageInputStream, imageDetail,n,size,responseFormat,user);
    }
}
