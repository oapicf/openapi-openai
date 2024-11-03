package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateFineTuningJobRequest;
import org.openapitools.vertxweb.server.model.FineTuningJob;
import org.openapitools.vertxweb.server.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.vertxweb.server.model.ListFineTuningJobEventsResponse;
import org.openapitools.vertxweb.server.model.ListPaginatedFineTuningJobsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface FineTuningApi  {
    Future<ApiResponse<FineTuningJob>> cancelFineTuningJob(String fineTuningJobId);
    Future<ApiResponse<FineTuningJob>> createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest);
    Future<ApiResponse<ListFineTuningJobEventsResponse>> listFineTuningEvents(String fineTuningJobId, String after, Integer limit);
    Future<ApiResponse<ListFineTuningJobCheckpointsResponse>> listFineTuningJobCheckpoints(String fineTuningJobId, String after, Integer limit);
    Future<ApiResponse<ListPaginatedFineTuningJobsResponse>> listPaginatedFineTuningJobs(String after, Integer limit);
    Future<ApiResponse<FineTuningJob>> retrieveFineTuningJob(String fineTuningJobId);
}
