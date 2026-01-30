package org.openapitools.api;

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
import org.openapitools.api.VectorStoresApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/vector_stores")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class VectorStoresApi  {

  @Context SecurityContext securityContext;

  @Inject VectorStoresApiService delegate;


    @POST
    @Path("/{vector_store_id}/file_batches/{batch_id}/cancel")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class) })
    public Response cancelVectorStoreFileBatch(@ApiParam(value = "The ID of the vector store that the file batch belongs to.",required=true) @PathParam("vector_store_id") String vectorStoreId, @ApiParam(value = "The ID of the file batch to cancel.",required=true) @PathParam("batch_id") String batchId) {
        return delegate.cancelVectorStoreFileBatch(vectorStoreId, batchId, securityContext);
    }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class) })
    public Response createVectorStore(@ApiParam(value = "" ,required=true) CreateVectorStoreRequest createVectorStoreRequest) {
        return delegate.createVectorStore(createVectorStoreRequest, securityContext);
    }

    @POST
    @Path("/{vector_store_id}/files")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).", notes = "", response = VectorStoreFileObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileObject.class) })
    public Response createVectorStoreFile(@ApiParam(value = "The ID of the vector store for which to create a File. ",required=true) @PathParam("vector_store_id") String vectorStoreId, @ApiParam(value = "" ,required=true) CreateVectorStoreFileRequest createVectorStoreFileRequest) {
        return delegate.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest, securityContext);
    }

    @POST
    @Path("/{vector_store_id}/file_batches")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a vector store file batch.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class) })
    public Response createVectorStoreFileBatch(@ApiParam(value = "The ID of the vector store for which to create a File Batch. ",required=true) @PathParam("vector_store_id") String vectorStoreId, @ApiParam(value = "" ,required=true) CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest) {
        return delegate.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest, securityContext);
    }

    @DELETE
    @Path("/{vector_store_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a vector store.", notes = "", response = DeleteVectorStoreResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteVectorStoreResponse.class) })
    public Response deleteVectorStore(@ApiParam(value = "The ID of the vector store to delete.",required=true) @PathParam("vector_store_id") String vectorStoreId) {
        return delegate.deleteVectorStore(vectorStoreId, securityContext);
    }

    @DELETE
    @Path("/{vector_store_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.", notes = "", response = DeleteVectorStoreFileResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteVectorStoreFileResponse.class) })
    public Response deleteVectorStoreFile(@ApiParam(value = "The ID of the vector store that the file belongs to.",required=true) @PathParam("vector_store_id") String vectorStoreId, @ApiParam(value = "The ID of the file to delete.",required=true) @PathParam("file_id") String fileId) {
        return delegate.deleteVectorStoreFile(vectorStoreId, fileId, securityContext);
    }

    @GET
    @Path("/{vector_store_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class) })
    public Response getVectorStore(@ApiParam(value = "The ID of the vector store to retrieve.",required=true) @PathParam("vector_store_id") String vectorStoreId) {
        return delegate.getVectorStore(vectorStoreId, securityContext);
    }

    @GET
    @Path("/{vector_store_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a vector store file.", notes = "", response = VectorStoreFileObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileObject.class) })
    public Response getVectorStoreFile(@ApiParam(value = "The ID of the vector store that the file belongs to.",required=true) @PathParam("vector_store_id") String vectorStoreId, @ApiParam(value = "The ID of the file being retrieved.",required=true) @PathParam("file_id") String fileId) {
        return delegate.getVectorStoreFile(vectorStoreId, fileId, securityContext);
    }

    @GET
    @Path("/{vector_store_id}/file_batches/{batch_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a vector store file batch.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class) })
    public Response getVectorStoreFileBatch(@ApiParam(value = "The ID of the vector store that the file batch belongs to.",required=true) @PathParam("vector_store_id") String vectorStoreId, @ApiParam(value = "The ID of the file batch being retrieved.",required=true) @PathParam("batch_id") String batchId) {
        return delegate.getVectorStoreFileBatch(vectorStoreId, batchId, securityContext);
    }

    @GET
    @Path("/{vector_store_id}/file_batches/{batch_id}/files")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of vector store files in a batch.", notes = "", response = ListVectorStoreFilesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListVectorStoreFilesResponse.class) })
    public Response listFilesInVectorStoreBatch(@ApiParam(value = "The ID of the vector store that the files belong to.",required=true) @PathParam("vector_store_id") String vectorStoreId, @ApiParam(value = "The ID of the file batch that the files belong to.",required=true) @PathParam("batch_id") String batchId, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc")  @QueryParam("order") String order, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @QueryParam("before") String before, @ApiParam(value = "Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.", allowableValues="in_progress, completed, failed, cancelled")  @QueryParam("filter") String filter) {
        return delegate.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter, securityContext);
    }

    @GET
    @Path("/{vector_store_id}/files")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of vector store files.", notes = "", response = ListVectorStoreFilesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListVectorStoreFilesResponse.class) })
    public Response listVectorStoreFiles(@ApiParam(value = "The ID of the vector store that the files belong to.",required=true) @PathParam("vector_store_id") String vectorStoreId, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc")  @QueryParam("order") String order, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @QueryParam("before") String before, @ApiParam(value = "Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.", allowableValues="in_progress, completed, failed, cancelled")  @QueryParam("filter") String filter) {
        return delegate.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of vector stores.", notes = "", response = ListVectorStoresResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListVectorStoresResponse.class) })
    public Response listVectorStores(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc")  @QueryParam("order") String order, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @QueryParam("before") String before) {
        return delegate.listVectorStores(limit, order, after, before, securityContext);
    }

    @POST
    @Path("/{vector_store_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class) })
    public Response modifyVectorStore(@ApiParam(value = "The ID of the vector store to modify.",required=true) @PathParam("vector_store_id") String vectorStoreId, @ApiParam(value = "" ,required=true) UpdateVectorStoreRequest updateVectorStoreRequest) {
        return delegate.modifyVectorStore(vectorStoreId, updateVectorStoreRequest, securityContext);
    }
}
