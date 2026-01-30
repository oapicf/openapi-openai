package org.openapitools.api;

import org.openapitools.api.RealtimeApiService;
import org.openapitools.api.factories.RealtimeApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.RealtimeSessionCreateRequest;
import org.openapitools.model.RealtimeSessionCreateResponse;

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

@Path("/realtime/sessions")


@io.swagger.annotations.Api(description = "the realtime API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeApi  {
   private final RealtimeApiService delegate;

   public RealtimeApi(@Context ServletConfig servletContext) {
      RealtimeApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RealtimeApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RealtimeApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = RealtimeApiServiceFactory.getRealtimeApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. ", notes = "", response = RealtimeSessionCreateResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Realtime", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Session created successfully.", response = RealtimeSessionCreateResponse.class)
    })
    public Response createRealtimeSession(@ApiParam(value = "Create an ephemeral API key with the given session configuration.", required = true) @NotNull @Valid  RealtimeSessionCreateRequest realtimeSessionCreateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createRealtimeSession(realtimeSessionCreateRequest, securityContext);
    }
}
