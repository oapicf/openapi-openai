package org.openapitools.api.interfaces;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface BatchesService {

    /**
     * Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
     * 
     *
     * @param batchId The ID of the batch to cancel. (required)
     * @return Batch
     */
    Batch cancelBatch(
        String batchId
    );

    /**
     * Creates and executes a batch from an uploaded file of requests
     * 
     *
     * @param createBatchRequest  (required)
     * @return Batch
     */
    Batch createBatch(
        CreateBatchRequest createBatchRequest
    );

    /**
     * List your organization&#39;s batches.
     * 
     *
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @return ListBatchesResponse
     */
    ListBatchesResponse listBatches(
        String after,
        Integer limit
    );

    /**
     * Retrieves a batch.
     * 
     *
     * @param batchId The ID of the batch to retrieve. (required)
     * @return Batch
     */
    Batch retrieveBatch(
        String batchId
    );
}
