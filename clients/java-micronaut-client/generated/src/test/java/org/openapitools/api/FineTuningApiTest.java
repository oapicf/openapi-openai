package org.openapitools.api;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for FineTuningApi
 */
@MicronautTest
public class FineTuningApiTest {

    @Inject
    FineTuningApi api;

    
    /**
     * Immediately cancel a fine-tune job. 
     */
    @Test
    @Disabled("Not Implemented")
    public void cancelFineTuningJobTest() {
        // given
        String fineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";

        // when
        FineTuningJob body = api.cancelFineTuningJob(fineTuningJobId).block();

        // then
        // TODO implement the cancelFineTuningJobTest()
    }

    
    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     */
    @Test
    @Disabled("Not Implemented")
    public void createFineTuningJobTest() {
        // given
        CreateFineTuningJobRequest createFineTuningJobRequest = new CreateFineTuningJobRequest(null, "file-abc123");

        // when
        FineTuningJob body = api.createFineTuningJob(createFineTuningJobRequest).block();

        // then
        // TODO implement the createFineTuningJobTest()
    }

    
    /**
     * Get status updates for a fine-tuning job. 
     */
    @Test
    @Disabled("Not Implemented")
    public void listFineTuningEventsTest() {
        // given
        String fineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";
        String after = "example";
        Integer limit = 20;

        // when
        ListFineTuningJobEventsResponse body = api.listFineTuningEvents(fineTuningJobId, after, limit).block();

        // then
        // TODO implement the listFineTuningEventsTest()
    }

    
    /**
     * List checkpoints for a fine-tuning job. 
     */
    @Test
    @Disabled("Not Implemented")
    public void listFineTuningJobCheckpointsTest() {
        // given
        String fineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";
        String after = "example";
        Integer limit = 10;

        // when
        ListFineTuningJobCheckpointsResponse body = api.listFineTuningJobCheckpoints(fineTuningJobId, after, limit).block();

        // then
        // TODO implement the listFineTuningJobCheckpointsTest()
    }

    
    /**
     * List your organization&#39;s fine-tuning jobs 
     */
    @Test
    @Disabled("Not Implemented")
    public void listPaginatedFineTuningJobsTest() {
        // given
        String after = "example";
        Integer limit = 20;

        // when
        ListPaginatedFineTuningJobsResponse body = api.listPaginatedFineTuningJobs(after, limit).block();

        // then
        // TODO implement the listPaginatedFineTuningJobsTest()
    }

    
    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveFineTuningJobTest() {
        // given
        String fineTuningJobId = "ft-AF1WoRqd3aJAHsqc9NY7iL8F";

        // when
        FineTuningJob body = api.retrieveFineTuningJob(fineTuningJobId).block();

        // then
        // TODO implement the retrieveFineTuningJobTest()
    }

    
}
