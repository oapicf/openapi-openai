package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class VectorStoresApiService {
    public abstract Response cancelVectorStoreFileBatch(String vectorStoreId
 ,String batchId
 ) throws NotFoundException;
    public abstract Response createVectorStore(CreateVectorStoreRequest createVectorStoreRequest
 ) throws NotFoundException;
    public abstract Response createVectorStoreFile(String vectorStoreId
 ,CreateVectorStoreFileRequest createVectorStoreFileRequest
 ) throws NotFoundException;
    public abstract Response createVectorStoreFileBatch(String vectorStoreId
 ,CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest
 ) throws NotFoundException;
    public abstract Response deleteVectorStore(String vectorStoreId
 ) throws NotFoundException;
    public abstract Response deleteVectorStoreFile(String vectorStoreId
 ,String fileId
 ) throws NotFoundException;
    public abstract Response getVectorStore(String vectorStoreId
 ) throws NotFoundException;
    public abstract Response getVectorStoreFile(String vectorStoreId
 ,String fileId
 ) throws NotFoundException;
    public abstract Response getVectorStoreFileBatch(String vectorStoreId
 ,String batchId
 ) throws NotFoundException;
    public abstract Response listFilesInVectorStoreBatch(String vectorStoreId
 ,String batchId
 ,Integer limit
 ,String order
 ,String after
 ,String before
 ,String filter
 ) throws NotFoundException;
    public abstract Response listVectorStoreFiles(String vectorStoreId
 ,Integer limit
 ,String order
 ,String after
 ,String before
 ,String filter
 ) throws NotFoundException;
    public abstract Response listVectorStores(Integer limit
 ,String order
 ,String after
 ,String before
 ) throws NotFoundException;
    public abstract Response modifyVectorStore(String vectorStoreId
 ,UpdateVectorStoreRequest updateVectorStoreRequest
 ) throws NotFoundException;
}
