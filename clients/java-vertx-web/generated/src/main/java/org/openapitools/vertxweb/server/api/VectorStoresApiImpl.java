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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class VectorStoresApiImpl implements VectorStoresApi {
    public Future<ApiResponse<VectorStoreFileBatchObject>> cancelVectorStoreFileBatch(String vectorStoreId, String batchId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<VectorStoreObject>> createVectorStore(CreateVectorStoreRequest createVectorStoreRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<VectorStoreFileObject>> createVectorStoreFile(String vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<VectorStoreFileBatchObject>> createVectorStoreFileBatch(String vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteVectorStoreResponse>> deleteVectorStore(String vectorStoreId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteVectorStoreFileResponse>> deleteVectorStoreFile(String vectorStoreId, String fileId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<VectorStoreObject>> getVectorStore(String vectorStoreId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<VectorStoreFileObject>> getVectorStoreFile(String vectorStoreId, String fileId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<VectorStoreFileBatchObject>> getVectorStoreFileBatch(String vectorStoreId, String batchId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListVectorStoreFilesResponse>> listFilesInVectorStoreBatch(String vectorStoreId, String batchId, Integer limit, String order, String after, String before, String filter) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListVectorStoreFilesResponse>> listVectorStoreFiles(String vectorStoreId, Integer limit, String order, String after, String before, String filter) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListVectorStoresResponse>> listVectorStores(Integer limit, String order, String after, String before) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<VectorStoreObject>> modifyVectorStore(String vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
