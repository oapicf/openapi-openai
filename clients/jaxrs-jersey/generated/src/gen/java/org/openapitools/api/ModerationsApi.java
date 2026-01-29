package org.openapitools.api;

import org.openapitools.api.ModerationsApiService;
import org.openapitools.api.factories.ModerationsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;

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

@Path("/moderations")


@io.swagger.annotations.Api(description = "the moderations API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ModerationsApi  {
   private final ModerationsApiService delegate;

   public ModerationsApi(@Context ServletConfig servletContext) {
      ModerationsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ModerationsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ModerationsApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ModerationsApiServiceFactory.getModerationsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Classifies if text is potentially harmful.", notes = "", response = CreateModerationResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Moderations", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateModerationResponse.class)
    })
    public Response createModeration(@ApiParam(value = "", required = true) @NotNull @Valid  CreateModerationRequest createModerationRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createModeration(createModerationRequest, securityContext);
    }
}
