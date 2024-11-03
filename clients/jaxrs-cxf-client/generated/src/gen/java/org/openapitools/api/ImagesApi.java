package org.openapitools.api;

import org.openapitools.model.CreateImageEditRequestModel;
import org.openapitools.model.CreateImageRequest;
import java.io.File;
import org.openapitools.model.ImagesResponse;

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
@Path("/images")
@Api(value = "/", description = "")
public interface ImagesApi  {

    /**
     * Creates an image given a prompt.
     *
     */
    @POST
    @Path("/generations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an image given a prompt.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public ImagesResponse createImage(CreateImageRequest createImageRequest);

    /**
     * Creates an edited or extended image given an original image and a prompt.
     *
     */
    @POST
    @Path("/edits")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an edited or extended image given an original image and a prompt.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public ImagesResponse createImageEdit( @Multipart(value = "image" ) Attachment imageDetail, @Multipart(value = "prompt")  String prompt,  @Multipart(value = "mask" , required = false) Attachment maskDetail, @Multipart(value = "model", required = false)  CreateImageEditRequestModel model, @Multipart(value = "n", required = false)  Integer n, @Multipart(value = "size", required = false)  String size, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "user", required = false)  String user);

    /**
     * Creates a variation of a given image.
     *
     */
    @POST
    @Path("/variations")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a variation of a given image.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImagesResponse.class) })
    public ImagesResponse createImageVariation( @Multipart(value = "image" ) Attachment imageDetail, @Multipart(value = "model", required = false)  CreateImageEditRequestModel model, @Multipart(value = "n", required = false)  Integer n, @Multipart(value = "response_format", required = false)  String responseFormat, @Multipart(value = "size", required = false)  String size, @Multipart(value = "user", required = false)  String user);
}
