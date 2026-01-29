package org.openapitools.api;

import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
@Path("/embeddings")
@Api(value = "/", description = "")
public interface EmbeddingsApi  {

    /**
     * Creates an embedding vector representing the input text.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an embedding vector representing the input text.", tags={ "Embeddings" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateEmbeddingResponse.class) })
    public CreateEmbeddingResponse createEmbedding(@Valid @NotNull CreateEmbeddingRequest createEmbeddingRequest);
}
