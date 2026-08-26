package org.openapitools.server.api;

import java.util.HexFormat;
import org.openapitools.server.model.Invite;
import org.openapitools.server.model.InviteDeleteResponse;
import org.openapitools.server.model.InviteListResponse;
import org.openapitools.server.model.InviteRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Invites'",
                             version = "7.24.0")
public interface InvitesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.delete("/{invite_id}", this::deleteInvite);
        rules.post("/", this::inviteUser);
        rules.get("/", this::listInvites);
        rules.get("/{invite_id}", this::retrieveInvite);
    }


    /**
     * DELETE /organization/invites/{invite_id} : Delete an invite. If the invite has already been accepted, it cannot be deleted..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteInvite(ServerRequest request, ServerResponse response);
    /**
     * POST /organization/invites : Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void inviteUser(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/invites : Returns a list of invites in the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void listInvites(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/invites/{invite_id} : Retrieves an invite..
     *
     * @param request the server request
     * @param response the server response
     */
    void retrieveInvite(ServerRequest request, ServerResponse response);
}
