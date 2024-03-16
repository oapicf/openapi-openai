package org.openapitools.api;

import org.openapitools.api.ModelsApiService;
import org.openapitools.api.factories.ModelsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.DeleteModelResponse;
import org.openapitools.model.ListModelsResponse;
import org.openapitools.model.Model;

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

@Path("/models")


@io.swagger.annotations.Api(description = "the models API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ModelsApi  {
   private final ModelsApiService delegate;

   public ModelsApi(@Context ServletConfig servletContext) {
      ModelsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ModelsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ModelsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ModelsApiServiceFactory.getModelsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.DELETE
    @Path("/{model}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a fine-tuned model. You must have the Owner role in your organization.", notes = "", response = DeleteModelResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteModelResponse.class)
    })
    public Response deleteModel(@ApiParam(value = "The model to delete", required = true) @PathParam("model") @NotNull  String model,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteModel(model, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lists the currently available models, and provides basic information about each one such as the owner and availability.", notes = "", response = ListModelsResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListModelsResponse.class)
    })
    public Response listModels(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listModels(securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{model}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a model instance, providing basic information about the model such as the owner and permissioning.", notes = "", response = Model.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Model.class)
    })
    public Response retrieveModel(@ApiParam(value = "The ID of the model to use for this request", required = true) @PathParam("model") @NotNull  String model,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.retrieveModel(model, securityContext);
    }
}
