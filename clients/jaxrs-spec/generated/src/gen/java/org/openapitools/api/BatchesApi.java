package org.openapitools.api;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;

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
@Path("/batches")
@Api(description = "the batches API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchesApi {

    @POST
    @Path("/{batch_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.", notes = "", response = Batch.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch is cancelling. Returns the cancelling batch's details.", response = Batch.class)
    })
    public Response cancelBatch(@PathParam("batch_id") @ApiParam("The ID of the batch to cancel.") String batchId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates and executes a batch from an uploaded file of requests", notes = "", response = Batch.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch created successfully.", response = Batch.class)
    })
    public Response createBatch(@Valid @NotNull CreateBatchRequest createBatchRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "List your organization's batches.", notes = "", response = ListBatchesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch listed successfully.", response = ListBatchesResponse.class)
    })
    public Response listBatches(@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{batch_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a batch.", notes = "", response = Batch.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch retrieved successfully.", response = Batch.class)
    })
    public Response retrieveBatch(@PathParam("batch_id") @ApiParam("The ID of the batch to retrieve.") String batchId) {
        return Response.ok().entity("magic!").build();
    }
}
