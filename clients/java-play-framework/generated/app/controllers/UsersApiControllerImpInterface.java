package controllers;

import apimodels.User;
import apimodels.UserDeleteResponse;
import apimodels.UserListResponse;
import apimodels.UserRoleUpdateRequest;

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
public abstract class UsersApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result deleteUserHttp(Http.Request request, String userId) throws Exception {
        UserDeleteResponse obj = deleteUser(request, userId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserDeleteResponse deleteUser(Http.Request request, String userId) throws Exception;

    public Result listUsersHttp(Http.Request request, Integer limit, String after) throws Exception {
        UserListResponse obj = listUsers(request, limit, after);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract UserListResponse listUsers(Http.Request request, Integer limit, String after) throws Exception;

    public Result modifyUserHttp(Http.Request request, String userId, UserRoleUpdateRequest userRoleUpdateRequest) throws Exception {
        User obj = modifyUser(request, userId, userRoleUpdateRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract User modifyUser(Http.Request request, String userId, UserRoleUpdateRequest userRoleUpdateRequest) throws Exception;

    public Result retrieveUserHttp(Http.Request request, String userId) throws Exception {
        User obj = retrieveUser(request, userId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract User retrieveUser(Http.Request request, String userId) throws Exception;

}
