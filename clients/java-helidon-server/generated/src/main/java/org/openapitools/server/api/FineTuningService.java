package org.openapitools.server.api;

import org.openapitools.server.model.CreateFineTuningJobRequest;
import org.openapitools.server.model.FineTuningJob;
import java.util.HexFormat;
import org.openapitools.server.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.server.model.ListFineTuningJobEventsResponse;
import org.openapitools.server.model.ListPaginatedFineTuningJobsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'FineTuning'",
                             version = "7.24.0")
public interface FineTuningService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/{fine_tuning_job_id}/cancel", this::cancelFineTuningJob);
        rules.post("/", this::createFineTuningJob);
        rules.get("/{fine_tuning_job_id}/events", this::listFineTuningEvents);
        rules.get("/{fine_tuning_job_id}/checkpoints", this::listFineTuningJobCheckpoints);
        rules.get("/", this::listPaginatedFineTuningJobs);
        rules.get("/{fine_tuning_job_id}", this::retrieveFineTuningJob);
    }


    /**
     * POST /fine_tuning/jobs/{fine_tuning_job_id}/cancel : Immediately cancel a fine-tune job. .
     *
     * @param request the server request
     * @param response the server response
     */
    void cancelFineTuningJob(ServerRequest request, ServerResponse response);
    /**
     * POST /fine_tuning/jobs : Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) .
     *
     * @param request the server request
     * @param response the server response
     */
    void createFineTuningJob(ServerRequest request, ServerResponse response);
    /**
     * GET /fine_tuning/jobs/{fine_tuning_job_id}/events : Get status updates for a fine-tuning job. .
     *
     * @param request the server request
     * @param response the server response
     */
    void listFineTuningEvents(ServerRequest request, ServerResponse response);
    /**
     * GET /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints : List checkpoints for a fine-tuning job. .
     *
     * @param request the server request
     * @param response the server response
     */
    void listFineTuningJobCheckpoints(ServerRequest request, ServerResponse response);
    /**
     * GET /fine_tuning/jobs : List your organization&#39;s fine-tuning jobs .
     *
     * @param request the server request
     * @param response the server response
     */
    void listPaginatedFineTuningJobs(ServerRequest request, ServerResponse response);
    /**
     * GET /fine_tuning/jobs/{fine_tuning_job_id} : Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) .
     *
     * @param request the server request
     * @param response the server response
     */
    void retrieveFineTuningJob(ServerRequest request, ServerResponse response);
}
