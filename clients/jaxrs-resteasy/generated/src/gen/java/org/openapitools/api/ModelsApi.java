package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ModelsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/models")


@io.swagger.annotations.Api(description = "the models API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-03T11:08:49.636855747Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ModelsApi  {

    @Inject ModelsApiService service;

    @DELETE
    @Path("/{model}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.", notes = "", response = DeleteModelResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Models", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteModelResponse.class) })
    public Response deleteModel( @PathParam("model") String model,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteModel(model,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lists the currently available models, and provides basic information about each one such as the owner and availability.", notes = "", response = ListModelsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Models", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListModelsResponse.class) })
    public Response listModels(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listModels(securityContext);
    }
    @GET
    @Path("/{model}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.", notes = "", response = Model.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Models", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Model.class) })
    public Response retrieveModel( @PathParam("model") String model,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.retrieveModel(model,securityContext);
    }
}
