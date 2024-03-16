package org.openapitools.api;

import org.openapitools.model.CreateEditRequest;
import org.openapitools.model.CreateEditResponse;

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
@Path("/edits")
@Api(description = "the edits API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EditsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a new edit for the provided input, instruction, and parameters.", notes = "", response = CreateEditResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateEditResponse.class)
    })
    public Response createEdit(@Valid @NotNull CreateEditRequest createEditRequest) {
        return Response.ok().entity("magic!").build();
    }
}
