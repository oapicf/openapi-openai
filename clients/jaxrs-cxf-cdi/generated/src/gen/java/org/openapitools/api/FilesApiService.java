package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.DeleteFileResponse;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T10:45:22.438122430Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface FilesApiService {
      public Response createFile(Attachment _fileDetail, String purpose, SecurityContext securityContext);
      public Response deleteFile(String fileId, SecurityContext securityContext);
      public Response downloadFile(String fileId, SecurityContext securityContext);
      public Response listFiles(String purpose, SecurityContext securityContext);
      public Response retrieveFile(String fileId, SecurityContext securityContext);
}
