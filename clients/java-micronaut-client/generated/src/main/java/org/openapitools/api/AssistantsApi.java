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

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
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
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Client("${openapi-micronaut-client-base-path}")
public interface AssistantsApi {
    /**
     * Cancels a run that is &#x60;in_progress&#x60;.
     *
     * @param threadId The ID of the thread to which this run belongs. (required)
     * @param runId The ID of the run to cancel. (required)
     * @return RunObject
     */
    @Post(uri="/threads/{thread_id}/runs/{run_id}/cancel")
    @Consumes({"application/json"})
    Mono<RunObject> cancelRun(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @PathVariable(name="run_id") @NotNull String runId
    );

    /**
     * Create an assistant with a model and instructions.
     *
     * @param createAssistantRequest  (required)
     * @return AssistantObject
     */
    @Post(uri="/assistants")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<AssistantObject> createAssistant(
        @Body @NotNull @Valid CreateAssistantRequest createAssistantRequest
    );

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     *
     * @param assistantId The ID of the assistant for which to create a File.  (required)
     * @param createAssistantFileRequest  (required)
     * @return AssistantFileObject
     */
    @Post(uri="/assistants/{assistant_id}/files")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<AssistantFileObject> createAssistantFile(
        @PathVariable(name="assistant_id") @NotNull String assistantId, 
        @Body @NotNull @Valid CreateAssistantFileRequest createAssistantFileRequest
    );

    /**
     * Create a message.
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for. (required)
     * @param createMessageRequest  (required)
     * @return MessageObject
     */
    @Post(uri="/threads/{thread_id}/messages")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<MessageObject> createMessage(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @Body @NotNull @Valid CreateMessageRequest createMessageRequest
    );

    /**
     * Create a run.
     *
     * @param threadId The ID of the thread to run. (required)
     * @param createRunRequest  (required)
     * @return RunObject
     */
    @Post(uri="/threads/{thread_id}/runs")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<RunObject> createRun(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @Body @NotNull @Valid CreateRunRequest createRunRequest
    );

    /**
     * Create a thread.
     *
     * @param createThreadRequest  (optional)
     * @return ThreadObject
     */
    @Post(uri="/threads")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<ThreadObject> createThread(
        @Body @Nullable @Valid CreateThreadRequest createThreadRequest
    );

    /**
     * Create a thread and run it in one request.
     *
     * @param createThreadAndRunRequest  (required)
     * @return RunObject
     */
    @Post(uri="/threads/runs")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<RunObject> createThreadAndRun(
        @Body @NotNull @Valid CreateThreadAndRunRequest createThreadAndRunRequest
    );

    /**
     * Delete an assistant.
     *
     * @param assistantId The ID of the assistant to delete. (required)
     * @return DeleteAssistantResponse
     */
    @Delete(uri="/assistants/{assistant_id}")
    @Consumes({"application/json"})
    Mono<DeleteAssistantResponse> deleteAssistant(
        @PathVariable(name="assistant_id") @NotNull String assistantId
    );

    /**
     * Delete an assistant file.
     *
     * @param assistantId The ID of the assistant that the file belongs to. (required)
     * @param fileId The ID of the file to delete. (required)
     * @return DeleteAssistantFileResponse
     */
    @Delete(uri="/assistants/{assistant_id}/files/{file_id}")
    @Consumes({"application/json"})
    Mono<DeleteAssistantFileResponse> deleteAssistantFile(
        @PathVariable(name="assistant_id") @NotNull String assistantId, 
        @PathVariable(name="file_id") @NotNull String fileId
    );

    /**
     * Delete a thread.
     *
     * @param threadId The ID of the thread to delete. (required)
     * @return DeleteThreadResponse
     */
    @Delete(uri="/threads/{thread_id}")
    @Consumes({"application/json"})
    Mono<DeleteThreadResponse> deleteThread(
        @PathVariable(name="thread_id") @NotNull String threadId
    );

    /**
     * Retrieves an assistant.
     *
     * @param assistantId The ID of the assistant to retrieve. (required)
     * @return AssistantObject
     */
    @Get(uri="/assistants/{assistant_id}")
    @Consumes({"application/json"})
    Mono<AssistantObject> getAssistant(
        @PathVariable(name="assistant_id") @NotNull String assistantId
    );

