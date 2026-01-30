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

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/vector_stores")
@Api(description = "the vector_stores API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoresApi {

    @POST
    @Path("/{vector_store_id}/file_batches/{batch_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class)
    })
    public Response cancelVectorStoreFileBatch(@PathParam("vector_store_id") @ApiParam("The ID of the vector store that the file batch belongs to.") String vectorStoreId,@PathParam("batch_id") @ApiParam("The ID of the file batch to cancel.") String batchId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class)
    })
    public Response createVectorStore(@Valid @NotNull CreateVectorStoreRequest createVectorStoreRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{vector_store_id}/files")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).", notes = "", response = VectorStoreFileObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileObject.class)
    })
    public Response createVectorStoreFile(@PathParam("vector_store_id") @ApiParam("The ID of the vector store for which to create a File. ") String vectorStoreId,@Valid @NotNull CreateVectorStoreFileRequest createVectorStoreFileRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{vector_store_id}/file_batches")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a vector store file batch.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class)
    })
    public Response createVectorStoreFileBatch(@PathParam("vector_store_id") @ApiParam("The ID of the vector store for which to create a File Batch. ") String vectorStoreId,@Valid @NotNull CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{vector_store_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a vector store.", notes = "", response = DeleteVectorStoreResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteVectorStoreResponse.class)
    })
    public Response deleteVectorStore(@PathParam("vector_store_id") @ApiParam("The ID of the vector store to delete.") String vectorStoreId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{vector_store_id}/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.", notes = "", response = DeleteVectorStoreFileResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteVectorStoreFileResponse.class)
    })
    public Response deleteVectorStoreFile(@PathParam("vector_store_id") @ApiParam("The ID of the vector store that the file belongs to.") String vectorStoreId,@PathParam("file_id") @ApiParam("The ID of the file to delete.") String fileId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{vector_store_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class)
    })
    public Response getVectorStore(@PathParam("vector_store_id") @ApiParam("The ID of the vector store to retrieve.") String vectorStoreId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{vector_store_id}/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a vector store file.", notes = "", response = VectorStoreFileObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileObject.class)
    })
    public Response getVectorStoreFile(@PathParam("vector_store_id") @ApiParam("The ID of the vector store that the file belongs to.") String vectorStoreId,@PathParam("file_id") @ApiParam("The ID of the file being retrieved.") String fileId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{vector_store_id}/file_batches/{batch_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a vector store file batch.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class)
    })
    public Response getVectorStoreFileBatch(@PathParam("vector_store_id") @ApiParam("The ID of the vector store that the file batch belongs to.") String vectorStoreId,@PathParam("batch_id") @ApiParam("The ID of the file batch being retrieved.") String batchId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{vector_store_id}/file_batches/{batch_id}/files")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of vector store files in a batch.", notes = "", response = ListVectorStoreFilesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListVectorStoreFilesResponse.class)
    })
    public Response listFilesInVectorStoreBatch(@PathParam("vector_store_id") @ApiParam("The ID of the vector store that the files belong to.") String vectorStoreId,@PathParam("batch_id") @ApiParam("The ID of the file batch that the files belong to.") String batchId,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("order") @DefaultValue("desc")  @ApiParam("Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ")  String order,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("before")  @ApiParam("A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ")  String before,@QueryParam("filter")  @ApiParam("Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.")  String filter) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{vector_store_id}/files")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of vector store files.", notes = "", response = ListVectorStoreFilesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListVectorStoreFilesResponse.class)
    })
    public Response listVectorStoreFiles(@PathParam("vector_store_id") @ApiParam("The ID of the vector store that the files belong to.") String vectorStoreId,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("order") @DefaultValue("desc")  @ApiParam("Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ")  String order,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("before")  @ApiParam("A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ")  String before,@QueryParam("filter")  @ApiParam("Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;.")  String filter) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of vector stores.", notes = "", response = ListVectorStoresResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListVectorStoresResponse.class)
    })
    public Response listVectorStores(@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("order") @DefaultValue("desc")  @ApiParam("Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ")  String order,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("before")  @ApiParam("A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ")  String before) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{vector_store_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Vector stores" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class)
    })
    public Response modifyVectorStore(@PathParam("vector_store_id") @ApiParam("The ID of the vector store to modify.") String vectorStoreId,@Valid @NotNull UpdateVectorStoreRequest updateVectorStoreRequest) {
        return Response.ok().entity("magic!").build();
    }
}
