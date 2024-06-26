/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.openapiopenai.api;

import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.model.AssistantFileObject;
import com.github.oapicf.openapiopenai.model.AssistantObject;
import com.github.oapicf.openapiopenai.model.CreateAssistantFileRequest;
import com.github.oapicf.openapiopenai.model.CreateAssistantRequest;
import com.github.oapicf.openapiopenai.model.CreateMessageRequest;
import com.github.oapicf.openapiopenai.model.CreateRunRequest;
import com.github.oapicf.openapiopenai.model.CreateThreadAndRunRequest;
import com.github.oapicf.openapiopenai.model.CreateThreadRequest;
import com.github.oapicf.openapiopenai.model.DeleteAssistantFileResponse;
import com.github.oapicf.openapiopenai.model.DeleteAssistantResponse;
import com.github.oapicf.openapiopenai.model.DeleteThreadResponse;
import com.github.oapicf.openapiopenai.model.ListAssistantFilesResponse;
import com.github.oapicf.openapiopenai.model.ListAssistantsResponse;
import com.github.oapicf.openapiopenai.model.ListMessageFilesResponse;
import com.github.oapicf.openapiopenai.model.ListMessagesResponse;
import com.github.oapicf.openapiopenai.model.ListRunStepsResponse;
import com.github.oapicf.openapiopenai.model.ListRunsResponse;
import com.github.oapicf.openapiopenai.model.MessageFileObject;
import com.github.oapicf.openapiopenai.model.MessageObject;
import com.github.oapicf.openapiopenai.model.ModifyAssistantRequest;
import com.github.oapicf.openapiopenai.model.ModifyMessageRequest;
import com.github.oapicf.openapiopenai.model.ModifyRunRequest;
import com.github.oapicf.openapiopenai.model.ModifyThreadRequest;
import com.github.oapicf.openapiopenai.model.RunObject;
import com.github.oapicf.openapiopenai.model.RunStepObject;
import com.github.oapicf.openapiopenai.model.SubmitToolOutputsRunRequest;
import com.github.oapicf.openapiopenai.model.ThreadObject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssistantsApi
 */
@Disabled
public class AssistantsApiTest {

    private final AssistantsApi api = new AssistantsApi();

