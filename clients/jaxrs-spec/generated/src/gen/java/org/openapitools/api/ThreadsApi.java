package org.openapitools.api;

import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateRunRequest;
import org.openapitools.model.CreateThreadAndRunRequest;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.DeleteMessageResponse;
import org.openapitools.model.DeleteThreadResponse;
import org.openapitools.model.ListMessagesResponse;
import org.openapitools.model.ListRunStepsResponse;
import org.openapitools.model.ListRunsResponse;
import org.openapitools.model.MessageObject;
import org.openapitools.model.ModifyMessageRequest;
import org.openapitools.model.ModifyRunRequest;
import org.openapitools.model.ModifyThreadRequest;
import org.openapitools.model.RunObject;
import org.openapitools.model.RunStepObject;
import org.openapitools.model.SubmitToolOutputsRunRequest;
import org.openapitools.model.ThreadObject;

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
@Path("/threads")
@Api(description = "the threads API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ThreadsApi {

    @POST
    @Path("/{thread_id}/runs/{run_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancels a run that is `in_progress`.", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response cancelRun(@PathParam("thread_id") @ApiParam("The ID of the thread to which this run belongs.") String threadId,@PathParam("run_id") @ApiParam("The ID of the run to cancel.") String runId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{thread_id}/messages")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a message.", notes = "", response = MessageObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageObject.class)
    })
    public Response createMessage(@PathParam("thread_id") @ApiParam("The ID of the [thread](/docs/api-reference/threads) to create a message for.") String threadId,@Valid @NotNull CreateMessageRequest createMessageRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{thread_id}/runs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a run.", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response createRun(@PathParam("thread_id") @ApiParam("The ID of the thread to run.") String threadId,@Valid @NotNull CreateRunRequest createRunRequest,@QueryParam("include[]")  @ApiParam("A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")  List<String> include) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a thread.", notes = "", response = ThreadObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ThreadObject.class)
    })
    public Response createThread(@Valid CreateThreadRequest createThreadRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/runs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a thread and run it in one request.", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response createThreadAndRun(@Valid @NotNull CreateThreadAndRunRequest createThreadAndRunRequest) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{thread_id}/messages/{message_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Deletes a message.", notes = "", response = DeleteMessageResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteMessageResponse.class)
    })
    public Response deleteMessage(@PathParam("thread_id") @ApiParam("The ID of the thread to which this message belongs.") String threadId,@PathParam("message_id") @ApiParam("The ID of the message to delete.") String messageId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{thread_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a thread.", notes = "", response = DeleteThreadResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteThreadResponse.class)
    })
    public Response deleteThread(@PathParam("thread_id") @ApiParam("The ID of the thread to delete.") String threadId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{thread_id}/messages/{message_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a message.", notes = "", response = MessageObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageObject.class)
    })
    public Response getMessage(@PathParam("thread_id") @ApiParam("The ID of the [thread](/docs/api-reference/threads) to which this message belongs.") String threadId,@PathParam("message_id") @ApiParam("The ID of the message to retrieve.") String messageId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{thread_id}/runs/{run_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a run.", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response getRun(@PathParam("thread_id") @ApiParam("The ID of the [thread](/docs/api-reference/threads) that was run.") String threadId,@PathParam("run_id") @ApiParam("The ID of the run to retrieve.") String runId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{thread_id}/runs/{run_id}/steps/{step_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a run step.", notes = "", response = RunStepObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunStepObject.class)
    })
    public Response getRunStep(@PathParam("thread_id") @ApiParam("The ID of the thread to which the run and run step belongs.") String threadId,@PathParam("run_id") @ApiParam("The ID of the run to which the run step belongs.") String runId,@PathParam("step_id") @ApiParam("The ID of the run step to retrieve.") String stepId,@QueryParam("include[]")  @ApiParam("A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")  List<String> include) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{thread_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a thread.", notes = "", response = ThreadObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ThreadObject.class)
    })
    public Response getThread(@PathParam("thread_id") @ApiParam("The ID of the thread to retrieve.") String threadId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{thread_id}/messages")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of messages for a given thread.", notes = "", response = ListMessagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListMessagesResponse.class)
    })
    public Response listMessages(@PathParam("thread_id") @ApiParam("The ID of the [thread](/docs/api-reference/threads) the messages belong to.") String threadId,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("order") @DefaultValue("desc")  @ApiParam("Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ")  String order,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("before")  @ApiParam("A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ")  String before,@QueryParam("run_id")  @ApiParam("Filter messages by the run ID that generated them. ")  String runId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{thread_id}/runs/{run_id}/steps")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of run steps belonging to a run.", notes = "", response = ListRunStepsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListRunStepsResponse.class)
    })
    public Response listRunSteps(@PathParam("thread_id") @ApiParam("The ID of the thread the run and run steps belong to.") String threadId,@PathParam("run_id") @ApiParam("The ID of the run the run steps belong to.") String runId,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("order") @DefaultValue("desc")  @ApiParam("Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ")  String order,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("before")  @ApiParam("A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ")  String before,@QueryParam("include[]")  @ApiParam("A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")  List<String> include) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{thread_id}/runs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of runs belonging to a thread.", notes = "", response = ListRunsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListRunsResponse.class)
    })
    public Response listRuns(@PathParam("thread_id") @ApiParam("The ID of the thread the run belongs to.") String threadId,@QueryParam("limit") @DefaultValue("20")  @ApiParam("A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ")  Integer limit,@QueryParam("order") @DefaultValue("desc")  @ApiParam("Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ")  String order,@QueryParam("after")  @ApiParam("A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ")  String after,@QueryParam("before")  @ApiParam("A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ")  String before) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{thread_id}/messages/{message_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a message.", notes = "", response = MessageObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageObject.class)
    })
    public Response modifyMessage(@PathParam("thread_id") @ApiParam("The ID of the thread to which this message belongs.") String threadId,@PathParam("message_id") @ApiParam("The ID of the message to modify.") String messageId,@Valid @NotNull ModifyMessageRequest modifyMessageRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{thread_id}/runs/{run_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a run.", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response modifyRun(@PathParam("thread_id") @ApiParam("The ID of the [thread](/docs/api-reference/threads) that was run.") String threadId,@PathParam("run_id") @ApiParam("The ID of the run to modify.") String runId,@Valid @NotNull ModifyRunRequest modifyRunRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{thread_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a thread.", notes = "", response = ThreadObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ThreadObject.class)
    })
    public Response modifyThread(@PathParam("thread_id") @ApiParam("The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.") String threadId,@Valid @NotNull ModifyThreadRequest modifyThreadRequest) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{thread_id}/runs/{run_id}/submit_tool_outputs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. ", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class)
    })
    public Response submitToolOuputsToRun(@PathParam("thread_id") @ApiParam("The ID of the [thread](/docs/api-reference/threads) to which this run belongs.") String threadId,@PathParam("run_id") @ApiParam("The ID of the run that requires the tool output submission.") String runId,@Valid @NotNull SubmitToolOutputsRunRequest submitToolOutputsRunRequest) {
        return Response.ok().entity("magic!").build();
    }
}