    /**
     * Retrieves an AssistantFile.
     *
     * @param assistantId The ID of the assistant who the file belongs to. (required)
     * @param fileId The ID of the file we&#39;re getting. (required)
     * @return AssistantFileObject
     */
    @Get(uri="/assistants/{assistant_id}/files/{file_id}")
    @Consumes({"application/json"})
    Mono<AssistantFileObject> getAssistantFile(
        @PathVariable(name="assistant_id") @NotNull String assistantId, 
        @PathVariable(name="file_id") @NotNull String fileId
    );

    /**
     * Retrieve a message.
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs. (required)
     * @param messageId The ID of the message to retrieve. (required)
     * @return MessageObject
     */
    @Get(uri="/threads/{thread_id}/messages/{message_id}")
    @Consumes({"application/json"})
    Mono<MessageObject> getMessage(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @PathVariable(name="message_id") @NotNull String messageId
    );

    /**
     * Retrieves a message file.
     *
     * @param threadId The ID of the thread to which the message and File belong. (required)
     * @param messageId The ID of the message the file belongs to. (required)
     * @param fileId The ID of the file being retrieved. (required)
     * @return MessageFileObject
     */
    @Get(uri="/threads/{thread_id}/messages/{message_id}/files/{file_id}")
    @Consumes({"application/json"})
    Mono<MessageFileObject> getMessageFile(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @PathVariable(name="message_id") @NotNull String messageId, 
        @PathVariable(name="file_id") @NotNull String fileId
    );

    /**
     * Retrieves a run.
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. (required)
     * @param runId The ID of the run to retrieve. (required)
     * @return RunObject
     */
    @Get(uri="/threads/{thread_id}/runs/{run_id}")
    @Consumes({"application/json"})
    Mono<RunObject> getRun(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @PathVariable(name="run_id") @NotNull String runId
    );

    /**
     * Retrieves a run step.
     *
     * @param threadId The ID of the thread to which the run and run step belongs. (required)
     * @param runId The ID of the run to which the run step belongs. (required)
     * @param stepId The ID of the run step to retrieve. (required)
     * @return RunStepObject
     */
    @Get(uri="/threads/{thread_id}/runs/{run_id}/steps/{step_id}")
    @Consumes({"application/json"})
    Mono<RunStepObject> getRunStep(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @PathVariable(name="run_id") @NotNull String runId, 
        @PathVariable(name="step_id") @NotNull String stepId
    );

    /**
     * Retrieves a thread.
     *
     * @param threadId The ID of the thread to retrieve. (required)
     * @return ThreadObject
     */
    @Get(uri="/threads/{thread_id}")
    @Consumes({"application/json"})
    Mono<ThreadObject> getThread(
        @PathVariable(name="thread_id") @NotNull String threadId
    );

    /**
     * Returns a list of assistant files.
     *
     * @param assistantId The ID of the assistant the file belongs to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListAssistantFilesResponse
     */
    @Get(uri="/assistants/{assistant_id}/files")
    @Consumes({"application/json"})
    Mono<ListAssistantFilesResponse> listAssistantFiles(
        @PathVariable(name="assistant_id") @NotNull String assistantId, 
        @QueryValue(value="limit", defaultValue="20") @Nullable Integer limit, 
        @QueryValue(value="order", defaultValue="desc") @Nullable String order, 
        @QueryValue(value="after") @Nullable String after, 
        @QueryValue(value="before") @Nullable String before
    );

    /**
     * Returns a list of assistants.
     *
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListAssistantsResponse
     */
    @Get(uri="/assistants")
    @Consumes({"application/json"})
    Mono<ListAssistantsResponse> listAssistants(
        @QueryValue(value="limit", defaultValue="20") @Nullable Integer limit, 
        @QueryValue(value="order", defaultValue="desc") @Nullable String order, 
        @QueryValue(value="after") @Nullable String after, 
        @QueryValue(value="before") @Nullable String before
    );

    /**
     * Returns a list of message files.
     *
     * @param threadId The ID of the thread that the message and files belong to. (required)
     * @param messageId The ID of the message that the files belongs to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListMessageFilesResponse
     */
    @Get(uri="/threads/{thread_id}/messages/{message_id}/files")
    @Consumes({"application/json"})
    Mono<ListMessageFilesResponse> listMessageFiles(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @PathVariable(name="message_id") @NotNull String messageId, 
        @QueryValue(value="limit", defaultValue="20") @Nullable Integer limit, 
        @QueryValue(value="order", defaultValue="desc") @Nullable String order, 
        @QueryValue(value="after") @Nullable String after, 
        @QueryValue(value="before") @Nullable String before
    );

