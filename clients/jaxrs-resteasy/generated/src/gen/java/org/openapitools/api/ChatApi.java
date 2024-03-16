package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ChatApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateChatCompletionRequest;
import org.openapitools.model.CreateChatCompletionResponse;

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

@Path("/chat/completions")


@io.swagger.annotations.Api(description = "the chat API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChatApi  {

    @Inject ChatApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a model response for the given chat conversation.", notes = "", response = CreateChatCompletionResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = CreateChatCompletionResponse.class) })
    public Response createChatCompletion(@ApiParam(value = "" ,required=true) @NotNull @Valid CreateChatCompletionRequest createChatCompletionRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createChatCompletion(createChatCompletionRequest,securityContext);
    }
}
