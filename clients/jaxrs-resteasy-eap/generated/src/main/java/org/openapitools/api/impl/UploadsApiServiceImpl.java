package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import org.openapitools.model.CompleteUploadRequest;
import org.openapitools.model.CreateUploadRequest;
import java.io.File;
import org.openapitools.model.Upload;
import org.openapitools.model.UploadPart;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UploadsApiServiceImpl implements UploadsApi {
      public Response addUploadPart(MultipartFormDataInput input,String uploadId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response cancelUpload(String uploadId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response completeUpload(String uploadId,CompleteUploadRequest completeUploadRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createUpload(CreateUploadRequest createUploadRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
