package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Batch;
import org.openapitools.vertxweb.server.model.CreateBatchRequest;
import org.openapitools.vertxweb.server.model.ListBatchesResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class BatchApiImpl implements BatchApi {
    public Future<ApiResponse<Batch>> cancelBatch(String batchId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Batch>> createBatch(CreateBatchRequest createBatchRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListBatchesResponse>> listBatches(String after, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Batch>> retrieveBatch(String batchId) {
        return Future.failedFuture(new HttpException(501));
    }

}
