package org.openapitools.server.api;

import org.openapitools.server.model.CreateCompletionRequest;
import org.openapitools.server.model.CreateCompletionResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Completions'",
                             version = "7.24.0")
public interface CompletionsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/", this::createCompletion);
    }


    /**
     * POST /completions : Creates a completion for the provided prompt and parameters..
     *
     * @param request the server request
     * @param response the server response
     */
    void createCompletion(ServerRequest request, ServerResponse response);
}
