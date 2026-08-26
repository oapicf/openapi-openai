package org.openapitools.server.api;

import org.openapitools.server.model.DeleteModelResponse;
import java.util.HexFormat;
import org.openapitools.server.model.ListModelsResponse;
import org.openapitools.server.model.Model;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Models'",
                             version = "7.24.0")
public interface ModelsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.delete("/{model}", this::deleteModel);
        rules.get("/", this::listModels);
        rules.get("/{model}", this::retrieveModel);
    }


    /**
     * DELETE /models/{model} : Delete a fine-tuned model. You must have the Owner role in your organization to delete a model..
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteModel(ServerRequest request, ServerResponse response);
    /**
     * GET /models : Lists the currently available models, and provides basic information about each one such as the owner and availability..
     *
     * @param request the server request
     * @param response the server response
     */
    void listModels(ServerRequest request, ServerResponse response);
    /**
     * GET /models/{model} : Retrieves a model instance, providing basic information about the model such as the owner and permissioning..
     *
     * @param request the server request
     * @param response the server response
     */
    void retrieveModel(ServerRequest request, ServerResponse response);
}
