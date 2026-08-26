package org.openapitools.api.consumer;

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
import org.openapitools.model.*;
import org.openapitools.api.interfaces.ThreadsService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/threads")
public class ThreadsServiceController {

    @DubboReference
    private ThreadsService threadsService;

    @RequestMapping(method = RequestMethod.POST, value = "/{thread_id}/runs/{run_id}/cancel")
    public RunObject cancelRun(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "runId") String runId
    ) {
        return threadsService.cancelRun(threadId, runId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{thread_id}/messages")
    public MessageObject createMessage(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "createMessageRequest") CreateMessageRequest createMessageRequest
    ) {
        return threadsService.createMessage(threadId, createMessageRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{thread_id}/runs")
    public RunObject createRun(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "createRunRequest") CreateRunRequest createRunRequest,
        @RequestParam(name = "include") List<String> include
    ) {
        return threadsService.createRun(threadId, createRunRequest, include);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public ThreadObject createThread(
        @RequestParam(name = "createThreadRequest") CreateThreadRequest createThreadRequest
    ) {
        return threadsService.createThread(createThreadRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/runs")
    public RunObject createThreadAndRun(
        @RequestParam(name = "createThreadAndRunRequest") CreateThreadAndRunRequest createThreadAndRunRequest
    ) {
        return threadsService.createThreadAndRun(createThreadAndRunRequest);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{thread_id}/messages/{message_id}")
    public DeleteMessageResponse deleteMessage(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "messageId") String messageId
    ) {
        return threadsService.deleteMessage(threadId, messageId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{thread_id}")
    public DeleteThreadResponse deleteThread(
        @RequestParam(name = "threadId") String threadId
    ) {
        return threadsService.deleteThread(threadId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{thread_id}/messages/{message_id}")
    public MessageObject getMessage(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "messageId") String messageId
    ) {
        return threadsService.getMessage(threadId, messageId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{thread_id}/runs/{run_id}")
    public RunObject getRun(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "runId") String runId
    ) {
        return threadsService.getRun(threadId, runId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{thread_id}/runs/{run_id}/steps/{step_id}")
    public RunStepObject getRunStep(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "runId") String runId,
        @RequestParam(name = "stepId") String stepId,
        @RequestParam(name = "include") List<String> include
    ) {
        return threadsService.getRunStep(threadId, runId, stepId, include);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{thread_id}")
    public ThreadObject getThread(
        @RequestParam(name = "threadId") String threadId
    ) {
        return threadsService.getThread(threadId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{thread_id}/messages")
    public ListMessagesResponse listMessages(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "order", defaultValue = "desc") String order,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "before") String before,
        @RequestParam(name = "runId") String runId
    ) {
        return threadsService.listMessages(threadId, limit, order, after, before, runId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{thread_id}/runs/{run_id}/steps")
    public ListRunStepsResponse listRunSteps(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "runId") String runId,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "order", defaultValue = "desc") String order,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "before") String before,
        @RequestParam(name = "include") List<String> include
    ) {
        return threadsService.listRunSteps(threadId, runId, limit, order, after, before, include);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{thread_id}/runs")
    public ListRunsResponse listRuns(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "limit", defaultValue = "20") Integer limit,
        @RequestParam(name = "order", defaultValue = "desc") String order,
        @RequestParam(name = "after") String after,
        @RequestParam(name = "before") String before
    ) {
        return threadsService.listRuns(threadId, limit, order, after, before);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{thread_id}/messages/{message_id}")
    public MessageObject modifyMessage(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "messageId") String messageId,
        @RequestParam(name = "modifyMessageRequest") ModifyMessageRequest modifyMessageRequest
    ) {
        return threadsService.modifyMessage(threadId, messageId, modifyMessageRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{thread_id}/runs/{run_id}")
    public RunObject modifyRun(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "runId") String runId,
        @RequestParam(name = "modifyRunRequest") ModifyRunRequest modifyRunRequest
    ) {
        return threadsService.modifyRun(threadId, runId, modifyRunRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{thread_id}")
    public ThreadObject modifyThread(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "modifyThreadRequest") ModifyThreadRequest modifyThreadRequest
    ) {
        return threadsService.modifyThread(threadId, modifyThreadRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{thread_id}/runs/{run_id}/submit_tool_outputs")
    public RunObject submitToolOuputsToRun(
        @RequestParam(name = "threadId") String threadId,
        @RequestParam(name = "runId") String runId,
        @RequestParam(name = "submitToolOutputsRunRequest") SubmitToolOutputsRunRequest submitToolOutputsRunRequest
    ) {
        return threadsService.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest);
    }
}
