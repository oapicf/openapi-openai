package org.openapitools.api.impl;

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

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T10:45:31.742862961Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ThreadsApiServiceImpl implements ThreadsApi {
      public Response cancelRun(String threadId,String runId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createMessage(String threadId,CreateMessageRequest createMessageRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createRun(String threadId,CreateRunRequest createRunRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createThread(CreateThreadRequest createThreadRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response createThreadAndRun(CreateThreadAndRunRequest createThreadAndRunRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteThread(String threadId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getMessage(String threadId,String messageId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getMessageFile(String threadId,String messageId,String fileId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getRun(String threadId,String runId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getRunStep(String threadId,String runId,String stepId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getThread(String threadId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listMessageFiles(String threadId,String messageId,Integer limit,String order,String after,String before,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listMessages(String threadId,Integer limit,String order,String after,String before,String runId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listRunSteps(String threadId,String runId,Integer limit,String order,String after,String before,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listRuns(String threadId,Integer limit,String order,String after,String before,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response modifyMessage(String threadId,String messageId,ModifyMessageRequest modifyMessageRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response modifyRun(String threadId,String runId,ModifyRunRequest modifyRunRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response modifyThread(String threadId,ModifyThreadRequest modifyThreadRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response submitToolOuputsToRun(String threadId,String runId,SubmitToolOutputsRunRequest submitToolOutputsRunRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
