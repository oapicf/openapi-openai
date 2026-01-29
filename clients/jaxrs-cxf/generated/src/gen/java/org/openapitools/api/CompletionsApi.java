package org.openapitools.api;

import org.openapitools.model.CreateCompletionRequest;
import org.openapitools.model.CreateCompletionResponse;

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
@Path("/completions")
@Api(value = "/", description = "")
public interface CompletionsApi  {

    /**
     * Creates a completion for the provided prompt and parameters.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a completion for the provided prompt and parameters.", tags={ "Completions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateCompletionResponse.class) })
    public CreateCompletionResponse createCompletion(@Valid @NotNull CreateCompletionRequest createCompletionRequest);
}