    /**
     * Cancels a run that is &#x60;in_progress&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelRunTest() throws ApiException {
        String threadId = null;
        String runId = null;
        RunObject response = api.cancelRun(threadId, runId);
        // TODO: test validations
    }

    /**
     * Create an assistant with a model and instructions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAssistantTest() throws ApiException {
        CreateAssistantRequest createAssistantRequest = null;
        AssistantObject response = api.createAssistant(createAssistantRequest);
        // TODO: test validations
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAssistantFileTest() throws ApiException {
        String assistantId = null;
        CreateAssistantFileRequest createAssistantFileRequest = null;
        AssistantFileObject response = api.createAssistantFile(assistantId, createAssistantFileRequest);
        // TODO: test validations
    }

    /**
     * Create a message.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMessageTest() throws ApiException {
        String threadId = null;
        CreateMessageRequest createMessageRequest = null;
        MessageObject response = api.createMessage(threadId, createMessageRequest);
        // TODO: test validations
    }

    /**
     * Create a run.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRunTest() throws ApiException {
        String threadId = null;
        CreateRunRequest createRunRequest = null;
        RunObject response = api.createRun(threadId, createRunRequest);
        // TODO: test validations
    }

    /**
     * Create a thread.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createThreadTest() throws ApiException {
        CreateThreadRequest createThreadRequest = null;
        ThreadObject response = api.createThread(createThreadRequest);
        // TODO: test validations
    }

    /**
     * Create a thread and run it in one request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createThreadAndRunTest() throws ApiException {
        CreateThreadAndRunRequest createThreadAndRunRequest = null;
        RunObject response = api.createThreadAndRun(createThreadAndRunRequest);
        // TODO: test validations
    }

    /**
     * Delete an assistant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAssistantTest() throws ApiException {
        String assistantId = null;
        DeleteAssistantResponse response = api.deleteAssistant(assistantId);
        // TODO: test validations
    }

    /**
     * Delete an assistant file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAssistantFileTest() throws ApiException {
        String assistantId = null;
        String fileId = null;
        DeleteAssistantFileResponse response = api.deleteAssistantFile(assistantId, fileId);
        // TODO: test validations
    }

    /**
     * Delete a thread.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteThreadTest() throws ApiException {
        String threadId = null;
        DeleteThreadResponse response = api.deleteThread(threadId);
        // TODO: test validations
    }

    /**
     * Retrieves an assistant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAssistantTest() throws ApiException {
        String assistantId = null;
        AssistantObject response = api.getAssistant(assistantId);
        // TODO: test validations
    }

    /**
     * Retrieves an AssistantFile.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAssistantFileTest() throws ApiException {
        String assistantId = null;
        String fileId = null;
        AssistantFileObject response = api.getAssistantFile(assistantId, fileId);
        // TODO: test validations
    }

    /**
     * Retrieve a message.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMessageTest() throws ApiException {
        String threadId = null;
        String messageId = null;
        MessageObject response = api.getMessage(threadId, messageId);
        // TODO: test validations
    }

    /**
     * Retrieves a message file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMessageFileTest() throws ApiException {
        String threadId = null;
        String messageId = null;
        String fileId = null;
        MessageFileObject response = api.getMessageFile(threadId, messageId, fileId);
        // TODO: test validations
    }

    /**
     * Retrieves a run.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRunTest() throws ApiException {
        String threadId = null;
        String runId = null;
        RunObject response = api.getRun(threadId, runId);
        // TODO: test validations
    }

    /**
     * Retrieves a run step.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRunStepTest() throws ApiException {
        String threadId = null;
        String runId = null;
        String stepId = null;
        RunStepObject response = api.getRunStep(threadId, runId, stepId);
        // TODO: test validations
    }

    /**
     * Retrieves a thread.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getThreadTest() throws ApiException {
        String threadId = null;
        ThreadObject response = api.getThread(threadId);
        // TODO: test validations
    }

    /**
     * Returns a list of assistant files.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAssistantFilesTest() throws ApiException {
        String assistantId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListAssistantFilesResponse response = api.listAssistantFiles(assistantId, limit, order, after, before);
        // TODO: test validations
    }

    /**
     * Returns a list of assistants.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAssistantsTest() throws ApiException {
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListAssistantsResponse response = api.listAssistants(limit, order, after, before);
        // TODO: test validations
    }

    /**
     * Returns a list of message files.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMessageFilesTest() throws ApiException {
        String threadId = null;
        String messageId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListMessageFilesResponse response = api.listMessageFiles(threadId, messageId, limit, order, after, before);
        // TODO: test validations
    }

    /**
     * Returns a list of messages for a given thread.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMessagesTest() throws ApiException {
        String threadId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        String runId = null;
        ListMessagesResponse response = api.listMessages(threadId, limit, order, after, before, runId);
        // TODO: test validations
    }

    /**
     * Returns a list of run steps belonging to a run.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRunStepsTest() throws ApiException {
        String threadId = null;
        String runId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListRunStepsResponse response = api.listRunSteps(threadId, runId, limit, order, after, before);
        // TODO: test validations
    }

    /**
     * Returns a list of runs belonging to a thread.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listRunsTest() throws ApiException {
        String threadId = null;
        Integer limit = null;
        String order = null;
        String after = null;
        String before = null;
        ListRunsResponse response = api.listRuns(threadId, limit, order, after, before);
        // TODO: test validations
    }

    /**
     * Modifies an assistant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyAssistantTest() throws ApiException {
        String assistantId = null;
        ModifyAssistantRequest modifyAssistantRequest = null;
        AssistantObject response = api.modifyAssistant(assistantId, modifyAssistantRequest);
        // TODO: test validations
    }

    /**
     * Modifies a message.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyMessageTest() throws ApiException {
        String threadId = null;
        String messageId = null;
        ModifyMessageRequest modifyMessageRequest = null;
        MessageObject response = api.modifyMessage(threadId, messageId, modifyMessageRequest);
        // TODO: test validations
    }

    /**
     * Modifies a run.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyRunTest() throws ApiException {
        String threadId = null;
        String runId = null;
        ModifyRunRequest modifyRunRequest = null;
        RunObject response = api.modifyRun(threadId, runId, modifyRunRequest);
        // TODO: test validations
    }

    /**
     * Modifies a thread.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modifyThreadTest() throws ApiException {
        String threadId = null;
        ModifyThreadRequest modifyThreadRequest = null;
        ThreadObject response = api.modifyThread(threadId, modifyThreadRequest);
        // TODO: test validations
    }

    /**
     * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitToolOuputsToRunTest() throws ApiException {
        String threadId = null;
        String runId = null;
        SubmitToolOutputsRunRequest submitToolOutputsRunRequest = null;
        RunObject response = api.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest);
        // TODO: test validations
    }

}
