package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.server.api.model.ListFilesResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OpenAIFile;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface FilesApi  {
    //createFile
    void createFile(File _file, String purpose, Handler<AsyncResult<OpenAIFile>> handler);

    //deleteFile
    void deleteFile(String fileId, Handler<AsyncResult<DeleteFileResponse>> handler);

    //downloadFile
    void downloadFile(String fileId, Handler<AsyncResult<String>> handler);

    //listFiles
    void listFiles(String purpose, Handler<AsyncResult<ListFilesResponse>> handler);

    //retrieveFile
    void retrieveFile(String fileId, Handler<AsyncResult<OpenAIFile>> handler);

}
