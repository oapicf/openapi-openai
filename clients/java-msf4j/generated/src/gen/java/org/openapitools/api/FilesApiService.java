package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-03T11:07:10.127704480Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public abstract class FilesApiService {
    public abstract Response createFile(InputStream _fileInputStream, FileInfo _fileDetail
 ,String purpose
 ) throws NotFoundException;
    public abstract Response deleteFile(String fileId
 ) throws NotFoundException;
    public abstract Response downloadFile(String fileId
 ) throws NotFoundException;
    public abstract Response listFiles(String purpose
 ) throws NotFoundException;
    public abstract Response retrieveFile(String fileId
 ) throws NotFoundException;
}
