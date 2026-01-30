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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
@Path("/vector_stores")
@Api(value = "/", description = "")
public interface VectorStoresApi  {

    /**
     * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
     *
     */
    @POST
    @Path("/{vector_store_id}/file_batches/{batch_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class) })
    public VectorStoreFileBatchObject cancelVectorStoreFileBatch(@PathParam("vector_store_id") String vectorStoreId, @PathParam("batch_id") String batchId);

    /**
     * Create a vector store.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a vector store.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class) })
    public VectorStoreObject createVectorStore(@Valid CreateVectorStoreRequest createVectorStoreRequest);

    /**
     * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
     *
     */
    @POST
    @Path("/{vector_store_id}/files")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileObject.class) })
    public VectorStoreFileObject createVectorStoreFile(@PathParam("vector_store_id") String vectorStoreId, @Valid CreateVectorStoreFileRequest createVectorStoreFileRequest);

    /**
     * Create a vector store file batch.
     *
     */
    @POST
    @Path("/{vector_store_id}/file_batches")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a vector store file batch.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class) })
    public VectorStoreFileBatchObject createVectorStoreFileBatch(@PathParam("vector_store_id") String vectorStoreId, @Valid CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest);

    /**
     * Delete a vector store.
     *
     */
    @DELETE
    @Path("/{vector_store_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a vector store.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteVectorStoreResponse.class) })
    public DeleteVectorStoreResponse deleteVectorStore(@PathParam("vector_store_id") String vectorStoreId);

    /**
     * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
     *
     */
    @DELETE
    @Path("/{vector_store_id}/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteVectorStoreFileResponse.class) })
    public DeleteVectorStoreFileResponse deleteVectorStoreFile(@PathParam("vector_store_id") String vectorStoreId, @PathParam("file_id") String fileId);

    /**
     * Retrieves a vector store.
     *
     */
    @GET
    @Path("/{vector_store_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a vector store.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class) })
    public VectorStoreObject getVectorStore(@PathParam("vector_store_id") String vectorStoreId);

    /**
     * Retrieves a vector store file.
     *
     */
    @GET
    @Path("/{vector_store_id}/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a vector store file.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileObject.class) })
    public VectorStoreFileObject getVectorStoreFile(@PathParam("vector_store_id") String vectorStoreId, @PathParam("file_id") String fileId);

    /**
     * Retrieves a vector store file batch.
     *
     */
    @GET
    @Path("/{vector_store_id}/file_batches/{batch_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a vector store file batch.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class) })
    public VectorStoreFileBatchObject getVectorStoreFileBatch(@PathParam("vector_store_id") String vectorStoreId, @PathParam("batch_id") String batchId);

    /**
     * Returns a list of vector store files in a batch.
     *
     */
    @GET
    @Path("/{vector_store_id}/file_batches/{batch_id}/files")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of vector store files in a batch.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListVectorStoreFilesResponse.class) })
    public ListVectorStoreFilesResponse listFilesInVectorStoreBatch(@PathParam("vector_store_id") String vectorStoreId, @PathParam("batch_id") String batchId, @QueryParam("limit") @DefaultValue("20") Integer limit, @QueryParam("order") @DefaultValue("desc") String order, @QueryParam("after") String after, @QueryParam("before") String before, @QueryParam("filter") String filter);

    /**
     * Returns a list of vector store files.
     *
     */
    @GET
    @Path("/{vector_store_id}/files")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of vector store files.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListVectorStoreFilesResponse.class) })
    public ListVectorStoreFilesResponse listVectorStoreFiles(@PathParam("vector_store_id") String vectorStoreId, @QueryParam("limit") @DefaultValue("20") Integer limit, @QueryParam("order") @DefaultValue("desc") String order, @QueryParam("after") String after, @QueryParam("before") String before, @QueryParam("filter") String filter);

    /**
     * Returns a list of vector stores.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of vector stores.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListVectorStoresResponse.class) })
    public ListVectorStoresResponse listVectorStores(@QueryParam("limit") @DefaultValue("20") Integer limit, @QueryParam("order") @DefaultValue("desc") String order, @QueryParam("after") String after, @QueryParam("before") String before);

    /**
     * Modifies a vector store.
     *
     */
    @POST
    @Path("/{vector_store_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a vector store.", tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class) })
    public VectorStoreObject modifyVectorStore(@PathParam("vector_store_id") String vectorStoreId, @Valid UpdateVectorStoreRequest updateVectorStoreRequest);
}
