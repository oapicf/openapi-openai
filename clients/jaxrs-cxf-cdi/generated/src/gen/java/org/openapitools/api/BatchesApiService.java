package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-11-03T06:33:55.768045576Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public interface BatchesApiService {
      public Response cancelBatch(String batchId, SecurityContext securityContext);
      public Response createBatch(CreateBatchRequest createBatchRequest, SecurityContext securityContext);
      public Response listBatches(String after, Integer limit, SecurityContext securityContext);
      public Response retrieveBatch(String batchId, SecurityContext securityContext);
}
