package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/fine_tuning/jobs")


@io.swagger.annotations.Api(description = "the fine_tuning API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T10:45:31.742862961Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface FineTuningApi  {

    @POST
    @Path("/{fine_tuning_job_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Immediately cancel a fine-tune job. ", notes = "", response = FineTuningJob.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTuningJob.class) })
    public Response cancelFineTuningJob( @PathParam("fine_tuning_job_id") String fineTuningJobId,@Context SecurityContext securityContext);
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTuningJob.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTuningJob.class) })
    public Response createFineTuningJob(@ApiParam(value = "" ,required=true) @NotNull @Valid CreateFineTuningJobRequest createFineTuningJobRequest,@Context SecurityContext securityContext);
    @GET
    @Path("/{fine_tuning_job_id}/events")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get status updates for a fine-tuning job. ", notes = "", response = ListFineTuningJobEventsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFineTuningJobEventsResponse.class) })
    public Response listFineTuningEvents( @PathParam("fine_tuning_job_id") String fineTuningJobId, @QueryParam("after") String after, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext);
    @GET
    @Path("/{fine_tuning_job_id}/checkpoints")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List checkpoints for a fine-tuning job. ", notes = "", response = ListFineTuningJobCheckpointsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFineTuningJobCheckpointsResponse.class) })
    public Response listFineTuningJobCheckpoints( @PathParam("fine_tuning_job_id") String fineTuningJobId, @QueryParam("after") String after, @DefaultValue("10") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext);
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List your organization's fine-tuning jobs ", notes = "", response = ListPaginatedFineTuningJobsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListPaginatedFineTuningJobsResponse.class) })
    public Response listPaginatedFineTuningJobs( @QueryParam("after") String after, @DefaultValue("20") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext);
    @GET
    @Path("/{fine_tuning_job_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTuningJob.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTuningJob.class) })
    public Response retrieveFineTuningJob( @PathParam("fine_tuning_job_id") String fineTuningJobId,@Context SecurityContext securityContext);
}
