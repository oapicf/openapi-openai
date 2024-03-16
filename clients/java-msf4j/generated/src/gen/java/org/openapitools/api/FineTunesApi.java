package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.FineTunesApiService;
import org.openapitools.api.factories.FineTunesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateFineTuneRequest;
import org.openapitools.model.FineTune;
import org.openapitools.model.ListFineTuneEventsResponse;
import org.openapitools.model.ListFineTunesResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/fine-tunes")


@io.swagger.annotations.Api(description = "the fine-tunes API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-16T01:12:44.741883350Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTunesApi  {
   private final FineTunesApiService delegate = FineTunesApiServiceFactory.getFineTunesApi();

    @POST
    @Path("/{fine_tune_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Immediately cancel a fine-tune job. ", notes = "", response = FineTune.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTune.class) })
    public Response cancelFineTune(@ApiParam(value = "The ID of the fine-tune job to cancel ",required=true) @PathParam("fine_tune_id") String fineTuneId
)
    throws NotFoundException {
        return delegate.cancelFineTune(fineTuneId);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTune.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTune.class) })
    public Response createFineTune(@ApiParam(value = "" ,required=true) CreateFineTuneRequest createFineTuneRequest
)
    throws NotFoundException {
        return delegate.createFineTune(createFineTuneRequest);
    }
    @GET
    @Path("/{fine_tune_id}/events")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get fine-grained status updates for a fine-tune job. ", notes = "", response = ListFineTuneEventsResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFineTuneEventsResponse.class) })
    public Response listFineTuneEvents(@ApiParam(value = "The ID of the fine-tune job to get events for. ",required=true) @PathParam("fine_tune_id") String fineTuneId
,@ApiParam(value = "Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. ", defaultValue="false") @DefaultValue("false") @QueryParam("stream") Boolean stream
)
    throws NotFoundException {
        return delegate.listFineTuneEvents(fineTuneId,stream);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List your organization's fine-tuning jobs ", notes = "", response = ListFineTunesResponse.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListFineTunesResponse.class) })
    public Response listFineTunes()
    throws NotFoundException {
        return delegate.listFineTunes();
    }
    @GET
    @Path("/{fine_tune_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTune.class, tags={ "OpenAI", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = FineTune.class) })
    public Response retrieveFineTune(@ApiParam(value = "The ID of the fine-tune job ",required=true) @PathParam("fine_tune_id") String fineTuneId
)
    throws NotFoundException {
        return delegate.retrieveFineTune(fineTuneId);
    }
}