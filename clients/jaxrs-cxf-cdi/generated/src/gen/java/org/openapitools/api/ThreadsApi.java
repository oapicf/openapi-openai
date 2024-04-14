package org.openapitools.api;

import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateRunRequest;
import org.openapitools.model.CreateThreadAndRunRequest;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.DeleteThreadResponse;
import org.openapitools.model.ListMessageFilesResponse;
import org.openapitools.model.ListMessagesResponse;
import org.openapitools.model.ListRunStepsResponse;
import org.openapitools.model.ListRunsResponse;
import org.openapitools.model.MessageFileObject;
import org.openapitools.model.MessageObject;
import org.openapitools.model.ModifyMessageRequest;
import org.openapitools.model.ModifyRunRequest;
import org.openapitools.model.ModifyThreadRequest;
import org.openapitools.model.RunObject;
import org.openapitools.model.RunStepObject;
import org.openapitools.model.SubmitToolOutputsRunRequest;
import org.openapitools.model.ThreadObject;
import org.openapitools.api.ThreadsApiService;

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
@Path("/threads")
@RequestScoped

@Api(description = "the threads API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-04-14T13:41:22.441879330Z[Etc/UTC]", comments = "Generator version: 7.4.0")

public class ThreadsApi  {

  @Context SecurityContext securityContext;

  @Inject ThreadsApiService delegate;


