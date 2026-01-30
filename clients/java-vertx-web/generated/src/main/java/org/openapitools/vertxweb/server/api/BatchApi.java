package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Batch;
import org.openapitools.vertxweb.server.model.CreateBatchRequest;
import org.openapitools.vertxweb.server.model.ListBatchesResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface BatchApi  {
    Future<ApiResponse<Batch>> cancelBatch(String batchId);
    Future<ApiResponse<Batch>> createBatch(CreateBatchRequest createBatchRequest);
    Future<ApiResponse<ListBatchesResponse>> listBatches(String after, Integer limit);
    Future<ApiResponse<Batch>> retrieveBatch(String batchId);
}
