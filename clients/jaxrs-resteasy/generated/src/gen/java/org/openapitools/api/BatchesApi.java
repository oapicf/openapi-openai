package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BatchesApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;

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

@Path("/batches")


@io.swagger.annotations.Api(description = "the batches API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchesApi  {

    @Inject BatchesApiService service;

    @POST
    @Path("/{batch_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.", notes = "", response = Batch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch is cancelling. Returns the cancelling batch's details.", response = Batch.class) })
    public Response cancelBatch( @PathParam("batch_id") String batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cancelBatch(batchId,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates and executes a batch from an uploaded file of requests", notes = "", response = Batch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch created successfully.", response = Batch.class) })
    public Response createBatch(@ApiParam(value = "" ,required=true) @NotNull @Valid CreateBatchRequest createBatchRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createBatch(createBatchRequest,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List your organization's batches.", notes = "", response = ListBatchesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch listed successfully.", response = ListBatchesResponse.class) })
    public Response listBatches( @QueryParam("after") String after, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listBatches(after,limit,securityContext);
    }
    @GET
    @Path("/{batch_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a batch.", notes = "", response = Batch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch retrieved successfully.", response = Batch.class) })
    public Response retrieveBatch( @PathParam("batch_id") String batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.retrieveBatch(batchId,securityContext);
    }
}
