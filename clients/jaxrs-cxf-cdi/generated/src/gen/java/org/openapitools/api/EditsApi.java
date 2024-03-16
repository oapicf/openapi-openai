package org.openapitools.api;

import org.openapitools.model.CreateEditRequest;
import org.openapitools.model.CreateEditResponse;
import org.openapitools.api.EditsApiService;

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
@Path("/edits")
@RequestScoped

@Api(description = "the edits API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-16T01:13:26.699737416Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class EditsApi  {

  @Context SecurityContext securityContext;

  @Inject EditsApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a new edit for the provided input, instruction, and parameters.", notes = "", response = CreateEditResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateEditResponse.class) })
    public Response createEdit(@ApiParam(value = "" ,required=true) CreateEditRequest createEditRequest) {
        return delegate.createEdit(createEditRequest, securityContext);
    }
}
