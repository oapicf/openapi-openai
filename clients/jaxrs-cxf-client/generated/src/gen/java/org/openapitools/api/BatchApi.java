package org.openapitools.api;

import org.openapitools.model.Batch;
import org.openapitools.model.CreateBatchRequest;
import org.openapitools.model.ListBatchesResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
@Path("/batches")
@Api(value = "/", description = "")
public interface BatchApi  {

    /**
     * Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
     *
     */
    @POST
    @Path("/{batch_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch is cancelling. Returns the cancelling batch's details.", response = Batch.class) })
    public Batch cancelBatch(@PathParam("batch_id") String batchId);

    /**
     * Creates and executes a batch from an uploaded file of requests
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates and executes a batch from an uploaded file of requests", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch created successfully.", response = Batch.class) })
    public Batch createBatch(CreateBatchRequest createBatchRequest);

    /**
     * List your organization&#39;s batches.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List your organization's batches.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch listed successfully.", response = ListBatchesResponse.class) })
    public ListBatchesResponse listBatches(@QueryParam("after") String after, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * Retrieves a batch.
     *
     */
    @GET
    @Path("/{batch_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a batch.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Batch retrieved successfully.", response = Batch.class) })
    public Batch retrieveBatch(@PathParam("batch_id") String batchId);
}
