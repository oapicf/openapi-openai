package org.openapitools.api;

import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import java.io.File;
import org.openapitools.model.ImagesResponse;

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
@Path("/images")
@Api(description = "the images API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T10:45:34.459631427Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ImagesApi {

    @POST
    @Path("/generations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an image given a prompt.", notes = "", response = ImagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Images" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class)
    })
    public Response createImage(@Valid @NotNull CreateImageRequest createImageRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/edits")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an edited or extended image given an original image and a prompt.", notes = "", response = ImagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Images" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class)
    })
    public Response createImageEdit( @FormParam(value = "image") InputStream imageInputStream,@FormParam(value = "prompt")  String prompt, @FormParam(value = "mask") InputStream maskInputStream,@FormParam(value = "model")  CreateImageEditRequestModel model,@FormParam(value = "n")  Integer n,@FormParam(value = "size")  String size,@FormParam(value = "response_format")  String responseFormat,@FormParam(value = "user")  String user) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/variations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a variation of a given image.", notes = "", response = ImagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Images" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class)
    })
    public Response createImageVariation( @FormParam(value = "image") InputStream imageInputStream,@FormParam(value = "model")  CreateImageEditRequestModel model,@FormParam(value = "n")  Integer n,@FormParam(value = "response_format")  String responseFormat,@FormParam(value = "size")  String size,@FormParam(value = "user")  String user) {
        return Response.ok().entity("magic!").build();
    }
}