    @POST
    @Path("/{thread_id}/runs/{run_id}/cancel")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancels a run that is `in_progress`.", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response cancelRun(@ApiParam(value = "The ID of the thread to which this run belongs.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "The ID of the run to cancel.",required=true) @PathParam("run_id") String runId) {
        return delegate.cancelRun(threadId, runId, securityContext);
    }

    @POST
    @Path("/{thread_id}/messages")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a message.", notes = "", response = MessageObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageObject.class) })
    public Response createMessage(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to create a message for.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "" ,required=true) CreateMessageRequest createMessageRequest) {
        return delegate.createMessage(threadId, createMessageRequest, securityContext);
    }

    @POST
    @Path("/{thread_id}/runs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a run.", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response createRun(@ApiParam(value = "The ID of the thread to run.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "" ,required=true) CreateRunRequest createRunRequest) {
        return delegate.createRun(threadId, createRunRequest, securityContext);
    }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a thread.", notes = "", response = ThreadObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public Response createThread(@ApiParam(value = "" ) CreateThreadRequest createThreadRequest) {
        return delegate.createThread(createThreadRequest, securityContext);
    }

    @POST
    @Path("/runs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a thread and run it in one request.", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response createThreadAndRun(@ApiParam(value = "" ,required=true) CreateThreadAndRunRequest createThreadAndRunRequest) {
        return delegate.createThreadAndRun(createThreadAndRunRequest, securityContext);
    }

    @DELETE
    @Path("/{thread_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a thread.", notes = "", response = DeleteThreadResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteThreadResponse.class) })
    public Response deleteThread(@ApiParam(value = "The ID of the thread to delete.",required=true) @PathParam("thread_id") String threadId) {
        return delegate.deleteThread(threadId, securityContext);
    }

    @GET
    @Path("/{thread_id}/messages/{message_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a message.", notes = "", response = MessageObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageObject.class) })
    public Response getMessage(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to which this message belongs.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "The ID of the message to retrieve.",required=true) @PathParam("message_id") String messageId) {
        return delegate.getMessage(threadId, messageId, securityContext);
    }

    @GET
    @Path("/{thread_id}/messages/{message_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a message file.", notes = "", response = MessageFileObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageFileObject.class) })
    public Response getMessageFile(@ApiParam(value = "The ID of the thread to which the message and File belong.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "The ID of the message the file belongs to.",required=true) @PathParam("message_id") String messageId, @ApiParam(value = "The ID of the file being retrieved.",required=true) @PathParam("file_id") String fileId) {
        return delegate.getMessageFile(threadId, messageId, fileId, securityContext);
    }

    @GET
    @Path("/{thread_id}/runs/{run_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a run.", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response getRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) that was run.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "The ID of the run to retrieve.",required=true) @PathParam("run_id") String runId) {
        return delegate.getRun(threadId, runId, securityContext);
    }

    @GET
    @Path("/{thread_id}/runs/{run_id}/steps/{step_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a run step.", notes = "", response = RunStepObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunStepObject.class) })
    public Response getRunStep(@ApiParam(value = "The ID of the thread to which the run and run step belongs.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "The ID of the run to which the run step belongs.",required=true) @PathParam("run_id") String runId, @ApiParam(value = "The ID of the run step to retrieve.",required=true) @PathParam("step_id") String stepId) {
        return delegate.getRunStep(threadId, runId, stepId, securityContext);
    }

    @GET
    @Path("/{thread_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a thread.", notes = "", response = ThreadObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public Response getThread(@ApiParam(value = "The ID of the thread to retrieve.",required=true) @PathParam("thread_id") String threadId) {
        return delegate.getThread(threadId, securityContext);
    }

    @GET
    @Path("/{thread_id}/messages/{message_id}/files")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of message files.", notes = "", response = ListMessageFilesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListMessageFilesResponse.class) })
    public Response listMessageFiles(@ApiParam(value = "The ID of the thread that the message and files belong to.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "The ID of the message that the files belongs to.",required=true) @PathParam("message_id") String messageId, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc")  @QueryParam("order") String order, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @QueryParam("before") String before) {
        return delegate.listMessageFiles(threadId, messageId, limit, order, after, before, securityContext);
    }

    @GET
    @Path("/{thread_id}/messages")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of messages for a given thread.", notes = "", response = ListMessagesResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListMessagesResponse.class) })
    public Response listMessages(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) the messages belong to.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc")  @QueryParam("order") String order, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @QueryParam("before") String before, @ApiParam(value = "Filter messages by the run ID that generated them. ")  @QueryParam("run_id") String runId) {
        return delegate.listMessages(threadId, limit, order, after, before, runId, securityContext);
    }

    @GET
    @Path("/{thread_id}/runs/{run_id}/steps")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of run steps belonging to a run.", notes = "", response = ListRunStepsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListRunStepsResponse.class) })
    public Response listRunSteps(@ApiParam(value = "The ID of the thread the run and run steps belong to.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "The ID of the run the run steps belong to.",required=true) @PathParam("run_id") String runId, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc")  @QueryParam("order") String order, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @QueryParam("before") String before) {
        return delegate.listRunSteps(threadId, runId, limit, order, after, before, securityContext);
    }

    @GET
    @Path("/{thread_id}/runs")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of runs belonging to a thread.", notes = "", response = ListRunsResponse.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListRunsResponse.class) })
    public Response listRuns(@ApiParam(value = "The ID of the thread the run belongs to.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue="20") @DefaultValue("20")  @QueryParam("limit") Integer limit, @ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue="desc") @DefaultValue("desc")  @QueryParam("order") String order, @ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ")  @QueryParam("after") String after, @ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ")  @QueryParam("before") String before) {
        return delegate.listRuns(threadId, limit, order, after, before, securityContext);
    }

    @POST
    @Path("/{thread_id}/messages/{message_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a message.", notes = "", response = MessageObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageObject.class) })
    public Response modifyMessage(@ApiParam(value = "The ID of the thread to which this message belongs.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "The ID of the message to modify.",required=true) @PathParam("message_id") String messageId, @ApiParam(value = "" ,required=true) ModifyMessageRequest modifyMessageRequest) {
        return delegate.modifyMessage(threadId, messageId, modifyMessageRequest, securityContext);
    }

    @POST
    @Path("/{thread_id}/runs/{run_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a run.", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response modifyRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) that was run.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "The ID of the run to modify.",required=true) @PathParam("run_id") String runId, @ApiParam(value = "" ,required=true) ModifyRunRequest modifyRunRequest) {
        return delegate.modifyRun(threadId, runId, modifyRunRequest, securityContext);
    }

    @POST
    @Path("/{thread_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a thread.", notes = "", response = ThreadObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public Response modifyThread(@ApiParam(value = "The ID of the thread to modify. Only the `metadata` can be modified.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "" ,required=true) ModifyThreadRequest modifyThreadRequest) {
        return delegate.modifyThread(threadId, modifyThreadRequest, securityContext);
    }

    @POST
    @Path("/{thread_id}/runs/{run_id}/submit_tool_outputs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. ", notes = "", response = RunObject.class, authorizations = {
        
        @Authorization(value = "ApiKeyAuth")
         }, tags={ "Assistants" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response submitToolOuputsToRun(@ApiParam(value = "The ID of the [thread](/docs/api-reference/threads) to which this run belongs.",required=true) @PathParam("thread_id") String threadId, @ApiParam(value = "The ID of the run that requires the tool output submission.",required=true) @PathParam("run_id") String runId, @ApiParam(value = "" ,required=true) SubmitToolOutputsRunRequest submitToolOutputsRunRequest) {
        return delegate.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest, securityContext);
    }
}
