package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class BatchesApiService {
    public abstract Response cancelBatch(String batchId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createBatch(CreateBatchRequest createBatchRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listBatches(String after,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response retrieveBatch(String batchId,SecurityContext securityContext) throws NotFoundException;
}
