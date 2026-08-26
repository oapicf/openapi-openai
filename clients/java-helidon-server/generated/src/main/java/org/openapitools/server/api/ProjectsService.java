package org.openapitools.server.api;

import org.openapitools.server.model.ErrorResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.Project;
import org.openapitools.server.model.ProjectApiKey;
import org.openapitools.server.model.ProjectApiKeyDeleteResponse;
import org.openapitools.server.model.ProjectApiKeyListResponse;
import org.openapitools.server.model.ProjectCreateRequest;
import org.openapitools.server.model.ProjectListResponse;
import org.openapitools.server.model.ProjectRateLimit;
import org.openapitools.server.model.ProjectRateLimitListResponse;
import org.openapitools.server.model.ProjectRateLimitUpdateRequest;
import org.openapitools.server.model.ProjectServiceAccount;
import org.openapitools.server.model.ProjectServiceAccountCreateRequest;
import org.openapitools.server.model.ProjectServiceAccountCreateResponse;
import org.openapitools.server.model.ProjectServiceAccountDeleteResponse;
import org.openapitools.server.model.ProjectServiceAccountListResponse;
import org.openapitools.server.model.ProjectUpdateRequest;
import org.openapitools.server.model.ProjectUser;
import org.openapitools.server.model.ProjectUserCreateRequest;
import org.openapitools.server.model.ProjectUserDeleteResponse;
import org.openapitools.server.model.ProjectUserListResponse;
import org.openapitools.server.model.ProjectUserUpdateRequest;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Projects'",
                             version = "7.24.0")
public interface ProjectsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/{project_id}/archive", this::archiveProject);
        rules.post("/", this::createProject);
        rules.post("/{project_id}/service_accounts", this::createProjectServiceAccount);
        rules.post("/{project_id}/users", this::createProjectUser);
        rules.delete("/{project_id}/api_keys/{key_id}", this::deleteProjectApiKey);
        rules.delete("/{project_id}/service_accounts/{service_account_id}", this::deleteProjectServiceAccount);
        rules.delete("/{project_id}/users/{user_id}", this::deleteProjectUser);
        rules.get("/{project_id}/api_keys", this::listProjectApiKeys);
        rules.get("/{project_id}/rate_limits", this::listProjectRateLimits);
        rules.get("/{project_id}/service_accounts", this::listProjectServiceAccounts);
        rules.get("/{project_id}/users", this::listProjectUsers);
        rules.get("/", this::listProjects);
        rules.post("/{project_id}", this::modifyProject);
        rules.post("/{project_id}/users/{user_id}", this::modifyProjectUser);
        rules.get("/{project_id}", this::retrieveProject);
        rules.get("/{project_id}/api_keys/{key_id}", this::retrieveProjectApiKey);
        rules.get("/{project_id}/service_accounts/{service_account_id}", this::retrieveProjectServiceAccount);
        rules.get("/{project_id}/users/{user_id}", this::retrieveProjectUser);
        rules.post("/{project_id}/rate_limits/{rate_limit_id}", this::updateProjectRateLimits);
    }


    /**
     * POST /organization/projects/{project_id}/archive : Archives a project in the organization. Archived projects cannot be used or updated..
     *
     * @param request the server request
     * @param response the server response
     */
    void archiveProject(ServerRequest request, ServerResponse response);
    /**
     * POST /organization/projects : Create a new project in the organization. Projects can be created and archived, but cannot be deleted..
     *
     * @param request the server request
     * @param response the server response
     */
    void createProject(ServerRequest request, ServerResponse response);
    /**
     * POST /organization/projects/{project_id}/service_accounts : Creates a new service account in the project. This also returns an unredacted API key for the service account..
     *
     * @param request the server request
     * @param response the server response
     */
    void createProjectServiceAccount(ServerRequest request, ServerResponse response);
    /**
     * POST /organization/projects/{project_id}/users : Adds a user to the project. Users must already be members of the organization to be added to a project..
     *
     * @param request the server request
     * @param response the server response
     */
    void createProjectUser(ServerRequest request, ServerResponse response);
    /**
     * DELETE /organization/projects/{project_id}/api_keys/{key_id} : Deletes an API key from the project..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteProjectApiKey(ServerRequest request, ServerResponse response);
    /**
     * DELETE /organization/projects/{project_id}/service_accounts/{service_account_id} : Deletes a service account from the project..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteProjectServiceAccount(ServerRequest request, ServerResponse response);
    /**
     * DELETE /organization/projects/{project_id}/users/{user_id} : Deletes a user from the project..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteProjectUser(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/projects/{project_id}/api_keys : Returns a list of API keys in the project..
     *
     * @param request the server request
     * @param response the server response
     */
    void listProjectApiKeys(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/projects/{project_id}/rate_limits : Returns the rate limits per model for a project..
     *
     * @param request the server request
     * @param response the server response
     */
    void listProjectRateLimits(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/projects/{project_id}/service_accounts : Returns a list of service accounts in the project..
     *
     * @param request the server request
     * @param response the server response
     */
    void listProjectServiceAccounts(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/projects/{project_id}/users : Returns a list of users in the project..
     *
     * @param request the server request
     * @param response the server response
     */
    void listProjectUsers(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/projects : Returns a list of projects..
     *
     * @param request the server request
     * @param response the server response
     */
    void listProjects(ServerRequest request, ServerResponse response);
    /**
     * POST /organization/projects/{project_id} : Modifies a project in the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void modifyProject(ServerRequest request, ServerResponse response);
    /**
     * POST /organization/projects/{project_id}/users/{user_id} : Modifies a user&#39;s role in the project..
     *
     * @param request the server request
     * @param response the server response
     */
    void modifyProjectUser(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/projects/{project_id} : Retrieves a project..
     *
     * @param request the server request
     * @param response the server response
     */
    void retrieveProject(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/projects/{project_id}/api_keys/{key_id} : Retrieves an API key in the project..
     *
     * @param request the server request
     * @param response the server response
     */
    void retrieveProjectApiKey(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/projects/{project_id}/service_accounts/{service_account_id} : Retrieves a service account in the project..
     *
     * @param request the server request
     * @param response the server response
     */
    void retrieveProjectServiceAccount(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/projects/{project_id}/users/{user_id} : Retrieves a user in the project..
     *
     * @param request the server request
     * @param response the server response
     */
    void retrieveProjectUser(ServerRequest request, ServerResponse response);
    /**
     * POST /organization/projects/{project_id}/rate_limits/{rate_limit_id} : Updates a project rate limit..
     *
     * @param request the server request
     * @param response the server response
     */
    void updateProjectRateLimits(ServerRequest request, ServerResponse response);
}
