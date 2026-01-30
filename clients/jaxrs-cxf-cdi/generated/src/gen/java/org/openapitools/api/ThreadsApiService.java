package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-29T14:09:03.843054404Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface ThreadsApiService {
      public Response cancelRun(String threadId, String runId, SecurityContext securityContext);
      public Response createMessage(String threadId, CreateMessageRequest createMessageRequest, SecurityContext securityContext);
      public Response createRun(String threadId, CreateRunRequest createRunRequest, List<String> include, SecurityContext securityContext);
      public Response createThread(CreateThreadRequest createThreadRequest, SecurityContext securityContext);
      public Response createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest, SecurityContext securityContext);
      public Response deleteMessage(String threadId, String messageId, SecurityContext securityContext);
      public Response deleteThread(String threadId, SecurityContext securityContext);
      public Response getMessage(String threadId, String messageId, SecurityContext securityContext);
      public Response getRun(String threadId, String runId, SecurityContext securityContext);
      public Response getRunStep(String threadId, String runId, String stepId, List<String> include, SecurityContext securityContext);
      public Response getThread(String threadId, SecurityContext securityContext);
      public Response listMessages(String threadId, Integer limit, String order, String after, String before, String runId, SecurityContext securityContext);
      public Response listRunSteps(String threadId, String runId, Integer limit, String order, String after, String before, List<String> include, SecurityContext securityContext);
      public Response listRuns(String threadId, Integer limit, String order, String after, String before, SecurityContext securityContext);
      public Response modifyMessage(String threadId, String messageId, ModifyMessageRequest modifyMessageRequest, SecurityContext securityContext);
      public Response modifyRun(String threadId, String runId, ModifyRunRequest modifyRunRequest, SecurityContext securityContext);
      public Response modifyThread(String threadId, ModifyThreadRequest modifyThreadRequest, SecurityContext securityContext);
      public Response submitToolOuputsToRun(String threadId, String runId, SubmitToolOutputsRunRequest submitToolOutputsRunRequest, SecurityContext securityContext);
}
