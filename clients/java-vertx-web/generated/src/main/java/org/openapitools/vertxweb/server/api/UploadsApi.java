package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CompleteUploadRequest;
import org.openapitools.vertxweb.server.model.CreateUploadRequest;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.Upload;
import org.openapitools.vertxweb.server.model.UploadPart;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface UploadsApi  {
    Future<ApiResponse<UploadPart>> addUploadPart(String uploadId, FileUpload data);
    Future<ApiResponse<Upload>> cancelUpload(String uploadId);
    Future<ApiResponse<Upload>> completeUpload(String uploadId, CompleteUploadRequest completeUploadRequest);
    Future<ApiResponse<Upload>> createUpload(CreateUploadRequest createUploadRequest);
}
