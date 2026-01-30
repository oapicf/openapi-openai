package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import org.openapitools.model.CompleteUploadRequest;
import org.openapitools.model.CreateUploadRequest;
import java.io.File;
import org.openapitools.model.Upload;
import org.openapitools.model.UploadPart;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface UploadsApiService {
      Response addUploadPart(MultipartFormDataInput input,String uploadId,SecurityContext securityContext)
      throws NotFoundException;
      Response cancelUpload(String uploadId,SecurityContext securityContext)
      throws NotFoundException;
      Response completeUpload(String uploadId,CompleteUploadRequest completeUploadRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createUpload(CreateUploadRequest createUploadRequest,SecurityContext securityContext)
      throws NotFoundException;


}
