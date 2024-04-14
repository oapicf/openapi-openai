package org.openapitools.api;

import org.openapitools.model.AssistantFileObject;
import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantFileRequest;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateRunRequest;
import org.openapitools.model.CreateThreadAndRunRequest;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.DeleteAssistantFileResponse;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.DeleteThreadResponse;
import org.openapitools.model.ListAssistantFilesResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ListMessageFilesResponse;
import org.openapitools.model.ListMessagesResponse;
import org.openapitools.model.ListRunStepsResponse;
import org.openapitools.model.ListRunsResponse;
import org.openapitools.model.MessageFileObject;
import org.openapitools.model.MessageObject;
import org.openapitools.model.ModifyAssistantRequest;
import org.openapitools.model.ModifyMessageRequest;
import org.openapitools.model.ModifyRunRequest;
import org.openapitools.model.ModifyThreadRequest;
import org.openapitools.model.RunObject;
import org.openapitools.model.RunStepObject;
import org.openapitools.model.SubmitToolOutputsRunRequest;
import org.openapitools.model.ThreadObject;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface AssistantsApi  {

    /**
     * Cancels a run that is &#x60;in_progress&#x60;.
     *
     */
    @POST
    @Path("/threads/{thread_id}/runs/{run_id}/cancel")
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancels a run that is `in_progress`.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public RunObject cancelRun(@PathParam("thread_id") String threadId, @PathParam("run_id") String runId);

    /**
     * Create an assistant with a model and instructions.
     *
     */
    @POST
    @Path("/assistants")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an assistant with a model and instructions.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public AssistantObject createAssistant(CreateAssistantRequest createAssistantRequest);

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     *
     */
    @POST
    @Path("/assistants/{assistant_id}/files")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantFileObject.class) })
    public AssistantFileObject createAssistantFile(@PathParam("assistant_id") String assistantId, CreateAssistantFileRequest createAssistantFileRequest);

    /**
     * Create a message.
     *
     */
    @POST
    @Path("/threads/{thread_id}/messages")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a message.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageObject.class) })
    public MessageObject createMessage(@PathParam("thread_id") String threadId, CreateMessageRequest createMessageRequest);

    /**
     * Create a run.
     *
     */
    @POST
    @Path("/threads/{thread_id}/runs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a run.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public RunObject createRun(@PathParam("thread_id") String threadId, CreateRunRequest createRunRequest);

    /**
     * Create a thread.
     *
     */
    @POST
    @Path("/threads")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a thread.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public ThreadObject createThread(CreateThreadRequest createThreadRequest);

    /**
     * Create a thread and run it in one request.
     *
     */
    @POST
    @Path("/threads/runs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a thread and run it in one request.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public RunObject createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest);

    /**
     * Delete an assistant.
     *
     */
    @DELETE
    @Path("/assistants/{assistant_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an assistant.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteAssistantResponse.class) })
    public DeleteAssistantResponse deleteAssistant(@PathParam("assistant_id") String assistantId);

    /**
     * Delete an assistant file.
     *
     */
    @DELETE
    @Path("/assistants/{assistant_id}/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete an assistant file.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteAssistantFileResponse.class) })
    public DeleteAssistantFileResponse deleteAssistantFile(@PathParam("assistant_id") String assistantId, @PathParam("file_id") String fileId);

    /**
     * Delete a thread.
     *
     */
    @DELETE
    @Path("/threads/{thread_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete a thread.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DeleteThreadResponse.class) })
    public DeleteThreadResponse deleteThread(@PathParam("thread_id") String threadId);

    /**
     * Retrieves an assistant.
     *
     */
    @GET
    @Path("/assistants/{assistant_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an assistant.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public AssistantObject getAssistant(@PathParam("assistant_id") String assistantId);

    /**
     * Retrieves an AssistantFile.
     *
     */
    @GET
    @Path("/assistants/{assistant_id}/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves an AssistantFile.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantFileObject.class) })
    public AssistantFileObject getAssistantFile(@PathParam("assistant_id") String assistantId, @PathParam("file_id") String fileId);

    /**
     * Retrieve a message.
     *
     */
    @GET
    @Path("/threads/{thread_id}/messages/{message_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve a message.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageObject.class) })
    public MessageObject getMessage(@PathParam("thread_id") String threadId, @PathParam("message_id") String messageId);

    /**
     * Retrieves a message file.
     *
     */
    @GET
    @Path("/threads/{thread_id}/messages/{message_id}/files/{file_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a message file.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageFileObject.class) })
    public MessageFileObject getMessageFile(@PathParam("thread_id") String threadId, @PathParam("message_id") String messageId, @PathParam("file_id") String fileId);

    /**
     * Retrieves a run.
     *
     */
    @GET
    @Path("/threads/{thread_id}/runs/{run_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a run.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public RunObject getRun(@PathParam("thread_id") String threadId, @PathParam("run_id") String runId);

    /**
     * Retrieves a run step.
     *
     */
    @GET
    @Path("/threads/{thread_id}/runs/{run_id}/steps/{step_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a run step.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunStepObject.class) })
    public RunStepObject getRunStep(@PathParam("thread_id") String threadId, @PathParam("run_id") String runId, @PathParam("step_id") String stepId);

    /**
     * Retrieves a thread.
     *
     */
    @GET
    @Path("/threads/{thread_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieves a thread.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public ThreadObject getThread(@PathParam("thread_id") String threadId);

    /**
     * Returns a list of assistant files.
     *
     */
    @GET
    @Path("/assistants/{assistant_id}/files")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of assistant files.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListAssistantFilesResponse.class) })
    public ListAssistantFilesResponse listAssistantFiles(@PathParam("assistant_id") String assistantId, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("order") @DefaultValue("desc")String order, @QueryParam("after") String after, @QueryParam("before") String before);

    /**
     * Returns a list of assistants.
     *
     */
    @GET
    @Path("/assistants")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of assistants.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListAssistantsResponse.class) })
    public ListAssistantsResponse listAssistants(@QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("order") @DefaultValue("desc")String order, @QueryParam("after") String after, @QueryParam("before") String before);

    /**
     * Returns a list of message files.
     *
     */
    @GET
    @Path("/threads/{thread_id}/messages/{message_id}/files")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of message files.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListMessageFilesResponse.class) })
    public ListMessageFilesResponse listMessageFiles(@PathParam("thread_id") String threadId, @PathParam("message_id") String messageId, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("order") @DefaultValue("desc")String order, @QueryParam("after") String after, @QueryParam("before") String before);

    /**
     * Returns a list of messages for a given thread.
     *
     */
    @GET
    @Path("/threads/{thread_id}/messages")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of messages for a given thread.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListMessagesResponse.class) })
    public ListMessagesResponse listMessages(@PathParam("thread_id") String threadId, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("order") @DefaultValue("desc")String order, @QueryParam("after") String after, @QueryParam("before") String before, @QueryParam("run_id") String runId);

    /**
     * Returns a list of run steps belonging to a run.
     *
     */
    @GET
    @Path("/threads/{thread_id}/runs/{run_id}/steps")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of run steps belonging to a run.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListRunStepsResponse.class) })
    public ListRunStepsResponse listRunSteps(@PathParam("thread_id") String threadId, @PathParam("run_id") String runId, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("order") @DefaultValue("desc")String order, @QueryParam("after") String after, @QueryParam("before") String before);

    /**
     * Returns a list of runs belonging to a thread.
     *
     */
    @GET
    @Path("/threads/{thread_id}/runs")
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns a list of runs belonging to a thread.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListRunsResponse.class) })
    public ListRunsResponse listRuns(@PathParam("thread_id") String threadId, @QueryParam("limit") @DefaultValue("20")Integer limit, @QueryParam("order") @DefaultValue("desc")String order, @QueryParam("after") String after, @QueryParam("before") String before);

    /**
     * Modifies an assistant.
     *
     */
    @POST
    @Path("/assistants/{assistant_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies an assistant.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AssistantObject.class) })
    public AssistantObject modifyAssistant(@PathParam("assistant_id") String assistantId, ModifyAssistantRequest modifyAssistantRequest);

    /**
     * Modifies a message.
     *
     */
    @POST
    @Path("/threads/{thread_id}/messages/{message_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a message.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MessageObject.class) })
    public MessageObject modifyMessage(@PathParam("thread_id") String threadId, @PathParam("message_id") String messageId, ModifyMessageRequest modifyMessageRequest);

    /**
     * Modifies a run.
     *
     */
    @POST
    @Path("/threads/{thread_id}/runs/{run_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a run.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public RunObject modifyRun(@PathParam("thread_id") String threadId, @PathParam("run_id") String runId, ModifyRunRequest modifyRunRequest);

    /**
     * Modifies a thread.
     *
     */
    @POST
    @Path("/threads/{thread_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Modifies a thread.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ThreadObject.class) })
    public ThreadObject modifyThread(@PathParam("thread_id") String threadId, ModifyThreadRequest modifyThreadRequest);

    /**
     * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
     *
     */
    @POST
    @Path("/threads/{thread_id}/runs/{run_id}/submit_tool_outputs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. ", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RunObject.class) })
    public RunObject submitToolOuputsToRun(@PathParam("thread_id") String threadId, @PathParam("run_id") String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest);
}
