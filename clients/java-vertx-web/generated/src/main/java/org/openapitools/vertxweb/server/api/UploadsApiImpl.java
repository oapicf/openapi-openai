package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CompleteUploadRequest;
import org.openapitools.vertxweb.server.model.CreateUploadRequest;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.Upload;
import org.openapitools.vertxweb.server.model.UploadPart;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class UploadsApiImpl implements UploadsApi {
    public Future<ApiResponse<UploadPart>> addUploadPart(String uploadId, FileUpload data) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Upload>> cancelUpload(String uploadId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Upload>> completeUpload(String uploadId, CompleteUploadRequest completeUploadRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Upload>> createUpload(CreateUploadRequest createUploadRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
