package org.openapitools.api;

import org.openapitools.model.RealtimeSessionCreateRequest;
import org.openapitools.model.RealtimeSessionCreateResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
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
@Path("/realtime/sessions")
@Api(value = "/", description = "")
public interface RealtimeApi  {

    /**
     * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. ", tags={ "Realtime" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Session created successfully.", response = RealtimeSessionCreateResponse.class) })
    public RealtimeSessionCreateResponse createRealtimeSession(@Valid RealtimeSessionCreateRequest realtimeSessionCreateRequest);
}
