package org.openapitools.api;

import org.openapitools.model.ErrorResponse;
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
@Path("/organization/projects")
@Api(value = "/", description = "")
public interface ProjectsApi  {

    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     *
     */
    @POST
    @Path("/{project_id}/archive")
    @Produces({ "application/json" })
    @ApiOperation(value = "Archives a project in the organization. Archived projects cannot be used or updated.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project archived successfully.", response = Project.class) })
    public Project archiveProject(@PathParam("project_id") String projectId);

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a new project in the organization. Projects can be created and archived, but cannot be deleted.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project created successfully.", response = Project.class) })
    public Project createProject(ProjectCreateRequest projectCreateRequest);

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     *
     */
    @POST
    @Path("/{project_id}/service_accounts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a new service account in the project. This also returns an unredacted API key for the service account.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service account created successfully.", response = ProjectServiceAccountCreateResponse.class),
        @ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class) })
    public ProjectServiceAccountCreateResponse createProjectServiceAccount(@PathParam("project_id") String projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest);

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     *
     */
    @POST
    @Path("/{project_id}/users")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Adds a user to the project. Users must already be members of the organization to be added to a project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "User added to project successfully.", response = ProjectUser.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public ProjectUser createProjectUser(@PathParam("project_id") String projectId, ProjectUserCreateRequest projectUserCreateRequest);

    /**
     * Deletes an API key from the project.
     *
     */
    @DELETE
    @Path("/{project_id}/api_keys/{key_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes an API key from the project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project API key deleted successfully.", response = ProjectApiKeyDeleteResponse.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public ProjectApiKeyDeleteResponse deleteProjectApiKey(@PathParam("project_id") String projectId, @PathParam("key_id") String keyId);

    /**
     * Deletes a service account from the project.
     *
     */
    @DELETE
    @Path("/{project_id}/service_accounts/{service_account_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a service account from the project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service account deleted successfully.", response = ProjectServiceAccountDeleteResponse.class) })
    public ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(@PathParam("project_id") String projectId, @PathParam("service_account_id") String serviceAccountId);

    /**
     * Deletes a user from the project.
     *
     */
    @DELETE
    @Path("/{project_id}/users/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a user from the project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project user deleted successfully.", response = ProjectUserDeleteResponse.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public ProjectUserDeleteResponse deleteProjectUser(@PathParam("project_id") String projectId, @PathParam("user_id") String userId);

    /**
     * Returns a list of API keys in the project.
     *
     */
    @GET
    @Path("/{project_id}/api_keys")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of API keys in the project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project API keys listed successfully.", response = ProjectApiKeyListResponse.class) })
    public ProjectApiKeyListResponse listProjectApiKeys(@PathParam("project_id") String projectId, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("after") String after);

    /**
     * Returns the rate limits per model for a project.
     *
     */
    @GET
    @Path("/{project_id}/rate_limits")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns the rate limits per model for a project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project rate limits listed successfully.", response = ProjectRateLimitListResponse.class) })
    public ProjectRateLimitListResponse listProjectRateLimits(@PathParam("project_id") String projectId, @QueryParam("limit") @DefaultValue("100")Integer limit, @QueryParam("after") String after, @QueryParam("before") String before);

    /**
     * Returns a list of service accounts in the project.
     *
     */
    @GET
    @Path("/{project_id}/service_accounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of service accounts in the project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service accounts listed successfully.", response = ProjectServiceAccountListResponse.class),
        @ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class) })
    public ProjectServiceAccountListResponse listProjectServiceAccounts(@PathParam("project_id") String projectId, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("after") String after);

    /**
     * Returns a list of users in the project.
     *
     */
    @GET
    @Path("/{project_id}/users")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of users in the project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project users listed successfully.", response = ProjectUserListResponse.class),
        @ApiResponse(code = 400, message = "Error response when project is archived.", response = ErrorResponse.class) })
    public ProjectUserListResponse listProjectUsers(@PathParam("project_id") String projectId, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("after") String after);

    /**
     * Returns a list of projects.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of projects.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Projects listed successfully.", response = ProjectListResponse.class) })
    public ProjectListResponse listProjects(@QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("after") String after, @QueryParam("include_archived") @DefaultValue("false")Boolean includeArchived);

    /**
     * Modifies a project in the organization.
     *
     */
    @POST
    @Path("/{project_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a project in the organization.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project updated successfully.", response = Project.class),
        @ApiResponse(code = 400, message = "Error response when updating the default project.", response = ErrorResponse.class) })
    public Project modifyProject(@PathParam("project_id") String projectId, ProjectUpdateRequest projectUpdateRequest);

    /**
     * Modifies a user&#39;s role in the project.
     *
     */
    @POST
    @Path("/{project_id}/users/{user_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a user's role in the project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project user's role updated successfully.", response = ProjectUser.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public ProjectUser modifyProjectUser(@PathParam("project_id") String projectId, @PathParam("user_id") String userId, ProjectUserUpdateRequest projectUserUpdateRequest);

    /**
     * Retrieves a project.
     *
     */
    @GET
    @Path("/{project_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project retrieved successfully.", response = Project.class) })
    public Project retrieveProject(@PathParam("project_id") String projectId);

    /**
     * Retrieves an API key in the project.
     *
     */
    @GET
    @Path("/{project_id}/api_keys/{key_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an API key in the project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project API key retrieved successfully.", response = ProjectApiKey.class) })
    public ProjectApiKey retrieveProjectApiKey(@PathParam("project_id") String projectId, @PathParam("key_id") String keyId);

    /**
     * Retrieves a service account in the project.
     *
     */
    @GET
    @Path("/{project_id}/service_accounts/{service_account_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a service account in the project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project service account retrieved successfully.", response = ProjectServiceAccount.class) })
    public ProjectServiceAccount retrieveProjectServiceAccount(@PathParam("project_id") String projectId, @PathParam("service_account_id") String serviceAccountId);

    /**
     * Retrieves a user in the project.
     *
     */
    @GET
    @Path("/{project_id}/users/{user_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a user in the project.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project user retrieved successfully.", response = ProjectUser.class) })
    public ProjectUser retrieveProjectUser(@PathParam("project_id") String projectId, @PathParam("user_id") String userId);

    /**
     * Updates a project rate limit.
     *
     */
    @POST
    @Path("/{project_id}/rate_limits/{rate_limit_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Updates a project rate limit.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Project rate limit updated successfully.", response = ProjectRateLimit.class),
        @ApiResponse(code = 400, message = "Error response for various conditions.", response = ErrorResponse.class) })
    public ProjectRateLimit updateProjectRateLimits(@PathParam("project_id") String projectId, @PathParam("rate_limit_id") String rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest);
}
