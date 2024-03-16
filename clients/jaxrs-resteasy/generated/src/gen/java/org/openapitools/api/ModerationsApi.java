package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ModerationsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;

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

@Path("/moderations")


@io.swagger.annotations.Api(description = "the moderations API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ModerationsApi  {

    @Inject ModerationsApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Classifies if text violates OpenAI's Content Policy", notes = "", response = CreateModerationResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateModerationResponse.class) })
    public Response createModeration(@ApiParam(value = "" ,required=true) @NotNull @Valid CreateModerationRequest createModerationRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createModeration(createModerationRequest,securityContext);
    }
}
