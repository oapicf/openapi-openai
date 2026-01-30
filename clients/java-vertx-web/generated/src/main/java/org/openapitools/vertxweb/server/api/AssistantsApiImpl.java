package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AssistantObject;
import org.openapitools.vertxweb.server.model.CreateAssistantRequest;
import org.openapitools.vertxweb.server.model.CreateMessageRequest;
import org.openapitools.vertxweb.server.model.CreateRunRequest;
import org.openapitools.vertxweb.server.model.CreateThreadAndRunRequest;
import org.openapitools.vertxweb.server.model.CreateThreadRequest;
import org.openapitools.vertxweb.server.model.DeleteAssistantResponse;
import org.openapitools.vertxweb.server.model.DeleteMessageResponse;
import org.openapitools.vertxweb.server.model.DeleteThreadResponse;
import org.openapitools.vertxweb.server.model.ListAssistantsResponse;
import org.openapitools.vertxweb.server.model.ListMessagesResponse;
import org.openapitools.vertxweb.server.model.ListRunStepsResponse;
import org.openapitools.vertxweb.server.model.ListRunsResponse;
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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AssistantsApiImpl implements AssistantsApi {
    public Future<ApiResponse<RunObject>> cancelRun(String threadId, String runId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AssistantObject>> createAssistant(CreateAssistantRequest createAssistantRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MessageObject>> createMessage(String threadId, CreateMessageRequest createMessageRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<RunObject>> createRun(String threadId, CreateRunRequest createRunRequest, List<String> include) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ThreadObject>> createThread(CreateThreadRequest createThreadRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<RunObject>> createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteAssistantResponse>> deleteAssistant(String assistantId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteMessageResponse>> deleteMessage(String threadId, String messageId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeleteThreadResponse>> deleteThread(String threadId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AssistantObject>> getAssistant(String assistantId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MessageObject>> getMessage(String threadId, String messageId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<RunObject>> getRun(String threadId, String runId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<RunStepObject>> getRunStep(String threadId, String runId, String stepId, List<String> include) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ThreadObject>> getThread(String threadId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListAssistantsResponse>> listAssistants(Integer limit, String order, String after, String before) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListMessagesResponse>> listMessages(String threadId, Integer limit, String order, String after, String before, String runId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListRunStepsResponse>> listRunSteps(String threadId, String runId, Integer limit, String order, String after, String before, List<String> include) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ListRunsResponse>> listRuns(String threadId, Integer limit, String order, String after, String before) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AssistantObject>> modifyAssistant(String assistantId, ModifyAssistantRequest modifyAssistantRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MessageObject>> modifyMessage(String threadId, String messageId, ModifyMessageRequest modifyMessageRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<RunObject>> modifyRun(String threadId, String runId, ModifyRunRequest modifyRunRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ThreadObject>> modifyThread(String threadId, ModifyThreadRequest modifyThreadRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<RunObject>> submitToolOuputsToRun(String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
