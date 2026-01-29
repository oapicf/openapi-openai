package org.openapitools.api;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
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
@Path("/fine_tuning/jobs")
@Api(value = "/", description = "")
public interface FineTuningApi  {

    /**
     * Immediately cancel a fine-tune job. 
     *
     */
    @POST
    @Path("/{fine_tuning_job_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Immediately cancel a fine-tune job. ", tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTuningJob.class) })
    public FineTuningJob cancelFineTuningJob(@PathParam("fine_tuning_job_id") String fineTuningJobId);

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ", tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTuningJob.class) })
    public FineTuningJob createFineTuningJob(@Valid @NotNull CreateFineTuningJobRequest createFineTuningJobRequest);

    /**
     * Get status updates for a fine-tuning job. 
     *
     */
    @GET
    @Path("/{fine_tuning_job_id}/events")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get status updates for a fine-tuning job. ", tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFineTuningJobEventsResponse.class) })
    public ListFineTuningJobEventsResponse listFineTuningEvents(@PathParam("fine_tuning_job_id") String fineTuningJobId, @QueryParam("after") String after, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * List checkpoints for a fine-tuning job. 
     *
     */
    @GET
    @Path("/{fine_tuning_job_id}/checkpoints")
    @Produces({ "application/json" })
    @ApiOperation(value = "List checkpoints for a fine-tuning job. ", tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFineTuningJobCheckpointsResponse.class) })
    public ListFineTuningJobCheckpointsResponse listFineTuningJobCheckpoints(@PathParam("fine_tuning_job_id") String fineTuningJobId, @QueryParam("after") String after, @QueryParam("limit") @DefaultValue("10")Integer limit);

    /**
     * List your organization&#39;s fine-tuning jobs 
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List your organization's fine-tuning jobs ", tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListPaginatedFineTuningJobsResponse.class) })
    public ListPaginatedFineTuningJobsResponse listPaginatedFineTuningJobs(@QueryParam("after") String after, @QueryParam("limit") @DefaultValue("20")Integer limit);

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     *
     */
    @GET
    @Path("/{fine_tuning_job_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ", tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTuningJob.class) })
    public FineTuningJob retrieveFineTuningJob(@PathParam("fine_tuning_job_id") String fineTuningJobId);
}
