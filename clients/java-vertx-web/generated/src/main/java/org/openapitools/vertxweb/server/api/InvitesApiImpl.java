package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Invite;
import org.openapitools.vertxweb.server.model.InviteDeleteResponse;
import org.openapitools.vertxweb.server.model.InviteListResponse;
import org.openapitools.vertxweb.server.model.InviteRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class InvitesApiImpl implements InvitesApi {
    public Future<ApiResponse<InviteDeleteResponse>> deleteInvite(String inviteId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Invite>> inviteUser(InviteRequest inviteRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<InviteListResponse>> listInvites(Integer limit, String after) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Invite>> retrieveInvite(String inviteId) {
        return Future.failedFuture(new HttpException(501));
    }

}
