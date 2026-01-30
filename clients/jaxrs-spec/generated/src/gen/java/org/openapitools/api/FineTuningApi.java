package org.openapitools.api;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;

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
@Path("/fine_tuning/jobs")
@Api(description = "the fine_tuning API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningApi {

    @POST
    @Path("/{fine_tuning_job_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Immediately cancel a fine-tune job. ", notes = "", response = FineTuningJob.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTuningJob.class)
    })
    public Response cancelFineTuningJob(@PathParam("fine_tuning_job_id") @ApiParam("The ID of the fine-tuning job to cancel. ") String fineTuningJobId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTuningJob.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTuningJob.class)
    })
    public Response createFineTuningJob(@Valid @NotNull CreateFineTuningJobRequest createFineTuningJobRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{fine_tuning_job_id}/events")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get status updates for a fine-tuning job. ", notes = "", response = ListFineTuningJobEventsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFineTuningJobEventsResponse.class)
    })
    public Response listFineTuningEvents(@PathParam("fine_tuning_job_id") @ApiParam("The ID of the fine-tuning job to get events for. ") String fineTuningJobId,@QueryParam("after")  @ApiParam("Identifier for the last event from the previous pagination request.")  String after,@QueryParam("limit") @DefaultValue("20")  @ApiParam("Number of events to retrieve.")  Integer limit) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{fine_tuning_job_id}/checkpoints")
    @Produces({ "application/json" })
    @ApiOperation(value = "List checkpoints for a fine-tuning job. ", notes = "", response = ListFineTuningJobCheckpointsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFineTuningJobCheckpointsResponse.class)
    })
    public Response listFineTuningJobCheckpoints(@PathParam("fine_tuning_job_id") @ApiParam("The ID of the fine-tuning job to get checkpoints for. ") String fineTuningJobId,@QueryParam("after")  @ApiParam("Identifier for the last checkpoint ID from the previous pagination request.")  String after,@QueryParam("limit") @DefaultValue("10")  @ApiParam("Number of checkpoints to retrieve.")  Integer limit) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "List your organization's fine-tuning jobs ", notes = "", response = ListPaginatedFineTuningJobsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListPaginatedFineTuningJobsResponse.class)
    })
    public Response listPaginatedFineTuningJobs(@QueryParam("after")  @ApiParam("Identifier for the last job from the previous pagination request.")  String after,@QueryParam("limit") @DefaultValue("20")  @ApiParam("Number of fine-tuning jobs to retrieve.")  Integer limit) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{fine_tuning_job_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTuningJob.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTuningJob.class)
    })
    public Response retrieveFineTuningJob(@PathParam("fine_tuning_job_id") @ApiParam("The ID of the fine-tuning job. ") String fineTuningJobId) {
        return Response.ok().entity("magic!").build();
    }
}
