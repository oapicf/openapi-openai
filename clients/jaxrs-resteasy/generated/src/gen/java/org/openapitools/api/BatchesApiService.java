package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface BatchesApiService {
      Response cancelBatch(String batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response createBatch(CreateBatchRequest createBatchRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response listBatches(String after,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response retrieveBatch(String batchId,SecurityContext securityContext)
      throws NotFoundException;


}
