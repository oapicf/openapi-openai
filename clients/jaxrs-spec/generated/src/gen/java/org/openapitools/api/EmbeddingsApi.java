package org.openapitools.api;

import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;

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
@Path("/embeddings")
@Api(description = "the embeddings API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EmbeddingsApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an embedding vector representing the input text.", notes = "", response = CreateEmbeddingResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Embeddings" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateEmbeddingResponse.class)
    })
    public Response createEmbedding(@Valid @NotNull CreateEmbeddingRequest createEmbeddingRequest) {
        return Response.ok().entity("magic!").build();
    }
}
