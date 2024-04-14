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

public final class AssistantsApiException extends MainApiException {
    public AssistantsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final AssistantsApiException Assistants_cancelRun_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_createAssistant_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_createAssistantFile_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_createMessage_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_createRun_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_createThread_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_createThreadAndRun_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_deleteAssistant_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_deleteAssistantFile_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_deleteThread_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_getAssistant_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_getAssistantFile_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_getMessage_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_getMessageFile_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_getRun_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_getRunStep_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_getThread_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_listAssistantFiles_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_listAssistants_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_listMessageFiles_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_listMessages_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_listRunSteps_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_listRuns_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_modifyAssistant_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_modifyMessage_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_modifyRun_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_modifyThread_200_Exception = new AssistantsApiException(200, "OK");
    public static final AssistantsApiException Assistants_submitToolOuputsToRun_200_Exception = new AssistantsApiException(200, "OK");
    

}