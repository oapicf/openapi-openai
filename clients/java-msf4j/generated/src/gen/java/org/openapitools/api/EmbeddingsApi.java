package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.EmbeddingsApiService;
import org.openapitools.api.factories.EmbeddingsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/embeddings")


@io.swagger.annotations.Api(description = "the embeddings API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T10:44:59.856749186Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EmbeddingsApi  {
   private final EmbeddingsApiService delegate = EmbeddingsApiServiceFactory.getEmbeddingsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates an embedding vector representing the input text.", notes = "", response = CreateEmbeddingResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Embeddings", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateEmbeddingResponse.class) })
    public Response createEmbedding(@ApiParam(value = "" ,required=true) CreateEmbeddingRequest createEmbeddingRequest
)
    throws NotFoundException {
        return delegate.createEmbedding(createEmbeddingRequest);
    }
}
