package controllers;

import apimodels.User;
import apimodels.UserDeleteResponse;
import apimodels.UserListResponse;
import apimodels.UserRoleUpdateRequest;

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
public class UsersApiController extends Controller {
    private final UsersApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private UsersApiController(Config configuration, UsersApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result deleteUser(Http.Request request, String userId) throws Exception {
        return imp.deleteUserHttp(request, userId);
    }

    @ApiAction
    public Result listUsers(Http.Request request) throws Exception {
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
        return imp.listUsersHttp(request, limit, after);
    }

    @ApiAction
    public Result modifyUser(Http.Request request, String userId) throws Exception {
        JsonNode nodeuserRoleUpdateRequest = request.body().asJson();
        UserRoleUpdateRequest userRoleUpdateRequest;
        if (nodeuserRoleUpdateRequest != null) {
            userRoleUpdateRequest = mapper.readValue(nodeuserRoleUpdateRequest.toString(), UserRoleUpdateRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(userRoleUpdateRequest);
            }
        } else {
            throw new IllegalArgumentException("'UserRoleUpdateRequest' parameter is required");
        }
        return imp.modifyUserHttp(request, userId, userRoleUpdateRequest);
    }

    @ApiAction
    public Result retrieveUser(Http.Request request, String userId) throws Exception {
        return imp.retrieveUserHttp(request, userId);
    }

}
