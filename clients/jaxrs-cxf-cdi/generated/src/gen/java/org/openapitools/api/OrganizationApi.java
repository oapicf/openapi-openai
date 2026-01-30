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
import org.openapitools.api.OrganizationApiService;

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
@Path("/organization")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class OrganizationApi  {

  @Context SecurityContext securityContext;

  @Inject OrganizationApiService delegate;


    @POST
    @Path("/admin_api_keys")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an organization admin API key", notes = "Create a new admin-level API key for the organization.", response = AdminApiKey.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The newly created admin API key.", response = AdminApiKey.class) })
    public Response adminApiKeysCreate(@ApiParam(value = "" ,required=true) AdminApiKeysCreateRequest adminApiKeysCreateRequest) {
        return delegate.adminApiKeysCreate(adminApiKeysCreateRequest, securityContext);
    }

    @DELETE
    @Path("/admin_api_keys/{key_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an organization admin API key", notes = "Delete the specified admin API key.", response = AdminApiKeysDelete200Response.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Confirmation that the API key was deleted.", response = AdminApiKeysDelete200Response.class) })
    public Response adminApiKeysDelete(@ApiParam(value = "",required=true) @PathParam("key_id") String keyId) {
        return delegate.adminApiKeysDelete(keyId, securityContext);
    }

    @GET
    @Path("/admin_api_keys/{key_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a single organization API key", notes = "Get details for a specific organization API key by its ID.", response = AdminApiKey.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Details of the requested API key.", response = AdminApiKey.class) })
    public Response adminApiKeysGet(@ApiParam(value = "",required=true) @PathParam("key_id") String keyId) {
        return delegate.adminApiKeysGet(keyId, securityContext);
    }

    @GET
    @Path("/admin_api_keys")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List organization API keys", notes = "Retrieve a paginated list of organization admin API keys.", response = ApiKeyList.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of organization API keys.", response = ApiKeyList.class) })
    public Response adminApiKeysList( @Nullable @ApiParam(value = "")  @QueryParam("after") String after, @ApiParam(value = "", allowableValues="asc, desc", defaultValue="asc") @DefaultValue("asc")  @QueryParam("order") String order, @ApiParam(value = "", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit) {
        return delegate.adminApiKeysList(after, order, limit, securityContext);
    }

    @POST
    @Path("/projects/{project_id}/archive")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Archives a project in the organization. Archived projects cannot be used or updated.", notes = "", response = Project.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project archived successfully.", response = Project.class) })
    public Response archiveProject(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId) {
        return delegate.archiveProject(projectId, securityContext);
    }

    @POST
    @Path("/projects")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new project in the organization. Projects can be created and archived, but cannot be deleted.", notes = "", response = Project.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project created successfully.", response = Project.class) })
    public Response createProject(@ApiParam(value = "The project create request payload." ,required=true) ProjectCreateRequest projectCreateRequest) {
        return delegate.createProject(projectCreateRequest, securityContext);
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
        @ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class) })
    public Response createProjectServiceAccount(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The project service account create request payload." ,required=true) ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest) {
        return delegate.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest, securityContext);
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
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public Response createProjectUser(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The project user create request payload." ,required=true) ProjectUserCreateRequest projectUserCreateRequest) {
        return delegate.createProjectUser(projectId, projectUserCreateRequest, securityContext);
    }

    @DELETE
    @Path("/invites/{invite_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an invite. If the invite has already been accepted, it cannot be deleted.", notes = "", response = InviteDeleteResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Invites" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Invite deleted successfully.", response = InviteDeleteResponse.class) })
    public Response deleteInvite(@ApiParam(value = "The ID of the invite to delete.",required=true) @PathParam("invite_id") String inviteId) {
        return delegate.deleteInvite(inviteId, securityContext);
    }

    @DELETE
    @Path("/projects/{project_id}/api_keys/{key_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes an API key from the project.", notes = "", response = ProjectApiKeyDeleteResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project API key deleted successfully.", response = ProjectApiKeyDeleteResponse.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public Response deleteProjectApiKey(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The ID of the API key.",required=true) @PathParam("key_id") String keyId) {
        return delegate.deleteProjectApiKey(projectId, keyId, securityContext);
    }

    @DELETE
    @Path("/projects/{project_id}/service_accounts/{service_account_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a service account from the project.", notes = "", response = ProjectServiceAccountDeleteResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service account deleted successfully.", response = ProjectServiceAccountDeleteResponse.class) })
    public Response deleteProjectServiceAccount(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The ID of the service account.",required=true) @PathParam("service_account_id") String serviceAccountId) {
        return delegate.deleteProjectServiceAccount(projectId, serviceAccountId, securityContext);
    }

    @DELETE
    @Path("/projects/{project_id}/users/{user_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a user from the project.", notes = "", response = ProjectUserDeleteResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project user deleted successfully.", response = ProjectUserDeleteResponse.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public Response deleteProjectUser(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The ID of the user.",required=true) @PathParam("user_id") String userId) {
        return delegate.deleteProjectUser(projectId, userId, securityContext);
    }

    @DELETE
    @Path("/users/{user_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a user from the organization.", notes = "", response = UserDeleteResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User deleted successfully.", response = UserDeleteResponse.class) })
    public Response deleteUser(@ApiParam(value = "The ID of the user.",required=true) @PathParam("user_id") String userId) {
        return delegate.deleteUser(userId, securityContext);
    }

    @POST
    @Path("/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.", notes = "", response = Invite.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Invites" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User invited successfully.", response = Invite.class) })
    public Response inviteUser(@ApiParam(value = "The invite request payload." ,required=true) InviteRequest inviteRequest) {
        return delegate.inviteUser(inviteRequest, securityContext);
    }

    @GET
    @Path("/audit_logs")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List user actions and configuration changes within this organization.", notes = "", response = ListAuditLogsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Audit Logs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Audit logs listed successfully.", response = ListAuditLogsResponse.class) })
    public Response listAuditLogs(@ApiParam(value = "Return only events whose `effective_at` (Unix seconds) is in this range.")  @QueryParam("effective_at") ListAuditLogsEffectiveAtParameter effectiveAt, @ApiParam(value = "Return only events for these projects.")  @QueryParam("project_ids[]") List<String> projectIds, @ApiParam(value = "Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).")  @QueryParam("event_types[]") List<AuditLogEventType> eventTypes, @ApiParam(value = "Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.")  @QueryParam("actor_ids[]") List<String> actorIds, @ApiParam(value = "Return only events performed by users with these emails.")  @QueryParam("actor_emails[]") List<String> actorEmails, @ApiParam(value = "Return only events performed on these targets. For example, a project ID updated.")  @QueryParam("resource_ids[]") List<String> resourceIds, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @QueryParam("before") String before) {
        return delegate.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before, securityContext);
    }

    @GET
    @Path("/invites")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of invites in the organization.", notes = "", response = InviteListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Invites" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Invites listed successfully.", response = InviteListResponse.class) })
    public Response listInvites(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after) {
        return delegate.listInvites(limit, after, securityContext);
    }

    @GET
    @Path("/projects/{project_id}/api_keys")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of API keys in the project.", notes = "", response = ProjectApiKeyListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project API keys listed successfully.", response = ProjectApiKeyListResponse.class) })
    public Response listProjectApiKeys(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after) {
        return delegate.listProjectApiKeys(projectId, limit, after, securityContext);
    }

    @GET
    @Path("/projects/{project_id}/rate_limits")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns the rate limits per model for a project.", notes = "", response = ProjectRateLimitListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project rate limits listed successfully.", response = ProjectRateLimitListResponse.class) })
    public Response listProjectRateLimits(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "A limit on the number of objects to be returned. The default is 100. ", defaultValue="100") @DefaultValue("100")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @QueryParam("before") String before) {
        return delegate.listProjectRateLimits(projectId, limit, after, before, securityContext);
    }

    @GET
    @Path("/projects/{project_id}/service_accounts")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of service accounts in the project.", notes = "", response = ProjectServiceAccountListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service accounts listed successfully.", response = ProjectServiceAccountListResponse.class),
        @ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class) })
    public Response listProjectServiceAccounts(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after) {
        return delegate.listProjectServiceAccounts(projectId, limit, after, securityContext);
    }

    @GET
    @Path("/projects/{project_id}/users")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of users in the project.", notes = "", response = ProjectUserListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project users listed successfully.", response = ProjectUserListResponse.class),
        @ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class) })
    public Response listProjectUsers(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after) {
        return delegate.listProjectUsers(projectId, limit, after, securityContext);
    }

    @GET
    @Path("/projects")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of projects.", notes = "", response = ProjectListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Projects listed successfully.", response = ProjectListResponse.class) })
    public Response listProjects(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "If `true` returns all projects including those that have been `archived`. Archived projects are not included by default.", defaultValue="false") @DefaultValue("false")  @QueryParam("include_archived") Boolean includeArchived) {
        return delegate.listProjects(limit, after, includeArchived, securityContext);
    }

    @GET
    @Path("/users")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Lists all of the users in the organization.", notes = "", response = UserListResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Users listed successfully.", response = UserListResponse.class) })
    public Response listUsers(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after) {
        return delegate.listUsers(limit, after, securityContext);
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
        @ApiResponse(code = 400, message = "Error response when updating the default project.", response = ErrorResponse.class) })
    public Response modifyProject(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The project update request payload." ,required=true) ProjectUpdateRequest projectUpdateRequest) {
        return delegate.modifyProject(projectId, projectUpdateRequest, securityContext);
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
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public Response modifyProjectUser(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The ID of the user.",required=true) @PathParam("user_id") String userId, @ApiParam(value = "The project user update request payload." ,required=true) ProjectUserUpdateRequest projectUserUpdateRequest) {
        return delegate.modifyProjectUser(projectId, userId, projectUserUpdateRequest, securityContext);
    }

    @POST
    @Path("/users/{user_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a user's role in the organization.", notes = "", response = User.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User role updated successfully.", response = User.class) })
    public Response modifyUser(@ApiParam(value = "The ID of the user.",required=true) @PathParam("user_id") String userId, @ApiParam(value = "The new user role to modify. This must be one of `owner` or `member`." ,required=true) UserRoleUpdateRequest userRoleUpdateRequest) {
        return delegate.modifyUser(userId, userRoleUpdateRequest, securityContext);
    }

    @GET
    @Path("/invites/{invite_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an invite.", notes = "", response = Invite.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Invites" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Invite retrieved successfully.", response = Invite.class) })
    public Response retrieveInvite(@ApiParam(value = "The ID of the invite to retrieve.",required=true) @PathParam("invite_id") String inviteId) {
        return delegate.retrieveInvite(inviteId, securityContext);
    }

    @GET
    @Path("/projects/{project_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a project.", notes = "", response = Project.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project retrieved successfully.", response = Project.class) })
    public Response retrieveProject(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId) {
        return delegate.retrieveProject(projectId, securityContext);
    }

    @GET
    @Path("/projects/{project_id}/api_keys/{key_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an API key in the project.", notes = "", response = ProjectApiKey.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project API key retrieved successfully.", response = ProjectApiKey.class) })
    public Response retrieveProjectApiKey(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The ID of the API key.",required=true) @PathParam("key_id") String keyId) {
        return delegate.retrieveProjectApiKey(projectId, keyId, securityContext);
    }

    @GET
    @Path("/projects/{project_id}/service_accounts/{service_account_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a service account in the project.", notes = "", response = ProjectServiceAccount.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service account retrieved successfully.", response = ProjectServiceAccount.class) })
    public Response retrieveProjectServiceAccount(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The ID of the service account.",required=true) @PathParam("service_account_id") String serviceAccountId) {
        return delegate.retrieveProjectServiceAccount(projectId, serviceAccountId, securityContext);
    }

    @GET
    @Path("/projects/{project_id}/users/{user_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a user in the project.", notes = "", response = ProjectUser.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Projects" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project user retrieved successfully.", response = ProjectUser.class) })
    public Response retrieveProjectUser(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The ID of the user.",required=true) @PathParam("user_id") String userId) {
        return delegate.retrieveProjectUser(projectId, userId, securityContext);
    }

    @GET
    @Path("/users/{user_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a user by their identifier.", notes = "", response = User.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Users" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User retrieved successfully.", response = User.class) })
    public Response retrieveUser(@ApiParam(value = "The ID of the user.",required=true) @PathParam("user_id") String userId) {
        return delegate.retrieveUser(userId, securityContext);
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
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public Response updateProjectRateLimits(@ApiParam(value = "The ID of the project.",required=true) @PathParam("project_id") String projectId, @ApiParam(value = "The ID of the rate limit.",required=true) @PathParam("rate_limit_id") String rateLimitId, @ApiParam(value = "The project rate limit update request payload." ,required=true) ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest) {
        return delegate.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest, securityContext);
    }

    @GET
    @Path("/usage/audio_speeches")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audio speeches usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageAudioSpeeches( @NotNull @ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.",required=true)  @QueryParam("start_time") Integer startTime, @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @QueryParam("end_time") Integer endTime, @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues="1m, 1h, 1d", defaultValue="1d") @DefaultValue("1d")  @QueryParam("bucket_width") String bucketWidth, @ApiParam(value = "Return only usage for these projects.")  @QueryParam("project_ids") List<String> projectIds, @ApiParam(value = "Return only usage for these users.")  @QueryParam("user_ids") List<String> userIds, @ApiParam(value = "Return only usage for these API keys.")  @QueryParam("api_key_ids") List<String> apiKeyIds, @ApiParam(value = "Return only usage for these models.")  @QueryParam("models") List<String> models, @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")  @QueryParam("group_by") List<String> groupBy, @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @QueryParam("page") String page) {
        return delegate.usageAudioSpeeches(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, securityContext);
    }

    @GET
    @Path("/usage/audio_transcriptions")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get audio transcriptions usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageAudioTranscriptions( @NotNull @ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.",required=true)  @QueryParam("start_time") Integer startTime, @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @QueryParam("end_time") Integer endTime, @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues="1m, 1h, 1d", defaultValue="1d") @DefaultValue("1d")  @QueryParam("bucket_width") String bucketWidth, @ApiParam(value = "Return only usage for these projects.")  @QueryParam("project_ids") List<String> projectIds, @ApiParam(value = "Return only usage for these users.")  @QueryParam("user_ids") List<String> userIds, @ApiParam(value = "Return only usage for these API keys.")  @QueryParam("api_key_ids") List<String> apiKeyIds, @ApiParam(value = "Return only usage for these models.")  @QueryParam("models") List<String> models, @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")  @QueryParam("group_by") List<String> groupBy, @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @QueryParam("page") String page) {
        return delegate.usageAudioTranscriptions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, securityContext);
    }

    @GET
    @Path("/usage/code_interpreter_sessions")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get code interpreter sessions usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageCodeInterpreterSessions( @NotNull @ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.",required=true)  @QueryParam("start_time") Integer startTime, @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @QueryParam("end_time") Integer endTime, @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues="1m, 1h, 1d", defaultValue="1d") @DefaultValue("1d")  @QueryParam("bucket_width") String bucketWidth, @ApiParam(value = "Return only usage for these projects.")  @QueryParam("project_ids") List<String> projectIds, @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`.")  @QueryParam("group_by") List<String> groupBy, @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @QueryParam("page") String page) {
        return delegate.usageCodeInterpreterSessions(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, securityContext);
    }

    @GET
    @Path("/usage/completions")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get completions usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageCompletions( @NotNull @ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.",required=true)  @QueryParam("start_time") Integer startTime, @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @QueryParam("end_time") Integer endTime, @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues="1m, 1h, 1d", defaultValue="1d") @DefaultValue("1d")  @QueryParam("bucket_width") String bucketWidth, @ApiParam(value = "Return only usage for these projects.")  @QueryParam("project_ids") List<String> projectIds, @ApiParam(value = "Return only usage for these users.")  @QueryParam("user_ids") List<String> userIds, @ApiParam(value = "Return only usage for these API keys.")  @QueryParam("api_key_ids") List<String> apiKeyIds, @ApiParam(value = "Return only usage for these models.")  @QueryParam("models") List<String> models, @ApiParam(value = "If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. ")  @QueryParam("batch") Boolean batch, @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.")  @QueryParam("group_by") List<String> groupBy, @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @QueryParam("page") String page) {
        return delegate.usageCompletions(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page, securityContext);
    }

    @GET
    @Path("/costs")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get costs details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Costs data retrieved successfully.", response = UsageResponse.class) })
    public Response usageCosts( @NotNull @ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.",required=true)  @QueryParam("start_time") Integer startTime, @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @QueryParam("end_time") Integer endTime, @ApiParam(value = "Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.", allowableValues="1d", defaultValue="1d") @DefaultValue("1d")  @QueryParam("bucket_width") String bucketWidth, @ApiParam(value = "Return only costs for these projects.")  @QueryParam("project_ids") List<String> projectIds, @ApiParam(value = "Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.")  @QueryParam("group_by") List<String> groupBy, @ApiParam(value = "A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. ", defaultValue="7") @DefaultValue("7")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @QueryParam("page") String page) {
        return delegate.usageCosts(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, securityContext);
    }

    @GET
    @Path("/usage/embeddings")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get embeddings usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageEmbeddings( @NotNull @ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.",required=true)  @QueryParam("start_time") Integer startTime, @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @QueryParam("end_time") Integer endTime, @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues="1m, 1h, 1d", defaultValue="1d") @DefaultValue("1d")  @QueryParam("bucket_width") String bucketWidth, @ApiParam(value = "Return only usage for these projects.")  @QueryParam("project_ids") List<String> projectIds, @ApiParam(value = "Return only usage for these users.")  @QueryParam("user_ids") List<String> userIds, @ApiParam(value = "Return only usage for these API keys.")  @QueryParam("api_key_ids") List<String> apiKeyIds, @ApiParam(value = "Return only usage for these models.")  @QueryParam("models") List<String> models, @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")  @QueryParam("group_by") List<String> groupBy, @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @QueryParam("page") String page) {
        return delegate.usageEmbeddings(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, securityContext);
    }

    @GET
    @Path("/usage/images")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get images usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageImages( @NotNull @ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.",required=true)  @QueryParam("start_time") Integer startTime, @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @QueryParam("end_time") Integer endTime, @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues="1m, 1h, 1d", defaultValue="1d") @DefaultValue("1d")  @QueryParam("bucket_width") String bucketWidth, @ApiParam(value = "Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.")  @QueryParam("sources") List<String> sources, @ApiParam(value = "Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.")  @QueryParam("sizes") List<String> sizes, @ApiParam(value = "Return only usage for these projects.")  @QueryParam("project_ids") List<String> projectIds, @ApiParam(value = "Return only usage for these users.")  @QueryParam("user_ids") List<String> userIds, @ApiParam(value = "Return only usage for these API keys.")  @QueryParam("api_key_ids") List<String> apiKeyIds, @ApiParam(value = "Return only usage for these models.")  @QueryParam("models") List<String> models, @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.")  @QueryParam("group_by") List<String> groupBy, @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @QueryParam("page") String page) {
        return delegate.usageImages(startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, securityContext);
    }

    @GET
    @Path("/usage/moderations")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get moderations usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageModerations( @NotNull @ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.",required=true)  @QueryParam("start_time") Integer startTime, @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @QueryParam("end_time") Integer endTime, @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues="1m, 1h, 1d", defaultValue="1d") @DefaultValue("1d")  @QueryParam("bucket_width") String bucketWidth, @ApiParam(value = "Return only usage for these projects.")  @QueryParam("project_ids") List<String> projectIds, @ApiParam(value = "Return only usage for these users.")  @QueryParam("user_ids") List<String> userIds, @ApiParam(value = "Return only usage for these API keys.")  @QueryParam("api_key_ids") List<String> apiKeyIds, @ApiParam(value = "Return only usage for these models.")  @QueryParam("models") List<String> models, @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.")  @QueryParam("group_by") List<String> groupBy, @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @QueryParam("page") String page) {
        return delegate.usageModerations(startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, securityContext);
    }

    @GET
    @Path("/usage/vector_stores")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get vector stores usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Usage" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageVectorStores( @NotNull @ApiParam(value = "Start time (Unix seconds) of the query time range, inclusive.",required=true)  @QueryParam("start_time") Integer startTime, @ApiParam(value = "End time (Unix seconds) of the query time range, exclusive.")  @QueryParam("end_time") Integer endTime, @ApiParam(value = "Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.", allowableValues="1m, 1h, 1d", defaultValue="1d") @DefaultValue("1d")  @QueryParam("bucket_width") String bucketWidth, @ApiParam(value = "Return only usage for these projects.")  @QueryParam("project_ids") List<String> projectIds, @ApiParam(value = "Group the usage data by the specified fields. Support fields include `project_id`.")  @QueryParam("group_by") List<String> groupBy, @ApiParam(value = "Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 ")  @QueryParam("limit") Integer limit, @ApiParam(value = "A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.")  @QueryParam("page") String page) {
        return delegate.usageVectorStores(startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, securityContext);
    }
}
