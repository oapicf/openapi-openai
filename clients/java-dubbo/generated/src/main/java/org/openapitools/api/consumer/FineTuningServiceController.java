package org.openapitools.api.consumer;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.FineTuningService;
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
@RequestMapping("/fine_tuning")
public class FineTuningServiceController {

    @DubboReference
    private FineTuningService fineTuningService;

    @RequestMapping(method = RequestMethod.POST, value = "/jobs/{fine_tuning_job_id}/cancel")
    public FineTuningJob cancelFineTuningJob(
        @RequestParam(name = "fineTuningJobId") String fineTuningJobId
    ) {
        return fineTuningService.cancelFineTuningJob(fineTuningJobId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/jobs")
    public FineTuningJob createFineTuningJob(
        @RequestParam(name = "createFineTuningJobRequest") CreateFineTuningJobRequest createFineTuningJobRequest
    ) {
        return fineTuningService.createFineTuningJob(createFineTuningJobRequest);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/jobs/{fine_tuning_job_id}/events")
    public ListFineTuningJobEventsResponse listFineTuningEvents(
        @RequestParam(name = "fineTuningJobId") String fineTuningJobId,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit
    ) {
        return fineTuningService.listFineTuningEvents(fineTuningJobId, after, limit);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/jobs/{fine_tuning_job_id}/checkpoints")
    public ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(
        @RequestParam(name = "fineTuningJobId") String fineTuningJobId,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "limit", defaultValue = "10") Integer limit
    ) {
        return fineTuningService.listFineTuningJobCheckpoints(fineTuningJobId, after, limit);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/jobs")
    public ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(
        @RequestParam(name = "after") String after,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit
    ) {
        return fineTuningService.listPaginatedFineTuningJobs(after, limit);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/jobs/{fine_tuning_job_id}")
    public FineTuningJob retrieveFineTuningJob(
        @RequestParam(name = "fineTuningJobId") String fineTuningJobId
    ) {
        return fineTuningService.retrieveFineTuningJob(fineTuningJobId);
    }
}
