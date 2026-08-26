package org.openapitools.server.api;

import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;
import org.openapitools.server.model.User;
import org.openapitools.server.model.UserDeleteResponse;
import org.openapitools.server.model.UserListResponse;
import org.openapitools.server.model.UserRoleUpdateRequest;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Users'",
                             version = "7.24.0")
public interface UsersService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.delete("/{user_id}", this::deleteUser);
        rules.get("/", this::listUsers);
        rules.post("/{user_id}", this::modifyUser);
        rules.get("/{user_id}", this::retrieveUser);
    }


    /**
     * DELETE /organization/users/{user_id} : Deletes a user from the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteUser(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/users : Lists all of the users in the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void listUsers(ServerRequest request, ServerResponse response);
    /**
     * POST /organization/users/{user_id} : Modifies a user&#39;s role in the organization..
     *
     * @param request the server request
     * @param response the server response
     */
    void modifyUser(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/users/{user_id} : Retrieves a user by their identifier..
     *
     * @param request the server request
     * @param response the server response
     */
    void retrieveUser(ServerRequest request, ServerResponse response);
}
