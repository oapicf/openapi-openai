package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class VectorStoresApiService {
    public abstract Response cancelVectorStoreFileBatch(String vectorStoreId,String batchId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createVectorStore(CreateVectorStoreRequest createVectorStoreRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createVectorStoreFile(String vectorStoreId,CreateVectorStoreFileRequest createVectorStoreFileRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createVectorStoreFileBatch(String vectorStoreId,CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteVectorStore(String vectorStoreId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteVectorStoreFile(String vectorStoreId,String fileId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getVectorStore(String vectorStoreId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getVectorStoreFile(String vectorStoreId,String fileId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getVectorStoreFileBatch(String vectorStoreId,String batchId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listFilesInVectorStoreBatch(String vectorStoreId,String batchId,Integer limit,String order,String after,String before,String filter,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listVectorStoreFiles(String vectorStoreId,Integer limit,String order,String after,String before,String filter,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listVectorStores(Integer limit,String order,String after,String before,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyVectorStore(String vectorStoreId,UpdateVectorStoreRequest updateVectorStoreRequest,SecurityContext securityContext) throws NotFoundException;
}
