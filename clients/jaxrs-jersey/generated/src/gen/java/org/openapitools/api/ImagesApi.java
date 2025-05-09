package org.openapitools.api;

import org.openapitools.api.ImagesApiService;
import org.openapitools.api.factories.ImagesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import java.io.File;
import org.openapitools.model.ImagesResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/images")


@io.swagger.annotations.Api(description = "the images API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ImagesApi  {
   private final ImagesApiService delegate;

   public ImagesApi(@Context ServletConfig servletContext) {
      ImagesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ImagesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ImagesApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ImagesApiServiceFactory.getImagesApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/generations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates an image given a prompt.", notes = "", response = ImagesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Images", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ImagesResponse.class)
    })
    public Response createImage(@ApiParam(value = "", required = true) @NotNull @Valid  CreateImageRequest createImageRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createImage(createImageRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/edits")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates an edited or extended image given an original image and a prompt.", notes = "", response = ImagesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Images", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ImagesResponse.class)
    })
    public Response createImageEdit(
 @FormDataParam("image") FormDataBodyPart imageBodypart ,@ApiParam(value = "A text description of the desired image(s). The maximum length is 1000 characters.", required=true)@FormDataParam("prompt")  String prompt,
 @FormDataParam("mask") FormDataBodyPart maskBodypart ,@ApiParam(value = "", defaultValue="dall-e-2")@FormDataParam("model")  CreateImageEditRequestModel model,@ApiParam(value = "The number of images to generate. Must be between 1 and 10.", defaultValue="1")@FormDataParam("n")  Integer n,@ApiParam(value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", allowableValues="256x256, 512x512, 1024x1024", defaultValue="1024x1024")@FormDataParam("size")  String size,@ApiParam(value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.", allowableValues="url, b64_json", defaultValue="url")@FormDataParam("response_format")  String responseFormat,@ApiParam(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")@FormDataParam("user")  String user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createImageEdit(imageBodypart, prompt, maskBodypart, model, n, size, responseFormat, user, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/variations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a variation of a given image.", notes = "", response = ImagesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Images", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ImagesResponse.class)
    })
    public Response createImageVariation(
 @FormDataParam("image") FormDataBodyPart imageBodypart ,@ApiParam(value = "", defaultValue="dall-e-2")@FormDataParam("model")  CreateImageEditRequestModel model,@ApiParam(value = "The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.", defaultValue="1")@FormDataParam("n")  Integer n,@ApiParam(value = "The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.", allowableValues="url, b64_json", defaultValue="url")@FormDataParam("response_format")  String responseFormat,@ApiParam(value = "The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.", allowableValues="256x256, 512x512, 1024x1024", defaultValue="1024x1024")@FormDataParam("size")  String size,@ApiParam(value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")@FormDataParam("user")  String user,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createImageVariation(imageBodypart, model, n, responseFormat, size, user, securityContext);
    }
}
