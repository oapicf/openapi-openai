package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ThreadsApiService;
import org.openapitools.api.factories.ThreadsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateRunRequest;
import org.openapitools.model.CreateThreadAndRunRequest;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.DeleteMessageResponse;
import org.openapitools.model.DeleteThreadResponse;
import java.util.List;
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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/threads")


@io.swagger.annotations.Api(description = "the threads API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ThreadsApi  {
   private final ThreadsApiService delegate = ThreadsApiServiceFactory.getThreadsApi();

    @POST
    @Path("/{thread_id}/runs/{run_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancels a run that is `in_progress`.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response cancelRun(@ApiParam(value = "The ID of the thread to which this run belongs.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "The ID of the run to cancel.",required=true) @PathParam("run_id") String runId
)
    throws NotFoundException {
        return delegate.cancelRun(threadId,runId);
    }
    @POST
    @Path("/{thread_id}/messages")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a message.", notes = "", response = MessageObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MessageObject.class) })
    public Response createMessage(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to create a message for.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "" ,required=true) CreateMessageRequest createMessageRequest
)
    throws NotFoundException {
        return delegate.createMessage(threadId,createMessageRequest);
    }
    @POST
    @Path("/{thread_id}/runs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a run.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response createRun(@ApiParam(value = "The ID of the thread to run.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "" ,required=true) CreateRunRequest createRunRequest
