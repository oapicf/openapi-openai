package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CreateFineTuningJobRequest;
import org.openapitools.server.api.model.FineTuningJob;
import org.openapitools.server.api.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.server.api.model.ListFineTuningJobEventsResponse;
import org.openapitools.server.api.model.ListPaginatedFineTuningJobsResponse;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface FineTuningApi  {
    //cancelFineTuningJob
    void cancelFineTuningJob(String fineTuningJobId, Handler<AsyncResult<FineTuningJob>> handler);

    //createFineTuningJob
    void createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest, Handler<AsyncResult<FineTuningJob>> handler);

    //listFineTuningEvents
    void listFineTuningEvents(String fineTuningJobId, String after, Integer limit, Handler<AsyncResult<ListFineTuningJobEventsResponse>> handler);

    //listFineTuningJobCheckpoints
    void listFineTuningJobCheckpoints(String fineTuningJobId, String after, Integer limit, Handler<AsyncResult<ListFineTuningJobCheckpointsResponse>> handler);

    //listPaginatedFineTuningJobs
    void listPaginatedFineTuningJobs(String after, Integer limit, Handler<AsyncResult<ListPaginatedFineTuningJobsResponse>> handler);

    //retrieveFineTuningJob
    void retrieveFineTuningJob(String fineTuningJobId, Handler<AsyncResult<FineTuningJob>> handler);

}
