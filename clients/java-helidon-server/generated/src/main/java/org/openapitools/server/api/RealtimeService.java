package org.openapitools.server.api;

import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.RealtimeSessionCreateRequest;
import org.openapitools.server.model.RealtimeSessionCreateResponse;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Realtime'",
                             version = "7.24.0")
public interface RealtimeService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/", this::createRealtimeSession);
    }


    /**
     * POST /realtime/sessions : Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. .
     *
     * @param request the server request
     * @param response the server response
     */
    void createRealtimeSession(ServerRequest request, ServerResponse response);
}
