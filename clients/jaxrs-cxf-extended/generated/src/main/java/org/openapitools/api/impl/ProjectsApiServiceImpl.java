package org.openapitools.api.impl;

import org.openapitools.api.*;
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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class ProjectsApiServiceImpl implements ProjectsApi {
    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     *
     */
    @Override
    public Project archiveProject(String projectId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     *
     */
    @Override
    public Project createProject(ProjectCreateRequest projectCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     *
     */
    @Override
    public ProjectServiceAccountCreateResponse createProjectServiceAccount(String projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     *
     */
    @Override
    public ProjectUser createProjectUser(String projectId, ProjectUserCreateRequest projectUserCreateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Deletes an API key from the project.
     *
     */
    @Override
    public ProjectApiKeyDeleteResponse deleteProjectApiKey(String projectId, String keyId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Deletes a service account from the project.
     *
     */
    @Override
    public ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(String projectId, String serviceAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Deletes a user from the project.
     *
     */
    @Override
    public ProjectUserDeleteResponse deleteProjectUser(String projectId, String userId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Returns a list of API keys in the project.
     *
     */
    @Override
    public ProjectApiKeyListResponse listProjectApiKeys(String projectId, Integer limit, String after) {
        // TODO: Implement...
        return null;
    }

    /**
     * Returns the rate limits per model for a project.
     *
     */
    @Override
    public ProjectRateLimitListResponse listProjectRateLimits(String projectId, Integer limit, String after, String before) {
        // TODO: Implement...
        return null;
    }

    /**
     * Returns a list of service accounts in the project.
     *
     */
    @Override
    public ProjectServiceAccountListResponse listProjectServiceAccounts(String projectId, Integer limit, String after) {
        // TODO: Implement...
        return null;
    }

    /**
     * Returns a list of users in the project.
     *
     */
    @Override
    public ProjectUserListResponse listProjectUsers(String projectId, Integer limit, String after) {
        // TODO: Implement...
        return null;
    }

    /**
     * Returns a list of projects.
     *
     */
    @Override
    public ProjectListResponse listProjects(Integer limit, String after, Boolean includeArchived) {
        // TODO: Implement...
        return null;
    }

    /**
     * Modifies a project in the organization.
     *
     */
    @Override
    public Project modifyProject(String projectId, ProjectUpdateRequest projectUpdateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Modifies a user&#39;s role in the project.
     *
     */
    @Override
    public ProjectUser modifyProjectUser(String projectId, String userId, ProjectUserUpdateRequest projectUserUpdateRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Retrieves a project.
     *
     */
    @Override
    public Project retrieveProject(String projectId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Retrieves an API key in the project.
     *
     */
    @Override
    public ProjectApiKey retrieveProjectApiKey(String projectId, String keyId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Retrieves a service account in the project.
     *
     */
    @Override
    public ProjectServiceAccount retrieveProjectServiceAccount(String projectId, String serviceAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Retrieves a user in the project.
     *
     */
    @Override
    public ProjectUser retrieveProjectUser(String projectId, String userId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Updates a project rate limit.
     *
     */
    @Override
    public ProjectRateLimit updateProjectRateLimits(String projectId, String rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest) {
        // TODO: Implement...
        return null;
    }

}
