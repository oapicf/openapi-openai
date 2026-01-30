package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreateVectorStoreFileBatchRequest;
import org.openapitools.vertxweb.server.model.CreateVectorStoreFileRequest;
import org.openapitools.vertxweb.server.model.CreateVectorStoreRequest;
import org.openapitools.vertxweb.server.model.DeleteVectorStoreFileResponse;
import org.openapitools.vertxweb.server.model.DeleteVectorStoreResponse;
import org.openapitools.vertxweb.server.model.ListVectorStoreFilesResponse;
import org.openapitools.vertxweb.server.model.ListVectorStoresResponse;
import org.openapitools.vertxweb.server.model.UpdateVectorStoreRequest;
import org.openapitools.vertxweb.server.model.VectorStoreFileBatchObject;
import org.openapitools.vertxweb.server.model.VectorStoreFileObject;
import org.openapitools.vertxweb.server.model.VectorStoreObject;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface VectorStoresApi  {
    Future<ApiResponse<VectorStoreFileBatchObject>> cancelVectorStoreFileBatch(String vectorStoreId, String batchId);
    Future<ApiResponse<VectorStoreObject>> createVectorStore(CreateVectorStoreRequest createVectorStoreRequest);
    Future<ApiResponse<VectorStoreFileObject>> createVectorStoreFile(String vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest);
    Future<ApiResponse<VectorStoreFileBatchObject>> createVectorStoreFileBatch(String vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest);
    Future<ApiResponse<DeleteVectorStoreResponse>> deleteVectorStore(String vectorStoreId);
    Future<ApiResponse<DeleteVectorStoreFileResponse>> deleteVectorStoreFile(String vectorStoreId, String fileId);
    Future<ApiResponse<VectorStoreObject>> getVectorStore(String vectorStoreId);
    Future<ApiResponse<VectorStoreFileObject>> getVectorStoreFile(String vectorStoreId, String fileId);
    Future<ApiResponse<VectorStoreFileBatchObject>> getVectorStoreFileBatch(String vectorStoreId, String batchId);
    Future<ApiResponse<ListVectorStoreFilesResponse>> listFilesInVectorStoreBatch(String vectorStoreId, String batchId, Integer limit, String order, String after, String before, String filter);
    Future<ApiResponse<ListVectorStoreFilesResponse>> listVectorStoreFiles(String vectorStoreId, Integer limit, String order, String after, String before, String filter);
    Future<ApiResponse<ListVectorStoresResponse>> listVectorStores(Integer limit, String order, String after, String before);
    Future<ApiResponse<VectorStoreObject>> modifyVectorStore(String vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest);
}
