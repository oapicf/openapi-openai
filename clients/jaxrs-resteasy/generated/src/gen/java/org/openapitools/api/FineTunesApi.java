package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FineTunesApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateFineTuneRequest;
import org.openapitools.model.FineTune;
import org.openapitools.model.ListFineTuneEventsResponse;
import org.openapitools.model.ListFineTunesResponse;

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

@Path("/fine-tunes")


@io.swagger.annotations.Api(description = "the fine-tunes API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-16T01:13:37.006745963Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTunesApi  {

    @Inject FineTunesApiService service;

    @POST
    @Path("/{fine_tune_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Immediately cancel a fine-tune job. ", notes = "", response = FineTune.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTune.class) })
    public Response cancelFineTune( @PathParam("fine_tune_id") String fineTuneId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cancelFineTune(fineTuneId,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTune.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTune.class) })
    public Response createFineTune(@ApiParam(value = "" ,required=true) @NotNull @Valid CreateFineTuneRequest createFineTuneRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createFineTune(createFineTuneRequest,securityContext);
    }
    @GET
    @Path("/{fine_tune_id}/events")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get fine-grained status updates for a fine-tune job. ", notes = "", response = ListFineTuneEventsResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFineTuneEventsResponse.class) })
    public Response listFineTuneEvents( @PathParam("fine_tune_id") String fineTuneId, @DefaultValue("false") @QueryParam("stream") Boolean stream,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listFineTuneEvents(fineTuneId,stream,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List your organization's fine-tuning jobs ", notes = "", response = ListFineTunesResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFineTunesResponse.class) })
    public Response listFineTunes(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listFineTunes(securityContext);
    }
    @GET
    @Path("/{fine_tune_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTune.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTune.class) })
    public Response retrieveFineTune( @PathParam("fine_tune_id") String fineTuneId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.retrieveFineTune(fineTuneId,securityContext);
    }
}
