package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.CompleteUploadRequest;
import org.openapitools.model.CreateUploadRequest;
import java.io.File;
import org.openapitools.model.Upload;
import org.openapitools.model.UploadPart;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class UploadsApiService {
    public abstract Response addUploadPart(String uploadId
 ,InputStream dataInputStream, FileInfo dataDetail
 ) throws NotFoundException;
    public abstract Response cancelUpload(String uploadId
 ) throws NotFoundException;
    public abstract Response completeUpload(String uploadId
 ,CompleteUploadRequest completeUploadRequest
 ) throws NotFoundException;
    public abstract Response createUpload(CreateUploadRequest createUploadRequest
 ) throws NotFoundException;
}
