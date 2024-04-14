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

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class AssistantsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result cancelRunHttp(Http.Request request, String threadId, String runId) throws Exception {
        RunObject obj = cancelRun(request, threadId, runId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RunObject cancelRun(Http.Request request, String threadId, String runId) throws Exception;

    public Result createAssistantHttp(Http.Request request, CreateAssistantRequest createAssistantRequest) throws Exception {
        AssistantObject obj = createAssistant(request, createAssistantRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssistantObject createAssistant(Http.Request request, CreateAssistantRequest createAssistantRequest) throws Exception;

    public Result createAssistantFileHttp(Http.Request request, String assistantId, CreateAssistantFileRequest createAssistantFileRequest) throws Exception {
        AssistantFileObject obj = createAssistantFile(request, assistantId, createAssistantFileRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssistantFileObject createAssistantFile(Http.Request request, String assistantId, CreateAssistantFileRequest createAssistantFileRequest) throws Exception;

    public Result createMessageHttp(Http.Request request, String threadId, CreateMessageRequest createMessageRequest) throws Exception {
        MessageObject obj = createMessage(request, threadId, createMessageRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MessageObject createMessage(Http.Request request, String threadId, CreateMessageRequest createMessageRequest) throws Exception;

    public Result createRunHttp(Http.Request request, String threadId, CreateRunRequest createRunRequest) throws Exception {
        RunObject obj = createRun(request, threadId, createRunRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RunObject createRun(Http.Request request, String threadId, CreateRunRequest createRunRequest) throws Exception;

    public Result createThreadHttp(Http.Request request, CreateThreadRequest createThreadRequest) throws Exception {
        ThreadObject obj = createThread(request, createThreadRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ThreadObject createThread(Http.Request request, CreateThreadRequest createThreadRequest) throws Exception;

    public Result createThreadAndRunHttp(Http.Request request, CreateThreadAndRunRequest createThreadAndRunRequest) throws Exception {
        RunObject obj = createThreadAndRun(request, createThreadAndRunRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RunObject createThreadAndRun(Http.Request request, CreateThreadAndRunRequest createThreadAndRunRequest) throws Exception;

    public Result deleteAssistantHttp(Http.Request request, String assistantId) throws Exception {
        DeleteAssistantResponse obj = deleteAssistant(request, assistantId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteAssistantResponse deleteAssistant(Http.Request request, String assistantId) throws Exception;

    public Result deleteAssistantFileHttp(Http.Request request, String assistantId, String fileId) throws Exception {
        DeleteAssistantFileResponse obj = deleteAssistantFile(request, assistantId, fileId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteAssistantFileResponse deleteAssistantFile(Http.Request request, String assistantId, String fileId) throws Exception;

    public Result deleteThreadHttp(Http.Request request, String threadId) throws Exception {
        DeleteThreadResponse obj = deleteThread(request, threadId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract DeleteThreadResponse deleteThread(Http.Request request, String threadId) throws Exception;

    public Result getAssistantHttp(Http.Request request, String assistantId) throws Exception {
        AssistantObject obj = getAssistant(request, assistantId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssistantObject getAssistant(Http.Request request, String assistantId) throws Exception;

    public Result getAssistantFileHttp(Http.Request request, String assistantId, String fileId) throws Exception {
        AssistantFileObject obj = getAssistantFile(request, assistantId, fileId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssistantFileObject getAssistantFile(Http.Request request, String assistantId, String fileId) throws Exception;

    public Result getMessageHttp(Http.Request request, String threadId, String messageId) throws Exception {
        MessageObject obj = getMessage(request, threadId, messageId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MessageObject getMessage(Http.Request request, String threadId, String messageId) throws Exception;

    public Result getMessageFileHttp(Http.Request request, String threadId, String messageId, String fileId) throws Exception {
        MessageFileObject obj = getMessageFile(request, threadId, messageId, fileId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MessageFileObject getMessageFile(Http.Request request, String threadId, String messageId, String fileId) throws Exception;

    public Result getRunHttp(Http.Request request, String threadId, String runId) throws Exception {
        RunObject obj = getRun(request, threadId, runId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RunObject getRun(Http.Request request, String threadId, String runId) throws Exception;

    public Result getRunStepHttp(Http.Request request, String threadId, String runId, String stepId) throws Exception {
        RunStepObject obj = getRunStep(request, threadId, runId, stepId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RunStepObject getRunStep(Http.Request request, String threadId, String runId, String stepId) throws Exception;

    public Result getThreadHttp(Http.Request request, String threadId) throws Exception {
        ThreadObject obj = getThread(request, threadId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ThreadObject getThread(Http.Request request, String threadId) throws Exception;

    public Result listAssistantFilesHttp(Http.Request request, String assistantId, Integer limit, String order, String after, String before) throws Exception {
        ListAssistantFilesResponse obj = listAssistantFiles(request, assistantId, limit, order, after, before);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListAssistantFilesResponse listAssistantFiles(Http.Request request, String assistantId, Integer limit, String order, String after, String before) throws Exception;

    public Result listAssistantsHttp(Http.Request request, Integer limit, String order, String after, String before) throws Exception {
        ListAssistantsResponse obj = listAssistants(request, limit, order, after, before);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListAssistantsResponse listAssistants(Http.Request request, Integer limit, String order, String after, String before) throws Exception;

    public Result listMessageFilesHttp(Http.Request request, String threadId, String messageId, Integer limit, String order, String after, String before) throws Exception {
        ListMessageFilesResponse obj = listMessageFiles(request, threadId, messageId, limit, order, after, before);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListMessageFilesResponse listMessageFiles(Http.Request request, String threadId, String messageId, Integer limit, String order, String after, String before) throws Exception;

    public Result listMessagesHttp(Http.Request request, String threadId, Integer limit, String order, String after, String before, String runId) throws Exception {
        ListMessagesResponse obj = listMessages(request, threadId, limit, order, after, before, runId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListMessagesResponse listMessages(Http.Request request, String threadId, Integer limit, String order, String after, String before, String runId) throws Exception;

    public Result listRunStepsHttp(Http.Request request, String threadId, String runId, Integer limit, String order, String after, String before) throws Exception {
        ListRunStepsResponse obj = listRunSteps(request, threadId, runId, limit, order, after, before);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListRunStepsResponse listRunSteps(Http.Request request, String threadId, String runId, Integer limit, String order, String after, String before) throws Exception;

    public Result listRunsHttp(Http.Request request, String threadId, Integer limit, String order, String after, String before) throws Exception {
        ListRunsResponse obj = listRuns(request, threadId, limit, order, after, before);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ListRunsResponse listRuns(Http.Request request, String threadId, Integer limit, String order, String after, String before) throws Exception;

    public Result modifyAssistantHttp(Http.Request request, String assistantId, ModifyAssistantRequest modifyAssistantRequest) throws Exception {
        AssistantObject obj = modifyAssistant(request, assistantId, modifyAssistantRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract AssistantObject modifyAssistant(Http.Request request, String assistantId, ModifyAssistantRequest modifyAssistantRequest) throws Exception;

    public Result modifyMessageHttp(Http.Request request, String threadId, String messageId, ModifyMessageRequest modifyMessageRequest) throws Exception {
        MessageObject obj = modifyMessage(request, threadId, messageId, modifyMessageRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract MessageObject modifyMessage(Http.Request request, String threadId, String messageId, ModifyMessageRequest modifyMessageRequest) throws Exception;

    public Result modifyRunHttp(Http.Request request, String threadId, String runId, ModifyRunRequest modifyRunRequest) throws Exception {
        RunObject obj = modifyRun(request, threadId, runId, modifyRunRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RunObject modifyRun(Http.Request request, String threadId, String runId, ModifyRunRequest modifyRunRequest) throws Exception;

    public Result modifyThreadHttp(Http.Request request, String threadId, ModifyThreadRequest modifyThreadRequest) throws Exception {
        ThreadObject obj = modifyThread(request, threadId, modifyThreadRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract ThreadObject modifyThread(Http.Request request, String threadId, ModifyThreadRequest modifyThreadRequest) throws Exception;

    public Result submitToolOuputsToRunHttp(Http.Request request, String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest) throws Exception {
        RunObject obj = submitToolOuputsToRun(request, threadId, runId, submitToolOutputsRunRequest);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract RunObject submitToolOuputsToRun(Http.Request request, String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest) throws Exception;

}
