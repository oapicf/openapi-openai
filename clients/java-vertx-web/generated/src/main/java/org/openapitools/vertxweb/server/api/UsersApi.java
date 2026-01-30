package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.User;
import org.openapitools.vertxweb.server.model.UserDeleteResponse;
import org.openapitools.vertxweb.server.model.UserListResponse;
import org.openapitools.vertxweb.server.model.UserRoleUpdateRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface UsersApi  {
    Future<ApiResponse<UserDeleteResponse>> deleteUser(String userId);
    Future<ApiResponse<UserListResponse>> listUsers(Integer limit, String after);
    Future<ApiResponse<User>> modifyUser(String userId, UserRoleUpdateRequest userRoleUpdateRequest);
    Future<ApiResponse<User>> retrieveUser(String userId);
}