    /**
     * Returns a list of messages for a given thread.
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @param runId Filter messages by the run ID that generated them.  (optional)
     * @return ListMessagesResponse
     */
    @Get(uri="/threads/{thread_id}/messages")
    @Consumes({"application/json"})
    Mono<ListMessagesResponse> listMessages(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @QueryValue(value="limit", defaultValue="20") @Nullable Integer limit, 
        @QueryValue(value="order", defaultValue="desc") @Nullable String order, 
        @QueryValue(value="after") @Nullable String after, 
        @QueryValue(value="before") @Nullable String before, 
        @QueryValue(value="run_id") @Nullable String runId
    );

    /**
     * Returns a list of run steps belonging to a run.
     *
     * @param threadId The ID of the thread the run and run steps belong to. (required)
     * @param runId The ID of the run the run steps belong to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListRunStepsResponse
     */
    @Get(uri="/threads/{thread_id}/runs/{run_id}/steps")
    @Consumes({"application/json"})
    Mono<ListRunStepsResponse> listRunSteps(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @PathVariable(name="run_id") @NotNull String runId, 
        @QueryValue(value="limit", defaultValue="20") @Nullable Integer limit, 
        @QueryValue(value="order", defaultValue="desc") @Nullable String order, 
        @QueryValue(value="after") @Nullable String after, 
        @QueryValue(value="before") @Nullable String before
    );

    /**
     * Returns a list of runs belonging to a thread.
     *
     * @param threadId The ID of the thread the run belongs to. (required)
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional, default to 20)
     * @param order Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  (optional, default to desc)
     * @param after A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  (optional)
     * @param before A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  (optional)
     * @return ListRunsResponse
     */
    @Get(uri="/threads/{thread_id}/runs")
    @Consumes({"application/json"})
    Mono<ListRunsResponse> listRuns(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @QueryValue(value="limit", defaultValue="20") @Nullable Integer limit, 
        @QueryValue(value="order", defaultValue="desc") @Nullable String order, 
        @QueryValue(value="after") @Nullable String after, 
        @QueryValue(value="before") @Nullable String before
    );

    /**
     * Modifies an assistant.
     *
     * @param assistantId The ID of the assistant to modify. (required)
     * @param modifyAssistantRequest  (required)
     * @return AssistantObject
     */
    @Post(uri="/assistants/{assistant_id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<AssistantObject> modifyAssistant(
        @PathVariable(name="assistant_id") @NotNull String assistantId, 
        @Body @NotNull @Valid ModifyAssistantRequest modifyAssistantRequest
    );

    /**
     * Modifies a message.
     *
     * @param threadId The ID of the thread to which this message belongs. (required)
     * @param messageId The ID of the message to modify. (required)
     * @param modifyMessageRequest  (required)
     * @return MessageObject
     */
    @Post(uri="/threads/{thread_id}/messages/{message_id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<MessageObject> modifyMessage(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @PathVariable(name="message_id") @NotNull String messageId, 
        @Body @NotNull @Valid ModifyMessageRequest modifyMessageRequest
    );

    /**
     * Modifies a run.
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. (required)
     * @param runId The ID of the run to modify. (required)
     * @param modifyRunRequest  (required)
     * @return RunObject
     */
    @Post(uri="/threads/{thread_id}/runs/{run_id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<RunObject> modifyRun(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @PathVariable(name="run_id") @NotNull String runId, 
        @Body @NotNull @Valid ModifyRunRequest modifyRunRequest
    );

    /**
     * Modifies a thread.
     *
     * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified. (required)
     * @param modifyThreadRequest  (required)
     * @return ThreadObject
     */
    @Post(uri="/threads/{thread_id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<ThreadObject> modifyThread(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @Body @NotNull @Valid ModifyThreadRequest modifyThreadRequest
    );

    /**
     * When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
     *
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs. (required)
     * @param runId The ID of the run that requires the tool output submission. (required)
     * @param submitToolOutputsRunRequest  (required)
     * @return RunObject
     */
    @Post(uri="/threads/{thread_id}/runs/{run_id}/submit_tool_outputs")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<RunObject> submitToolOuputsToRun(
        @PathVariable(name="thread_id") @NotNull String threadId, 
        @PathVariable(name="run_id") @NotNull String runId, 
        @Body @NotNull @Valid SubmitToolOutputsRunRequest submitToolOutputsRunRequest
    );

}
