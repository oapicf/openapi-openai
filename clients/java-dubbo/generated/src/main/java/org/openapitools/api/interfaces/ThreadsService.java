package org.openapitools.api.interfaces;

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
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface ThreadsService {

    /**
     * Cancels a run that is &#x60;in_progress&#x60;.
     * 
     *
     * @param threadId The ID of the thread to which this run belongs. (required)
     * @param runId The ID of the run to cancel. (required)
     * @return RunObject
     */
    RunObject cancelRun(
        String threadId,
        String runId
    );

    /**
     * Create a message.
     * 
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for. (required)
     * @param createMessageRequest  (required)
     * @return MessageObject
     */
    MessageObject createMessage(
        String threadId,
        CreateMessageRequest createMessageRequest
    );

    /**
     * Create a run.
     * 
     *
     * @param threadId The ID of the thread to run. (required)
     * @param createRunRequest  (required)
     * @param include A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)
     * @return RunObject
     */
    RunObject createRun(
        String threadId,
        CreateRunRequest createRunRequest,
        List<String> include
    );

    /**
     * Create a thread.
     * 
     *
     * @param createThreadRequest  (optional)
     * @return ThreadObject
     */
    ThreadObject createThread(
        CreateThreadRequest createThreadRequest
    );

    /**
     * Create a thread and run it in one request.
     * 
     *
     * @param createThreadAndRunRequest  (required)
     * @return RunObject
     */
    RunObject createThreadAndRun(
        CreateThreadAndRunRequest createThreadAndRunRequest
    );

    /**
     * Deletes a message.
     * 
     *
     * @param threadId The ID of the thread to which this message belongs. (required)
     * @param messageId The ID of the message to delete. (required)
     * @return DeleteMessageResponse
     */
    DeleteMessageResponse deleteMessage(
        String threadId,
        String messageId
    );

    /**
     * Delete a thread.
     * 
     *
     * @param threadId The ID of the thread to delete. (required)
     * @return DeleteThreadResponse
     */
    DeleteThreadResponse deleteThread(
        String threadId
    );

    /**
     * Retrieve a message.
     * 
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs. (required)
     * @param messageId The ID of the message to retrieve. (required)
     * @return MessageObject
     */
    MessageObject getMessage(
        String threadId,
        String messageId
    );

    /**
     * Retrieves a run.
     * 
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. (required)
     * @param runId The ID of the run to retrieve. (required)
     * @return RunObject
     */
    RunObject getRun(
        String threadId,
        String runId
    );

    /**
     * Retrieves a run step.
     * 
     *
     * @param threadId The ID of the thread to which the run and run step belongs. (required)
     * @param runId The ID of the run to which the run step belongs. (required)
     * @param stepId The ID of the run step to retrieve. (required)
     * @param include A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)
     * @return RunStepObject
     */
    RunStepObject getRunStep(
        String threadId,
        String runId,
        String stepId,
        List<String> include
    );

    /**
     * Retrieves a thread.
     * 
     *
     * @param threadId The ID of the thread to retrieve. (required)
     * @return ThreadObject
     */
    ThreadObject getThread(
        String threadId
    );

    /**
     * Returns a list of messages for a given thread.
     * 
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param runId Filter messages by the run ID that generated them.  (optional)
     * @return ListMessagesResponse
     */
    ListMessagesResponse listMessages(
        String threadId,
        Integer limit,
        String order,
        String after,
        String before,
        String runId
    );

    /**
     * Returns a list of run steps belonging to a run.
     * 
     *
     * @param threadId The ID of the thread the run and run steps belong to. (required)
     * @param runId The ID of the run the run steps belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param include A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  (optional)
     * @return ListRunStepsResponse
     */
    ListRunStepsResponse listRunSteps(
        String threadId,
        String runId,
        Integer limit,
        String order,
        String after,
        String before,
        List<String> include
    );

    /**
     * Returns a list of runs belonging to a thread.
     * 
     *
     * @param threadId The ID of the thread the run belongs to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListRunsResponse
     */
    ListRunsResponse listRuns(
        String threadId,
        Integer limit,
        String order,
        String after,
        String before
    );

    /**
     * Modifies a message.
     * 
     *
     * @param threadId The ID of the thread to which this message belongs. (required)
     * @param messageId The ID of the message to modify. (required)
     * @param modifyMessageRequest  (required)
     * @return MessageObject
     */
    MessageObject modifyMessage(
        String threadId,
        String messageId,
        ModifyMessageRequest modifyMessageRequest
    );

    /**
     * Modifies a run.
     * 
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. (required)
     * @param runId The ID of the run to modify. (required)
     * @param modifyRunRequest  (required)
     * @return RunObject
     */
    RunObject modifyRun(
        String threadId,
        String runId,
        ModifyRunRequest modifyRunRequest
    );

    /**
     * Modifies a thread.
     * 
     *
     * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. (required)
     * @param modifyThreadRequest  (required)
     * @return ThreadObject
     */
    ThreadObject modifyThread(
        String threadId,
        ModifyThreadRequest modifyThreadRequest
    );

    /**
     * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
     * 
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs. (required)
     * @param runId The ID of the run that requires the tool output submission. (required)
     * @param submitToolOutputsRunRequest  (required)
     * @return RunObject
     */
    RunObject submitToolOuputsToRun(
        String threadId,
        String runId,
        SubmitToolOutputsRunRequest submitToolOutputsRunRequest
    );
}
