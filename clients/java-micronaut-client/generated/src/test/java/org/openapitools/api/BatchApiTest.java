package org.openapitools.api;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;
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
 * API tests for BatchApi
 */
@MicronautTest
public class BatchApiTest {

    @Inject
    BatchApi api;

    
    /**
     * Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
     */
    @Test
    @Disabled("Not Implemented")
    public void cancelBatchTest() {
        // given
        String batchId = "example";

        // when
        Batch body = api.cancelBatch(batchId).block();

        // then
        // TODO implement the cancelBatchTest()
    }

    
    /**
     * Creates and executes a batch from an uploaded file of requests
     */
    @Test
    @Disabled("Not Implemented")
    public void createBatchTest() {
        // given
        CreateBatchRequest createBatchRequest = new CreateBatchRequest("example", "example", "example");

        // when
        Batch body = api.createBatch(createBatchRequest).block();

        // then
        // TODO implement the createBatchTest()
    }

    
    /**
     * List your organization&#39;s batches.
     */
    @Test
    @Disabled("Not Implemented")
    public void listBatchesTest() {
        // given
        String after = "example";
        Integer limit = 20;

        // when
        ListBatchesResponse body = api.listBatches(after, limit).block();

        // then
        // TODO implement the listBatchesTest()
    }

    
    /**
     * Retrieves a batch.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveBatchTest() {
        // given
        String batchId = "example";

        // when
        Batch body = api.retrieveBatch(batchId).block();

        // then
        // TODO implement the retrieveBatchTest()
    }

    
}
