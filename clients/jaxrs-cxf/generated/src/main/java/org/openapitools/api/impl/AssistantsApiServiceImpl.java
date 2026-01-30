package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AssistantObject;
import org.openapitools.model.CreateAssistantRequest;
import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateRunRequest;
import org.openapitools.model.CreateThreadAndRunRequest;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.DeleteAssistantResponse;
import org.openapitools.model.DeleteMessageResponse;
import org.openapitools.model.DeleteThreadResponse;
import org.openapitools.model.ListAssistantsResponse;
import org.openapitools.model.ListMessagesResponse;
import org.openapitools.model.ListRunStepsResponse;
import org.openapitools.model.ListRunsResponse;
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
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class AssistantsApiServiceImpl implements AssistantsApi {
    /**
     * Cancels a run that is &#x60;in_progress&#x60;.
     *
     */
    public RunObject cancelRun(String threadId, String runId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create an assistant with a model and instructions.
     *
     */
    public AssistantObject createAssistant(CreateAssistantRequest createAssistantRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create a message.
     *
     */
    public MessageObject createMessage(String threadId, CreateMessageRequest createMessageRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create a run.
     *
     */
    public RunObject createRun(String threadId, CreateRunRequest createRunRequest, List<String> include) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create a thread.
     *
     */
    public ThreadObject createThread(CreateThreadRequest createThreadRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create a thread and run it in one request.
     *
     */
    public RunObject createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete an assistant.
     *
     */
    public DeleteAssistantResponse deleteAssistant(String assistantId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Deletes a message.
     *
     */
    public DeleteMessageResponse deleteMessage(String threadId, String messageId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete a thread.
     *
     */
    public DeleteThreadResponse deleteThread(String threadId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieves an assistant.
     *
     */
    public AssistantObject getAssistant(String assistantId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieve a message.
     *
     */
    public MessageObject getMessage(String threadId, String messageId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieves a run.
     *
     */
    public RunObject getRun(String threadId, String runId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieves a run step.
     *
     */
    public RunStepObject getRunStep(String threadId, String runId, String stepId, List<String> include) {
        // TODO: Implement...

        return null;
    }

    /**
     * Retrieves a thread.
     *
     */
    public ThreadObject getThread(String threadId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns a list of assistants.
     *
     */
    public ListAssistantsResponse listAssistants(Integer limit, String order, String after, String before) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns a list of messages for a given thread.
     *
     */
    public ListMessagesResponse listMessages(String threadId, Integer limit, String order, String after, String before, String runId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns a list of run steps belonging to a run.
     *
     */
    public ListRunStepsResponse listRunSteps(String threadId, String runId, Integer limit, String order, String after, String before, List<String> include) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns a list of runs belonging to a thread.
     *
     */
    public ListRunsResponse listRuns(String threadId, Integer limit, String order, String after, String before) {
        // TODO: Implement...

        return null;
    }

    /**
     * Modifies an assistant.
     *
     */
    public AssistantObject modifyAssistant(String assistantId, ModifyAssistantRequest modifyAssistantRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Modifies a message.
     *
     */
    public MessageObject modifyMessage(String threadId, String messageId, ModifyMessageRequest modifyMessageRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Modifies a run.
     *
     */
    public RunObject modifyRun(String threadId, String runId, ModifyRunRequest modifyRunRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Modifies a thread.
     *
     */
    public ThreadObject modifyThread(String threadId, ModifyThreadRequest modifyThreadRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
     *
     */
    public RunObject submitToolOuputsToRun(String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest) {
        // TODO: Implement...

        return null;
    }

}
