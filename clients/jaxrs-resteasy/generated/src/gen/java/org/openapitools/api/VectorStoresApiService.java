package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



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
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface VectorStoresApiService {
      Response cancelVectorStoreFileBatch(String vectorStoreId,String batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response createVectorStore(CreateVectorStoreRequest createVectorStoreRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createVectorStoreFile(String vectorStoreId,CreateVectorStoreFileRequest createVectorStoreFileRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createVectorStoreFileBatch(String vectorStoreId,CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteVectorStore(String vectorStoreId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteVectorStoreFile(String vectorStoreId,String fileId,SecurityContext securityContext)
      throws NotFoundException;
      Response getVectorStore(String vectorStoreId,SecurityContext securityContext)
      throws NotFoundException;
      Response getVectorStoreFile(String vectorStoreId,String fileId,SecurityContext securityContext)
      throws NotFoundException;
      Response getVectorStoreFileBatch(String vectorStoreId,String batchId,SecurityContext securityContext)
      throws NotFoundException;
      Response listFilesInVectorStoreBatch(String vectorStoreId,String batchId,Integer limit,String order,String after,String before,String filter,SecurityContext securityContext)
      throws NotFoundException;
      Response listVectorStoreFiles(String vectorStoreId,Integer limit,String order,String after,String before,String filter,SecurityContext securityContext)
      throws NotFoundException;
      Response listVectorStores(Integer limit,String order,String after,String before,SecurityContext securityContext)
      throws NotFoundException;
      Response modifyVectorStore(String vectorStoreId,UpdateVectorStoreRequest updateVectorStoreRequest,SecurityContext securityContext)
      throws NotFoundException;


}
