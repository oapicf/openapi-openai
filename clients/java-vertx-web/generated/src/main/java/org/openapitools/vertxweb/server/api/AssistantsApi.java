package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AssistantFileObject;
import org.openapitools.vertxweb.server.model.AssistantObject;
import org.openapitools.vertxweb.server.model.CreateAssistantFileRequest;
import org.openapitools.vertxweb.server.model.CreateAssistantRequest;
import org.openapitools.vertxweb.server.model.CreateMessageRequest;
import org.openapitools.vertxweb.server.model.CreateRunRequest;
import org.openapitools.vertxweb.server.model.CreateThreadAndRunRequest;
import org.openapitools.vertxweb.server.model.CreateThreadRequest;
import org.openapitools.vertxweb.server.model.DeleteAssistantFileResponse;
import org.openapitools.vertxweb.server.model.DeleteAssistantResponse;
import org.openapitools.vertxweb.server.model.DeleteThreadResponse;
import org.openapitools.vertxweb.server.model.ListAssistantFilesResponse;
import org.openapitools.vertxweb.server.model.ListAssistantsResponse;
import org.openapitools.vertxweb.server.model.ListMessageFilesResponse;
import org.openapitools.vertxweb.server.model.ListMessagesResponse;
import org.openapitools.vertxweb.server.model.ListRunStepsResponse;
import org.openapitools.vertxweb.server.model.ListRunsResponse;
import org.openapitools.vertxweb.server.model.MessageFileObject;
import org.openapitools.vertxweb.server.model.MessageObject;
import org.openapitools.vertxweb.server.model.ModifyAssistantRequest;
import org.openapitools.vertxweb.server.model.ModifyMessageRequest;
import org.openapitools.vertxweb.server.model.ModifyRunRequest;
import org.openapitools.vertxweb.server.model.ModifyThreadRequest;
import org.openapitools.vertxweb.server.model.RunObject;
import org.openapitools.vertxweb.server.model.RunStepObject;
import org.openapitools.vertxweb.server.model.SubmitToolOutputsRunRequest;
import org.openapitools.vertxweb.server.model.ThreadObject;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface AssistantsApi  {
    Future<ApiResponse<RunObject>> cancelRun(String threadId, String runId);
    Future<ApiResponse<AssistantObject>> createAssistant(CreateAssistantRequest createAssistantRequest);
    Future<ApiResponse<AssistantFileObject>> createAssistantFile(String assistantId, CreateAssistantFileRequest createAssistantFileRequest);
    Future<ApiResponse<MessageObject>> createMessage(String threadId, CreateMessageRequest createMessageRequest);
    Future<ApiResponse<RunObject>> createRun(String threadId, CreateRunRequest createRunRequest);
    Future<ApiResponse<ThreadObject>> createThread(CreateThreadRequest createThreadRequest);
    Future<ApiResponse<RunObject>> createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest);
    Future<ApiResponse<DeleteAssistantResponse>> deleteAssistant(String assistantId);
    Future<ApiResponse<DeleteAssistantFileResponse>> deleteAssistantFile(String assistantId, String fileId);
    Future<ApiResponse<DeleteThreadResponse>> deleteThread(String threadId);
    Future<ApiResponse<AssistantObject>> getAssistant(String assistantId);
    Future<ApiResponse<AssistantFileObject>> getAssistantFile(String assistantId, String fileId);
    Future<ApiResponse<MessageObject>> getMessage(String threadId, String messageId);
    Future<ApiResponse<MessageFileObject>> getMessageFile(String threadId, String messageId, String fileId);
    Future<ApiResponse<RunObject>> getRun(String threadId, String runId);
    Future<ApiResponse<RunStepObject>> getRunStep(String threadId, String runId, String stepId);
    Future<ApiResponse<ThreadObject>> getThread(String threadId);
    Future<ApiResponse<ListAssistantFilesResponse>> listAssistantFiles(String assistantId, Integer limit, String order, String after, String before);
    Future<ApiResponse<ListAssistantsResponse>> listAssistants(Integer limit, String order, String after, String before);
    Future<ApiResponse<ListMessageFilesResponse>> listMessageFiles(String threadId, String messageId, Integer limit, String order, String after, String before);
    Future<ApiResponse<ListMessagesResponse>> listMessages(String threadId, Integer limit, String order, String after, String before, String runId);
    Future<ApiResponse<ListRunStepsResponse>> listRunSteps(String threadId, String runId, Integer limit, String order, String after, String before);
    Future<ApiResponse<ListRunsResponse>> listRuns(String threadId, Integer limit, String order, String after, String before);
    Future<ApiResponse<AssistantObject>> modifyAssistant(String assistantId, ModifyAssistantRequest modifyAssistantRequest);
    Future<ApiResponse<MessageObject>> modifyMessage(String threadId, String messageId, ModifyMessageRequest modifyMessageRequest);
    Future<ApiResponse<RunObject>> modifyRun(String threadId, String runId, ModifyRunRequest modifyRunRequest);
    Future<ApiResponse<ThreadObject>> modifyThread(String threadId, ModifyThreadRequest modifyThreadRequest);
    Future<ApiResponse<RunObject>> submitToolOuputsToRun(String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest);
}
