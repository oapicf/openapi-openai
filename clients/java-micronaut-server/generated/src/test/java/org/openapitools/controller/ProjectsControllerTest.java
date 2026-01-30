package org.openapitools.controller;

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
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for ProjectsController
 */
@MicronautTest
public class ProjectsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ProjectsController controller;

    /**
     * This test is used to validate the implementation of archiveProject() method
     *
     * The method should: Archives a project in the organization. Archived projects cannot be used or updated.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void archiveProjectMethodTest() {
        // given
        String projectId = "example";

        // when
        Project result = controller.archiveProject(projectId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/archive' to the features of archiveProject() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void archiveProjectClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/archive").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, null)
            .accept("[Ljava.lang.String;@7b73b5c9");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Project.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createProject() method
     *
     * The method should: Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createProjectMethodTest() {
        // given
        ProjectCreateRequest projectCreateRequest = new ProjectCreateRequest("example");

        // when
        Project result = controller.createProject(projectCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects' to the features of createProject() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createProjectClientApiTest() throws IOException {
        // given
        ProjectCreateRequest body = new ProjectCreateRequest("example");
        String uri = UriTemplate.of("/organization/projects").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4a402ba3");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Project.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createProjectServiceAccount() method
     *
     * The method should: Creates a new service account in the project. This also returns an unredacted API key for the service account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createProjectServiceAccountMethodTest() {
        // given
        String projectId = "example";
        ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest = new ProjectServiceAccountCreateRequest("example");

        // when
        ProjectServiceAccountCreateResponse result = controller.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/service_accounts' to the features of createProjectServiceAccount() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createProjectServiceAccountClientApiTest() throws IOException {
        // given
        ProjectServiceAccountCreateRequest body = new ProjectServiceAccountCreateRequest("example");
        String uri = UriTemplate.of("/organization/projects/{project_id}/service_accounts").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@65b2f815");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectServiceAccountCreateResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createProjectUser() method
     *
     * The method should: Adds a user to the project. Users must already be members of the organization to be added to a project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createProjectUserMethodTest() {
        // given
        String projectId = "example";
        ProjectUserCreateRequest projectUserCreateRequest = new ProjectUserCreateRequest("example", "example");

        // when
        ProjectUser result = controller.createProjectUser(projectId, projectUserCreateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/users' to the features of createProjectUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createProjectUserClientApiTest() throws IOException {
        // given
        ProjectUserCreateRequest body = new ProjectUserCreateRequest("example", "example");
        String uri = UriTemplate.of("/organization/projects/{project_id}/users").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@1a8b2ab3");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectUser.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteProjectApiKey() method
     *
     * The method should: Deletes an API key from the project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteProjectApiKeyMethodTest() {
        // given
        String projectId = "example";
        String keyId = "example";

        // when
        ProjectApiKeyDeleteResponse result = controller.deleteProjectApiKey(projectId, keyId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/api_keys/{key_id}' to the features of deleteProjectApiKey() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteProjectApiKeyClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/api_keys/{key_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
            put("key_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@7c3019d6");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectApiKeyDeleteResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteProjectServiceAccount() method
     *
     * The method should: Deletes a service account from the project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteProjectServiceAccountMethodTest() {
        // given
        String projectId = "example";
        String serviceAccountId = "example";

        // when
        ProjectServiceAccountDeleteResponse result = controller.deleteProjectServiceAccount(projectId, serviceAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/service_accounts/{service_account_id}' to the features of deleteProjectServiceAccount() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteProjectServiceAccountClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/service_accounts/{service_account_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
            put("service_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@37e628c0");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectServiceAccountDeleteResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of deleteProjectUser() method
     *
     * The method should: Deletes a user from the project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteProjectUserMethodTest() {
        // given
        String projectId = "example";
        String userId = "example";

        // when
        ProjectUserDeleteResponse result = controller.deleteProjectUser(projectId, userId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/users/{user_id}' to the features of deleteProjectUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void deleteProjectUserClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/users/{user_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
            put("user_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@45e60c79");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectUserDeleteResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listProjectApiKeys() method
     *
     * The method should: Returns a list of API keys in the project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listProjectApiKeysMethodTest() {
        // given
        String projectId = "example";
        Integer limit = 20;
        String after = "example";

        // when
        ProjectApiKeyListResponse result = controller.listProjectApiKeys(projectId, limit, after).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/api_keys' to the features of listProjectApiKeys() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listProjectApiKeysClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/api_keys").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6fb68c4");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("after", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectApiKeyListResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listProjectRateLimits() method
     *
     * The method should: Returns the rate limits per model for a project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listProjectRateLimitsMethodTest() {
        // given
        String projectId = "example";
        Integer limit = 100;
        String after = "example";
        String before = "example";

        // when
        ProjectRateLimitListResponse result = controller.listProjectRateLimits(projectId, limit, after, before).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/rate_limits' to the features of listProjectRateLimits() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listProjectRateLimitsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/rate_limits").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7a792f64");
        request.getParameters()
            .add("limit", String.valueOf(100)) // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("before", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectRateLimitListResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listProjectServiceAccounts() method
     *
     * The method should: Returns a list of service accounts in the project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listProjectServiceAccountsMethodTest() {
        // given
        String projectId = "example";
        Integer limit = 20;
        String after = "example";

        // when
        ProjectServiceAccountListResponse result = controller.listProjectServiceAccounts(projectId, limit, after).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/service_accounts' to the features of listProjectServiceAccounts() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listProjectServiceAccountsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/service_accounts").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7cdfb8c3");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("after", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectServiceAccountListResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listProjectUsers() method
     *
     * The method should: Returns a list of users in the project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listProjectUsersMethodTest() {
        // given
        String projectId = "example";
        Integer limit = 20;
        String after = "example";

        // when
        ProjectUserListResponse result = controller.listProjectUsers(projectId, limit, after).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/users' to the features of listProjectUsers() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listProjectUsersClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/users").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@92fe6e5");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("after", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectUserListResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of listProjects() method
     *
     * The method should: Returns a list of projects.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void listProjectsMethodTest() {
        // given
        Integer limit = 20;
        String after = "example";
        Boolean includeArchived = false;

        // when
        ProjectListResponse result = controller.listProjects(limit, after, includeArchived).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects' to the features of listProjects() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void listProjectsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@54cf024c");
        request.getParameters()
            .add("limit", String.valueOf(20)) // The query parameter format should be 
            .add("after", "example") // The query parameter format should be 
            .add("include_archived", String.valueOf(false)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectListResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of modifyProject() method
     *
     * The method should: Modifies a project in the organization.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyProjectMethodTest() {
        // given
        String projectId = "example";
        ProjectUpdateRequest projectUpdateRequest = new ProjectUpdateRequest("example");

        // when
        Project result = controller.modifyProject(projectId, projectUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}' to the features of modifyProject() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyProjectClientApiTest() throws IOException {
        // given
        ProjectUpdateRequest body = new ProjectUpdateRequest("example");
        String uri = UriTemplate.of("/organization/projects/{project_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@67fe15be");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Project.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of modifyProjectUser() method
     *
     * The method should: Modifies a user&#39;s role in the project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyProjectUserMethodTest() {
        // given
        String projectId = "example";
        String userId = "example";
        ProjectUserUpdateRequest projectUserUpdateRequest = new ProjectUserUpdateRequest("example");

        // when
        ProjectUser result = controller.modifyProjectUser(projectId, userId, projectUserUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/users/{user_id}' to the features of modifyProjectUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void modifyProjectUserClientApiTest() throws IOException {
        // given
        ProjectUserUpdateRequest body = new ProjectUserUpdateRequest("example");
        String uri = UriTemplate.of("/organization/projects/{project_id}/users/{user_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
            put("user_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@66e6b022");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectUser.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveProject() method
     *
     * The method should: Retrieves a project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveProjectMethodTest() {
        // given
        String projectId = "example";

        // when
        Project result = controller.retrieveProject(projectId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}' to the features of retrieveProject() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveProjectClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@10087ad5");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Project.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveProjectApiKey() method
     *
     * The method should: Retrieves an API key in the project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveProjectApiKeyMethodTest() {
        // given
        String projectId = "example";
        String keyId = "example";

        // when
        ProjectApiKey result = controller.retrieveProjectApiKey(projectId, keyId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/api_keys/{key_id}' to the features of retrieveProjectApiKey() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveProjectApiKeyClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/api_keys/{key_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
            put("key_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@3c79c7fa");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectApiKey.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveProjectServiceAccount() method
     *
     * The method should: Retrieves a service account in the project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveProjectServiceAccountMethodTest() {
        // given
        String projectId = "example";
        String serviceAccountId = "example";

        // when
        ProjectServiceAccount result = controller.retrieveProjectServiceAccount(projectId, serviceAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/service_accounts/{service_account_id}' to the features of retrieveProjectServiceAccount() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveProjectServiceAccountClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/service_accounts/{service_account_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
            put("service_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@2b3d662e");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectServiceAccount.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of retrieveProjectUser() method
     *
     * The method should: Retrieves a user in the project.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveProjectUserMethodTest() {
        // given
        String projectId = "example";
        String userId = "example";

        // when
        ProjectUser result = controller.retrieveProjectUser(projectId, userId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/users/{user_id}' to the features of retrieveProjectUser() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void retrieveProjectUserClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/organization/projects/{project_id}/users/{user_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
            put("user_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7889b4cb");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectUser.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of updateProjectRateLimits() method
     *
     * The method should: Updates a project rate limit.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void updateProjectRateLimitsMethodTest() {
        // given
        String projectId = "example";
        String rateLimitId = "example";
        ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest = new ProjectRateLimitUpdateRequest();

        // when
        ProjectRateLimit result = controller.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/organization/projects/{project_id}/rate_limits/{rate_limit_id}' to the features of updateProjectRateLimits() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void updateProjectRateLimitsClientApiTest() throws IOException {
        // given
        ProjectRateLimitUpdateRequest body = new ProjectRateLimitUpdateRequest();
        String uri = UriTemplate.of("/organization/projects/{project_id}/rate_limits/{rate_limit_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("project_id", "example");
            put("rate_limit_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@2b04b7dd");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, ProjectRateLimit.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
