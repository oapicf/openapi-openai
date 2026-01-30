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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for ProjectsApi
 */
@MicronautTest
public class ProjectsApiTest {

    @Inject
    ProjectsApi api;

    
    /**
     * Archives a project in the organization. Archived projects cannot be used or updated.
     */
    @Test
    @Disabled("Not Implemented")
    public void archiveProjectTest() {
        // given
        String projectId = "example";

        // when
        Project body = api.archiveProject(projectId).block();

        // then
        // TODO implement the archiveProjectTest()
    }

    
    /**
     * Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     */
    @Test
    @Disabled("Not Implemented")
    public void createProjectTest() {
        // given
        ProjectCreateRequest projectCreateRequest = new ProjectCreateRequest("example");

        // when
        Project body = api.createProject(projectCreateRequest).block();

        // then
        // TODO implement the createProjectTest()
    }

    
    /**
     * Creates a new service account in the project. This also returns an unredacted API key for the service account.
     */
    @Test
    @Disabled("Not Implemented")
    public void createProjectServiceAccountTest() {
        // given
        String projectId = "example";
        ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest = new ProjectServiceAccountCreateRequest("example");

        // when
        ProjectServiceAccountCreateResponse body = api.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest).block();

        // then
        // TODO implement the createProjectServiceAccountTest()
    }

    
    /**
     * Adds a user to the project. Users must already be members of the organization to be added to a project.
     */
    @Test
    @Disabled("Not Implemented")
    public void createProjectUserTest() {
        // given
        String projectId = "example";
        ProjectUserCreateRequest projectUserCreateRequest = new ProjectUserCreateRequest("example", "example");

        // when
        ProjectUser body = api.createProjectUser(projectId, projectUserCreateRequest).block();

        // then
        // TODO implement the createProjectUserTest()
    }

    
    /**
     * Deletes an API key from the project.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteProjectApiKeyTest() {
        // given
        String projectId = "example";
        String keyId = "example";

        // when
        ProjectApiKeyDeleteResponse body = api.deleteProjectApiKey(projectId, keyId).block();

        // then
        // TODO implement the deleteProjectApiKeyTest()
    }

    
    /**
     * Deletes a service account from the project.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteProjectServiceAccountTest() {
        // given
        String projectId = "example";
        String serviceAccountId = "example";

        // when
        ProjectServiceAccountDeleteResponse body = api.deleteProjectServiceAccount(projectId, serviceAccountId).block();

        // then
        // TODO implement the deleteProjectServiceAccountTest()
    }

    
    /**
     * Deletes a user from the project.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteProjectUserTest() {
        // given
        String projectId = "example";
        String userId = "example";

        // when
        ProjectUserDeleteResponse body = api.deleteProjectUser(projectId, userId).block();

        // then
        // TODO implement the deleteProjectUserTest()
    }

    
    /**
     * Returns a list of API keys in the project.
     */
    @Test
    @Disabled("Not Implemented")
    public void listProjectApiKeysTest() {
        // given
        String projectId = "example";
        Integer limit = 20;
        String after = "example";

        // when
        ProjectApiKeyListResponse body = api.listProjectApiKeys(projectId, limit, after).block();

        // then
        // TODO implement the listProjectApiKeysTest()
    }

    
    /**
     * Returns the rate limits per model for a project.
     */
    @Test
    @Disabled("Not Implemented")
    public void listProjectRateLimitsTest() {
        // given
        String projectId = "example";
        Integer limit = 100;
        String after = "example";
        String before = "example";

        // when
        ProjectRateLimitListResponse body = api.listProjectRateLimits(projectId, limit, after, before).block();

        // then
        // TODO implement the listProjectRateLimitsTest()
    }

    
    /**
     * Returns a list of service accounts in the project.
     */
    @Test
    @Disabled("Not Implemented")
    public void listProjectServiceAccountsTest() {
        // given
        String projectId = "example";
        Integer limit = 20;
        String after = "example";

        // when
        ProjectServiceAccountListResponse body = api.listProjectServiceAccounts(projectId, limit, after).block();

        // then
        // TODO implement the listProjectServiceAccountsTest()
    }

    
    /**
     * Returns a list of users in the project.
     */
    @Test
    @Disabled("Not Implemented")
    public void listProjectUsersTest() {
        // given
        String projectId = "example";
        Integer limit = 20;
        String after = "example";

        // when
        ProjectUserListResponse body = api.listProjectUsers(projectId, limit, after).block();

        // then
        // TODO implement the listProjectUsersTest()
    }

    
    /**
     * Returns a list of projects.
     */
    @Test
    @Disabled("Not Implemented")
    public void listProjectsTest() {
        // given
        Integer limit = 20;
        String after = "example";
        Boolean includeArchived = false;

        // when
        ProjectListResponse body = api.listProjects(limit, after, includeArchived).block();

        // then
        // TODO implement the listProjectsTest()
    }

    
    /**
     * Modifies a project in the organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void modifyProjectTest() {
        // given
        String projectId = "example";
        ProjectUpdateRequest projectUpdateRequest = new ProjectUpdateRequest("example");

        // when
        Project body = api.modifyProject(projectId, projectUpdateRequest).block();

        // then
        // TODO implement the modifyProjectTest()
    }

    
    /**
     * Modifies a user&#39;s role in the project.
     */
    @Test
    @Disabled("Not Implemented")
    public void modifyProjectUserTest() {
        // given
        String projectId = "example";
        String userId = "example";
        ProjectUserUpdateRequest projectUserUpdateRequest = new ProjectUserUpdateRequest("example");

        // when
        ProjectUser body = api.modifyProjectUser(projectId, userId, projectUserUpdateRequest).block();

        // then
        // TODO implement the modifyProjectUserTest()
    }

    
    /**
     * Retrieves a project.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveProjectTest() {
        // given
        String projectId = "example";

        // when
        Project body = api.retrieveProject(projectId).block();

        // then
        // TODO implement the retrieveProjectTest()
    }

    
    /**
     * Retrieves an API key in the project.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveProjectApiKeyTest() {
        // given
        String projectId = "example";
        String keyId = "example";

        // when
        ProjectApiKey body = api.retrieveProjectApiKey(projectId, keyId).block();

        // then
        // TODO implement the retrieveProjectApiKeyTest()
    }

    
    /**
     * Retrieves a service account in the project.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveProjectServiceAccountTest() {
        // given
        String projectId = "example";
        String serviceAccountId = "example";

        // when
        ProjectServiceAccount body = api.retrieveProjectServiceAccount(projectId, serviceAccountId).block();

        // then
        // TODO implement the retrieveProjectServiceAccountTest()
    }

    
    /**
     * Retrieves a user in the project.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveProjectUserTest() {
        // given
        String projectId = "example";
        String userId = "example";

        // when
        ProjectUser body = api.retrieveProjectUser(projectId, userId).block();

        // then
        // TODO implement the retrieveProjectUserTest()
    }

    
    /**
     * Updates a project rate limit.
     */
    @Test
    @Disabled("Not Implemented")
    public void updateProjectRateLimitsTest() {
        // given
        String projectId = "example";
        String rateLimitId = "example";
        ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest = new ProjectRateLimitUpdateRequest();

        // when
        ProjectRateLimit body = api.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest).block();

        // then
        // TODO implement the updateProjectRateLimitsTest()
    }

    
}
