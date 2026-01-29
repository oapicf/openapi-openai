package org.openapitools.api;

import org.openapitools.model.CreateModerationRequest;
import org.openapitools.model.CreateModerationResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
@Path("/moderations")
@Api(value = "/", description = "")
public interface ModerationsApi  {

    /**
     * Classifies if text is potentially harmful.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Classifies if text is potentially harmful.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CreateModerationResponse.class) })
    public CreateModerationResponse createModeration(CreateModerationRequest createModerationRequest);
}
