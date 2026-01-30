package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BatchesApiService;
import org.openapitools.api.factories.BatchesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/batches")


@io.swagger.annotations.Api(description = "the batches API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchesApi  {
   private final BatchesApiService delegate = BatchesApiServiceFactory.getBatchesApi();

    @POST
    @Path("/{batch_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.", notes = "", response = Batch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch is cancelling. Returns the cancelling batch's details.", response = Batch.class) })
    public Response cancelBatch(@ApiParam(value = "The ID of the batch to cancel.",required=true) @PathParam("batch_id") String batchId
)
    throws NotFoundException {
        return delegate.cancelBatch(batchId);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates and executes a batch from an uploaded file of requests", notes = "", response = Batch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch created successfully.", response = Batch.class) })
    public Response createBatch(@ApiParam(value = "" ,required=true) CreateBatchRequest createBatchRequest
)
    throws NotFoundException {
        return delegate.createBatch(createBatchRequest);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List your organization's batches.", notes = "", response = ListBatchesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch listed successfully.", response = ListBatchesResponse.class) })
    public Response listBatches(@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after") String after
,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20") @QueryParam("limit") Integer limit
)
    throws NotFoundException {
        return delegate.listBatches(after,limit);
    }
    @GET
    @Path("/{batch_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a batch.", notes = "", response = Batch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Batch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Batch retrieved successfully.", response = Batch.class) })
    public Response retrieveBatch(@ApiParam(value = "The ID of the batch to retrieve.",required=true) @PathParam("batch_id") String batchId
)
    throws NotFoundException {
        return delegate.retrieveBatch(batchId);
    }
}
