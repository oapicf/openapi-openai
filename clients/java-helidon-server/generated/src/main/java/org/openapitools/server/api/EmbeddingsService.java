package org.openapitools.server.api;

import org.openapitools.server.model.CreateEmbeddingRequest;
import org.openapitools.server.model.CreateEmbeddingResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Embeddings'",
                             version = "7.24.0")
public interface EmbeddingsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/", this::createEmbedding);
    }


    /**
     * POST /embeddings : Creates an embedding vector representing the input text..
     *
     * @param request the server request
     * @param response the server response
     */
    void createEmbedding(ServerRequest request, ServerResponse response);
}
