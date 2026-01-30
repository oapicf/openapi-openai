package org.openapitools.api;

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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for AssistantsApi
 */
@MicronautTest
public class AssistantsApiTest {

    @Inject
    AssistantsApi api;

    
    /**
     * Cancels a run that is &#x60;in_progress&#x60;.
     */
    @Test
    @Disabled("Not Implemented")
    public void cancelRunTest() {
        // given
        String threadId = "example";
        String runId = "example";

        // when
        RunObject body = api.cancelRun(threadId, runId).block();

        // then
        // TODO implement the cancelRunTest()
    }

    
    /**
     * Create an assistant with a model and instructions.
     */
    @Test
    @Disabled("Not Implemented")
    public void createAssistantTest() {
        // given
        CreateAssistantRequest createAssistantRequest = new CreateAssistantRequest(null);

        // when
        AssistantObject body = api.createAssistant(createAssistantRequest).block();

        // then
        // TODO implement the createAssistantTest()
    }

    
    /**
     * Create a message.
     */
    @Test
    @Disabled("Not Implemented")
    public void createMessageTest() {
        // given
        String threadId = "example";
        CreateMessageRequest createMessageRequest = new CreateMessageRequest("example", null);

        // when
        MessageObject body = api.createMessage(threadId, createMessageRequest).block();

        // then
        // TODO implement the createMessageTest()
    }

    
    /**
     * Create a run.
     */
    @Test
    @Disabled("Not Implemented")
    public void createRunTest() {
        // given
        String threadId = "example";
        CreateRunRequest createRunRequest = new CreateRunRequest("example");
        List<String> include = Arrays.asList("example");

        // when
        RunObject body = api.createRun(threadId, createRunRequest, include).block();

        // then
        // TODO implement the createRunTest()
    }

    
    /**
     * Create a thread.
     */
    @Test
    @Disabled("Not Implemented")
    public void createThreadTest() {
        // given
        CreateThreadRequest createThreadRequest = new CreateThreadRequest();

        // when
        ThreadObject body = api.createThread(createThreadRequest).block();

        // then
        // TODO implement the createThreadTest()
    }

    
    /**
     * Create a thread and run it in one request.
     */
    @Test
    @Disabled("Not Implemented")
    public void createThreadAndRunTest() {
        // given
        CreateThreadAndRunRequest createThreadAndRunRequest = new CreateThreadAndRunRequest("example");

        // when
        RunObject body = api.createThreadAndRun(createThreadAndRunRequest).block();

        // then
        // TODO implement the createThreadAndRunTest()
    }

    
    /**
     * Delete an assistant.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteAssistantTest() {
        // given
        String assistantId = "example";

        // when
        DeleteAssistantResponse body = api.deleteAssistant(assistantId).block();

        // then
        // TODO implement the deleteAssistantTest()
    }

    
    /**
     * Deletes a message.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteMessageTest() {
        // given
        String threadId = "example";
        String messageId = "example";

        // when
        DeleteMessageResponse body = api.deleteMessage(threadId, messageId).block();

        // then
        // TODO implement the deleteMessageTest()
    }

    
    /**
     * Delete a thread.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteThreadTest() {
        // given
        String threadId = "example";

        // when
        DeleteThreadResponse body = api.deleteThread(threadId).block();

        // then
        // TODO implement the deleteThreadTest()
    }

    
    /**
     * Retrieves an assistant.
     */
    @Test
    @Disabled("Not Implemented")
    public void getAssistantTest() {
        // given
        String assistantId = "example";

        // when
        AssistantObject body = api.getAssistant(assistantId).block();

        // then
        // TODO implement the getAssistantTest()
    }

    
    /**
     * Retrieve a message.
     */
    @Test
    @Disabled("Not Implemented")
    public void getMessageTest() {
        // given
        String threadId = "example";
        String messageId = "example";

        // when
        MessageObject body = api.getMessage(threadId, messageId).block();

        // then
        // TODO implement the getMessageTest()
    }

    
    /**
     * Retrieves a run.
     */
    @Test
    @Disabled("Not Implemented")
    public void getRunTest() {
        // given
        String threadId = "example";
        String runId = "example";

        // when
        RunObject body = api.getRun(threadId, runId).block();

        // then
        // TODO implement the getRunTest()
    }

    
    /**
     * Retrieves a run step.
     */
    @Test
    @Disabled("Not Implemented")
    public void getRunStepTest() {
        // given
        String threadId = "example";
        String runId = "example";
        String stepId = "example";
        List<String> include = Arrays.asList("example");

        // when
        RunStepObject body = api.getRunStep(threadId, runId, stepId, include).block();

        // then
        // TODO implement the getRunStepTest()
    }

    
    /**
     * Retrieves a thread.
     */
    @Test
    @Disabled("Not Implemented")
    public void getThreadTest() {
        // given
        String threadId = "example";

        // when
        ThreadObject body = api.getThread(threadId).block();

        // then
        // TODO implement the getThreadTest()
    }

    
    /**
     * Returns a list of assistants.
     */
    @Test
    @Disabled("Not Implemented")
    public void listAssistantsTest() {
        // given
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";

        // when
        ListAssistantsResponse body = api.listAssistants(limit, order, after, before).block();

        // then
        // TODO implement the listAssistantsTest()
    }

    
    /**
     * Returns a list of messages for a given thread.
     */
    @Test
    @Disabled("Not Implemented")
    public void listMessagesTest() {
        // given
        String threadId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";
        String runId = "example";

        // when
        ListMessagesResponse body = api.listMessages(threadId, limit, order, after, before, runId).block();

        // then
        // TODO implement the listMessagesTest()
    }

    
    /**
     * Returns a list of run steps belonging to a run.
     */
    @Test
    @Disabled("Not Implemented")
    public void listRunStepsTest() {
        // given
        String threadId = "example";
        String runId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";
        List<String> include = Arrays.asList("example");

        // when
        ListRunStepsResponse body = api.listRunSteps(threadId, runId, limit, order, after, before, include).block();

        // then
        // TODO implement the listRunStepsTest()
    }

    
    /**
     * Returns a list of runs belonging to a thread.
     */
    @Test
    @Disabled("Not Implemented")
    public void listRunsTest() {
        // given
        String threadId = "example";
        Integer limit = 20;
        String order = "desc";
        String after = "example";
        String before = "example";

        // when
        ListRunsResponse body = api.listRuns(threadId, limit, order, after, before).block();

        // then
        // TODO implement the listRunsTest()
    }

    
    /**
     * Modifies an assistant.
     */
    @Test
    @Disabled("Not Implemented")
    public void modifyAssistantTest() {
        // given
        String assistantId = "example";
        ModifyAssistantRequest modifyAssistantRequest = new ModifyAssistantRequest();

        // when
        AssistantObject body = api.modifyAssistant(assistantId, modifyAssistantRequest).block();

        // then
        // TODO implement the modifyAssistantTest()
    }

    
    /**
     * Modifies a message.
     */
    @Test
    @Disabled("Not Implemented")
    public void modifyMessageTest() {
        // given
        String threadId = "example";
        String messageId = "example";
        ModifyMessageRequest modifyMessageRequest = new ModifyMessageRequest();

        // when
        MessageObject body = api.modifyMessage(threadId, messageId, modifyMessageRequest).block();

        // then
        // TODO implement the modifyMessageTest()
    }

    
    /**
     * Modifies a run.
     */
    @Test
    @Disabled("Not Implemented")
    public void modifyRunTest() {
        // given
        String threadId = "example";
        String runId = "example";
        ModifyRunRequest modifyRunRequest = new ModifyRunRequest();

        // when
        RunObject body = api.modifyRun(threadId, runId, modifyRunRequest).block();

        // then
        // TODO implement the modifyRunTest()
    }

    
    /**
     * Modifies a thread.
     */
    @Test
    @Disabled("Not Implemented")
    public void modifyThreadTest() {
        // given
        String threadId = "example";
        ModifyThreadRequest modifyThreadRequest = new ModifyThreadRequest();

        // when
        ThreadObject body = api.modifyThread(threadId, modifyThreadRequest).block();

        // then
        // TODO implement the modifyThreadTest()
    }

    
    /**
     * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
     */
    @Test
    @Disabled("Not Implemented")
    public void submitToolOuputsToRunTest() {
        // given
        String threadId = "example";
        String runId = "example";
        SubmitToolOutputsRunRequest submitToolOutputsRunRequest = new SubmitToolOutputsRunRequest(Arrays.asList());

        // when
        RunObject body = api.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest).block();

        // then
        // TODO implement the submitToolOuputsToRunTest()
    }

    
}
