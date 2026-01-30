package controllers;

import apimodels.AssistantObject;
import apimodels.CreateAssistantRequest;
import apimodels.CreateMessageRequest;
import apimodels.CreateRunRequest;
import apimodels.CreateThreadAndRunRequest;
import apimodels.CreateThreadRequest;
import apimodels.DeleteAssistantResponse;
import apimodels.DeleteMessageResponse;
import apimodels.DeleteThreadResponse;
import apimodels.ListAssistantsResponse;
import apimodels.ListMessagesResponse;
import apimodels.ListRunStepsResponse;
import apimodels.ListRunsResponse;
import apimodels.MessageObject;
import apimodels.ModifyAssistantRequest;
import apimodels.ModifyMessageRequest;
import apimodels.ModifyRunRequest;
import apimodels.ModifyThreadRequest;
import apimodels.RunObject;
import apimodels.RunStepObject;
import apimodels.SubmitToolOutputsRunRequest;
import apimodels.ThreadObject;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantsApiController extends Controller {
    private final AssistantsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private AssistantsApiController(Config configuration, AssistantsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result cancelRun(Http.Request request, String threadId,String runId) throws Exception {
        return imp.cancelRunHttp(request, threadId, runId);
    }

    @ApiAction
    public Result createAssistant(Http.Request request) throws Exception {
        JsonNode nodecreateAssistantRequest = request.body().asJson();
        CreateAssistantRequest createAssistantRequest;
        if (nodecreateAssistantRequest != null) {
            createAssistantRequest = mapper.readValue(nodecreateAssistantRequest.toString(), CreateAssistantRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createAssistantRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateAssistantRequest' parameter is required");
        }
        return imp.createAssistantHttp(request, createAssistantRequest);
    }

    @ApiAction
    public Result createMessage(Http.Request request, String threadId) throws Exception {
        JsonNode nodecreateMessageRequest = request.body().asJson();
        CreateMessageRequest createMessageRequest;
        if (nodecreateMessageRequest != null) {
            createMessageRequest = mapper.readValue(nodecreateMessageRequest.toString(), CreateMessageRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createMessageRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateMessageRequest' parameter is required");
        }
        return imp.createMessageHttp(request, threadId, createMessageRequest);
    }

    @ApiAction
    public Result createRun(Http.Request request, String threadId) throws Exception {
        JsonNode nodecreateRunRequest = request.body().asJson();
        CreateRunRequest createRunRequest;
        if (nodecreateRunRequest != null) {
            createRunRequest = mapper.readValue(nodecreateRunRequest.toString(), CreateRunRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createRunRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateRunRequest' parameter is required");
        }
        String[] includeArray = request.queryString().get("include[]");
        List<String> includeList = OpenAPIUtils.parametersToList("multi", includeArray);
        List<String> include = new ArrayList<>();
        for (String curParam : includeList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                include.add(curParam);
            }
        }
        return imp.createRunHttp(request, threadId, createRunRequest, include);
    }

    @ApiAction
    public Result createThread(Http.Request request) throws Exception {
        JsonNode nodecreateThreadRequest = request.body().asJson();
        CreateThreadRequest createThreadRequest;
        if (nodecreateThreadRequest != null) {
            createThreadRequest = mapper.readValue(nodecreateThreadRequest.toString(), CreateThreadRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createThreadRequest);
            }
        } else {
            createThreadRequest = null;
        }
        return imp.createThreadHttp(request, createThreadRequest);
    }

    @ApiAction
    public Result createThreadAndRun(Http.Request request) throws Exception {
        JsonNode nodecreateThreadAndRunRequest = request.body().asJson();
        CreateThreadAndRunRequest createThreadAndRunRequest;
        if (nodecreateThreadAndRunRequest != null) {
            createThreadAndRunRequest = mapper.readValue(nodecreateThreadAndRunRequest.toString(), CreateThreadAndRunRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(createThreadAndRunRequest);
            }
        } else {
            throw new IllegalArgumentException("'CreateThreadAndRunRequest' parameter is required");
        }
        return imp.createThreadAndRunHttp(request, createThreadAndRunRequest);
    }

    @ApiAction
    public Result deleteAssistant(Http.Request request, String assistantId) throws Exception {
        return imp.deleteAssistantHttp(request, assistantId);
    }

    @ApiAction
    public Result deleteMessage(Http.Request request, String threadId,String messageId) throws Exception {
        return imp.deleteMessageHttp(request, threadId, messageId);
    }

    @ApiAction
    public Result deleteThread(Http.Request request, String threadId) throws Exception {
        return imp.deleteThreadHttp(request, threadId);
    }

    @ApiAction
    public Result getAssistant(Http.Request request, String assistantId) throws Exception {
        return imp.getAssistantHttp(request, assistantId);
    }

    @ApiAction
    public Result getMessage(Http.Request request, String threadId,String messageId) throws Exception {
        return imp.getMessageHttp(request, threadId, messageId);
    }

    @ApiAction
    public Result getRun(Http.Request request, String threadId,String runId) throws Exception {
        return imp.getRunHttp(request, threadId, runId);
    }

    @ApiAction
    public Result getRunStep(Http.Request request, String threadId,String runId,String stepId) throws Exception {
        String[] includeArray = request.queryString().get("include[]");
        List<String> includeList = OpenAPIUtils.parametersToList("multi", includeArray);
        List<String> include = new ArrayList<>();
        for (String curParam : includeList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                include.add(curParam);
            }
        }
        return imp.getRunStepHttp(request, threadId, runId, stepId, include);
    }

    @ApiAction
    public Result getThread(Http.Request request, String threadId) throws Exception {
        return imp.getThreadHttp(request, threadId);
    }

    @ApiAction
    public Result listAssistants(Http.Request request) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = "desc";
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuebefore = request.getQueryString("before");
        String before;
        if (valuebefore != null) {
            before = valuebefore;
        } else {
            before = null;
        }
        return imp.listAssistantsHttp(request, limit, order, after, before);
    }

    @ApiAction
    public Result listMessages(Http.Request request, String threadId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = "desc";
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuebefore = request.getQueryString("before");
        String before;
        if (valuebefore != null) {
            before = valuebefore;
        } else {
            before = null;
        }
        String valuerunId = request.getQueryString("run_id");
        String runId;
        if (valuerunId != null) {
            runId = valuerunId;
        } else {
            runId = null;
        }
        return imp.listMessagesHttp(request, threadId, limit, order, after, before, runId);
    }

    @ApiAction
    public Result listRunSteps(Http.Request request, String threadId,String runId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = "desc";
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuebefore = request.getQueryString("before");
        String before;
        if (valuebefore != null) {
            before = valuebefore;
        } else {
            before = null;
        }
        String[] includeArray = request.queryString().get("include[]");
        List<String> includeList = OpenAPIUtils.parametersToList("multi", includeArray);
        List<String> include = new ArrayList<>();
        for (String curParam : includeList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                include.add(curParam);
            }
        }
        return imp.listRunStepsHttp(request, threadId, runId, limit, order, after, before, include);
    }

    @ApiAction
    public Result listRuns(Http.Request request, String threadId) throws Exception {
        String valuelimit = request.getQueryString("limit");
        Integer limit;
        if (valuelimit != null) {
            limit = Integer.parseInt(valuelimit);
        } else {
            limit = 20;
        }
        String valueorder = request.getQueryString("order");
        String order;
        if (valueorder != null) {
            order = valueorder;
        } else {
            order = "desc";
        }
        String valueafter = request.getQueryString("after");
        String after;
        if (valueafter != null) {
            after = valueafter;
        } else {
            after = null;
        }
        String valuebefore = request.getQueryString("before");
        String before;
        if (valuebefore != null) {
            before = valuebefore;
        } else {
            before = null;
        }
        return imp.listRunsHttp(request, threadId, limit, order, after, before);
    }

    @ApiAction
    public Result modifyAssistant(Http.Request request, String assistantId) throws Exception {
        JsonNode nodemodifyAssistantRequest = request.body().asJson();
        ModifyAssistantRequest modifyAssistantRequest;
        if (nodemodifyAssistantRequest != null) {
            modifyAssistantRequest = mapper.readValue(nodemodifyAssistantRequest.toString(), ModifyAssistantRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(modifyAssistantRequest);
            }
        } else {
            throw new IllegalArgumentException("'ModifyAssistantRequest' parameter is required");
        }
        return imp.modifyAssistantHttp(request, assistantId, modifyAssistantRequest);
    }

    @ApiAction
    public Result modifyMessage(Http.Request request, String threadId,String messageId) throws Exception {
        JsonNode nodemodifyMessageRequest = request.body().asJson();
        ModifyMessageRequest modifyMessageRequest;
        if (nodemodifyMessageRequest != null) {
            modifyMessageRequest = mapper.readValue(nodemodifyMessageRequest.toString(), ModifyMessageRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(modifyMessageRequest);
            }
        } else {
            throw new IllegalArgumentException("'ModifyMessageRequest' parameter is required");
        }
        return imp.modifyMessageHttp(request, threadId, messageId, modifyMessageRequest);
    }

    @ApiAction
    public Result modifyRun(Http.Request request, String threadId,String runId) throws Exception {
        JsonNode nodemodifyRunRequest = request.body().asJson();
        ModifyRunRequest modifyRunRequest;
        if (nodemodifyRunRequest != null) {
            modifyRunRequest = mapper.readValue(nodemodifyRunRequest.toString(), ModifyRunRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(modifyRunRequest);
            }
        } else {
            throw new IllegalArgumentException("'ModifyRunRequest' parameter is required");
        }
        return imp.modifyRunHttp(request, threadId, runId, modifyRunRequest);
    }

    @ApiAction
    public Result modifyThread(Http.Request request, String threadId) throws Exception {
        JsonNode nodemodifyThreadRequest = request.body().asJson();
        ModifyThreadRequest modifyThreadRequest;
        if (nodemodifyThreadRequest != null) {
            modifyThreadRequest = mapper.readValue(nodemodifyThreadRequest.toString(), ModifyThreadRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(modifyThreadRequest);
            }
        } else {
            throw new IllegalArgumentException("'ModifyThreadRequest' parameter is required");
        }
        return imp.modifyThreadHttp(request, threadId, modifyThreadRequest);
    }

    @ApiAction
    public Result submitToolOuputsToRun(Http.Request request, String threadId,String runId) throws Exception {
        JsonNode nodesubmitToolOutputsRunRequest = request.body().asJson();
        SubmitToolOutputsRunRequest submitToolOutputsRunRequest;
        if (nodesubmitToolOutputsRunRequest != null) {
            submitToolOutputsRunRequest = mapper.readValue(nodesubmitToolOutputsRunRequest.toString(), SubmitToolOutputsRunRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(submitToolOutputsRunRequest);
            }
        } else {
            throw new IllegalArgumentException("'SubmitToolOutputsRunRequest' parameter is required");
        }
        return imp.submitToolOuputsToRunHttp(request, threadId, runId, submitToolOutputsRunRequest);
    }

}
