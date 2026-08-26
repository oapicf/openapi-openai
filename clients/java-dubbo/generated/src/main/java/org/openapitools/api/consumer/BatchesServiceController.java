package org.openapitools.api.consumer;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.BatchesService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/batches")
public class BatchesServiceController {

    @DubboReference
    private BatchesService batchesService;

    @RequestMapping(method = RequestMethod.POST, value = "/{batch_id}/cancel")
    public Batch cancelBatch(
        @RequestParam(name = "batchId") String batchId
    ) {
        return batchesService.cancelBatch(batchId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public Batch createBatch(
        @RequestParam(name = "createBatchRequest") CreateBatchRequest createBatchRequest
    ) {
        return batchesService.createBatch(createBatchRequest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ListBatchesResponse listBatches(
        @RequestParam(name = "after") String after,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit
    ) {
        return batchesService.listBatches(after, limit);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{batch_id}")
    public Batch retrieveBatch(
        @RequestParam(name = "batchId") String batchId
    ) {
        return batchesService.retrieveBatch(batchId);
    }
}
