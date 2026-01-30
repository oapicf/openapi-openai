package controllers;

import apimodels.ErrorResponse;
import apimodels.Project;
import apimodels.ProjectApiKey;
import apimodels.ProjectApiKeyDeleteResponse;
import apimodels.ProjectApiKeyListResponse;
import apimodels.ProjectCreateRequest;
import apimodels.ProjectListResponse;
import apimodels.ProjectRateLimit;
import apimodels.ProjectRateLimitListResponse;
import apimodels.ProjectRateLimitUpdateRequest;
import apimodels.ProjectServiceAccount;
import apimodels.ProjectServiceAccountCreateRequest;
import apimodels.ProjectServiceAccountCreateResponse;
import apimodels.ProjectServiceAccountDeleteResponse;
import apimodels.ProjectServiceAccountListResponse;
import apimodels.ProjectUpdateRequest;
import apimodels.ProjectUser;
import apimodels.ProjectUserCreateRequest;
import apimodels.ProjectUserDeleteResponse;
import apimodels.ProjectUserListResponse;
import apimodels.ProjectUserUpdateRequest;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class ProjectsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result archiveProjectHttp(Http.Request request, String projectId) throws Exception {
        Project obj = archiveProject(request, projectId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Project archiveProject(Http.Request request, String projectId) throws Exception;

    public Result createProjectHttp(Http.Request request, ProjectCreateRequest projectCreateRequest) throws Exception {
        Project obj = createProject(request, projectCreateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Project createProject(Http.Request request, ProjectCreateRequest projectCreateRequest) throws Exception;

    public Result createProjectServiceAccountHttp(Http.Request request, String projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest) throws Exception {
        ProjectServiceAccountCreateResponse obj = createProjectServiceAccount(request, projectId, projectServiceAccountCreateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectServiceAccountCreateResponse createProjectServiceAccount(Http.Request request, String projectId, ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest) throws Exception;

    public Result createProjectUserHttp(Http.Request request, String projectId, ProjectUserCreateRequest projectUserCreateRequest) throws Exception {
        ProjectUser obj = createProjectUser(request, projectId, projectUserCreateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectUser createProjectUser(Http.Request request, String projectId, ProjectUserCreateRequest projectUserCreateRequest) throws Exception;

    public Result deleteProjectApiKeyHttp(Http.Request request, String projectId, String keyId) throws Exception {
        ProjectApiKeyDeleteResponse obj = deleteProjectApiKey(request, projectId, keyId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectApiKeyDeleteResponse deleteProjectApiKey(Http.Request request, String projectId, String keyId) throws Exception;

    public Result deleteProjectServiceAccountHttp(Http.Request request, String projectId, String serviceAccountId) throws Exception {
        ProjectServiceAccountDeleteResponse obj = deleteProjectServiceAccount(request, projectId, serviceAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectServiceAccountDeleteResponse deleteProjectServiceAccount(Http.Request request, String projectId, String serviceAccountId) throws Exception;

    public Result deleteProjectUserHttp(Http.Request request, String projectId, String userId) throws Exception {
        ProjectUserDeleteResponse obj = deleteProjectUser(request, projectId, userId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectUserDeleteResponse deleteProjectUser(Http.Request request, String projectId, String userId) throws Exception;

    public Result listProjectApiKeysHttp(Http.Request request, String projectId, Integer limit, String after) throws Exception {
        ProjectApiKeyListResponse obj = listProjectApiKeys(request, projectId, limit, after);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectApiKeyListResponse listProjectApiKeys(Http.Request request, String projectId, Integer limit, String after) throws Exception;

    public Result listProjectRateLimitsHttp(Http.Request request, String projectId, Integer limit, String after, String before) throws Exception {
        ProjectRateLimitListResponse obj = listProjectRateLimits(request, projectId, limit, after, before);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectRateLimitListResponse listProjectRateLimits(Http.Request request, String projectId, Integer limit, String after, String before) throws Exception;

    public Result listProjectServiceAccountsHttp(Http.Request request, String projectId, Integer limit, String after) throws Exception {
        ProjectServiceAccountListResponse obj = listProjectServiceAccounts(request, projectId, limit, after);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectServiceAccountListResponse listProjectServiceAccounts(Http.Request request, String projectId, Integer limit, String after) throws Exception;

    public Result listProjectUsersHttp(Http.Request request, String projectId, Integer limit, String after) throws Exception {
        ProjectUserListResponse obj = listProjectUsers(request, projectId, limit, after);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectUserListResponse listProjectUsers(Http.Request request, String projectId, Integer limit, String after) throws Exception;

    public Result listProjectsHttp(Http.Request request, Integer limit, String after, Boolean includeArchived) throws Exception {
        ProjectListResponse obj = listProjects(request, limit, after, includeArchived);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectListResponse listProjects(Http.Request request, Integer limit, String after, Boolean includeArchived) throws Exception;

    public Result modifyProjectHttp(Http.Request request, String projectId, ProjectUpdateRequest projectUpdateRequest) throws Exception {
        Project obj = modifyProject(request, projectId, projectUpdateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Project modifyProject(Http.Request request, String projectId, ProjectUpdateRequest projectUpdateRequest) throws Exception;

    public Result modifyProjectUserHttp(Http.Request request, String projectId, String userId, ProjectUserUpdateRequest projectUserUpdateRequest) throws Exception {
        ProjectUser obj = modifyProjectUser(request, projectId, userId, projectUserUpdateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectUser modifyProjectUser(Http.Request request, String projectId, String userId, ProjectUserUpdateRequest projectUserUpdateRequest) throws Exception;

    public Result retrieveProjectHttp(Http.Request request, String projectId) throws Exception {
        Project obj = retrieveProject(request, projectId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Project retrieveProject(Http.Request request, String projectId) throws Exception;

    public Result retrieveProjectApiKeyHttp(Http.Request request, String projectId, String keyId) throws Exception {
        ProjectApiKey obj = retrieveProjectApiKey(request, projectId, keyId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectApiKey retrieveProjectApiKey(Http.Request request, String projectId, String keyId) throws Exception;

    public Result retrieveProjectServiceAccountHttp(Http.Request request, String projectId, String serviceAccountId) throws Exception {
        ProjectServiceAccount obj = retrieveProjectServiceAccount(request, projectId, serviceAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectServiceAccount retrieveProjectServiceAccount(Http.Request request, String projectId, String serviceAccountId) throws Exception;

    public Result retrieveProjectUserHttp(Http.Request request, String projectId, String userId) throws Exception {
        ProjectUser obj = retrieveProjectUser(request, projectId, userId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectUser retrieveProjectUser(Http.Request request, String projectId, String userId) throws Exception;

    public Result updateProjectRateLimitsHttp(Http.Request request, String projectId, String rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest) throws Exception {
        ProjectRateLimit obj = updateProjectRateLimits(request, projectId, rateLimitId, projectRateLimitUpdateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ProjectRateLimit updateProjectRateLimits(Http.Request request, String projectId, String rateLimitId, ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest) throws Exception;

}
