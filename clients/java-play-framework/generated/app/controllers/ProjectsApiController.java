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

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProjectsApiController extends Controller {
    private final ProjectsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ProjectsApiController(Config configuration, ProjectsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result archiveProject(Http.Request request, String projectId) throws Exception {
        return imp.archiveProjectHttp(request, projectId);
    }

    @ApiAction
    public Result createProject(Http.Request request) throws Exception {
        JsonNode nodeprojectCreateRequest = request.body().asJson();
        ProjectCreateRequest projectCreateRequest;
        if (nodeprojectCreateRequest != null) {
            projectCreateRequest = mapper.readValue(nodeprojectCreateRequest.toString(), ProjectCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(projectCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProjectCreateRequest' parameter is required");
        }
        return imp.createProjectHttp(request, projectCreateRequest);
    }

    @ApiAction
    public Result createProjectServiceAccount(Http.Request request, String projectId) throws Exception {
        JsonNode nodeprojectServiceAccountCreateRequest = request.body().asJson();
        ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest;
        if (nodeprojectServiceAccountCreateRequest != null) {
            projectServiceAccountCreateRequest = mapper.readValue(nodeprojectServiceAccountCreateRequest.toString(), ProjectServiceAccountCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(projectServiceAccountCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProjectServiceAccountCreateRequest' parameter is required");
        }
        return imp.createProjectServiceAccountHttp(request, projectId, projectServiceAccountCreateRequest);
    }

    @ApiAction
    public Result createProjectUser(Http.Request request, String projectId) throws Exception {
        JsonNode nodeprojectUserCreateRequest = request.body().asJson();
        ProjectUserCreateRequest projectUserCreateRequest;
        if (nodeprojectUserCreateRequest != null) {
            projectUserCreateRequest = mapper.readValue(nodeprojectUserCreateRequest.toString(), ProjectUserCreateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(projectUserCreateRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProjectUserCreateRequest' parameter is required");
        }
        return imp.createProjectUserHttp(request, projectId, projectUserCreateRequest);
    }

    @ApiAction
    public Result deleteProjectApiKey(Http.Request request, String projectId,String keyId) throws Exception {
        return imp.deleteProjectApiKeyHttp(request, projectId, keyId);
    }

    @ApiAction
    public Result deleteProjectServiceAccount(Http.Request request, String projectId,String serviceAccountId) throws Exception {
        return imp.deleteProjectServiceAccountHttp(request, projectId, serviceAccountId);
    }

    @ApiAction
    public Result deleteProjectUser(Http.Request request, String projectId,String userId) throws Exception {
        return imp.deleteProjectUserHttp(request, projectId, userId);
    }

    @ApiAction
    public Result listProjectApiKeys(Http.Request request, String projectId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        return imp.listProjectApiKeysHttp(request, projectId, limit, after);
    }

    @ApiAction
    public Result listProjectRateLimits(Http.Request request, String projectId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 100;
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuebefore = request.getQueryString("before");
        String before;
        if (valuebefore != null) {
            before = valuebefore;
        } else {
            before = null;
        }
        return imp.listProjectRateLimitsHttp(request, projectId, limit, after, before);
    }

    @ApiAction
    public Result listProjectServiceAccounts(Http.Request request, String projectId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        return imp.listProjectServiceAccountsHttp(request, projectId, limit, after);
    }

    @ApiAction
    public Result listProjectUsers(Http.Request request, String projectId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        return imp.listProjectUsersHttp(request, projectId, limit, after);
    }

    @ApiAction
    public Result listProjects(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valueincludeArchived = request.getQueryString("include_archived");
        Boolean includeArchived;
        if (valueincludeArchived != null) {
            includeArchived = Boolean.valueOf(valueincludeArchived);
        } else {
            includeArchived = false;
        }
        return imp.listProjectsHttp(request, limit, after, includeArchived);
    }

    @ApiAction
    public Result modifyProject(Http.Request request, String projectId) throws Exception {
        JsonNode nodeprojectUpdateRequest = request.body().asJson();
        ProjectUpdateRequest projectUpdateRequest;
        if (nodeprojectUpdateRequest != null) {
            projectUpdateRequest = mapper.readValue(nodeprojectUpdateRequest.toString(), ProjectUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(projectUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProjectUpdateRequest' parameter is required");
        }
        return imp.modifyProjectHttp(request, projectId, projectUpdateRequest);
    }

    @ApiAction
    public Result modifyProjectUser(Http.Request request, String projectId,String userId) throws Exception {
        JsonNode nodeprojectUserUpdateRequest = request.body().asJson();
        ProjectUserUpdateRequest projectUserUpdateRequest;
        if (nodeprojectUserUpdateRequest != null) {
            projectUserUpdateRequest = mapper.readValue(nodeprojectUserUpdateRequest.toString(), ProjectUserUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(projectUserUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProjectUserUpdateRequest' parameter is required");
        }
        return imp.modifyProjectUserHttp(request, projectId, userId, projectUserUpdateRequest);
    }

    @ApiAction
    public Result retrieveProject(Http.Request request, String projectId) throws Exception {
        return imp.retrieveProjectHttp(request, projectId);
    }

    @ApiAction
    public Result retrieveProjectApiKey(Http.Request request, String projectId,String keyId) throws Exception {
        return imp.retrieveProjectApiKeyHttp(request, projectId, keyId);
    }

    @ApiAction
    public Result retrieveProjectServiceAccount(Http.Request request, String projectId,String serviceAccountId) throws Exception {
        return imp.retrieveProjectServiceAccountHttp(request, projectId, serviceAccountId);
    }

    @ApiAction
    public Result retrieveProjectUser(Http.Request request, String projectId,String userId) throws Exception {
        return imp.retrieveProjectUserHttp(request, projectId, userId);
    }

    @ApiAction
    public Result updateProjectRateLimits(Http.Request request, String projectId,String rateLimitId) throws Exception {
        JsonNode nodeprojectRateLimitUpdateRequest = request.body().asJson();
        ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest;
        if (nodeprojectRateLimitUpdateRequest != null) {
            projectRateLimitUpdateRequest = mapper.readValue(nodeprojectRateLimitUpdateRequest.toString(), ProjectRateLimitUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(projectRateLimitUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'ProjectRateLimitUpdateRequest' parameter is required");
        }
        return imp.updateProjectRateLimitsHttp(request, projectId, rateLimitId, projectRateLimitUpdateRequest);
    }

}
