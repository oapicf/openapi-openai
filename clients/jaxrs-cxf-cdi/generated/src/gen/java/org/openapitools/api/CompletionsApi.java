package org.openapitools.api;

import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;
import org.openapitools.api.CompletionsApiService;

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
@Path("/completions")
@RequestScoped

@Api(description = "the completions API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-03T11:08:31.248726961Z[Etc/UTC]", comments = "Generator version: 7.9.0")

public class CompletionsApi  {

  @Context SecurityContext securityContext;

  @Inject CompletionsApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a completion for the provided prompt and parameters.", notes = "", response = CreateCompletionResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Completions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateCompletionResponse.class) })
    public Response createCompletion(@ApiParam(value = "" ,required=true) CreateCompletionRequest createCompletionRequest) {
        return delegate.createCompletion(createCompletionRequest, securityContext);
    }
}
