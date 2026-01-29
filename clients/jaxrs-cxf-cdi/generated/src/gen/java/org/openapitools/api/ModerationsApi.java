package org.openapitools.api;

import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;
import org.openapitools.api.ModerationsApiService;

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
@Path("/moderations")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T10:45:22.438122430Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class ModerationsApi  {

  @Context SecurityContext securityContext;

  @Inject ModerationsApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Classifies if text is potentially harmful.", notes = "", response = CreateModerationResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Moderations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateModerationResponse.class) })
    public Response createModeration(@ApiParam(value = "" ,required=true) CreateModerationRequest createModerationRequest) {
        return delegate.createModeration(createModerationRequest, securityContext);
    }
}
