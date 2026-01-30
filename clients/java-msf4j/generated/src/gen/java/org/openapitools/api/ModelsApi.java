package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ModelsApiService;
import org.openapitools.api.factories.ModelsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/models")


@io.swagger.annotations.Api(description = "the models API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ModelsApi  {
   private final ModelsApiService delegate = ModelsApiServiceFactory.getModelsApi();

    @DELETE
    @Path("/{model}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.", notes = "", response = DeleteModelResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Models", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteModelResponse.class) })
    public Response deleteModel(@ApiParam(value = "The model to delete",required=true) @PathParam("model") String model
)
    throws NotFoundException {
        return delegate.deleteModel(model);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lists the currently available models, and provides basic information about each one such as the owner and availability.", notes = "", response = ListModelsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Models", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListModelsResponse.class) })
    public Response listModels()
    throws NotFoundException {
        return delegate.listModels();
    }
    @GET
    @Path("/{model}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.", notes = "", response = Model.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Models", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Model.class) })
    public Response retrieveModel(@ApiParam(value = "The ID of the model to use for this request",required=true) @PathParam("model") String model
)
    throws NotFoundException {
        return delegate.retrieveModel(model);
    }
}
