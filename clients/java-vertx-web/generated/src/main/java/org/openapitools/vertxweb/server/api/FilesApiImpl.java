package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.DeleteFileResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.ListFilesResponse;
import org.openapitools.vertxweb.server.model.OpenAIFile;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class FilesApiImpl implements FilesApi {
    public Future<ApiResponse<OpenAIFile>> createFile(FileUpload _file) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteFileResponse>> deleteFile(String fileId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> downloadFile(String fileId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListFilesResponse>> listFiles(String purpose) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<OpenAIFile>> retrieveFile(String fileId) {
        return Future.failedFuture(new HttpException(501));
    }

}
