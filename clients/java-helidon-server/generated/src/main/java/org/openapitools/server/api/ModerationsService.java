package org.openapitools.server.api;

import org.openapitools.server.model.CreateModerationRequest;
import org.openapitools.server.model.CreateModerationResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Moderations'",
                             version = "7.24.0")
public interface ModerationsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/", this::createModeration);
    }


    /**
     * POST /moderations : Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). .
     *
     * @param request the server request
     * @param response the server response
     */
    void createModeration(ServerRequest request, ServerResponse response);
}
