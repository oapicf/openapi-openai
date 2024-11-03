package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

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

import java.util.List;
import java.util.Map;

public class AssistantsApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(AssistantsApiVerticle.class);

    static final String CANCELRUN_SERVICE_ID = "cancelRun";
    static final String CREATEASSISTANT_SERVICE_ID = "createAssistant";
    static final String CREATEASSISTANTFILE_SERVICE_ID = "createAssistantFile";
    static final String CREATEMESSAGE_SERVICE_ID = "createMessage";
    static final String CREATERUN_SERVICE_ID = "createRun";
    static final String CREATETHREAD_SERVICE_ID = "createThread";
    static final String CREATETHREADANDRUN_SERVICE_ID = "createThreadAndRun";
    static final String DELETEASSISTANT_SERVICE_ID = "deleteAssistant";
    static final String DELETEASSISTANTFILE_SERVICE_ID = "deleteAssistantFile";
    static final String DELETETHREAD_SERVICE_ID = "deleteThread";
    static final String GETASSISTANT_SERVICE_ID = "getAssistant";
    static final String GETASSISTANTFILE_SERVICE_ID = "getAssistantFile";
    static final String GETMESSAGE_SERVICE_ID = "getMessage";
    static final String GETMESSAGEFILE_SERVICE_ID = "getMessageFile";
    static final String GETRUN_SERVICE_ID = "getRun";
    static final String GETRUNSTEP_SERVICE_ID = "getRunStep";
    static final String GETTHREAD_SERVICE_ID = "getThread";
    static final String LISTASSISTANTFILES_SERVICE_ID = "listAssistantFiles";
    static final String LISTASSISTANTS_SERVICE_ID = "listAssistants";
    static final String LISTMESSAGEFILES_SERVICE_ID = "listMessageFiles";
    static final String LISTMESSAGES_SERVICE_ID = "listMessages";
    static final String LISTRUNSTEPS_SERVICE_ID = "listRunSteps";
    static final String LISTRUNS_SERVICE_ID = "listRuns";
    static final String MODIFYASSISTANT_SERVICE_ID = "modifyAssistant";
    static final String MODIFYMESSAGE_SERVICE_ID = "modifyMessage";
    static final String MODIFYRUN_SERVICE_ID = "modifyRun";
    static final String MODIFYTHREAD_SERVICE_ID = "modifyThread";
    static final String SUBMITTOOLOUPUTSTORUN_SERVICE_ID = "submitToolOuputsToRun";
    
    final AssistantsApi service;

    public AssistantsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.AssistantsApiImpl");
            service = (AssistantsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AssistantsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for cancelRun
        vertx.eventBus().<JsonObject> consumer(CANCELRUN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "cancelRun";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String runIdParam = message.body().getString("run_id");
                if(runIdParam == null) {
                    manageError(message, new MainApiException(400, "run_id is required"), serviceId);
                    return;
                }
                String runId = runIdParam;
                service.cancelRun(threadId, runId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "cancelRun");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("cancelRun", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createAssistant
        vertx.eventBus().<JsonObject> consumer(CREATEASSISTANT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createAssistant";
                JsonObject createAssistantRequestParam = message.body().getJsonObject("CreateAssistantRequest");
                if (createAssistantRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateAssistantRequest is required"), serviceId);
                    return;
                }
                CreateAssistantRequest createAssistantRequest = Json.mapper.readValue(createAssistantRequestParam.encode(), CreateAssistantRequest.class);
                service.createAssistant(createAssistantRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createAssistant");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createAssistant", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createAssistantFile
        vertx.eventBus().<JsonObject> consumer(CREATEASSISTANTFILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createAssistantFile";
                String assistantIdParam = message.body().getString("assistant_id");
                if(assistantIdParam == null) {
                    manageError(message, new MainApiException(400, "assistant_id is required"), serviceId);
                    return;
                }
                String assistantId = assistantIdParam;
                JsonObject createAssistantFileRequestParam = message.body().getJsonObject("CreateAssistantFileRequest");
                if (createAssistantFileRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateAssistantFileRequest is required"), serviceId);
                    return;
                }
                CreateAssistantFileRequest createAssistantFileRequest = Json.mapper.readValue(createAssistantFileRequestParam.encode(), CreateAssistantFileRequest.class);
                service.createAssistantFile(assistantId, createAssistantFileRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createAssistantFile");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createAssistantFile", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createMessage
        vertx.eventBus().<JsonObject> consumer(CREATEMESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createMessage";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                JsonObject createMessageRequestParam = message.body().getJsonObject("CreateMessageRequest");
                if (createMessageRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateMessageRequest is required"), serviceId);
                    return;
                }
                CreateMessageRequest createMessageRequest = Json.mapper.readValue(createMessageRequestParam.encode(), CreateMessageRequest.class);
                service.createMessage(threadId, createMessageRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createMessage");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createMessage", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createRun
        vertx.eventBus().<JsonObject> consumer(CREATERUN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createRun";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                JsonObject createRunRequestParam = message.body().getJsonObject("CreateRunRequest");
                if (createRunRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateRunRequest is required"), serviceId);
                    return;
                }
                CreateRunRequest createRunRequest = Json.mapper.readValue(createRunRequestParam.encode(), CreateRunRequest.class);
                service.createRun(threadId, createRunRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createRun");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createRun", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createThread
        vertx.eventBus().<JsonObject> consumer(CREATETHREAD_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createThread";
                JsonObject createThreadRequestParam = message.body().getJsonObject("CreateThreadRequest");
                if (createThreadRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateThreadRequest is required"), serviceId);
                    return;
                }
                CreateThreadRequest createThreadRequest = Json.mapper.readValue(createThreadRequestParam.encode(), CreateThreadRequest.class);
                service.createThread(createThreadRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createThread");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createThread", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for createThreadAndRun
        vertx.eventBus().<JsonObject> consumer(CREATETHREADANDRUN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "createThreadAndRun";
                JsonObject createThreadAndRunRequestParam = message.body().getJsonObject("CreateThreadAndRunRequest");
                if (createThreadAndRunRequestParam == null) {
                    manageError(message, new MainApiException(400, "CreateThreadAndRunRequest is required"), serviceId);
                    return;
                }
                CreateThreadAndRunRequest createThreadAndRunRequest = Json.mapper.readValue(createThreadAndRunRequestParam.encode(), CreateThreadAndRunRequest.class);
                service.createThreadAndRun(createThreadAndRunRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "createThreadAndRun");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("createThreadAndRun", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteAssistant
        vertx.eventBus().<JsonObject> consumer(DELETEASSISTANT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteAssistant";
                String assistantIdParam = message.body().getString("assistant_id");
                if(assistantIdParam == null) {
                    manageError(message, new MainApiException(400, "assistant_id is required"), serviceId);
                    return;
                }
                String assistantId = assistantIdParam;
                service.deleteAssistant(assistantId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteAssistant");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteAssistant", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteAssistantFile
        vertx.eventBus().<JsonObject> consumer(DELETEASSISTANTFILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteAssistantFile";
                String assistantIdParam = message.body().getString("assistant_id");
                if(assistantIdParam == null) {
                    manageError(message, new MainApiException(400, "assistant_id is required"), serviceId);
                    return;
                }
                String assistantId = assistantIdParam;
                String fileIdParam = message.body().getString("file_id");
                if(fileIdParam == null) {
                    manageError(message, new MainApiException(400, "file_id is required"), serviceId);
                    return;
                }
                String fileId = fileIdParam;
                service.deleteAssistantFile(assistantId, fileId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteAssistantFile");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteAssistantFile", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteThread
        vertx.eventBus().<JsonObject> consumer(DELETETHREAD_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteThread";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                service.deleteThread(threadId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteThread");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteThread", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getAssistant
        vertx.eventBus().<JsonObject> consumer(GETASSISTANT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAssistant";
                String assistantIdParam = message.body().getString("assistant_id");
                if(assistantIdParam == null) {
                    manageError(message, new MainApiException(400, "assistant_id is required"), serviceId);
                    return;
                }
                String assistantId = assistantIdParam;
                service.getAssistant(assistantId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAssistant");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAssistant", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getAssistantFile
        vertx.eventBus().<JsonObject> consumer(GETASSISTANTFILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAssistantFile";
                String assistantIdParam = message.body().getString("assistant_id");
                if(assistantIdParam == null) {
                    manageError(message, new MainApiException(400, "assistant_id is required"), serviceId);
                    return;
                }
                String assistantId = assistantIdParam;
                String fileIdParam = message.body().getString("file_id");
                if(fileIdParam == null) {
                    manageError(message, new MainApiException(400, "file_id is required"), serviceId);
                    return;
                }
                String fileId = fileIdParam;
                service.getAssistantFile(assistantId, fileId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAssistantFile");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAssistantFile", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getMessage
        vertx.eventBus().<JsonObject> consumer(GETMESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getMessage";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String messageIdParam = message.body().getString("message_id");
                if(messageIdParam == null) {
                    manageError(message, new MainApiException(400, "message_id is required"), serviceId);
                    return;
                }
                String messageId = messageIdParam;
                service.getMessage(threadId, messageId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getMessage");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getMessage", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getMessageFile
        vertx.eventBus().<JsonObject> consumer(GETMESSAGEFILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getMessageFile";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String messageIdParam = message.body().getString("message_id");
                if(messageIdParam == null) {
                    manageError(message, new MainApiException(400, "message_id is required"), serviceId);
                    return;
                }
                String messageId = messageIdParam;
                String fileIdParam = message.body().getString("file_id");
                if(fileIdParam == null) {
                    manageError(message, new MainApiException(400, "file_id is required"), serviceId);
                    return;
                }
                String fileId = fileIdParam;
                service.getMessageFile(threadId, messageId, fileId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getMessageFile");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getMessageFile", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getRun
        vertx.eventBus().<JsonObject> consumer(GETRUN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getRun";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String runIdParam = message.body().getString("run_id");
                if(runIdParam == null) {
                    manageError(message, new MainApiException(400, "run_id is required"), serviceId);
                    return;
                }
                String runId = runIdParam;
                service.getRun(threadId, runId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getRun");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getRun", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getRunStep
        vertx.eventBus().<JsonObject> consumer(GETRUNSTEP_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getRunStep";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String runIdParam = message.body().getString("run_id");
                if(runIdParam == null) {
                    manageError(message, new MainApiException(400, "run_id is required"), serviceId);
                    return;
                }
                String runId = runIdParam;
                String stepIdParam = message.body().getString("step_id");
                if(stepIdParam == null) {
                    manageError(message, new MainApiException(400, "step_id is required"), serviceId);
                    return;
                }
                String stepId = stepIdParam;
                service.getRunStep(threadId, runId, stepId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getRunStep");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getRunStep", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getThread
        vertx.eventBus().<JsonObject> consumer(GETTHREAD_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getThread";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                service.getThread(threadId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getThread");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getThread", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listAssistantFiles
        vertx.eventBus().<JsonObject> consumer(LISTASSISTANTFILES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listAssistantFiles";
                String assistantIdParam = message.body().getString("assistant_id");
                if(assistantIdParam == null) {
                    manageError(message, new MainApiException(400, "assistant_id is required"), serviceId);
                    return;
                }
                String assistantId = assistantIdParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 20 : Json.mapper.readValue(limitParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? "desc" : orderParam;
                String afterParam = message.body().getString("after");
                String after = (afterParam == null) ? null : afterParam;
                String beforeParam = message.body().getString("before");
                String before = (beforeParam == null) ? null : beforeParam;
                service.listAssistantFiles(assistantId, limit, order, after, before, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listAssistantFiles");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listAssistantFiles", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listAssistants
        vertx.eventBus().<JsonObject> consumer(LISTASSISTANTS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listAssistants";
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 20 : Json.mapper.readValue(limitParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? "desc" : orderParam;
                String afterParam = message.body().getString("after");
                String after = (afterParam == null) ? null : afterParam;
                String beforeParam = message.body().getString("before");
                String before = (beforeParam == null) ? null : beforeParam;
                service.listAssistants(limit, order, after, before, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listAssistants");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listAssistants", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listMessageFiles
        vertx.eventBus().<JsonObject> consumer(LISTMESSAGEFILES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listMessageFiles";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String messageIdParam = message.body().getString("message_id");
                if(messageIdParam == null) {
                    manageError(message, new MainApiException(400, "message_id is required"), serviceId);
                    return;
                }
                String messageId = messageIdParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 20 : Json.mapper.readValue(limitParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? "desc" : orderParam;
                String afterParam = message.body().getString("after");
                String after = (afterParam == null) ? null : afterParam;
                String beforeParam = message.body().getString("before");
                String before = (beforeParam == null) ? null : beforeParam;
                service.listMessageFiles(threadId, messageId, limit, order, after, before, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listMessageFiles");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listMessageFiles", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listMessages
        vertx.eventBus().<JsonObject> consumer(LISTMESSAGES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listMessages";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 20 : Json.mapper.readValue(limitParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? "desc" : orderParam;
                String afterParam = message.body().getString("after");
                String after = (afterParam == null) ? null : afterParam;
                String beforeParam = message.body().getString("before");
                String before = (beforeParam == null) ? null : beforeParam;
                String runIdParam = message.body().getString("run_id");
                String runId = (runIdParam == null) ? null : runIdParam;
                service.listMessages(threadId, limit, order, after, before, runId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listMessages");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listMessages", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listRunSteps
        vertx.eventBus().<JsonObject> consumer(LISTRUNSTEPS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listRunSteps";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String runIdParam = message.body().getString("run_id");
                if(runIdParam == null) {
                    manageError(message, new MainApiException(400, "run_id is required"), serviceId);
                    return;
                }
                String runId = runIdParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 20 : Json.mapper.readValue(limitParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? "desc" : orderParam;
                String afterParam = message.body().getString("after");
                String after = (afterParam == null) ? null : afterParam;
                String beforeParam = message.body().getString("before");
                String before = (beforeParam == null) ? null : beforeParam;
                service.listRunSteps(threadId, runId, limit, order, after, before, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listRunSteps");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listRunSteps", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listRuns
        vertx.eventBus().<JsonObject> consumer(LISTRUNS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listRuns";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String limitParam = message.body().getString("limit");
                Integer limit = (limitParam == null) ? 20 : Json.mapper.readValue(limitParam, Integer.class);
                String orderParam = message.body().getString("order");
                String order = (orderParam == null) ? "desc" : orderParam;
                String afterParam = message.body().getString("after");
                String after = (afterParam == null) ? null : afterParam;
                String beforeParam = message.body().getString("before");
                String before = (beforeParam == null) ? null : beforeParam;
                service.listRuns(threadId, limit, order, after, before, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listRuns");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listRuns", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for modifyAssistant
        vertx.eventBus().<JsonObject> consumer(MODIFYASSISTANT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "modifyAssistant";
                String assistantIdParam = message.body().getString("assistant_id");
                if(assistantIdParam == null) {
                    manageError(message, new MainApiException(400, "assistant_id is required"), serviceId);
                    return;
                }
                String assistantId = assistantIdParam;
                JsonObject modifyAssistantRequestParam = message.body().getJsonObject("ModifyAssistantRequest");
                if (modifyAssistantRequestParam == null) {
                    manageError(message, new MainApiException(400, "ModifyAssistantRequest is required"), serviceId);
                    return;
                }
                ModifyAssistantRequest modifyAssistantRequest = Json.mapper.readValue(modifyAssistantRequestParam.encode(), ModifyAssistantRequest.class);
                service.modifyAssistant(assistantId, modifyAssistantRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "modifyAssistant");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("modifyAssistant", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for modifyMessage
        vertx.eventBus().<JsonObject> consumer(MODIFYMESSAGE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "modifyMessage";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String messageIdParam = message.body().getString("message_id");
                if(messageIdParam == null) {
                    manageError(message, new MainApiException(400, "message_id is required"), serviceId);
                    return;
                }
                String messageId = messageIdParam;
                JsonObject modifyMessageRequestParam = message.body().getJsonObject("ModifyMessageRequest");
                if (modifyMessageRequestParam == null) {
                    manageError(message, new MainApiException(400, "ModifyMessageRequest is required"), serviceId);
                    return;
                }
                ModifyMessageRequest modifyMessageRequest = Json.mapper.readValue(modifyMessageRequestParam.encode(), ModifyMessageRequest.class);
                service.modifyMessage(threadId, messageId, modifyMessageRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "modifyMessage");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("modifyMessage", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for modifyRun
        vertx.eventBus().<JsonObject> consumer(MODIFYRUN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "modifyRun";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String runIdParam = message.body().getString("run_id");
                if(runIdParam == null) {
                    manageError(message, new MainApiException(400, "run_id is required"), serviceId);
                    return;
                }
                String runId = runIdParam;
                JsonObject modifyRunRequestParam = message.body().getJsonObject("ModifyRunRequest");
                if (modifyRunRequestParam == null) {
                    manageError(message, new MainApiException(400, "ModifyRunRequest is required"), serviceId);
                    return;
                }
                ModifyRunRequest modifyRunRequest = Json.mapper.readValue(modifyRunRequestParam.encode(), ModifyRunRequest.class);
                service.modifyRun(threadId, runId, modifyRunRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "modifyRun");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("modifyRun", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for modifyThread
        vertx.eventBus().<JsonObject> consumer(MODIFYTHREAD_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "modifyThread";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                JsonObject modifyThreadRequestParam = message.body().getJsonObject("ModifyThreadRequest");
                if (modifyThreadRequestParam == null) {
                    manageError(message, new MainApiException(400, "ModifyThreadRequest is required"), serviceId);
                    return;
                }
                ModifyThreadRequest modifyThreadRequest = Json.mapper.readValue(modifyThreadRequestParam.encode(), ModifyThreadRequest.class);
                service.modifyThread(threadId, modifyThreadRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "modifyThread");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("modifyThread", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for submitToolOuputsToRun
        vertx.eventBus().<JsonObject> consumer(SUBMITTOOLOUPUTSTORUN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "submitToolOuputsToRun";
                String threadIdParam = message.body().getString("thread_id");
                if(threadIdParam == null) {
                    manageError(message, new MainApiException(400, "thread_id is required"), serviceId);
                    return;
                }
                String threadId = threadIdParam;
                String runIdParam = message.body().getString("run_id");
                if(runIdParam == null) {
                    manageError(message, new MainApiException(400, "run_id is required"), serviceId);
                    return;
                }
                String runId = runIdParam;
                JsonObject submitToolOutputsRunRequestParam = message.body().getJsonObject("SubmitToolOutputsRunRequest");
                if (submitToolOutputsRunRequestParam == null) {
                    manageError(message, new MainApiException(400, "SubmitToolOutputsRunRequest is required"), serviceId);
                    return;
                }
                SubmitToolOutputsRunRequest submitToolOutputsRunRequest = Json.mapper.readValue(submitToolOutputsRunRequestParam.encode(), SubmitToolOutputsRunRequest.class);
                service.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "submitToolOuputsToRun");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("submitToolOuputsToRun", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
