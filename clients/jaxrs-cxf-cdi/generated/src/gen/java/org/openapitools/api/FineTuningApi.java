package org.openapitools.api;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;
import org.openapitools.api.FineTuningApiService;

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
@Path("/fine_tuning/jobs")
@RequestScoped

@Api(description = "the fine_tuning API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-03T11:08:31.248726961Z[Etc/UTC]", comments = "Generator version: 7.9.0")

public class FineTuningApi  {

  @Context SecurityContext securityContext;

  @Inject FineTuningApiService delegate;


    @POST
    @Path("/{fine_tuning_job_id}/cancel")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Immediately cancel a fine-tune job. ", notes = "", response = FineTuningJob.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTuningJob.class) })
    public Response cancelFineTuningJob(@ApiParam(value = "The ID of the fine-tuning job to cancel. ",required=true) @PathParam("fine_tuning_job_id") String fineTuningJobId) {
        return delegate.cancelFineTuningJob(fineTuningJobId, securityContext);
    }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTuningJob.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTuningJob.class) })
    public Response createFineTuningJob(@ApiParam(value = "" ,required=true) CreateFineTuningJobRequest createFineTuningJobRequest) {
        return delegate.createFineTuningJob(createFineTuningJobRequest, securityContext);
    }

    @GET
    @Path("/{fine_tuning_job_id}/events")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get status updates for a fine-tuning job. ", notes = "", response = ListFineTuningJobEventsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFineTuningJobEventsResponse.class) })
    public Response listFineTuningEvents(@ApiParam(value = "The ID of the fine-tuning job to get events for. ",required=true) @PathParam("fine_tuning_job_id") String fineTuningJobId, @ApiParam(value = "Identifier for the last event from the previous pagination request.")  @QueryParam("after") String after, @ApiParam(value = "Number of events to retrieve.", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit) {
        return delegate.listFineTuningEvents(fineTuningJobId, after, limit, securityContext);
    }

    @GET
    @Path("/{fine_tuning_job_id}/checkpoints")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List checkpoints for a fine-tuning job. ", notes = "", response = ListFineTuningJobCheckpointsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFineTuningJobCheckpointsResponse.class) })
    public Response listFineTuningJobCheckpoints(@ApiParam(value = "The ID of the fine-tuning job to get checkpoints for. ",required=true) @PathParam("fine_tuning_job_id") String fineTuningJobId, @ApiParam(value = "Identifier for the last checkpoint ID from the previous pagination request.")  @QueryParam("after") String after, @ApiParam(value = "Number of checkpoints to retrieve.", defaultValue="10") @DefaultValue("10")  @QueryParam("limit") Integer limit) {
        return delegate.listFineTuningJobCheckpoints(fineTuningJobId, after, limit, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List your organization's fine-tuning jobs ", notes = "", response = ListPaginatedFineTuningJobsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListPaginatedFineTuningJobsResponse.class) })
    public Response listPaginatedFineTuningJobs(@ApiParam(value = "Identifier for the last job from the previous pagination request.")  @QueryParam("after") String after, @ApiParam(value = "Number of fine-tuning jobs to retrieve.", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit) {
        return delegate.listPaginatedFineTuningJobs(after, limit, securityContext);
    }

    @GET
    @Path("/{fine_tuning_job_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTuningJob.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Fine-tuning" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTuningJob.class) })
    public Response retrieveFineTuningJob(@ApiParam(value = "The ID of the fine-tuning job. ",required=true) @PathParam("fine_tuning_job_id") String fineTuningJobId) {
        return delegate.retrieveFineTuningJob(fineTuningJobId, securityContext);
    }
}
