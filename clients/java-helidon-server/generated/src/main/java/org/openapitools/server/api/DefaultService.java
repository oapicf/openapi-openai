package org.openapitools.server.api;

import org.openapitools.server.model.AdminApiKey;
import org.openapitools.server.model.AdminApiKeysCreateRequest;
import org.openapitools.server.model.AdminApiKeysDelete200Response;
import org.openapitools.server.model.ApiKeyList;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Default'",
                             version = "7.24.0")
public interface DefaultService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/", this::adminApiKeysCreate);
        rules.delete("/{key_id}", this::adminApiKeysDelete);
        rules.get("/{key_id}", this::adminApiKeysGet);
        rules.get("/", this::adminApiKeysList);
    }


    /**
     * POST /organization/admin_api_keys : Create an organization admin API key.
     *
     * @param request the server request
     * @param response the server response
     */
    void adminApiKeysCreate(ServerRequest request, ServerResponse response);
    /**
     * DELETE /organization/admin_api_keys/{key_id} : Delete an organization admin API key.
     *
     * @param request the server request
     * @param response the server response
     */
    void adminApiKeysDelete(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/admin_api_keys/{key_id} : Retrieve a single organization API key.
     *
     * @param request the server request
     * @param response the server response
     */
    void adminApiKeysGet(ServerRequest request, ServerResponse response);
    /**
     * GET /organization/admin_api_keys : List organization API keys.
     *
     * @param request the server request
     * @param response the server response
     */
    void adminApiKeysList(ServerRequest request, ServerResponse response);
}
