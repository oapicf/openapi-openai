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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ProjectsApiImpl implements ProjectsApi {
    public Future<ApiResponse<Project>> archiveProject(String projectId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Project>> createProject(ProjectCreateRequest projectCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectServiceAccountCreateResponse>> createProjectServiceAccount(String projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectUser>> createProjectUser(String projectId, ProjectUserCreateRequest projectUserCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectApiKeyDeleteResponse>> deleteProjectApiKey(String projectId, String keyId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectServiceAccountDeleteResponse>> deleteProjectServiceAccount(String projectId, String serviceAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectUserDeleteResponse>> deleteProjectUser(String projectId, String userId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectApiKeyListResponse>> listProjectApiKeys(String projectId, Integer limit, String after) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectRateLimitListResponse>> listProjectRateLimits(String projectId, Integer limit, String after, String before) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectServiceAccountListResponse>> listProjectServiceAccounts(String projectId, Integer limit, String after) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectUserListResponse>> listProjectUsers(String projectId, Integer limit, String after) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectListResponse>> listProjects(Integer limit, String after, Boolean includeArchived) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Project>> modifyProject(String projectId, ProjectUpdateRequest projectUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectUser>> modifyProjectUser(String projectId, String userId, ProjectUserUpdateRequest projectUserUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Project>> retrieveProject(String projectId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectApiKey>> retrieveProjectApiKey(String projectId, String keyId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectServiceAccount>> retrieveProjectServiceAccount(String projectId, String serviceAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectUser>> retrieveProjectUser(String projectId, String userId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ProjectRateLimit>> updateProjectRateLimits(String projectId, String rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
