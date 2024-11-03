package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateRunRequest;
import org.openapitools.model.CreateThreadAndRunRequest;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.DeleteThreadResponse;
import org.openapitools.model.ListMessageFilesResponse;
import org.openapitools.model.ListMessagesResponse;
import org.openapitools.model.ListRunStepsResponse;
import org.openapitools.model.ListRunsResponse;
import org.openapitools.model.MessageFileObject;
import org.openapitools.model.MessageObject;
import org.openapitools.model.ModifyMessageRequest;
import org.openapitools.model.ModifyRunRequest;
import org.openapitools.model.ModifyThreadRequest;
import org.openapitools.model.RunObject;
import org.openapitools.model.RunStepObject;
import org.openapitools.model.SubmitToolOutputsRunRequest;
import org.openapitools.model.ThreadObject;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-03T11:07:10.127704480Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public abstract class ThreadsApiService {
    public abstract Response cancelRun(String threadId
 ,String runId
 ) throws NotFoundException;
    public abstract Response createMessage(String threadId
 ,CreateMessageRequest createMessageRequest
 ) throws NotFoundException;
    public abstract Response createRun(String threadId
 ,CreateRunRequest createRunRequest
 ) throws NotFoundException;
    public abstract Response createThread(CreateThreadRequest createThreadRequest
 ) throws NotFoundException;
    public abstract Response createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest
 ) throws NotFoundException;
    public abstract Response deleteThread(String threadId
 ) throws NotFoundException;
    public abstract Response getMessage(String threadId
 ,String messageId
 ) throws NotFoundException;
    public abstract Response getMessageFile(String threadId
 ,String messageId
 ,String fileId
 ) throws NotFoundException;
    public abstract Response getRun(String threadId
 ,String runId
 ) throws NotFoundException;
    public abstract Response getRunStep(String threadId
 ,String runId
 ,String stepId
 ) throws NotFoundException;
    public abstract Response getThread(String threadId
 ) throws NotFoundException;
    public abstract Response listMessageFiles(String threadId
 ,String messageId
 ,Integer limit
 ,String order
 ,String after
 ,String before
 ) throws NotFoundException;
    public abstract Response listMessages(String threadId
 ,Integer limit
 ,String order
 ,String after
 ,String before
 ,String runId
 ) throws NotFoundException;
    public abstract Response listRunSteps(String threadId
 ,String runId
 ,Integer limit
 ,String order
 ,String after
 ,String before
 ) throws NotFoundException;
    public abstract Response listRuns(String threadId
 ,Integer limit
 ,String order
 ,String after
 ,String before
 ) throws NotFoundException;
    public abstract Response modifyMessage(String threadId
 ,String messageId
 ,ModifyMessageRequest modifyMessageRequest
 ) throws NotFoundException;
    public abstract Response modifyRun(String threadId
 ,String runId
 ,ModifyRunRequest modifyRunRequest
 ) throws NotFoundException;
    public abstract Response modifyThread(String threadId
 ,ModifyThreadRequest modifyThreadRequest
 ) throws NotFoundException;
    public abstract Response submitToolOuputsToRun(String threadId
 ,String runId
 ,SubmitToolOutputsRunRequest submitToolOutputsRunRequest
 ) throws NotFoundException;
}
