package org.openapitools.api;

import org.openapitools.model.User;
import org.openapitools.model.UserDeleteResponse;
import org.openapitools.model.UserListResponse;
import org.openapitools.model.UserRoleUpdateRequest;

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
@Path("/organization/users")
@Api(value = "/", description = "")
public interface UsersApi  {

    /**
     * Deletes a user from the organization.
     *
     */
    @DELETE
    @Path("/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a user from the organization.", tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User deleted successfully.", response = UserDeleteResponse.class) })
    public UserDeleteResponse deleteUser(@PathParam("user_id") String userId);

    /**
     * Lists all of the users in the organization.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists all of the users in the organization.", tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Users listed successfully.", response = UserListResponse.class) })
    public UserListResponse listUsers(@QueryParam("limit") @DefaultValue("20") Integer limit, @QueryParam("after") String after);

    /**
     * Modifies a user&#39;s role in the organization.
     *
     */
    @POST
    @Path("/{user_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a user's role in the organization.", tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User role updated successfully.", response = User.class) })
    public User modifyUser(@PathParam("user_id") String userId, @Valid UserRoleUpdateRequest userRoleUpdateRequest);

    /**
     * Retrieves a user by their identifier.
     *
     */
    @GET
    @Path("/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a user by their identifier.", tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User retrieved successfully.", response = User.class) })
    public User retrieveUser(@PathParam("user_id") String userId);
}
