package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.EditsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateEditRequest;
import org.openapitools.model.CreateEditResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/edits")


@io.swagger.annotations.Api(description = "the edits API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EditsApi  {

    @Inject EditsApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a new edit for the provided input, instruction, and parameters.", notes = "", response = CreateEditResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateEditResponse.class) })
    public Response createEdit(@ApiParam(value = "" ,required=true) @NotNull @Valid CreateEditRequest createEditRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createEdit(createEditRequest,securityContext);
    }
}
