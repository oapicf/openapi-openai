package org.openapitools.api;

import org.openapitools.api.FineTuningApiService;
import org.openapitools.api.factories.FineTuningApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateFineTuningJobRequest;
import org.openapitools.model.FineTuningJob;
import org.openapitools.model.ListFineTuningJobCheckpointsResponse;
import org.openapitools.model.ListFineTuningJobEventsResponse;
import org.openapitools.model.ListPaginatedFineTuningJobsResponse;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/fine_tuning/jobs")


@io.swagger.annotations.Api(description = "the fine_tuning API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T10:45:25.331962823Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuningApi  {
   private final FineTuningApiService delegate;

   public FineTuningApi(@Context ServletConfig servletContext) {
      FineTuningApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FineTuningApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FineTuningApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = FineTuningApiServiceFactory.getFineTuningApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/{fine_tuning_job_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Immediately cancel a fine-tune job. ", notes = "", response = FineTuningJob.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTuningJob.class)
    })
    public Response cancelFineTuningJob(@ApiParam(value = "The ID of the fine-tuning job to cancel. ", required = true) @PathParam("fine_tuning_job_id") @NotNull  String fineTuningJobId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancelFineTuningJob(fineTuningJobId, securityContext);
    }
    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTuningJob.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTuningJob.class)
    })
    public Response createFineTuningJob(@ApiParam(value = "", required = true) @NotNull @Valid  CreateFineTuningJobRequest createFineTuningJobRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createFineTuningJob(createFineTuningJobRequest, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{fine_tuning_job_id}/events")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get status updates for a fine-tuning job. ", notes = "", response = ListFineTuningJobEventsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFineTuningJobEventsResponse.class)
    })
    public Response listFineTuningEvents(@ApiParam(value = "The ID of the fine-tuning job to get events for. ", required = true) @PathParam("fine_tuning_job_id") @NotNull  String fineTuningJobId,@ApiParam(value = "Identifier for the last event from the previous pagination request.") @QueryParam("after")  String after,@ApiParam(value = "Number of events to retrieve.", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listFineTuningEvents(fineTuningJobId, after, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{fine_tuning_job_id}/checkpoints")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List checkpoints for a fine-tuning job. ", notes = "", response = ListFineTuningJobCheckpointsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFineTuningJobCheckpointsResponse.class)
    })
    public Response listFineTuningJobCheckpoints(@ApiParam(value = "The ID of the fine-tuning job to get checkpoints for. ", required = true) @PathParam("fine_tuning_job_id") @NotNull  String fineTuningJobId,@ApiParam(value = "Identifier for the last checkpoint ID from the previous pagination request.") @QueryParam("after")  String after,@ApiParam(value = "Number of checkpoints to retrieve.", defaultValue = "10") @DefaultValue("10") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listFineTuningJobCheckpoints(fineTuningJobId, after, limit, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List your organization's fine-tuning jobs ", notes = "", response = ListPaginatedFineTuningJobsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListPaginatedFineTuningJobsResponse.class)
    })
    public Response listPaginatedFineTuningJobs(@ApiParam(value = "Identifier for the last job from the previous pagination request.") @QueryParam("after")  String after,@ApiParam(value = "Number of fine-tuning jobs to retrieve.", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listPaginatedFineTuningJobs(after, limit, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{fine_tuning_job_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTuningJob.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Fine-tuning", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTuningJob.class)
    })
    public Response retrieveFineTuningJob(@ApiParam(value = "The ID of the fine-tuning job. ", required = true) @PathParam("fine_tuning_job_id") @NotNull  String fineTuningJobId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.retrieveFineTuningJob(fineTuningJobId, securityContext);
    }
}
