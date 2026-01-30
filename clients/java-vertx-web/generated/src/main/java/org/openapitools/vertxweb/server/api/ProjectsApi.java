package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.ErrorResponse;
import org.openapitools.vertxweb.server.model.Project;
import org.openapitools.vertxweb.server.model.ProjectApiKey;
import org.openapitools.vertxweb.server.model.ProjectApiKeyDeleteResponse;
import org.openapitools.vertxweb.server.model.ProjectApiKeyListResponse;
import org.openapitools.vertxweb.server.model.ProjectCreateRequest;
import org.openapitools.vertxweb.server.model.ProjectListResponse;
import org.openapitools.vertxweb.server.model.ProjectRateLimit;
import org.openapitools.vertxweb.server.model.ProjectRateLimitListResponse;
import org.openapitools.vertxweb.server.model.ProjectRateLimitUpdateRequest;
import org.openapitools.vertxweb.server.model.ProjectServiceAccount;
import org.openapitools.vertxweb.server.model.ProjectServiceAccountCreateRequest;
import org.openapitools.vertxweb.server.model.ProjectServiceAccountCreateResponse;
import org.openapitools.vertxweb.server.model.ProjectServiceAccountDeleteResponse;
import org.openapitools.vertxweb.server.model.ProjectServiceAccountListResponse;
import org.openapitools.vertxweb.server.model.ProjectUpdateRequest;
import org.openapitools.vertxweb.server.model.ProjectUser;
import org.openapitools.vertxweb.server.model.ProjectUserCreateRequest;
import org.openapitools.vertxweb.server.model.ProjectUserDeleteResponse;
import org.openapitools.vertxweb.server.model.ProjectUserListResponse;
import org.openapitools.vertxweb.server.model.ProjectUserUpdateRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ProjectsApi  {
    Future<ApiResponse<Project>> archiveProject(String projectId);
    Future<ApiResponse<Project>> createProject(ProjectCreateRequest projectCreateRequest);
    Future<ApiResponse<ProjectServiceAccountCreateResponse>> createProjectServiceAccount(String projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest);
    Future<ApiResponse<ProjectUser>> createProjectUser(String projectId, ProjectUserCreateRequest projectUserCreateRequest);
    Future<ApiResponse<ProjectApiKeyDeleteResponse>> deleteProjectApiKey(String projectId, String keyId);
    Future<ApiResponse<ProjectServiceAccountDeleteResponse>> deleteProjectServiceAccount(String projectId, String serviceAccountId);
    Future<ApiResponse<ProjectUserDeleteResponse>> deleteProjectUser(String projectId, String userId);
    Future<ApiResponse<ProjectApiKeyListResponse>> listProjectApiKeys(String projectId, Integer limit, String after);
    Future<ApiResponse<ProjectRateLimitListResponse>> listProjectRateLimits(String projectId, Integer limit, String after, String before);
    Future<ApiResponse<ProjectServiceAccountListResponse>> listProjectServiceAccounts(String projectId, Integer limit, String after);
    Future<ApiResponse<ProjectUserListResponse>> listProjectUsers(String projectId, Integer limit, String after);
    Future<ApiResponse<ProjectListResponse>> listProjects(Integer limit, String after, Boolean includeArchived);
    Future<ApiResponse<Project>> modifyProject(String projectId, ProjectUpdateRequest projectUpdateRequest);
    Future<ApiResponse<ProjectUser>> modifyProjectUser(String projectId, String userId, ProjectUserUpdateRequest projectUserUpdateRequest);
    Future<ApiResponse<Project>> retrieveProject(String projectId);
    Future<ApiResponse<ProjectApiKey>> retrieveProjectApiKey(String projectId, String keyId);
    Future<ApiResponse<ProjectServiceAccount>> retrieveProjectServiceAccount(String projectId, String serviceAccountId);
    Future<ApiResponse<ProjectUser>> retrieveProjectUser(String projectId, String userId);
    Future<ApiResponse<ProjectRateLimit>> updateProjectRateLimits(String projectId, String rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest);
}
