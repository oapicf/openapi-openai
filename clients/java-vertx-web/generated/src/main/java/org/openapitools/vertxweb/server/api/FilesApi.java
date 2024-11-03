package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.DeleteFileResponse;
import io.vertx.ext.web.FileUpload;
import org.openapitools.vertxweb.server.model.ListFilesResponse;
import org.openapitools.vertxweb.server.model.OpenAIFile;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface FilesApi  {
    Future<ApiResponse<OpenAIFile>> createFile(FileUpload _file);
    Future<ApiResponse<DeleteFileResponse>> deleteFile(String fileId);
    Future<ApiResponse<String>> downloadFile(String fileId);
    Future<ApiResponse<ListFilesResponse>> listFiles(String purpose);
    Future<ApiResponse<OpenAIFile>> retrieveFile(String fileId);
}
