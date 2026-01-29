package org.openapitools.api;

import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/moderations")
@Api(description = "the moderations API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T10:45:34.459631427Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ModerationsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Classifies if text is potentially harmful.", notes = "", response = CreateModerationResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Moderations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateModerationResponse.class)
    })
    public Response createModeration(@Valid @NotNull CreateModerationRequest createModerationRequest) {
        return Response.ok().entity("magic!").build();
    }
}
