package org.openapitools.api;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;

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
@Path("/models")
@Api(description = "the models API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-04-14T13:42:15.676976801Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ModelsApi {

    @DELETE
    @Path("/{model}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.", notes = "", response = DeleteModelResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Models" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteModelResponse.class)
    })
    public Response deleteModel(@PathParam("model") @ApiParam("The model to delete") String model) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists the currently available models, and provides basic information about each one such as the owner and availability.", notes = "", response = ListModelsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Models" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListModelsResponse.class)
    })
    public Response listModels() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{model}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.", notes = "", response = Model.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Models" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Model.class)
    })
    public Response retrieveModel(@PathParam("model") @ApiParam("The ID of the model to use for this request") String model) {
        return Response.ok().entity("magic!").build();
    }
}
