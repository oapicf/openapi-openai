package org.openapitools.server.api;

import org.openapitools.server.model.Batch;
import org.openapitools.server.model.CreateBatchRequest;
import java.util.HexFormat;
import org.openapitools.server.model.ListBatchesResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Batch'",
                             version = "7.24.0")
public interface BatchService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/{batch_id}/cancel", this::cancelBatch);
        rules.post("/", this::createBatch);
        rules.get("/", this::listBatches);
        rules.get("/{batch_id}", this::retrieveBatch);
    }


    /**
     * POST /batches/{batch_id}/cancel : Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file..
     *
     * @param request the server request
     * @param response the server response
     */
    void cancelBatch(ServerRequest request, ServerResponse response);
    /**
     * POST /batches : Creates and executes a batch from an uploaded file of requests.
     *
     * @param request the server request
     * @param response the server response
     */
    void createBatch(ServerRequest request, ServerResponse response);
    /**
     * GET /batches : List your organization&#39;s batches..
     *
     * @param request the server request
     * @param response the server response
     */
    void listBatches(ServerRequest request, ServerResponse response);
    /**
     * GET /batches/{batch_id} : Retrieves a batch..
     *
     * @param request the server request
     * @param response the server response
     */
    void retrieveBatch(ServerRequest request, ServerResponse response);
}
