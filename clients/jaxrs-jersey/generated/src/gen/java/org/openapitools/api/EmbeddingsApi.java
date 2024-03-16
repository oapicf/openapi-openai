package org.openapitools.api;

import org.openapitools.api.EmbeddingsApiService;
import org.openapitools.api.factories.EmbeddingsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateEmbeddingRequest;
import org.openapitools.model.CreateEmbeddingResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/embeddings")


@io.swagger.annotations.Api(description = "the embeddings API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T01:13:32.134709667Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class EmbeddingsApi  {
   private final EmbeddingsApiService delegate;

   public EmbeddingsApi(@Context ServletConfig servletContext) {
      EmbeddingsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EmbeddingsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EmbeddingsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = EmbeddingsApiServiceFactory.getEmbeddingsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates an embedding vector representing the input text.", notes = "", response = CreateEmbeddingResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateEmbeddingResponse.class)
    })
    public Response createEmbedding(@ApiParam(value = "", required = true) @NotNull @Valid  CreateEmbeddingRequest createEmbeddingRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createEmbedding(createEmbeddingRequest, securityContext);
    }
}
