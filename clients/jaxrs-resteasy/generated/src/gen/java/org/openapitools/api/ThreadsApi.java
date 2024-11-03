package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ThreadsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/threads")


@io.swagger.annotations.Api(description = "the threads API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-03T11:08:49.636855747Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ThreadsApi  {

    @Inject ThreadsApiService service;

    @POST
    @Path("/{thread_id}/runs/{run_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancels a run that is `in_progress`.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response cancelRun( @PathParam("thread_id") String threadId, @PathParam("run_id") String runId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.cancelRun(threadId,runId,securityContext);
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
    public Response createMessage( @PathParam("thread_id") String threadId,@ApiParam(value = "" ,required=true) @NotNull @Valid CreateMessageRequest createMessageRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createMessage(threadId,createMessageRequest,securityContext);
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
    public Response createRun( @PathParam("thread_id") String threadId,@ApiParam(value = "" ,required=true) @NotNull @Valid CreateRunRequest createRunRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createRun(threadId,createRunRequest,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a thread.", notes = "", response = ThreadObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public Response createThread(@ApiParam(value = "" ) @Valid CreateThreadRequest createThreadRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createThread(createThreadRequest,securityContext);
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
    public Response createThreadAndRun(@ApiParam(value = "" ,required=true) @NotNull @Valid CreateThreadAndRunRequest createThreadAndRunRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.createThreadAndRun(createThreadAndRunRequest,securityContext);
    }
    @DELETE
    @Path("/{thread_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a thread.", notes = "", response = DeleteThreadResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteThreadResponse.class) })
    public Response deleteThread( @PathParam("thread_id") String threadId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteThread(threadId,securityContext);
    }
    @GET
    @Path("/{thread_id}/messages/{message_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieve a message.", notes = "", response = MessageObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MessageObject.class) })
    public Response getMessage( @PathParam("thread_id") String threadId, @PathParam("message_id") String messageId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMessage(threadId,messageId,securityContext);
    }
    @GET
    @Path("/{thread_id}/messages/{message_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a message file.", notes = "", response = MessageFileObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = MessageFileObject.class) })
    public Response getMessageFile( @PathParam("thread_id") String threadId, @PathParam("message_id") String messageId, @PathParam("file_id") String fileId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getMessageFile(threadId,messageId,fileId,securityContext);
    }
    @GET
    @Path("/{thread_id}/runs/{run_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a run.", notes = "", response = RunObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public Response getRun( @PathParam("thread_id") String threadId, @PathParam("run_id") String runId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRun(threadId,runId,securityContext);
    }
    @GET
    @Path("/{thread_id}/runs/{run_id}/steps/{step_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a run step.", notes = "", response = RunStepObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = RunStepObject.class) })
    public Response getRunStep( @PathParam("thread_id") String threadId, @PathParam("run_id") String runId, @PathParam("step_id") String stepId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getRunStep(threadId,runId,stepId,securityContext);
    }
    @GET
    @Path("/{thread_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a thread.", notes = "", response = ThreadObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public Response getThread( @PathParam("thread_id") String threadId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getThread(threadId,securityContext);
    }
    @GET
    @Path("/{thread_id}/messages/{message_id}/files")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of message files.", notes = "", response = ListMessageFilesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListMessageFilesResponse.class) })
    public Response listMessageFiles( @PathParam("thread_id") String threadId, @PathParam("message_id") String messageId, @DefaultValue("20") @QueryParam("limit") Integer limit,, allowableValues="asc, desc" @DefaultValue("desc") @QueryParam("order") String order, @QueryParam("after") String after, @QueryParam("before") String before,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listMessageFiles(threadId,messageId,limit,order,after,before,securityContext);
    }
    @GET
    @Path("/{thread_id}/messages")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of messages for a given thread.", notes = "", response = ListMessagesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListMessagesResponse.class) })
    public Response listMessages( @PathParam("thread_id") String threadId, @DefaultValue("20") @QueryParam("limit") Integer limit,, allowableValues="asc, desc" @DefaultValue("desc") @QueryParam("order") String order, @QueryParam("after") String after, @QueryParam("before") String before, @QueryParam("run_id") String runId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listMessages(threadId,limit,order,after,before,runId,securityContext);
    }
    @GET
    @Path("/{thread_id}/runs/{run_id}/steps")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of run steps belonging to a run.", notes = "", response = ListRunStepsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListRunStepsResponse.class) })
    public Response listRunSteps( @PathParam("thread_id") String threadId, @PathParam("run_id") String runId, @DefaultValue("20") @QueryParam("limit") Integer limit,, allowableValues="asc, desc" @DefaultValue("desc") @QueryParam("order") String order, @QueryParam("after") String after, @QueryParam("before") String before,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listRunSteps(threadId,runId,limit,order,after,before,securityContext);
    }
    @GET
    @Path("/{thread_id}/runs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of runs belonging to a thread.", notes = "", response = ListRunsResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Assistants", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListRunsResponse.class) })
    public Response listRuns( @PathParam("thread_id") String threadId, @DefaultValue("20") @QueryParam("limit") Integer limit,, allowableValues="asc, desc" @DefaultValue("desc") @QueryParam("order") String order, @QueryParam("after") String after, @QueryParam("before") String before,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listRuns(threadId,limit,order,after,before,securityContext);
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
    public Response modifyMessage( @PathParam("thread_id") String threadId, @PathParam("message_id") String messageId,@ApiParam(value = "" ,required=true) @NotNull @Valid ModifyMessageRequest modifyMessageRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.modifyMessage(threadId,messageId,modifyMessageRequest,securityContext);
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
    public Response modifyRun( @PathParam("thread_id") String threadId, @PathParam("run_id") String runId,@ApiParam(value = "" ,required=true) @NotNull @Valid ModifyRunRequest modifyRunRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.modifyRun(threadId,runId,modifyRunRequest,securityContext);
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
    public Response modifyThread( @PathParam("thread_id") String threadId,@ApiParam(value = "" ,required=true) @NotNull @Valid ModifyThreadRequest modifyThreadRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.modifyThread(threadId,modifyThreadRequest,securityContext);
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
    public Response submitToolOuputsToRun( @PathParam("thread_id") String threadId, @PathParam("run_id") String runId,@ApiParam(value = "" ,required=true) @NotNull @Valid SubmitToolOutputsRunRequest submitToolOutputsRunRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.submitToolOuputsToRun(threadId,runId,submitToolOutputsRunRequest,securityContext);
    }
}
