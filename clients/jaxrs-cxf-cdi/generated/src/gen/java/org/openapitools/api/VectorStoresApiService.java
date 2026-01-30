package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.CreateVectorStoreFileBatchRequest;
import org.openapitools.model.CreateVectorStoreFileRequest;
import org.openapitools.model.CreateVectorStoreRequest;
import org.openapitools.model.DeleteVectorStoreFileResponse;
import org.openapitools.model.DeleteVectorStoreResponse;
import org.openapitools.model.ListVectorStoreFilesResponse;
import org.openapitools.model.ListVectorStoresResponse;
import org.openapitools.model.UpdateVectorStoreRequest;
import org.openapitools.model.VectorStoreFileBatchObject;
import org.openapitools.model.VectorStoreFileObject;
import org.openapitools.model.VectorStoreObject;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface VectorStoresApiService {
      public Response cancelVectorStoreFileBatch(String vectorStoreId, String batchId, SecurityContext securityContext);
      public Response createVectorStore(CreateVectorStoreRequest createVectorStoreRequest, SecurityContext securityContext);
      public Response createVectorStoreFile(String vectorStoreId, CreateVectorStoreFileRequest createVectorStoreFileRequest, SecurityContext securityContext);
      public Response createVectorStoreFileBatch(String vectorStoreId, CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest, SecurityContext securityContext);
      public Response deleteVectorStore(String vectorStoreId, SecurityContext securityContext);
      public Response deleteVectorStoreFile(String vectorStoreId, String fileId, SecurityContext securityContext);
      public Response getVectorStore(String vectorStoreId, SecurityContext securityContext);
      public Response getVectorStoreFile(String vectorStoreId, String fileId, SecurityContext securityContext);
      public Response getVectorStoreFileBatch(String vectorStoreId, String batchId, SecurityContext securityContext);
      public Response listFilesInVectorStoreBatch(String vectorStoreId, String batchId, Integer limit, String order, String after, String before, String filter, SecurityContext securityContext);
      public Response listVectorStoreFiles(String vectorStoreId, Integer limit, String order, String after, String before, String filter, SecurityContext securityContext);
      public Response listVectorStores(Integer limit, String order, String after, String before, SecurityContext securityContext);
      public Response modifyVectorStore(String vectorStoreId, UpdateVectorStoreRequest updateVectorStoreRequest, SecurityContext securityContext);
}
