package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-04-14T13:41:51.736364282Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface ThreadsApiService {
      Response cancelRun(String threadId,String runId,SecurityContext securityContext)
      throws NotFoundException;
      Response createMessage(String threadId,CreateMessageRequest createMessageRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createRun(String threadId,CreateRunRequest createRunRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createThread(CreateThreadRequest createThreadRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteThread(String threadId,SecurityContext securityContext)
      throws NotFoundException;
      Response getMessage(String threadId,String messageId,SecurityContext securityContext)
      throws NotFoundException;
      Response getMessageFile(String threadId,String messageId,String fileId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRun(String threadId,String runId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRunStep(String threadId,String runId,String stepId,SecurityContext securityContext)
      throws NotFoundException;
      Response getThread(String threadId,SecurityContext securityContext)
      throws NotFoundException;
      Response listMessageFiles(String threadId,String messageId,Integer limit,String order,String after,String before,SecurityContext securityContext)
      throws NotFoundException;
      Response listMessages(String threadId,Integer limit,String order,String after,String before,String runId,SecurityContext securityContext)
      throws NotFoundException;
      Response listRunSteps(String threadId,String runId,Integer limit,String order,String after,String before,SecurityContext securityContext)
      throws NotFoundException;
      Response listRuns(String threadId,Integer limit,String order,String after,String before,SecurityContext securityContext)
      throws NotFoundException;
      Response modifyMessage(String threadId,String messageId,ModifyMessageRequest modifyMessageRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response modifyRun(String threadId,String runId,ModifyRunRequest modifyRunRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response modifyThread(String threadId,ModifyThreadRequest modifyThreadRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response submitToolOuputsToRun(String threadId,String runId,SubmitToolOutputsRunRequest submitToolOutputsRunRequest,SecurityContext securityContext)
      throws NotFoundException;
}
