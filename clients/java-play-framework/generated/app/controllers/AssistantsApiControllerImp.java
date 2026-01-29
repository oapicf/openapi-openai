package controllers;

import apimodels.AssistantFileObject;
import apimodels.AssistantObject;
import apimodels.CreateAssistantFileRequest;
import apimodels.CreateAssistantRequest;
import apimodels.CreateMessageRequest;
import apimodels.CreateRunRequest;
import apimodels.CreateThreadAndRunRequest;
import apimodels.CreateThreadRequest;
import apimodels.DeleteAssistantFileResponse;
import apimodels.DeleteAssistantResponse;
import apimodels.DeleteThreadResponse;
import apimodels.ListAssistantFilesResponse;
import apimodels.ListAssistantsResponse;
import apimodels.ListMessageFilesResponse;
import apimodels.ListMessagesResponse;
import apimodels.ListRunStepsResponse;
import apimodels.ListRunsResponse;
import apimodels.MessageFileObject;
import apimodels.MessageObject;
import apimodels.ModifyAssistantRequest;
import apimodels.ModifyMessageRequest;
import apimodels.ModifyRunRequest;
import apimodels.ModifyThreadRequest;
import apimodels.RunObject;
import apimodels.RunStepObject;
import apimodels.SubmitToolOutputsRunRequest;
import apimodels.ThreadObject;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantsApiControllerImp extends AssistantsApiControllerImpInterface {
    @Override
    public RunObject cancelRun(Http.Request request, String threadId, String runId) throws Exception {
        //Do your magic!!!
        return new RunObject();
    }

    @Override
    public AssistantObject createAssistant(Http.Request request, CreateAssistantRequest createAssistantRequest) throws Exception {
        //Do your magic!!!
        return new AssistantObject();
    }

    @Override
    public AssistantFileObject createAssistantFile(Http.Request request, String assistantId, CreateAssistantFileRequest createAssistantFileRequest) throws Exception {
        //Do your magic!!!
        return new AssistantFileObject();
    }

    @Override
    public MessageObject createMessage(Http.Request request, String threadId, CreateMessageRequest createMessageRequest) throws Exception {
        //Do your magic!!!
        return new MessageObject();
    }

    @Override
    public RunObject createRun(Http.Request request, String threadId, CreateRunRequest createRunRequest) throws Exception {
        //Do your magic!!!
        return new RunObject();
    }

    @Override
    public ThreadObject createThread(Http.Request request, CreateThreadRequest createThreadRequest) throws Exception {
        //Do your magic!!!
        return new ThreadObject();
    }

    @Override
    public RunObject createThreadAndRun(Http.Request request, CreateThreadAndRunRequest createThreadAndRunRequest) throws Exception {
        //Do your magic!!!
        return new RunObject();
    }

    @Override
    public DeleteAssistantResponse deleteAssistant(Http.Request request, String assistantId) throws Exception {
        //Do your magic!!!
        return new DeleteAssistantResponse();
    }

    @Override
    public DeleteAssistantFileResponse deleteAssistantFile(Http.Request request, String assistantId, String fileId) throws Exception {
        //Do your magic!!!
        return new DeleteAssistantFileResponse();
    }

    @Override
    public DeleteThreadResponse deleteThread(Http.Request request, String threadId) throws Exception {
        //Do your magic!!!
        return new DeleteThreadResponse();
    }

    @Override
    public AssistantObject getAssistant(Http.Request request, String assistantId) throws Exception {
        //Do your magic!!!
        return new AssistantObject();
    }

    @Override
    public AssistantFileObject getAssistantFile(Http.Request request, String assistantId, String fileId) throws Exception {
        //Do your magic!!!
        return new AssistantFileObject();
    }

    @Override
    public MessageObject getMessage(Http.Request request, String threadId, String messageId) throws Exception {
        //Do your magic!!!
        return new MessageObject();
    }

    @Override
    public MessageFileObject getMessageFile(Http.Request request, String threadId, String messageId, String fileId) throws Exception {
        //Do your magic!!!
        return new MessageFileObject();
    }

    @Override
    public RunObject getRun(Http.Request request, String threadId, String runId) throws Exception {
        //Do your magic!!!
        return new RunObject();
    }

    @Override
    public RunStepObject getRunStep(Http.Request request, String threadId, String runId, String stepId) throws Exception {
        //Do your magic!!!
        return new RunStepObject();
    }

    @Override
    public ThreadObject getThread(Http.Request request, String threadId) throws Exception {
        //Do your magic!!!
        return new ThreadObject();
    }

    @Override
    public ListAssistantFilesResponse listAssistantFiles(Http.Request request, String assistantId, Integer limit, String order, String after, String before) throws Exception {
        //Do your magic!!!
        return new ListAssistantFilesResponse();
    }

    @Override
    public ListAssistantsResponse listAssistants(Http.Request request, Integer limit, String order, String after, String before) throws Exception {
        //Do your magic!!!
        return new ListAssistantsResponse();
    }

    @Override
    public ListMessageFilesResponse listMessageFiles(Http.Request request, String threadId, String messageId, Integer limit, String order, String after, String before) throws Exception {
        //Do your magic!!!
        return new ListMessageFilesResponse();
    }

    @Override
    public ListMessagesResponse listMessages(Http.Request request, String threadId, Integer limit, String order, String after, String before, String runId) throws Exception {
        //Do your magic!!!
        return new ListMessagesResponse();
    }

    @Override
    public ListRunStepsResponse listRunSteps(Http.Request request, String threadId, String runId, Integer limit, String order, String after, String before) throws Exception {
        //Do your magic!!!
        return new ListRunStepsResponse();
    }

    @Override
    public ListRunsResponse listRuns(Http.Request request, String threadId, Integer limit, String order, String after, String before) throws Exception {
        //Do your magic!!!
        return new ListRunsResponse();
    }

    @Override
    public AssistantObject modifyAssistant(Http.Request request, String assistantId, ModifyAssistantRequest modifyAssistantRequest) throws Exception {
        //Do your magic!!!
        return new AssistantObject();
    }

    @Override
    public MessageObject modifyMessage(Http.Request request, String threadId, String messageId, ModifyMessageRequest modifyMessageRequest) throws Exception {
        //Do your magic!!!
        return new MessageObject();
    }

    @Override
    public RunObject modifyRun(Http.Request request, String threadId, String runId, ModifyRunRequest modifyRunRequest) throws Exception {
        //Do your magic!!!
        return new RunObject();
    }

    @Override
    public ThreadObject modifyThread(Http.Request request, String threadId, ModifyThreadRequest modifyThreadRequest) throws Exception {
        //Do your magic!!!
        return new ThreadObject();
    }

    @Override
    public RunObject submitToolOuputsToRun(Http.Request request, String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest) throws Exception {
        //Do your magic!!!
        return new RunObject();
    }

}
