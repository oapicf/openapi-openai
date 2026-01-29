package org.openapitools.api;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
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
@Path("/models")
@Api(value = "/", description = "")
public interface ModelsApi  {

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     *
     */
    @DELETE
    @Path("/{model}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteModelResponse.class) })
    public DeleteModelResponse deleteModel(@PathParam("model") String model);

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists the currently available models, and provides basic information about each one such as the owner and availability.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListModelsResponse.class) })
    public ListModelsResponse listModels();

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     *
     */
    @GET
    @Path("/{model}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Model.class) })
    public Model retrieveModel(@PathParam("model") String model);
}
