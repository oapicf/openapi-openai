package org.openapitools.api;

import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;

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
@Path("/completions")
@Api(description = "the completions API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CompletionsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a completion for the provided prompt and parameters.", notes = "", response = CreateCompletionResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Completions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateCompletionResponse.class)
    })
    public Response createCompletion(@Valid @NotNull CreateCompletionRequest createCompletionRequest) {
        return Response.ok().entity("magic!").build();
    }
}
