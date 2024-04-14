package org.openapitools.api;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;
import org.openapitools.api.ModelsApiService;

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
@Path("/models")
@RequestScoped

@Api(description = "the models API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-04-14T13:41:22.441879330Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class ModelsApi  {

  @Context SecurityContext securityContext;

  @Inject ModelsApiService delegate;


    @DELETE
    @Path("/{model}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.", notes = "", response = DeleteModelResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Models" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteModelResponse.class) })
    public Response deleteModel(@ApiParam(value = "The model to delete",required=true) @PathParam("model") String model) {
        return delegate.deleteModel(model, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists the currently available models, and provides basic information about each one such as the owner and availability.", notes = "", response = ListModelsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Models" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListModelsResponse.class) })
    public Response listModels() {
        return delegate.listModels(securityContext);
    }

    @GET
    @Path("/{model}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.", notes = "", response = Model.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Models" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Model.class) })
    public Response retrieveModel(@ApiParam(value = "The ID of the model to use for this request",required=true) @PathParam("model") String model) {
        return delegate.retrieveModel(model, securityContext);
    }
}
