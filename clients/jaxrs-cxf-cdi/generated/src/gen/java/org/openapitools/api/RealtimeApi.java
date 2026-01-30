package org.openapitools.api;

import org.openapitools.model.RealtimeSessionCreateRequest;
import org.openapitools.model.RealtimeSessionCreateResponse;
import org.openapitools.api.RealtimeApiService;

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
@Path("/realtime/sessions")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class RealtimeApi  {

  @Context SecurityContext securityContext;

  @Inject RealtimeApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. ", notes = "", response = RealtimeSessionCreateResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Realtime" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Session created successfully.", response = RealtimeSessionCreateResponse.class) })
    public Response createRealtimeSession(@ApiParam(value = "Create an ephemeral API key with the given session configuration." ,required=true) RealtimeSessionCreateRequest realtimeSessionCreateRequest) {
        return delegate.createRealtimeSession(realtimeSessionCreateRequest, securityContext);
    }
}
