package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/organization")


@io.swagger.annotations.Api(description = "the organization API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface OrganizationApi  {

    @POST
    @Path("/admin_api_keys")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create an organization admin API key", notes = "Create a new admin-level API key for the organization.", response = AdminApiKey.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The newly created admin API key.", response = AdminApiKey.class) })
    public Response adminApiKeysCreate(@ApiParam(value = "" ,required=true) @NotNull @Valid AdminApiKeysCreateRequest adminApiKeysCreateRequest,@Context SecurityContext securityContext);
    @DELETE
    @Path("/admin_api_keys/{key_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an organization admin API key", notes = "Delete the specified admin API key.", response = AdminApiKeysDelete200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Confirmation that the API key was deleted.", response = AdminApiKeysDelete200Response.class) })
    public Response adminApiKeysDelete( @PathParam("key_id") String keyId,@Context SecurityContext securityContext);
    @GET
    @Path("/admin_api_keys/{key_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve a single organization API key", notes = "Get details for a specific organization API key by its ID.", response = AdminApiKey.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Details of the requested API key.", response = AdminApiKey.class) })
    public Response adminApiKeysGet( @PathParam("key_id") String keyId,@Context SecurityContext securityContext);
    @GET
    @Path("/admin_api_keys")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List organization API keys", notes = "Retrieve a paginated list of organization admin API keys.", response = ApiKeyList.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of organization API keys.", response = ApiKeyList.class) })
    public Response adminApiKeysList( @QueryParam("after") String after,, allowableValues="asc, desc" @DefaultValue("asc") @QueryParam("order") String order, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext);
    @POST
    @Path("/projects/{project_id}/archive")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Archives a project in the organization. Archived projects cannot be used or updated.", notes = "", response = Project.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project archived successfully.", response = Project.class) })
    public Response archiveProject( @PathParam("project_id") String projectId,@Context SecurityContext securityContext);
    @POST
    @Path("/projects")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a new project in the organization. Projects can be created and archived, but cannot be deleted.", notes = "", response = Project.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project created successfully.", response = Project.class) })
    public Response createProject(@ApiParam(value = "The project create request payload." ,required=true) @NotNull @Valid ProjectCreateRequest projectCreateRequest,@Context SecurityContext securityContext);
    @POST
    @Path("/projects/{project_id}/service_accounts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a new service account in the project. This also returns an unredacted API key for the service account.", notes = "", response = ProjectServiceAccountCreateResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project service account created successfully.", response = ProjectServiceAccountCreateResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class) })
    public Response createProjectServiceAccount( @PathParam("project_id") String projectId,@ApiParam(value = "The project service account create request payload." ,required=true) @NotNull @Valid ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest,@Context SecurityContext securityContext);
    @POST
    @Path("/projects/{project_id}/users")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Adds a user to the project. Users must already be members of the organization to be added to a project.", notes = "", response = ProjectUser.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User added to project successfully.", response = ProjectUser.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public Response createProjectUser( @PathParam("project_id") String projectId,@ApiParam(value = "The project user create request payload." ,required=true) @NotNull @Valid ProjectUserCreateRequest projectUserCreateRequest,@Context SecurityContext securityContext);
    @DELETE
    @Path("/invites/{invite_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an invite. If the invite has already been accepted, it cannot be deleted.", notes = "", response = InviteDeleteResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Invites", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Invite deleted successfully.", response = InviteDeleteResponse.class) })
    public Response deleteInvite( @PathParam("invite_id") String inviteId,@Context SecurityContext securityContext);
    @DELETE
    @Path("/projects/{project_id}/api_keys/{key_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deletes an API key from the project.", notes = "", response = ProjectApiKeyDeleteResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project API key deleted successfully.", response = ProjectApiKeyDeleteResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public Response deleteProjectApiKey( @PathParam("project_id") String projectId, @PathParam("key_id") String keyId,@Context SecurityContext securityContext);
    @DELETE
    @Path("/projects/{project_id}/service_accounts/{service_account_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deletes a service account from the project.", notes = "", response = ProjectServiceAccountDeleteResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project service account deleted successfully.", response = ProjectServiceAccountDeleteResponse.class) })
    public Response deleteProjectServiceAccount( @PathParam("project_id") String projectId, @PathParam("service_account_id") String serviceAccountId,@Context SecurityContext securityContext);
    @DELETE
    @Path("/projects/{project_id}/users/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deletes a user from the project.", notes = "", response = ProjectUserDeleteResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project user deleted successfully.", response = ProjectUserDeleteResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public Response deleteProjectUser( @PathParam("project_id") String projectId, @PathParam("user_id") String userId,@Context SecurityContext securityContext);
    @DELETE
    @Path("/users/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deletes a user from the organization.", notes = "", response = UserDeleteResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User deleted successfully.", response = UserDeleteResponse.class) })
    public Response deleteUser( @PathParam("user_id") String userId,@Context SecurityContext securityContext);
    @POST
    @Path("/invites")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.", notes = "", response = Invite.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Invites", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User invited successfully.", response = Invite.class) })
    public Response inviteUser(@ApiParam(value = "The invite request payload." ,required=true) @NotNull @Valid InviteRequest inviteRequest,@Context SecurityContext securityContext);
    @GET
    @Path("/audit_logs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List user actions and configuration changes within this organization.", notes = "", response = ListAuditLogsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Audit Logs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Audit logs listed successfully.", response = ListAuditLogsResponse.class) })
    public Response listAuditLogs( @QueryParam("effective_at") ListAuditLogsEffectiveAtParameter effectiveAt, @QueryParam("project_ids[]") List<String> projectIds, @QueryParam("event_types[]") List<AuditLogEventType> eventTypes, @QueryParam("actor_ids[]") List<String> actorIds, @QueryParam("actor_emails[]") List<String> actorEmails, @QueryParam("resource_ids[]") List<String> resourceIds, @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("after") String after, @QueryParam("before") String before,@Context SecurityContext securityContext);
    @GET
    @Path("/invites")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of invites in the organization.", notes = "", response = InviteListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Invites", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Invites listed successfully.", response = InviteListResponse.class) })
    public Response listInvites( @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("after") String after,@Context SecurityContext securityContext);
    @GET
    @Path("/projects/{project_id}/api_keys")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of API keys in the project.", notes = "", response = ProjectApiKeyListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project API keys listed successfully.", response = ProjectApiKeyListResponse.class) })
    public Response listProjectApiKeys( @PathParam("project_id") String projectId, @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("after") String after,@Context SecurityContext securityContext);
    @GET
    @Path("/projects/{project_id}/rate_limits")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns the rate limits per model for a project.", notes = "", response = ProjectRateLimitListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project rate limits listed successfully.", response = ProjectRateLimitListResponse.class) })
    public Response listProjectRateLimits( @PathParam("project_id") String projectId, @DefaultValue("100") @QueryParam("limit") Integer limit, @QueryParam("after") String after, @QueryParam("before") String before,@Context SecurityContext securityContext);
    @GET
    @Path("/projects/{project_id}/service_accounts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of service accounts in the project.", notes = "", response = ProjectServiceAccountListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project service accounts listed successfully.", response = ProjectServiceAccountListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class) })
    public Response listProjectServiceAccounts( @PathParam("project_id") String projectId, @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("after") String after,@Context SecurityContext securityContext);
    @GET
    @Path("/projects/{project_id}/users")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of users in the project.", notes = "", response = ProjectUserListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project users listed successfully.", response = ProjectUserListResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class) })
    public Response listProjectUsers( @PathParam("project_id") String projectId, @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("after") String after,@Context SecurityContext securityContext);
    @GET
    @Path("/projects")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of projects.", notes = "", response = ProjectListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Projects listed successfully.", response = ProjectListResponse.class) })
    public Response listProjects( @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("after") String after, @DefaultValue("false") @QueryParam("include_archived") Boolean includeArchived,@Context SecurityContext securityContext);
    @GET
    @Path("/users")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Lists all of the users in the organization.", notes = "", response = UserListResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Users listed successfully.", response = UserListResponse.class) })
    public Response listUsers( @DefaultValue("20") @QueryParam("limit") Integer limit, @QueryParam("after") String after,@Context SecurityContext securityContext);
    @POST
    @Path("/projects/{project_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a project in the organization.", notes = "", response = Project.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project updated successfully.", response = Project.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error response when updating the default project.", response = ErrorResponse.class) })
    public Response modifyProject( @PathParam("project_id") String projectId,@ApiParam(value = "The project update request payload." ,required=true) @NotNull @Valid ProjectUpdateRequest projectUpdateRequest,@Context SecurityContext securityContext);
    @POST
    @Path("/projects/{project_id}/users/{user_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a user's role in the project.", notes = "", response = ProjectUser.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project user's role updated successfully.", response = ProjectUser.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public Response modifyProjectUser( @PathParam("project_id") String projectId, @PathParam("user_id") String userId,@ApiParam(value = "The project user update request payload." ,required=true) @NotNull @Valid ProjectUserUpdateRequest projectUserUpdateRequest,@Context SecurityContext securityContext);
    @POST
    @Path("/users/{user_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a user's role in the organization.", notes = "", response = User.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User role updated successfully.", response = User.class) })
    public Response modifyUser( @PathParam("user_id") String userId,@ApiParam(value = "The new user role to modify. This must be one of `owner` or `member`." ,required=true) @NotNull @Valid UserRoleUpdateRequest userRoleUpdateRequest,@Context SecurityContext securityContext);
    @GET
    @Path("/invites/{invite_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves an invite.", notes = "", response = Invite.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Invites", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Invite retrieved successfully.", response = Invite.class) })
    public Response retrieveInvite( @PathParam("invite_id") String inviteId,@Context SecurityContext securityContext);
    @GET
    @Path("/projects/{project_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a project.", notes = "", response = Project.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project retrieved successfully.", response = Project.class) })
    public Response retrieveProject( @PathParam("project_id") String projectId,@Context SecurityContext securityContext);
    @GET
    @Path("/projects/{project_id}/api_keys/{key_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves an API key in the project.", notes = "", response = ProjectApiKey.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project API key retrieved successfully.", response = ProjectApiKey.class) })
    public Response retrieveProjectApiKey( @PathParam("project_id") String projectId, @PathParam("key_id") String keyId,@Context SecurityContext securityContext);
    @GET
    @Path("/projects/{project_id}/service_accounts/{service_account_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a service account in the project.", notes = "", response = ProjectServiceAccount.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project service account retrieved successfully.", response = ProjectServiceAccount.class) })
    public Response retrieveProjectServiceAccount( @PathParam("project_id") String projectId, @PathParam("service_account_id") String serviceAccountId,@Context SecurityContext securityContext);
    @GET
    @Path("/projects/{project_id}/users/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a user in the project.", notes = "", response = ProjectUser.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project user retrieved successfully.", response = ProjectUser.class) })
    public Response retrieveProjectUser( @PathParam("project_id") String projectId, @PathParam("user_id") String userId,@Context SecurityContext securityContext);
    @GET
    @Path("/users/{user_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a user by their identifier.", notes = "", response = User.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Users", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "User retrieved successfully.", response = User.class) })
    public Response retrieveUser( @PathParam("user_id") String userId,@Context SecurityContext securityContext);
    @POST
    @Path("/projects/{project_id}/rate_limits/{rate_limit_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Updates a project rate limit.", notes = "", response = ProjectRateLimit.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Projects", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Project rate limit updated successfully.", response = ProjectRateLimit.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public Response updateProjectRateLimits( @PathParam("project_id") String projectId, @PathParam("rate_limit_id") String rateLimitId,@ApiParam(value = "The project rate limit update request payload." ,required=true) @NotNull @Valid ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest,@Context SecurityContext securityContext);
    @GET
    @Path("/usage/audio_speeches")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get audio speeches usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Usage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageAudioSpeeches( @NotNull @QueryParam("start_time") Integer startTime, @QueryParam("end_time") Integer endTime,, allowableValues="1m, 1h, 1d" @DefaultValue("1d") @QueryParam("bucket_width") String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page,@Context SecurityContext securityContext);
    @GET
    @Path("/usage/audio_transcriptions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get audio transcriptions usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Usage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageAudioTranscriptions( @NotNull @QueryParam("start_time") Integer startTime, @QueryParam("end_time") Integer endTime,, allowableValues="1m, 1h, 1d" @DefaultValue("1d") @QueryParam("bucket_width") String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page,@Context SecurityContext securityContext);
    @GET
    @Path("/usage/code_interpreter_sessions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get code interpreter sessions usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Usage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageCodeInterpreterSessions( @NotNull @QueryParam("start_time") Integer startTime, @QueryParam("end_time") Integer endTime,, allowableValues="1m, 1h, 1d" @DefaultValue("1d") @QueryParam("bucket_width") String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page,@Context SecurityContext securityContext);
    @GET
    @Path("/usage/completions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get completions usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Usage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageCompletions( @NotNull @QueryParam("start_time") Integer startTime, @QueryParam("end_time") Integer endTime,, allowableValues="1m, 1h, 1d" @DefaultValue("1d") @QueryParam("bucket_width") String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("batch") Boolean batch, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page,@Context SecurityContext securityContext);
    @GET
    @Path("/costs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get costs details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Usage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Costs data retrieved successfully.", response = UsageResponse.class) })
    public Response usageCosts( @NotNull @QueryParam("start_time") Integer startTime, @QueryParam("end_time") Integer endTime,, allowableValues="1d" @DefaultValue("1d") @QueryParam("bucket_width") String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("group_by") List<String> groupBy, @DefaultValue("7") @QueryParam("limit") Integer limit, @QueryParam("page") String page,@Context SecurityContext securityContext);
    @GET
    @Path("/usage/embeddings")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get embeddings usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Usage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageEmbeddings( @NotNull @QueryParam("start_time") Integer startTime, @QueryParam("end_time") Integer endTime,, allowableValues="1m, 1h, 1d" @DefaultValue("1d") @QueryParam("bucket_width") String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page,@Context SecurityContext securityContext);
    @GET
    @Path("/usage/images")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get images usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Usage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageImages( @NotNull @QueryParam("start_time") Integer startTime, @QueryParam("end_time") Integer endTime,, allowableValues="1m, 1h, 1d" @DefaultValue("1d") @QueryParam("bucket_width") String bucketWidth, @QueryParam("sources") List<String> sources, @QueryParam("sizes") List<String> sizes, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page,@Context SecurityContext securityContext);
    @GET
    @Path("/usage/moderations")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get moderations usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Usage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageModerations( @NotNull @QueryParam("start_time") Integer startTime, @QueryParam("end_time") Integer endTime,, allowableValues="1m, 1h, 1d" @DefaultValue("1d") @QueryParam("bucket_width") String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("user_ids") List<String> userIds, @QueryParam("api_key_ids") List<String> apiKeyIds, @QueryParam("models") List<String> models, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page,@Context SecurityContext securityContext);
    @GET
    @Path("/usage/vector_stores")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get vector stores usage details for the organization.", notes = "", response = UsageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Usage", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Usage data retrieved successfully.", response = UsageResponse.class) })
    public Response usageVectorStores( @NotNull @QueryParam("start_time") Integer startTime, @QueryParam("end_time") Integer endTime,, allowableValues="1m, 1h, 1d" @DefaultValue("1d") @QueryParam("bucket_width") String bucketWidth, @QueryParam("project_ids") List<String> projectIds, @QueryParam("group_by") List<String> groupBy, @QueryParam("limit") Integer limit, @QueryParam("page") String page,@Context SecurityContext securityContext);
}
