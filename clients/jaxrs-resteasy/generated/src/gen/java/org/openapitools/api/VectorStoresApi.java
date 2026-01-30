package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.VectorStoresApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/vector_stores")


@io.swagger.annotations.Api(description = "the vector_stores API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoresApi  {

    @Inject VectorStoresApiService service;

    @POST
    @Path("/{vector_store_id}/file_batches/{batch_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class) })
    public Response cancelVectorStoreFileBatch( @PathParam("vector_store_id") String vectorStoreId, @PathParam("batch_id") String batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cancelVectorStoreFileBatch(vectorStoreId,batchId,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class) })
    public Response createVectorStore(@ApiParam(value = "" ,required=true) @NotNull @Valid CreateVectorStoreRequest createVectorStoreRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVectorStore(createVectorStoreRequest,securityContext);
    }
    @POST
    @Path("/{vector_store_id}/files")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).", notes = "", response = VectorStoreFileObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreFileObject.class) })
    public Response createVectorStoreFile( @PathParam("vector_store_id") String vectorStoreId,@ApiParam(value = "" ,required=true) @NotNull @Valid CreateVectorStoreFileRequest createVectorStoreFileRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVectorStoreFile(vectorStoreId,createVectorStoreFileRequest,securityContext);
    }
    @POST
    @Path("/{vector_store_id}/file_batches")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a vector store file batch.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class) })
    public Response createVectorStoreFileBatch( @PathParam("vector_store_id") String vectorStoreId,@ApiParam(value = "" ,required=true) @NotNull @Valid CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createVectorStoreFileBatch(vectorStoreId,createVectorStoreFileBatchRequest,securityContext);
    }
    @DELETE
    @Path("/{vector_store_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a vector store.", notes = "", response = DeleteVectorStoreResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteVectorStoreResponse.class) })
    public Response deleteVectorStore( @PathParam("vector_store_id") String vectorStoreId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteVectorStore(vectorStoreId,securityContext);
    }
    @DELETE
    @Path("/{vector_store_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.", notes = "", response = DeleteVectorStoreFileResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteVectorStoreFileResponse.class) })
    public Response deleteVectorStoreFile( @PathParam("vector_store_id") String vectorStoreId, @PathParam("file_id") String fileId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteVectorStoreFile(vectorStoreId,fileId,securityContext);
    }
    @GET
    @Path("/{vector_store_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class) })
    public Response getVectorStore( @PathParam("vector_store_id") String vectorStoreId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVectorStore(vectorStoreId,securityContext);
    }
    @GET
    @Path("/{vector_store_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a vector store file.", notes = "", response = VectorStoreFileObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreFileObject.class) })
    public Response getVectorStoreFile( @PathParam("vector_store_id") String vectorStoreId, @PathParam("file_id") String fileId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVectorStoreFile(vectorStoreId,fileId,securityContext);
    }
    @GET
    @Path("/{vector_store_id}/file_batches/{batch_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a vector store file batch.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class) })
    public Response getVectorStoreFileBatch( @PathParam("vector_store_id") String vectorStoreId, @PathParam("batch_id") String batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getVectorStoreFileBatch(vectorStoreId,batchId,securityContext);
    }
    @GET
    @Path("/{vector_store_id}/file_batches/{batch_id}/files")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of vector store files in a batch.", notes = "", response = ListVectorStoreFilesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListVectorStoreFilesResponse.class) })
    public Response listFilesInVectorStoreBatch( @PathParam("vector_store_id") String vectorStoreId, @PathParam("batch_id") String batchId, @DefaultValue("20") @QueryParam("limit") Integer limit,, allowableValues="asc, desc" @DefaultValue("desc") @QueryParam("order") String order, @QueryParam("after") String after, @QueryParam("before") String before,, allowableValues="in_progress, completed, failed, cancelled" @QueryParam("filter") String filter,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listFilesInVectorStoreBatch(vectorStoreId,batchId,limit,order,after,before,filter,securityContext);
    }
    @GET
    @Path("/{vector_store_id}/files")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of vector store files.", notes = "", response = ListVectorStoreFilesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListVectorStoreFilesResponse.class) })
    public Response listVectorStoreFiles( @PathParam("vector_store_id") String vectorStoreId, @DefaultValue("20") @QueryParam("limit") Integer limit,, allowableValues="asc, desc" @DefaultValue("desc") @QueryParam("order") String order, @QueryParam("after") String after, @QueryParam("before") String before,, allowableValues="in_progress, completed, failed, cancelled" @QueryParam("filter") String filter,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listVectorStoreFiles(vectorStoreId,limit,order,after,before,filter,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of vector stores.", notes = "", response = ListVectorStoresResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListVectorStoresResponse.class) })
    public Response listVectorStores( @DefaultValue("20") @QueryParam("limit") Integer limit,, allowableValues="asc, desc" @DefaultValue("desc") @QueryParam("order") String order, @QueryParam("after") String after, @QueryParam("before") String before,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listVectorStores(limit,order,after,before,securityContext);
    }
    @POST
    @Path("/{vector_store_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class) })
    public Response modifyVectorStore( @PathParam("vector_store_id") String vectorStoreId,@ApiParam(value = "" ,required=true) @NotNull @Valid UpdateVectorStoreRequest updateVectorStoreRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.modifyVectorStore(vectorStoreId,updateVectorStoreRequest,securityContext);
    }
}
