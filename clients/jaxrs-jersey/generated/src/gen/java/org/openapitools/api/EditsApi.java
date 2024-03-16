package org.openapitools.api;

import org.openapitools.api.EditsApiService;
import org.openapitools.api.factories.EditsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateEditRequest;
import org.openapitools.model.CreateEditResponse;

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

@Path("/edits")


@io.swagger.annotations.Api(description = "the edits API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EditsApi  {
   private final EditsApiService delegate;

   public EditsApi(@Context ServletConfig servletContext) {
      EditsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EditsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EditsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = EditsApiServiceFactory.getEditsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a new edit for the provided input, instruction, and parameters.", notes = "", response = CreateEditResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateEditResponse.class)
    })
    public Response createEdit(@ApiParam(value = "", required = true) @NotNull @Valid  CreateEditRequest createEditRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createEdit(createEditRequest, securityContext);
    }
}
