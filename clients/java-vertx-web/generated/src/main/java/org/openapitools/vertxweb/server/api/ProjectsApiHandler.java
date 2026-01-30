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

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class ProjectsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(ProjectsApiHandler.class);

    private final ProjectsApi api;

    public ProjectsApiHandler(ProjectsApi api) {
        this.api = api;
    }

    @Deprecated
    public ProjectsApiHandler() {
        this(new ProjectsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("archiveProject").handler(this::archiveProject);
        builder.operation("createProject").handler(this::createProject);
        builder.operation("createProjectServiceAccount").handler(this::createProjectServiceAccount);
        builder.operation("createProjectUser").handler(this::createProjectUser);
        builder.operation("deleteProjectApiKey").handler(this::deleteProjectApiKey);
        builder.operation("deleteProjectServiceAccount").handler(this::deleteProjectServiceAccount);
        builder.operation("deleteProjectUser").handler(this::deleteProjectUser);
        builder.operation("listProjectApiKeys").handler(this::listProjectApiKeys);
        builder.operation("listProjectRateLimits").handler(this::listProjectRateLimits);
        builder.operation("listProjectServiceAccounts").handler(this::listProjectServiceAccounts);
        builder.operation("listProjectUsers").handler(this::listProjectUsers);
        builder.operation("listProjects").handler(this::listProjects);
        builder.operation("modifyProject").handler(this::modifyProject);
        builder.operation("modifyProjectUser").handler(this::modifyProjectUser);
        builder.operation("retrieveProject").handler(this::retrieveProject);
        builder.operation("retrieveProjectApiKey").handler(this::retrieveProjectApiKey);
        builder.operation("retrieveProjectServiceAccount").handler(this::retrieveProjectServiceAccount);
        builder.operation("retrieveProjectUser").handler(this::retrieveProjectUser);
        builder.operation("updateProjectRateLimits").handler(this::updateProjectRateLimits);
    }

    private void archiveProject(RoutingContext routingContext) {
        logger.info("archiveProject()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);

        api.archiveProject(projectId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createProject(RoutingContext routingContext) {
        logger.info("createProject()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        ProjectCreateRequest projectCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProjectCreateRequest>(){}) : null;

        logger.debug("Parameter projectCreateRequest is {}", projectCreateRequest);

        api.createProject(projectCreateRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createProjectServiceAccount(RoutingContext routingContext) {
        logger.info("createProjectServiceAccount()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProjectServiceAccountCreateRequest>(){}) : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter projectServiceAccountCreateRequest is {}", projectServiceAccountCreateRequest);

        api.createProjectServiceAccount(projectId, projectServiceAccountCreateRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createProjectUser(RoutingContext routingContext) {
        logger.info("createProjectUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ProjectUserCreateRequest projectUserCreateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProjectUserCreateRequest>(){}) : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter projectUserCreateRequest is {}", projectUserCreateRequest);

        api.createProjectUser(projectId, projectUserCreateRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteProjectApiKey(RoutingContext routingContext) {
        logger.info("deleteProjectApiKey()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        String keyId = requestParameters.pathParameter("key_id") != null ? requestParameters.pathParameter("key_id").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter keyId is {}", keyId);

        api.deleteProjectApiKey(projectId, keyId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteProjectServiceAccount(RoutingContext routingContext) {
        logger.info("deleteProjectServiceAccount()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        String serviceAccountId = requestParameters.pathParameter("service_account_id") != null ? requestParameters.pathParameter("service_account_id").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter serviceAccountId is {}", serviceAccountId);

        api.deleteProjectServiceAccount(projectId, serviceAccountId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteProjectUser(RoutingContext routingContext) {
        logger.info("deleteProjectUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        String userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter userId is {}", userId);

        api.deleteProjectUser(projectId, userId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void listProjectApiKeys(RoutingContext routingContext) {
        logger.info("listProjectApiKeys()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter after is {}", after);

        api.listProjectApiKeys(projectId, limit, after)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void listProjectRateLimits(RoutingContext routingContext) {
        logger.info("listProjectRateLimits()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 100;
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        String before = requestParameters.queryParameter("before") != null ? requestParameters.queryParameter("before").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter before is {}", before);

        api.listProjectRateLimits(projectId, limit, after, before)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void listProjectServiceAccounts(RoutingContext routingContext) {
        logger.info("listProjectServiceAccounts()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter after is {}", after);

        api.listProjectServiceAccounts(projectId, limit, after)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void listProjectUsers(RoutingContext routingContext) {
        logger.info("listProjectUsers()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter after is {}", after);

        api.listProjectUsers(projectId, limit, after)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void listProjects(RoutingContext routingContext) {
        logger.info("listProjects()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        Boolean includeArchived = requestParameters.queryParameter("include_archived") != null ? requestParameters.queryParameter("include_archived").getBoolean() : false;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter includeArchived is {}", includeArchived);

        api.listProjects(limit, after, includeArchived)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void modifyProject(RoutingContext routingContext) {
        logger.info("modifyProject()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ProjectUpdateRequest projectUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProjectUpdateRequest>(){}) : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter projectUpdateRequest is {}", projectUpdateRequest);

        api.modifyProject(projectId, projectUpdateRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void modifyProjectUser(RoutingContext routingContext) {
        logger.info("modifyProjectUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        String userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ProjectUserUpdateRequest projectUserUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProjectUserUpdateRequest>(){}) : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter userId is {}", userId);
        logger.debug("Parameter projectUserUpdateRequest is {}", projectUserUpdateRequest);

        api.modifyProjectUser(projectId, userId, projectUserUpdateRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void retrieveProject(RoutingContext routingContext) {
        logger.info("retrieveProject()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);

        api.retrieveProject(projectId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void retrieveProjectApiKey(RoutingContext routingContext) {
        logger.info("retrieveProjectApiKey()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        String keyId = requestParameters.pathParameter("key_id") != null ? requestParameters.pathParameter("key_id").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter keyId is {}", keyId);

        api.retrieveProjectApiKey(projectId, keyId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void retrieveProjectServiceAccount(RoutingContext routingContext) {
        logger.info("retrieveProjectServiceAccount()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        String serviceAccountId = requestParameters.pathParameter("service_account_id") != null ? requestParameters.pathParameter("service_account_id").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter serviceAccountId is {}", serviceAccountId);

        api.retrieveProjectServiceAccount(projectId, serviceAccountId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void retrieveProjectUser(RoutingContext routingContext) {
        logger.info("retrieveProjectUser()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        String userId = requestParameters.pathParameter("user_id") != null ? requestParameters.pathParameter("user_id").getString() : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter userId is {}", userId);

        api.retrieveProjectUser(projectId, userId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void updateProjectRateLimits(RoutingContext routingContext) {
        logger.info("updateProjectRateLimits()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String projectId = requestParameters.pathParameter("project_id") != null ? requestParameters.pathParameter("project_id").getString() : null;
        String rateLimitId = requestParameters.pathParameter("rate_limit_id") != null ? requestParameters.pathParameter("rate_limit_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ProjectRateLimitUpdateRequest>(){}) : null;

        logger.debug("Parameter projectId is {}", projectId);
        logger.debug("Parameter rateLimitId is {}", rateLimitId);
        logger.debug("Parameter projectRateLimitUpdateRequest is {}", projectRateLimitUpdateRequest);

        api.updateProjectRateLimits(projectId, rateLimitId, projectRateLimitUpdateRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
