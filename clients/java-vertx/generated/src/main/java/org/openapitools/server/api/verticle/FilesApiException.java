package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.server.api.model.ListFilesResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OpenAIFile;

public final class FilesApiException extends MainApiException {
    public FilesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final FilesApiException Files_createFile_200_Exception = new FilesApiException(200, "OK");
    public static final FilesApiException Files_deleteFile_200_Exception = new FilesApiException(200, "OK");
    public static final FilesApiException Files_downloadFile_200_Exception = new FilesApiException(200, "OK");
    public static final FilesApiException Files_listFiles_200_Exception = new FilesApiException(200, "OK");
    public static final FilesApiException Files_retrieveFile_200_Exception = new FilesApiException(200, "OK");
    

}