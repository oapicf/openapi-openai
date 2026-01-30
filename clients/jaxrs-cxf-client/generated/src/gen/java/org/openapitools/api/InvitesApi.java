package org.openapitools.api;

import org.openapitools.model.Invite;
import org.openapitools.model.InviteDeleteResponse;
import org.openapitools.model.InviteListResponse;
import org.openapitools.model.InviteRequest;

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
@Path("/organization/invites")
@Api(value = "/", description = "")
public interface InvitesApi  {

    /**
     * Delete an invite. If the invite has already been accepted, it cannot be deleted.
     *
     */
    @DELETE
    @Path("/{invite_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an invite. If the invite has already been accepted, it cannot be deleted.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Invite deleted successfully.", response = InviteDeleteResponse.class) })
    public InviteDeleteResponse deleteInvite(@PathParam("invite_id") String inviteId);

    /**
     * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User invited successfully.", response = Invite.class) })
    public Invite inviteUser(InviteRequest inviteRequest);

    /**
     * Returns a list of invites in the organization.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of invites in the organization.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Invites listed successfully.", response = InviteListResponse.class) })
    public InviteListResponse listInvites(@QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("after") String after);

    /**
     * Retrieves an invite.
     *
     */
    @GET
    @Path("/{invite_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an invite.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Invite retrieved successfully.", response = Invite.class) })
    public Invite retrieveInvite(@PathParam("invite_id") String inviteId);
}
