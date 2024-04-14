package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateFineTuningJobRequest;
import org.openapitools.vertxweb.server.model.FineTuningJob;
import org.openapitools.vertxweb.server.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.vertxweb.server.model.ListFineTuningJobEventsResponse;
import org.openapitools.vertxweb.server.model.ListPaginatedFineTuningJobsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class FineTuningApiImpl implements FineTuningApi {
    public Future<ApiResponse<FineTuningJob>> cancelFineTuningJob(String fineTuningJobId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FineTuningJob>> createFineTuningJob(CreateFineTuningJobRequest createFineTuningJobRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListFineTuningJobEventsResponse>> listFineTuningEvents(String fineTuningJobId, String after, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListFineTuningJobCheckpointsResponse>> listFineTuningJobCheckpoints(String fineTuningJobId, String after, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListPaginatedFineTuningJobsResponse>> listPaginatedFineTuningJobs(String after, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<FineTuningJob>> retrieveFineTuningJob(String fineTuningJobId) {
        return Future.failedFuture(new HttpException(501));
    }

}
