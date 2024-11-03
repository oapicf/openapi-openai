package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AssistantFileObject;
import org.openapitools.server.api.model.AssistantObject;
import org.openapitools.server.api.model.CreateAssistantFileRequest;
import org.openapitools.server.api.model.CreateAssistantRequest;
import org.openapitools.server.api.model.CreateMessageRequest;
import org.openapitools.server.api.model.CreateRunRequest;
import org.openapitools.server.api.model.CreateThreadAndRunRequest;
import org.openapitools.server.api.model.CreateThreadRequest;
import org.openapitools.server.api.model.DeleteAssistantFileResponse;
import org.openapitools.server.api.model.DeleteAssistantResponse;
import org.openapitools.server.api.model.DeleteThreadResponse;
import org.openapitools.server.api.model.ListAssistantFilesResponse;
import org.openapitools.server.api.model.ListAssistantsResponse;
import org.openapitools.server.api.model.ListMessageFilesResponse;
import org.openapitools.server.api.model.ListMessagesResponse;
import org.openapitools.server.api.model.ListRunStepsResponse;
import org.openapitools.server.api.model.ListRunsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MessageFileObject;
import org.openapitools.server.api.model.MessageObject;
import org.openapitools.server.api.model.ModifyAssistantRequest;
import org.openapitools.server.api.model.ModifyMessageRequest;
import org.openapitools.server.api.model.ModifyRunRequest;
import org.openapitools.server.api.model.ModifyThreadRequest;
import org.openapitools.server.api.model.RunObject;
import org.openapitools.server.api.model.RunStepObject;
import org.openapitools.server.api.model.SubmitToolOutputsRunRequest;
import org.openapitools.server.api.model.ThreadObject;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AssistantsApi  {
    //cancelRun
    void cancelRun(String threadId, String runId, Handler<AsyncResult<RunObject>> handler);

    //createAssistant
    void createAssistant(CreateAssistantRequest createAssistantRequest, Handler<AsyncResult<AssistantObject>> handler);

    //createAssistantFile
    void createAssistantFile(String assistantId, CreateAssistantFileRequest createAssistantFileRequest, Handler<AsyncResult<AssistantFileObject>> handler);

    //createMessage
    void createMessage(String threadId, CreateMessageRequest createMessageRequest, Handler<AsyncResult<MessageObject>> handler);

    //createRun
    void createRun(String threadId, CreateRunRequest createRunRequest, Handler<AsyncResult<RunObject>> handler);

    //createThread
    void createThread(CreateThreadRequest createThreadRequest, Handler<AsyncResult<ThreadObject>> handler);

    //createThreadAndRun
    void createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest, Handler<AsyncResult<RunObject>> handler);

    //deleteAssistant
    void deleteAssistant(String assistantId, Handler<AsyncResult<DeleteAssistantResponse>> handler);

    //deleteAssistantFile
    void deleteAssistantFile(String assistantId, String fileId, Handler<AsyncResult<DeleteAssistantFileResponse>> handler);

    //deleteThread
    void deleteThread(String threadId, Handler<AsyncResult<DeleteThreadResponse>> handler);

    //getAssistant
    void getAssistant(String assistantId, Handler<AsyncResult<AssistantObject>> handler);

    //getAssistantFile
    void getAssistantFile(String assistantId, String fileId, Handler<AsyncResult<AssistantFileObject>> handler);

    //getMessage
    void getMessage(String threadId, String messageId, Handler<AsyncResult<MessageObject>> handler);

    //getMessageFile
    void getMessageFile(String threadId, String messageId, String fileId, Handler<AsyncResult<MessageFileObject>> handler);

    //getRun
    void getRun(String threadId, String runId, Handler<AsyncResult<RunObject>> handler);

    //getRunStep
    void getRunStep(String threadId, String runId, String stepId, Handler<AsyncResult<RunStepObject>> handler);

    //getThread
    void getThread(String threadId, Handler<AsyncResult<ThreadObject>> handler);

    //listAssistantFiles
    void listAssistantFiles(String assistantId, Integer limit, String order, String after, String before, Handler<AsyncResult<ListAssistantFilesResponse>> handler);

    //listAssistants
    void listAssistants(Integer limit, String order, String after, String before, Handler<AsyncResult<ListAssistantsResponse>> handler);

    //listMessageFiles
    void listMessageFiles(String threadId, String messageId, Integer limit, String order, String after, String before, Handler<AsyncResult<ListMessageFilesResponse>> handler);

    //listMessages
    void listMessages(String threadId, Integer limit, String order, String after, String before, String runId, Handler<AsyncResult<ListMessagesResponse>> handler);

    //listRunSteps
    void listRunSteps(String threadId, String runId, Integer limit, String order, String after, String before, Handler<AsyncResult<ListRunStepsResponse>> handler);

    //listRuns
    void listRuns(String threadId, Integer limit, String order, String after, String before, Handler<AsyncResult<ListRunsResponse>> handler);

    //modifyAssistant
    void modifyAssistant(String assistantId, ModifyAssistantRequest modifyAssistantRequest, Handler<AsyncResult<AssistantObject>> handler);

    //modifyMessage
    void modifyMessage(String threadId, String messageId, ModifyMessageRequest modifyMessageRequest, Handler<AsyncResult<MessageObject>> handler);

    //modifyRun
    void modifyRun(String threadId, String runId, ModifyRunRequest modifyRunRequest, Handler<AsyncResult<RunObject>> handler);

    //modifyThread
    void modifyThread(String threadId, ModifyThreadRequest modifyThreadRequest, Handler<AsyncResult<ThreadObject>> handler);

    //submitToolOuputsToRun
    void submitToolOuputsToRun(String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest, Handler<AsyncResult<RunObject>> handler);

}
