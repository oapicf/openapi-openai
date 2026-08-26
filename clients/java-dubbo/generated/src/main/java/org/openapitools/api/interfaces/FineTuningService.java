package org.openapitools.api.interfaces;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface FineTuningService {

    /**
     * Immediately cancel a fine-tune job. 
     * 
     *
     * @param fineTuningJobId The ID of the fine-tuning job to cancel.  (required)
     * @return FineTuningJob
     */
    FineTuningJob cancelFineTuningJob(
        String fineTuningJobId
    );

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * 
     *
     * @param createFineTuningJobRequest  (required)
     * @return FineTuningJob
     */
    FineTuningJob createFineTuningJob(
        CreateFineTuningJobRequest createFineTuningJobRequest
    );

    /**
     * Get status updates for a fine-tuning job. 
     * 
     *
     * @param fineTuningJobId The ID of the fine-tuning job to get events for.  (required)
     * @param after Identifier for the last event from the previous pagination request. (optional)
     * @param limit Number of events to retrieve. (optional, default to 20)
     * @return ListFineTuningJobEventsResponse
     */
    ListFineTuningJobEventsResponse listFineTuningEvents(
        String fineTuningJobId,
        String after,
        Integer limit
    );

    /**
     * List checkpoints for a fine-tuning job. 
     * 
     *
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.  (required)
     * @param after Identifier for the last checkpoint ID from the previous pagination request. (optional)
     * @param limit Number of checkpoints to retrieve. (optional, default to 10)
     * @return ListFineTuningJobCheckpointsResponse
     */
    ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(
        String fineTuningJobId,
        String after,
        Integer limit
    );

    /**
     * List your organization&#39;s fine-tuning jobs 
     * 
     *
     * @param after Identifier for the last job from the previous pagination request. (optional)
     * @param limit Number of fine-tuning jobs to retrieve. (optional, default to 20)
     * @return ListPaginatedFineTuningJobsResponse
     */
    ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(
        String after,
        Integer limit
    );

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * 
     *
     * @param fineTuningJobId The ID of the fine-tuning job.  (required)
     * @return FineTuningJob
     */
    FineTuningJob retrieveFineTuningJob(
        String fineTuningJobId
    );
}
