package org.openapitools.api;

import org.openapitools.model.AdminApiKey;
import org.openapitools.model.AdminApiKeysCreateRequest;
import org.openapitools.model.AdminApiKeysDelete200Response;
import org.openapitools.model.ApiKeyList;

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
@Path("/organization/admin_api_keys")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * Create an organization admin API key
     *
     * Create a new admin-level API key for the organization.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an organization admin API key", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The newly created admin API key.", response = AdminApiKey.class) })
    public AdminApiKey adminApiKeysCreate(AdminApiKeysCreateRequest adminApiKeysCreateRequest);

    /**
     * Delete an organization admin API key
     *
     * Delete the specified admin API key.
     *
     */
    @DELETE
    @Path("/{key_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an organization admin API key", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Confirmation that the API key was deleted.", response = AdminApiKeysDelete200Response.class) })
    public AdminApiKeysDelete200Response adminApiKeysDelete(@PathParam("key_id") String keyId);

    /**
     * Retrieve a single organization API key
     *
     * Get details for a specific organization API key by its ID.
     *
     */
    @GET
    @Path("/{key_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a single organization API key", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Details of the requested API key.", response = AdminApiKey.class) })
    public AdminApiKey adminApiKeysGet(@PathParam("key_id") String keyId);

    /**
     * List organization API keys
     *
     * Retrieve a paginated list of organization admin API keys.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List organization API keys", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of organization API keys.", response = ApiKeyList.class) })
    public ApiKeyList adminApiKeysList(@QueryParam("after") String after, @QueryParam("order") @DefaultValue("asc")String order, @QueryParam("limit") @DefaultValue("20")Integer limit);
}
