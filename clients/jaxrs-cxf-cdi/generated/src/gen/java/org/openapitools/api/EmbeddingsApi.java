package org.openapitools.api;

import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;
import org.openapitools.api.EmbeddingsApiService;

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
@Path("/embeddings")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T10:45:22.438122430Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class EmbeddingsApi  {

  @Context SecurityContext securityContext;

  @Inject EmbeddingsApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates an embedding vector representing the input text.", notes = "", response = CreateEmbeddingResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Embeddings" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateEmbeddingResponse.class) })
    public Response createEmbedding(@ApiParam(value = "" ,required=true) CreateEmbeddingRequest createEmbeddingRequest) {
        return delegate.createEmbedding(createEmbeddingRequest, securityContext);
    }
}