,@ApiParam(value = "A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ", allowableValues="step_details.tool_calls[*].file_search.results[*].content") @QueryParam("include[]") List<String> include
)
    throws NotFoundException {
        return delegate.createRun(threadId,createRunRequest,include);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a thread.", notes = "", response = ThreadObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public Response createThread(@ApiParam(value = "" ) CreateThreadRequest createThreadRequest
)
    throws NotFoundException {
        return delegate.createThread(createThreadRequest);
    }
    @POST
    @Path("/runs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a thread and run it in one request.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response createThreadAndRun(@ApiParam(value = "" ,required=true) CreateThreadAndRunRequest createThreadAndRunRequest
)
    throws NotFoundException {
        return delegate.createThreadAndRun(createThreadAndRunRequest);
    }
    @DELETE
    @Path("/{thread_id}/messages/{message_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Deletes a message.", notes = "", response = DeleteMessageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteMessageResponse.class) })
    public Response deleteMessage(@ApiParam(value = "The ID of the thread to which this message belongs.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "The ID of the message to delete.",required=true) @PathParam("message_id") String messageId
)
    throws NotFoundException {
        return delegate.deleteMessage(threadId,messageId);
    }
    @DELETE
    @Path("/{thread_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a thread.", notes = "", response = DeleteThreadResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteThreadResponse.class) })
    public Response deleteThread(@ApiParam(value = "The ID of the thread to delete.",required=true) @PathParam("thread_id") String threadId
)
    throws NotFoundException {
        return delegate.deleteThread(threadId);
    }
    @GET
    @Path("/{thread_id}/messages/{message_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve a message.", notes = "", response = MessageObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MessageObject.class) })
    public Response getMessage(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to which this message belongs.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "The ID of the message to retrieve.",required=true) @PathParam("message_id") String messageId
)
    throws NotFoundException {
        return delegate.getMessage(threadId,messageId);
    }
    @GET
    @Path("/{thread_id}/runs/{run_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a run.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response getRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) that was run.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "The ID of the run to retrieve.",required=true) @PathParam("run_id") String runId
)
    throws NotFoundException {
        return delegate.getRun(threadId,runId);
    }
    @GET
    @Path("/{thread_id}/runs/{run_id}/steps/{step_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a run step.", notes = "", response = RunStepObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunStepObject.class) })
    public Response getRunStep(@ApiParam(value = "The ID of the thread to which the run and run step belongs.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "The ID of the run to which the run step belongs.",required=true) @PathParam("run_id") String runId
,@ApiParam(value = "The ID of the run step to retrieve.",required=true) @PathParam("step_id") String stepId
,@ApiParam(value = "A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ", allowableValues="step_details.tool_calls[*].file_search.results[*].content") @QueryParam("include[]") List<String> include
)
    throws NotFoundException {
        return delegate.getRunStep(threadId,runId,stepId,include);
    }
    @GET
    @Path("/{thread_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a thread.", notes = "", response = ThreadObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public Response getThread(@ApiParam(value = "The ID of the thread to retrieve.",required=true) @PathParam("thread_id") String threadId
)
    throws NotFoundException {
        return delegate.getThread(threadId);
    }
    @GET
    @Path("/{thread_id}/messages")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of messages for a given thread.", notes = "", response = ListMessagesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListMessagesResponse.class) })
    public Response listMessages(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) the messages belong to.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20") @QueryParam("limit") Integer limit
,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc") @QueryParam("order") String order
,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after") String after
,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before") String before
,@ApiParam(value = "Filter messages by the run ID that generated them. ") @QueryParam("run_id") String runId
)
    throws NotFoundException {
        return delegate.listMessages(threadId,limit,order,after,before,runId);
    }
    @GET
    @Path("/{thread_id}/runs/{run_id}/steps")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of run steps belonging to a run.", notes = "", response = ListRunStepsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListRunStepsResponse.class) })
    public Response listRunSteps(@ApiParam(value = "The ID of the thread the run and run steps belong to.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "The ID of the run the run steps belong to.",required=true) @PathParam("run_id") String runId
,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20") @QueryParam("limit") Integer limit
,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc") @QueryParam("order") String order
,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after") String after
,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before") String before
,@ApiParam(value = "A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ", allowableValues="step_details.tool_calls[*].file_search.results[*].content") @QueryParam("include[]") List<String> include
)
    throws NotFoundException {
        return delegate.listRunSteps(threadId,runId,limit,order,after,before,include);
    }
    @GET
    @Path("/{thread_id}/runs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of runs belonging to a thread.", notes = "", response = ListRunsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListRunsResponse.class) })
    public Response listRuns(@ApiParam(value = "The ID of the thread the run belongs to.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20") @QueryParam("limit") Integer limit
,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc") @QueryParam("order") String order
,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after") String after
,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before") String before
)
    throws NotFoundException {
        return delegate.listRuns(threadId,limit,order,after,before);
    }
    @POST
    @Path("/{thread_id}/messages/{message_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a message.", notes = "", response = MessageObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MessageObject.class) })
    public Response modifyMessage(@ApiParam(value = "The ID of the thread to which this message belongs.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "The ID of the message to modify.",required=true) @PathParam("message_id") String messageId
,@ApiParam(value = "" ,required=true) ModifyMessageRequest modifyMessageRequest
)
    throws NotFoundException {
        return delegate.modifyMessage(threadId,messageId,modifyMessageRequest);
    }
    @POST
    @Path("/{thread_id}/runs/{run_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a run.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response modifyRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) that was run.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "The ID of the run to modify.",required=true) @PathParam("run_id") String runId
,@ApiParam(value = "" ,required=true) ModifyRunRequest modifyRunRequest
)
    throws NotFoundException {
        return delegate.modifyRun(threadId,runId,modifyRunRequest);
    }
    @POST
    @Path("/{thread_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a thread.", notes = "", response = ThreadObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public Response modifyThread(@ApiParam(value = "The ID of the thread to modify. Only the `metadata` can be modified.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "" ,required=true) ModifyThreadRequest modifyThreadRequest
)
    throws NotFoundException {
        return delegate.modifyThread(threadId,modifyThreadRequest);
    }
    @POST
    @Path("/{thread_id}/runs/{run_id}/submit_tool_outputs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. ", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response submitToolOuputsToRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to which this run belongs.",required=true) @PathParam("thread_id") String threadId
,@ApiParam(value = "The ID of the run that requires the tool output submission.",required=true) @PathParam("run_id") String runId
,@ApiParam(value = "" ,required=true) SubmitToolOutputsRunRequest submitToolOutputsRunRequest
)
    throws NotFoundException {
        return delegate.submitToolOuputsToRun(threadId,runId,submitToolOutputsRunRequest);
    }
}
