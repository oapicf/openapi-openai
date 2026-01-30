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

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class AssistantsApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(AssistantsApiHandler.class);

    private final AssistantsApi api;

    public AssistantsApiHandler(AssistantsApi api) {
        this.api = api;
    }

    @Deprecated
    public AssistantsApiHandler() {
        this(new AssistantsApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("cancelRun").handler(this::cancelRun);
        builder.operation("createAssistant").handler(this::createAssistant);
        builder.operation("createMessage").handler(this::createMessage);
        builder.operation("createRun").handler(this::createRun);
        builder.operation("createThread").handler(this::createThread);
        builder.operation("createThreadAndRun").handler(this::createThreadAndRun);
        builder.operation("deleteAssistant").handler(this::deleteAssistant);
        builder.operation("deleteMessage").handler(this::deleteMessage);
        builder.operation("deleteThread").handler(this::deleteThread);
        builder.operation("getAssistant").handler(this::getAssistant);
        builder.operation("getMessage").handler(this::getMessage);
        builder.operation("getRun").handler(this::getRun);
        builder.operation("getRunStep").handler(this::getRunStep);
        builder.operation("getThread").handler(this::getThread);
        builder.operation("listAssistants").handler(this::listAssistants);
        builder.operation("listMessages").handler(this::listMessages);
        builder.operation("listRunSteps").handler(this::listRunSteps);
        builder.operation("listRuns").handler(this::listRuns);
        builder.operation("modifyAssistant").handler(this::modifyAssistant);
        builder.operation("modifyMessage").handler(this::modifyMessage);
        builder.operation("modifyRun").handler(this::modifyRun);
        builder.operation("modifyThread").handler(this::modifyThread);
        builder.operation("submitToolOuputsToRun").handler(this::submitToolOuputsToRun);
    }

    private void cancelRun(RoutingContext routingContext) {
        logger.info("cancelRun()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        String runId = requestParameters.pathParameter("run_id") != null ? requestParameters.pathParameter("run_id").getString() : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter runId is {}", runId);

        api.cancelRun(threadId, runId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createAssistant(RoutingContext routingContext) {
        logger.info("createAssistant()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateAssistantRequest createAssistantRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateAssistantRequest>(){}) : null;

        logger.debug("Parameter createAssistantRequest is {}", createAssistantRequest);

        api.createAssistant(createAssistantRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createMessage(RoutingContext routingContext) {
        logger.info("createMessage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CreateMessageRequest createMessageRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateMessageRequest>(){}) : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter createMessageRequest is {}", createMessageRequest);

        api.createMessage(threadId, createMessageRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createRun(RoutingContext routingContext) {
        logger.info("createRun()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        RequestParameter body = requestParameters.body();
        CreateRunRequest createRunRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateRunRequest>(){}) : null;
        List<String> include = requestParameters.queryParameter("include[]") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("include[]").get(), new TypeReference<List<String>>(){}) : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter createRunRequest is {}", createRunRequest);
        logger.debug("Parameter include is {}", include);

        api.createRun(threadId, createRunRequest, include)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createThread(RoutingContext routingContext) {
        logger.info("createThread()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateThreadRequest createThreadRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateThreadRequest>(){}) : null;

        logger.debug("Parameter createThreadRequest is {}", createThreadRequest);

        api.createThread(createThreadRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void createThreadAndRun(RoutingContext routingContext) {
        logger.info("createThreadAndRun()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        RequestParameter body = requestParameters.body();
        CreateThreadAndRunRequest createThreadAndRunRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<CreateThreadAndRunRequest>(){}) : null;

        logger.debug("Parameter createThreadAndRunRequest is {}", createThreadAndRunRequest);

        api.createThreadAndRun(createThreadAndRunRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteAssistant(RoutingContext routingContext) {
        logger.info("deleteAssistant()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String assistantId = requestParameters.pathParameter("assistant_id") != null ? requestParameters.pathParameter("assistant_id").getString() : null;

        logger.debug("Parameter assistantId is {}", assistantId);

        api.deleteAssistant(assistantId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteMessage(RoutingContext routingContext) {
        logger.info("deleteMessage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        String messageId = requestParameters.pathParameter("message_id") != null ? requestParameters.pathParameter("message_id").getString() : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter messageId is {}", messageId);

        api.deleteMessage(threadId, messageId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void deleteThread(RoutingContext routingContext) {
        logger.info("deleteThread()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;

        logger.debug("Parameter threadId is {}", threadId);

        api.deleteThread(threadId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getAssistant(RoutingContext routingContext) {
        logger.info("getAssistant()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String assistantId = requestParameters.pathParameter("assistant_id") != null ? requestParameters.pathParameter("assistant_id").getString() : null;

        logger.debug("Parameter assistantId is {}", assistantId);

        api.getAssistant(assistantId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getMessage(RoutingContext routingContext) {
        logger.info("getMessage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        String messageId = requestParameters.pathParameter("message_id") != null ? requestParameters.pathParameter("message_id").getString() : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter messageId is {}", messageId);

        api.getMessage(threadId, messageId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getRun(RoutingContext routingContext) {
        logger.info("getRun()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        String runId = requestParameters.pathParameter("run_id") != null ? requestParameters.pathParameter("run_id").getString() : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter runId is {}", runId);

        api.getRun(threadId, runId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getRunStep(RoutingContext routingContext) {
        logger.info("getRunStep()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        String runId = requestParameters.pathParameter("run_id") != null ? requestParameters.pathParameter("run_id").getString() : null;
        String stepId = requestParameters.pathParameter("step_id") != null ? requestParameters.pathParameter("step_id").getString() : null;
        List<String> include = requestParameters.queryParameter("include[]") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("include[]").get(), new TypeReference<List<String>>(){}) : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter runId is {}", runId);
        logger.debug("Parameter stepId is {}", stepId);
        logger.debug("Parameter include is {}", include);

        api.getRunStep(threadId, runId, stepId, include)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getThread(RoutingContext routingContext) {
        logger.info("getThread()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;

        logger.debug("Parameter threadId is {}", threadId);

        api.getThread(threadId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void listAssistants(RoutingContext routingContext) {
        logger.info("listAssistants()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : "desc";
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        String before = requestParameters.queryParameter("before") != null ? requestParameters.queryParameter("before").getString() : null;

        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter before is {}", before);

        api.listAssistants(limit, order, after, before)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void listMessages(RoutingContext routingContext) {
        logger.info("listMessages()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : "desc";
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        String before = requestParameters.queryParameter("before") != null ? requestParameters.queryParameter("before").getString() : null;
        String runId = requestParameters.queryParameter("run_id") != null ? requestParameters.queryParameter("run_id").getString() : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter before is {}", before);
        logger.debug("Parameter runId is {}", runId);

        api.listMessages(threadId, limit, order, after, before, runId)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void listRunSteps(RoutingContext routingContext) {
        logger.info("listRunSteps()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        String runId = requestParameters.pathParameter("run_id") != null ? requestParameters.pathParameter("run_id").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : "desc";
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        String before = requestParameters.queryParameter("before") != null ? requestParameters.queryParameter("before").getString() : null;
        List<String> include = requestParameters.queryParameter("include[]") != null ? DatabindCodec.mapper().convertValue(requestParameters.queryParameter("include[]").get(), new TypeReference<List<String>>(){}) : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter runId is {}", runId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter before is {}", before);
        logger.debug("Parameter include is {}", include);

        api.listRunSteps(threadId, runId, limit, order, after, before, include)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void listRuns(RoutingContext routingContext) {
        logger.info("listRuns()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        Integer limit = requestParameters.queryParameter("limit") != null ? requestParameters.queryParameter("limit").getInteger() : 20;
        String order = requestParameters.queryParameter("order") != null ? requestParameters.queryParameter("order").getString() : "desc";
        String after = requestParameters.queryParameter("after") != null ? requestParameters.queryParameter("after").getString() : null;
        String before = requestParameters.queryParameter("before") != null ? requestParameters.queryParameter("before").getString() : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter limit is {}", limit);
        logger.debug("Parameter order is {}", order);
        logger.debug("Parameter after is {}", after);
        logger.debug("Parameter before is {}", before);

        api.listRuns(threadId, limit, order, after, before)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void modifyAssistant(RoutingContext routingContext) {
        logger.info("modifyAssistant()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String assistantId = requestParameters.pathParameter("assistant_id") != null ? requestParameters.pathParameter("assistant_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ModifyAssistantRequest modifyAssistantRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ModifyAssistantRequest>(){}) : null;

        logger.debug("Parameter assistantId is {}", assistantId);
        logger.debug("Parameter modifyAssistantRequest is {}", modifyAssistantRequest);

        api.modifyAssistant(assistantId, modifyAssistantRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void modifyMessage(RoutingContext routingContext) {
        logger.info("modifyMessage()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        String messageId = requestParameters.pathParameter("message_id") != null ? requestParameters.pathParameter("message_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ModifyMessageRequest modifyMessageRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ModifyMessageRequest>(){}) : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter messageId is {}", messageId);
        logger.debug("Parameter modifyMessageRequest is {}", modifyMessageRequest);

        api.modifyMessage(threadId, messageId, modifyMessageRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void modifyRun(RoutingContext routingContext) {
        logger.info("modifyRun()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        String runId = requestParameters.pathParameter("run_id") != null ? requestParameters.pathParameter("run_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ModifyRunRequest modifyRunRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ModifyRunRequest>(){}) : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter runId is {}", runId);
        logger.debug("Parameter modifyRunRequest is {}", modifyRunRequest);

        api.modifyRun(threadId, runId, modifyRunRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void modifyThread(RoutingContext routingContext) {
        logger.info("modifyThread()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        RequestParameter body = requestParameters.body();
        ModifyThreadRequest modifyThreadRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<ModifyThreadRequest>(){}) : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter modifyThreadRequest is {}", modifyThreadRequest);

        api.modifyThread(threadId, modifyThreadRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void submitToolOuputsToRun(RoutingContext routingContext) {
        logger.info("submitToolOuputsToRun()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String threadId = requestParameters.pathParameter("thread_id") != null ? requestParameters.pathParameter("thread_id").getString() : null;
        String runId = requestParameters.pathParameter("run_id") != null ? requestParameters.pathParameter("run_id").getString() : null;
        RequestParameter body = requestParameters.body();
        SubmitToolOutputsRunRequest submitToolOutputsRunRequest = body != null ? DatabindCodec.mapper().convertValue(body.get(), new TypeReference<SubmitToolOutputsRunRequest>(){}) : null;

        logger.debug("Parameter threadId is {}", threadId);
        logger.debug("Parameter runId is {}", runId);
        logger.debug("Parameter submitToolOutputsRunRequest is {}", submitToolOutputsRunRequest);

        api.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
