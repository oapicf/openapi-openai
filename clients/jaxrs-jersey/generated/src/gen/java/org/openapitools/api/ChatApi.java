package org.openapitools.api;

import org.openapitools.api.ChatApiService;
import org.openapitools.api.factories.ChatApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateChatCompletionRequest;
import org.openapitools.model.CreateChatCompletionResponse;

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

@Path("/chat/completions")


@io.swagger.annotations.Api(description = "the chat API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T11:08:40.472203335Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatApi  {
   private final ChatApiService delegate;

   public ChatApi(@Context ServletConfig servletContext) {
      ChatApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ChatApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ChatApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ChatApiServiceFactory.getChatApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a model response for the given chat conversation.", notes = "", response = CreateChatCompletionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Chat", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateChatCompletionResponse.class)
    })
    public Response createChatCompletion(@ApiParam(value = "", required = true) @NotNull @Valid  CreateChatCompletionRequest createChatCompletionRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createChatCompletion(createChatCompletionRequest, securityContext);
    }
}
