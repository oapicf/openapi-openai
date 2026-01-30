package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Invite;
import org.openapitools.vertxweb.server.model.InviteDeleteResponse;
import org.openapitools.vertxweb.server.model.InviteListResponse;
import org.openapitools.vertxweb.server.model.InviteRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface InvitesApi  {
    Future<ApiResponse<InviteDeleteResponse>> deleteInvite(String inviteId);
    Future<ApiResponse<Invite>> inviteUser(InviteRequest inviteRequest);
    Future<ApiResponse<InviteListResponse>> listInvites(Integer limit, String after);
    Future<ApiResponse<Invite>> retrieveInvite(String inviteId);
}
