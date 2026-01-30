package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.CompleteUploadRequest;
import org.openapitools.model.CreateUploadRequest;
import org.openapitools.model.Upload;
import org.openapitools.model.UploadPart;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface UploadsApiService {
      public Response addUploadPart(String uploadId, Attachment dataDetail, SecurityContext securityContext);
      public Response cancelUpload(String uploadId, SecurityContext securityContext);
      public Response completeUpload(String uploadId, CompleteUploadRequest completeUploadRequest, SecurityContext securityContext);
      public Response createUpload(CreateUploadRequest createUploadRequest, SecurityContext securityContext);
}
