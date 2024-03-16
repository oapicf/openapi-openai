package org.openapitools.api;

import org.openapitools.model.CreateFineTuneRequest;
import org.openapitools.model.FineTune;
import org.openapitools.model.ListFineTuneEventsResponse;
import org.openapitools.model.ListFineTunesResponse;

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
@Path("/fine-tunes")
@Api(description = "the fine-tunes API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-16T01:13:46.302927795Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FineTunesApi {

    @POST
    @Path("/{fine_tune_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Immediately cancel a fine-tune job. ", notes = "", response = FineTune.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTune.class)
    })
    public Response cancelFineTune(@PathParam("fine_tune_id") @ApiParam("The ID of the fine-tune job to cancel ") String fineTuneId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTune.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTune.class)
    })
    public Response createFineTune(@Valid @NotNull CreateFineTuneRequest createFineTuneRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{fine_tune_id}/events")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get fine-grained status updates for a fine-tune job. ", notes = "", response = ListFineTuneEventsResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFineTuneEventsResponse.class)
    })
    public Response listFineTuneEvents(@PathParam("fine_tune_id") @ApiParam("The ID of the fine-tune job to get events for. ") String fineTuneId,@QueryParam("stream") @DefaultValue("false")  @ApiParam("Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. ")  Boolean stream) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "List your organization's fine-tuning jobs ", notes = "", response = ListFineTunesResponse.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListFineTunesResponse.class)
    })
    public Response listFineTunes() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{fine_tune_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) ", notes = "", response = FineTune.class, tags={ "OpenAI" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FineTune.class)
    })
    public Response retrieveFineTune(@PathParam("fine_tune_id") @ApiParam("The ID of the fine-tune job ") String fineTuneId) {
        return Response.ok().entity("magic!").build();
    }
}
