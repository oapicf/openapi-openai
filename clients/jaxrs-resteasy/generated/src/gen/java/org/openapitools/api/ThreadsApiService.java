package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.CreateMessageRequest;
import org.openapitools.model.CreateRunRequest;
import org.openapitools.model.CreateThreadAndRunRequest;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.DeleteMessageResponse;
import org.openapitools.model.DeleteThreadResponse;
import org.openapitools.model.ListMessagesResponse;
import org.openapitools.model.ListRunStepsResponse;
import org.openapitools.model.ListRunsResponse;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface ThreadsApiService {
      Response cancelRun(String threadId,String runId,SecurityContext securityContext)
      throws NotFoundException;
      Response createMessage(String threadId,CreateMessageRequest createMessageRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createRun(String threadId,CreateRunRequest createRunRequest,List<String> include,SecurityContext securityContext)
      throws NotFoundException;
      Response createThread(CreateThreadRequest createThreadRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteMessage(String threadId,String messageId,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteThread(String threadId,SecurityContext securityContext)
      throws NotFoundException;
      Response getMessage(String threadId,String messageId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRun(String threadId,String runId,SecurityContext securityContext)
      throws NotFoundException;
      Response getRunStep(String threadId,String runId,String stepId,List<String> include,SecurityContext securityContext)
      throws NotFoundException;
      Response getThread(String threadId,SecurityContext securityContext)
      throws NotFoundException;
      Response listMessages(String threadId,Integer limit,String order,String after,String before,String runId,SecurityContext securityContext)
      throws NotFoundException;
      Response listRunSteps(String threadId,String runId,Integer limit,String order,String after,String before,List<String> include,SecurityContext securityContext)
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
