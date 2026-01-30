package org.openapitools.api;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;
import org.openapitools.api.BatchesApiService;

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
@Path("/batches")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class BatchesApi  {

  @Context SecurityContext securityContext;

  @Inject BatchesApiService delegate;


    @POST
    @Path("/{batch_id}/cancel")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.", notes = "", response = Batch.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch is cancelling. Returns the cancelling batch's details.", response = Batch.class) })
    public Response cancelBatch(@ApiParam(value = "The ID of the batch to cancel.",required=true) @PathParam("batch_id") String batchId) {
        return delegate.cancelBatch(batchId, securityContext);
    }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates and executes a batch from an uploaded file of requests", notes = "", response = Batch.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch created successfully.", response = Batch.class) })
    public Response createBatch(@ApiParam(value = "" ,required=true) CreateBatchRequest createBatchRequest) {
        return delegate.createBatch(createBatchRequest, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List your organization's batches.", notes = "", response = ListBatchesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch listed successfully.", response = ListBatchesResponse.class) })
    public Response listBatches(@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit) {
        return delegate.listBatches(after, limit, securityContext);
    }

    @GET
    @Path("/{batch_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a batch.", notes = "", response = Batch.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Batch" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch retrieved successfully.", response = Batch.class) })
    public Response retrieveBatch(@ApiParam(value = "The ID of the batch to retrieve.",required=true) @PathParam("batch_id") String batchId) {
        return delegate.retrieveBatch(batchId, securityContext);
    }
}
