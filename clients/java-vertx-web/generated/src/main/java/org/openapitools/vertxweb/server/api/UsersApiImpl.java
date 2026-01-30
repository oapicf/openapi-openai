package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.User;
import org.openapitools.vertxweb.server.model.UserDeleteResponse;
import org.openapitools.vertxweb.server.model.UserListResponse;
import org.openapitools.vertxweb.server.model.UserRoleUpdateRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class UsersApiImpl implements UsersApi {
    public Future<ApiResponse<UserDeleteResponse>> deleteUser(String userId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<UserListResponse>> listUsers(Integer limit, String after) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<User>> modifyUser(String userId, UserRoleUpdateRequest userRoleUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<User>> retrieveUser(String userId) {
        return Future.failedFuture(new HttpException(501));
    }

}
