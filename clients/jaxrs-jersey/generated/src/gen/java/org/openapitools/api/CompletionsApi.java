package org.openapitools.api;

import org.openapitools.api.CompletionsApiService;
import org.openapitools.api.factories.CompletionsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;

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

@Path("/completions")


@io.swagger.annotations.Api(description = "the completions API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CompletionsApi  {
   private final CompletionsApiService delegate;

   public CompletionsApi(@Context ServletConfig servletContext) {
      CompletionsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CompletionsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CompletionsApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = CompletionsApiServiceFactory.getCompletionsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a completion for the provided prompt and parameters.", notes = "", response = CreateCompletionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Completions", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateCompletionResponse.class)
    })
    public Response createCompletion(@ApiParam(value = "", required = true) @NotNull @Valid  CreateCompletionRequest createCompletionRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCompletion(createCompletionRequest, securityContext);
    }
}
