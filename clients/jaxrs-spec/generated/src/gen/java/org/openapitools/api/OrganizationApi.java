package org.openapitools.api;

import org.openapitools.model.AdminApiKey;
import org.openapitools.model.AdminApiKeysCreateRequest;
import org.openapitools.model.AdminApiKeysDelete200Response;
import org.openapitools.model.ApiKeyList;
import org.openapitools.model.AuditLogEventType;
import org.openapitools.model.ErrorResponse;
import org.openapitools.model.Invite;
import org.openapitools.model.InviteDeleteResponse;
import org.openapitools.model.InviteListResponse;
import org.openapitools.model.InviteRequest;
import org.openapitools.model.ListAuditLogsEffectiveAtParameter;
import org.openapitools.model.ListAuditLogsResponse;
import org.openapitools.model.Project;
import org.openapitools.model.ProjectApiKey;
import org.openapitools.model.ProjectApiKeyDeleteResponse;
import org.openapitools.model.ProjectApiKeyListResponse;
import org.openapitools.model.ProjectCreateRequest;
import org.openapitools.model.ProjectListResponse;
import org.openapitools.model.ProjectRateLimit;
import org.openapitools.model.ProjectRateLimitListResponse;
import org.openapitools.model.ProjectRateLimitUpdateRequest;
import org.openapitools.model.ProjectServiceAccount;
import org.openapitools.model.ProjectServiceAccountCreateRequest;
import org.openapitools.model.ProjectServiceAccountCreateResponse;
import org.openapitools.model.ProjectServiceAccountDeleteResponse;
import org.openapitools.model.ProjectServiceAccountListResponse;
import org.openapitools.model.ProjectUpdateRequest;
import org.openapitools.model.ProjectUser;
import org.openapitools.model.ProjectUserCreateRequest;
import org.openapitools.model.ProjectUserDeleteResponse;
import org.openapitools.model.ProjectUserListResponse;
import org.openapitools.model.ProjectUserUpdateRequest;
import org.openapitools.model.UsageResponse;
import org.openapitools.model.User;
import org.openapitools.model.UserDeleteResponse;
import org.openapitools.model.UserListResponse;
import org.openapitools.model.UserRoleUpdateRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/organization")
@Api(description = "the organization API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OrganizationApi {

    @POST
    @Path("/admin_api_keys")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an organization admin API key", notes = "Create a new admin-level API key for the organization.", response = AdminApiKey.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The newly created admin API key.", response = AdminApiKey.class)
    })
    public Response adminApiKeysCreate(@Valid @NotNull AdminApiKeysCreateRequest adminApiKeysCreateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/admin_api_keys/{key_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an organization admin API key", notes = "Delete the specified admin API key.", response = AdminApiKeysDelete200Response.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Confirmation that the API key was deleted.", response = AdminApiKeysDelete200Response.class)
    })
    public Response adminApiKeysDelete(@PathParam("key_id") String keyId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/admin_api_keys/{key_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a single organization API key", notes = "Get details for a specific organization API key by its ID.", response = AdminApiKey.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Details of the requested API key.", response = AdminApiKey.class)
    })
    public Response adminApiKeysGet(@PathParam("key_id") String keyId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/admin_api_keys")
    @Produces({ "application/json" })
    @ApiOperation(value = "List organization API keys", notes = "Retrieve a paginated list of organization admin API keys.", response = ApiKeyList.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of organization API keys.", response = ApiKeyList.class)
    })
    public Response adminApiKeysList(@QueryParam("after")   String after,@QueryParam("order") @DefaultValue("asc")   String order,@QueryParam("limit") @DefaultValue("20")   Integer limit) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/projects/{project_id}/archive")
    @Produces({ "application/json" })
    @ApiOperation(value = "Archives a project in the organization. Archived projects cannot be used or updated.", notes = "", response = Project.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project archived successfully.", response = Project.class)
    })
    public Response archiveProject(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/projects")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new project in the organization. Projects can be created and archived, but cannot be deleted.", notes = "", response = Project.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project created successfully.", response = Project.class)
    })
    public Response createProject(@Valid @NotNull ProjectCreateRequest projectCreateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/projects/{project_id}/service_accounts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a new service account in the project. This also returns an unredacted API key for the service account.", notes = "", response = ProjectServiceAccountCreateResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service account created successfully.", response = ProjectServiceAccountCreateResponse.class),
        @ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class)
    })
    public Response createProjectServiceAccount(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@Valid @NotNull ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/projects/{project_id}/users")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Adds a user to the project. Users must already be members of the organization to be added to a project.", notes = "", response = ProjectUser.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User added to project successfully.", response = ProjectUser.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class)
    })
    public Response createProjectUser(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@Valid @NotNull ProjectUserCreateRequest projectUserCreateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/invites/{invite_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an invite. If the invite has already been accepted, it cannot be deleted.", notes = "", response = InviteDeleteResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Invites" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Invite deleted successfully.", response = InviteDeleteResponse.class)
    })
    public Response deleteInvite(@PathParam("invite_id") @ApiParam("The ID of the invite to delete.") String inviteId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/projects/{project_id}/api_keys/{key_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes an API key from the project.", notes = "", response = ProjectApiKeyDeleteResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project API key deleted successfully.", response = ProjectApiKeyDeleteResponse.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class)
    })
    public Response deleteProjectApiKey(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@PathParam("key_id") @ApiParam("The ID of the API key.") String keyId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/projects/{project_id}/service_accounts/{service_account_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a service account from the project.", notes = "", response = ProjectServiceAccountDeleteResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service account deleted successfully.", response = ProjectServiceAccountDeleteResponse.class)
    })
    public Response deleteProjectServiceAccount(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@PathParam("service_account_id") @ApiParam("The ID of the service account.") String serviceAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/projects/{project_id}/users/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a user from the project.", notes = "", response = ProjectUserDeleteResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project user deleted successfully.", response = ProjectUserDeleteResponse.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class)
    })
    public Response deleteProjectUser(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@PathParam("user_id") @ApiParam("The ID of the user.") String userId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/users/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a user from the organization.", notes = "", response = UserDeleteResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User deleted successfully.", response = UserDeleteResponse.class)
    })
    public Response deleteUser(@PathParam("user_id") @ApiParam("The ID of the user.") String userId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.", notes = "", response = Invite.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Invites" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User invited successfully.", response = Invite.class)
    })
    public Response inviteUser(@Valid @NotNull InviteRequest inviteRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/audit_logs")
    @Produces({ "application/json" })
    @ApiOperation(value = "List user actions and configuration changes within this organization.", notes = "", response = ListAuditLogsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Audit Logs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Audit logs listed successfully.", response = ListAuditLogsResponse.class)
    })
    public Response listAuditLogs(@QueryParam("effective_at")  @ApiParam("Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range.")  ListAuditLogsEffectiveAtParameter effectiveAt,@QueryParam("project_ids[]")  @ApiParam("Return only events for these projects.")  List<String> projectIds,@QueryParam("event_types[]")  @ApiParam("Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).")  List<AuditLogEventType> eventTypes,@QueryParam("actor_ids[]")  @ApiParam("Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.")  List<String> actorIds,@QueryParam("actor_emails[]")  @ApiParam("Return only events performed by users with these emails.")  List<String> actorEmails,@QueryParam("resource_ids[]")  @ApiParam("Return only events performed on these targets. For example, a project ID updated.")  List<String> resourceIds,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("before")  @ApiParam("A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ")  String before) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/invites")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of invites in the organization.", notes = "", response = InviteListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Invites" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Invites listed successfully.", response = InviteListResponse.class)
    })
    public Response listInvites(@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/projects/{project_id}/api_keys")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of API keys in the project.", notes = "", response = ProjectApiKeyListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project API keys listed successfully.", response = ProjectApiKeyListResponse.class)
    })
    public Response listProjectApiKeys(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/projects/{project_id}/rate_limits")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns the rate limits per model for a project.", notes = "", response = ProjectRateLimitListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project rate limits listed successfully.", response = ProjectRateLimitListResponse.class)
    })
    public Response listProjectRateLimits(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@QueryParam("limit") @DefaultValue("100")  @ApiParam("A limit on the number of objects to be returned. The default is 100. ")  Integer limit,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("before")  @ApiParam("A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ")  String before) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/projects/{project_id}/service_accounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of service accounts in the project.", notes = "", response = ProjectServiceAccountListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service accounts listed successfully.", response = ProjectServiceAccountListResponse.class),
        @ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class)
    })
    public Response listProjectServiceAccounts(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/projects/{project_id}/users")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of users in the project.", notes = "", response = ProjectUserListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project users listed successfully.", response = ProjectUserListResponse.class),
        @ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class)
    })
    public Response listProjectUsers(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/projects")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of projects.", notes = "", response = ProjectListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Projects listed successfully.", response = ProjectListResponse.class)
    })
    public Response listProjects(@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("include_archived") @DefaultValue("false")  @ApiParam("If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.")  Boolean includeArchived) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/users")
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists all of the users in the organization.", notes = "", response = UserListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Users listed successfully.", response = UserListResponse.class)
    })
    public Response listUsers(@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/projects/{project_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a project in the organization.", notes = "", response = Project.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project updated successfully.", response = Project.class),
        @ApiResponse(code = 400, message = "Error response when updating the default project.", response = ErrorResponse.class)
    })
    public Response modifyProject(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@Valid @NotNull ProjectUpdateRequest projectUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/projects/{project_id}/users/{user_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a user's role in the project.", notes = "", response = ProjectUser.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project user's role updated successfully.", response = ProjectUser.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class)
    })
    public Response modifyProjectUser(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@PathParam("user_id") @ApiParam("The ID of the user.") String userId,@Valid @NotNull ProjectUserUpdateRequest projectUserUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/users/{user_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a user's role in the organization.", notes = "", response = User.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User role updated successfully.", response = User.class)
    })
    public Response modifyUser(@PathParam("user_id") @ApiParam("The ID of the user.") String userId,@Valid @NotNull UserRoleUpdateRequest userRoleUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/invites/{invite_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an invite.", notes = "", response = Invite.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Invites" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Invite retrieved successfully.", response = Invite.class)
    })
    public Response retrieveInvite(@PathParam("invite_id") @ApiParam("The ID of the invite to retrieve.") String inviteId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/projects/{project_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a project.", notes = "", response = Project.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project retrieved successfully.", response = Project.class)
    })
    public Response retrieveProject(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/projects/{project_id}/api_keys/{key_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an API key in the project.", notes = "", response = ProjectApiKey.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project API key retrieved successfully.", response = ProjectApiKey.class)
    })
    public Response retrieveProjectApiKey(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@PathParam("key_id") @ApiParam("The ID of the API key.") String keyId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/projects/{project_id}/service_accounts/{service_account_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a service account in the project.", notes = "", response = ProjectServiceAccount.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service account retrieved successfully.", response = ProjectServiceAccount.class)
    })
    public Response retrieveProjectServiceAccount(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@PathParam("service_account_id") @ApiParam("The ID of the service account.") String serviceAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/projects/{project_id}/users/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a user in the project.", notes = "", response = ProjectUser.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project user retrieved successfully.", response = ProjectUser.class)
    })
    public Response retrieveProjectUser(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@PathParam("user_id") @ApiParam("The ID of the user.") String userId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/users/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a user by their identifier.", notes = "", response = User.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User retrieved successfully.", response = User.class)
    })
    public Response retrieveUser(@PathParam("user_id") @ApiParam("The ID of the user.") String userId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/projects/{project_id}/rate_limits/{rate_limit_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates a project rate limit.", notes = "", response = ProjectRateLimit.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project rate limit updated successfully.", response = ProjectRateLimit.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class)
    })
    public Response updateProjectRateLimits(@PathParam("project_id") @ApiParam("The ID of the project.") String projectId,@PathParam("rate_limit_id") @ApiParam("The ID of the rate limit.") String rateLimitId,@Valid @NotNull ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/usage/audio_speeches")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audio speeches usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class)
    })
    public Response usageAudioSpeeches(@QueryParam("start_time") @NotNull  @ApiParam("Start time (Unix seconds) of the query time range, inclusive.")  Integer startTime,@QueryParam("end_time")  @ApiParam("End time (Unix seconds) of the query time range, exclusive.")  Integer endTime,@QueryParam("bucket_width") @DefaultValue("1d")  @ApiParam("Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.")  String bucketWidth,@QueryParam("project_ids")  @ApiParam("Return only usage for these projects.")  List<String> projectIds,@QueryParam("user_ids")  @ApiParam("Return only usage for these users.")  List<String> userIds,@QueryParam("api_key_ids")  @ApiParam("Return only usage for these API keys.")  List<String> apiKeyIds,@QueryParam("models")  @ApiParam("Return only usage for these models.")  List<String> models,@QueryParam("group_by")  @ApiParam("Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.")  List<String> groupBy,@QueryParam("limit")  @ApiParam("Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ")  Integer limit,@QueryParam("page")  @ApiParam("A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.")  String page) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/usage/audio_transcriptions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audio transcriptions usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class)
    })
    public Response usageAudioTranscriptions(@QueryParam("start_time") @NotNull  @ApiParam("Start time (Unix seconds) of the query time range, inclusive.")  Integer startTime,@QueryParam("end_time")  @ApiParam("End time (Unix seconds) of the query time range, exclusive.")  Integer endTime,@QueryParam("bucket_width") @DefaultValue("1d")  @ApiParam("Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.")  String bucketWidth,@QueryParam("project_ids")  @ApiParam("Return only usage for these projects.")  List<String> projectIds,@QueryParam("user_ids")  @ApiParam("Return only usage for these users.")  List<String> userIds,@QueryParam("api_key_ids")  @ApiParam("Return only usage for these API keys.")  List<String> apiKeyIds,@QueryParam("models")  @ApiParam("Return only usage for these models.")  List<String> models,@QueryParam("group_by")  @ApiParam("Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.")  List<String> groupBy,@QueryParam("limit")  @ApiParam("Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ")  Integer limit,@QueryParam("page")  @ApiParam("A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.")  String page) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/usage/code_interpreter_sessions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get code interpreter sessions usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class)
    })
    public Response usageCodeInterpreterSessions(@QueryParam("start_time") @NotNull  @ApiParam("Start time (Unix seconds) of the query time range, inclusive.")  Integer startTime,@QueryParam("end_time")  @ApiParam("End time (Unix seconds) of the query time range, exclusive.")  Integer endTime,@QueryParam("bucket_width") @DefaultValue("1d")  @ApiParam("Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.")  String bucketWidth,@QueryParam("project_ids")  @ApiParam("Return only usage for these projects.")  List<String> projectIds,@QueryParam("group_by")  @ApiParam("Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.")  List<String> groupBy,@QueryParam("limit")  @ApiParam("Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ")  Integer limit,@QueryParam("page")  @ApiParam("A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.")  String page) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/usage/completions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get completions usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class)
    })
    public Response usageCompletions(@QueryParam("start_time") @NotNull  @ApiParam("Start time (Unix seconds) of the query time range, inclusive.")  Integer startTime,@QueryParam("end_time")  @ApiParam("End time (Unix seconds) of the query time range, exclusive.")  Integer endTime,@QueryParam("bucket_width") @DefaultValue("1d")  @ApiParam("Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.")  String bucketWidth,@QueryParam("project_ids")  @ApiParam("Return only usage for these projects.")  List<String> projectIds,@QueryParam("user_ids")  @ApiParam("Return only usage for these users.")  List<String> userIds,@QueryParam("api_key_ids")  @ApiParam("Return only usage for these API keys.")  List<String> apiKeyIds,@QueryParam("models")  @ApiParam("Return only usage for these models.")  List<String> models,@QueryParam("batch")  @ApiParam("If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. ")  Boolean batch,@QueryParam("group_by")  @ApiParam("Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.")  List<String> groupBy,@QueryParam("limit")  @ApiParam("Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ")  Integer limit,@QueryParam("page")  @ApiParam("A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.")  String page) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/costs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get costs details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Costs data retrieved successfully.", response = UsageResponse.class)
    })
    public Response usageCosts(@QueryParam("start_time") @NotNull  @ApiParam("Start time (Unix seconds) of the query time range, inclusive.")  Integer startTime,@QueryParam("end_time")  @ApiParam("End time (Unix seconds) of the query time range, exclusive.")  Integer endTime,@QueryParam("bucket_width") @DefaultValue("1d")  @ApiParam("Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.")  String bucketWidth,@QueryParam("project_ids")  @ApiParam("Return only costs for these projects.")  List<String> projectIds,@QueryParam("group_by")  @ApiParam("Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.")  List<String> groupBy,@QueryParam("limit") @DefaultValue("7")  @ApiParam("A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. ")  Integer limit,@QueryParam("page")  @ApiParam("A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.")  String page) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/usage/embeddings")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get embeddings usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class)
    })
    public Response usageEmbeddings(@QueryParam("start_time") @NotNull  @ApiParam("Start time (Unix seconds) of the query time range, inclusive.")  Integer startTime,@QueryParam("end_time")  @ApiParam("End time (Unix seconds) of the query time range, exclusive.")  Integer endTime,@QueryParam("bucket_width") @DefaultValue("1d")  @ApiParam("Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.")  String bucketWidth,@QueryParam("project_ids")  @ApiParam("Return only usage for these projects.")  List<String> projectIds,@QueryParam("user_ids")  @ApiParam("Return only usage for these users.")  List<String> userIds,@QueryParam("api_key_ids")  @ApiParam("Return only usage for these API keys.")  List<String> apiKeyIds,@QueryParam("models")  @ApiParam("Return only usage for these models.")  List<String> models,@QueryParam("group_by")  @ApiParam("Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.")  List<String> groupBy,@QueryParam("limit")  @ApiParam("Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ")  Integer limit,@QueryParam("page")  @ApiParam("A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.")  String page) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/usage/images")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get images usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class)
    })
    public Response usageImages(@QueryParam("start_time") @NotNull  @ApiParam("Start time (Unix seconds) of the query time range, inclusive.")  Integer startTime,@QueryParam("end_time")  @ApiParam("End time (Unix seconds) of the query time range, exclusive.")  Integer endTime,@QueryParam("bucket_width") @DefaultValue("1d")  @ApiParam("Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.")  String bucketWidth,@QueryParam("sources")  @ApiParam("Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.")  List<String> sources,@QueryParam("sizes")  @ApiParam("Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.")  List<String> sizes,@QueryParam("project_ids")  @ApiParam("Return only usage for these projects.")  List<String> projectIds,@QueryParam("user_ids")  @ApiParam("Return only usage for these users.")  List<String> userIds,@QueryParam("api_key_ids")  @ApiParam("Return only usage for these API keys.")  List<String> apiKeyIds,@QueryParam("models")  @ApiParam("Return only usage for these models.")  List<String> models,@QueryParam("group_by")  @ApiParam("Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.")  List<String> groupBy,@QueryParam("limit")  @ApiParam("Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ")  Integer limit,@QueryParam("page")  @ApiParam("A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.")  String page) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/usage/moderations")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get moderations usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class)
    })
    public Response usageModerations(@QueryParam("start_time") @NotNull  @ApiParam("Start time (Unix seconds) of the query time range, inclusive.")  Integer startTime,@QueryParam("end_time")  @ApiParam("End time (Unix seconds) of the query time range, exclusive.")  Integer endTime,@QueryParam("bucket_width") @DefaultValue("1d")  @ApiParam("Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.")  String bucketWidth,@QueryParam("project_ids")  @ApiParam("Return only usage for these projects.")  List<String> projectIds,@QueryParam("user_ids")  @ApiParam("Return only usage for these users.")  List<String> userIds,@QueryParam("api_key_ids")  @ApiParam("Return only usage for these API keys.")  List<String> apiKeyIds,@QueryParam("models")  @ApiParam("Return only usage for these models.")  List<String> models,@QueryParam("group_by")  @ApiParam("Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.")  List<String> groupBy,@QueryParam("limit")  @ApiParam("Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ")  Integer limit,@QueryParam("page")  @ApiParam("A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.")  String page) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/usage/vector_stores")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get vector stores usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class)
    })
    public Response usageVectorStores(@QueryParam("start_time") @NotNull  @ApiParam("Start time (Unix seconds) of the query time range, inclusive.")  Integer startTime,@QueryParam("end_time")  @ApiParam("End time (Unix seconds) of the query time range, exclusive.")  Integer endTime,@QueryParam("bucket_width") @DefaultValue("1d")  @ApiParam("Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.")  String bucketWidth,@QueryParam("project_ids")  @ApiParam("Return only usage for these projects.")  List<String> projectIds,@QueryParam("group_by")  @ApiParam("Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.")  List<String> groupBy,@QueryParam("limit")  @ApiParam("Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ")  Integer limit,@QueryParam("page")  @ApiParam("A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.")  String page) {
        return Response.ok().entity("magic!").build();
    }
}
