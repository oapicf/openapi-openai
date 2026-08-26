package org.openapitools.api.provider;

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
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@DubboService
public class ThreadsServiceImpl implements ThreadsService {

    private static final Logger logger = LoggerFactory.getLogger(ThreadsServiceImpl.class);

    @Override
    public RunObject cancelRun(
        String threadId,
        String runId
    ) {
        logger.info("Dubbo service method cancelRun called with parameters: threadId={}, runId={}", threadId, runId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public MessageObject createMessage(
        String threadId,
        CreateMessageRequest createMessageRequest
    ) {
        logger.info("Dubbo service method createMessage called with parameters: threadId={}, createMessageRequest={}", threadId, createMessageRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public RunObject createRun(
        String threadId,
        CreateRunRequest createRunRequest,
        List<String> include
    ) {
        logger.info("Dubbo service method createRun called with parameters: threadId={}, createRunRequest={}, include={}", threadId, createRunRequest, include);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ThreadObject createThread(
        CreateThreadRequest createThreadRequest
    ) {
        logger.info("Dubbo service method createThread called with parameters: createThreadRequest={}", createThreadRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public RunObject createThreadAndRun(
        CreateThreadAndRunRequest createThreadAndRunRequest
    ) {
        logger.info("Dubbo service method createThreadAndRun called with parameters: createThreadAndRunRequest={}", createThreadAndRunRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public DeleteMessageResponse deleteMessage(
        String threadId,
        String messageId
    ) {
        logger.info("Dubbo service method deleteMessage called with parameters: threadId={}, messageId={}", threadId, messageId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public DeleteThreadResponse deleteThread(
        String threadId
    ) {
        logger.info("Dubbo service method deleteThread called with parameters: threadId={}", threadId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public MessageObject getMessage(
        String threadId,
        String messageId
    ) {
        logger.info("Dubbo service method getMessage called with parameters: threadId={}, messageId={}", threadId, messageId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public RunObject getRun(
        String threadId,
        String runId
    ) {
        logger.info("Dubbo service method getRun called with parameters: threadId={}, runId={}", threadId, runId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public RunStepObject getRunStep(
        String threadId,
        String runId,
        String stepId,
        List<String> include
    ) {
        logger.info("Dubbo service method getRunStep called with parameters: threadId={}, runId={}, stepId={}, include={}", threadId, runId, stepId, include);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ThreadObject getThread(
        String threadId
    ) {
        logger.info("Dubbo service method getThread called with parameters: threadId={}", threadId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ListMessagesResponse listMessages(
        String threadId,
        Integer limit,
        String order,
        String after,
        String before,
        String runId
    ) {
        logger.info("Dubbo service method listMessages called with parameters: threadId={}, limit={}, order={}, after={}, before={}, runId={}", threadId, limit, order, after, before, runId);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ListRunStepsResponse listRunSteps(
        String threadId,
        String runId,
        Integer limit,
        String order,
        String after,
        String before,
        List<String> include
    ) {
        logger.info("Dubbo service method listRunSteps called with parameters: threadId={}, runId={}, limit={}, order={}, after={}, before={}, include={}", threadId, runId, limit, order, after, before, include);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ListRunsResponse listRuns(
        String threadId,
        Integer limit,
        String order,
        String after,
        String before
    ) {
        logger.info("Dubbo service method listRuns called with parameters: threadId={}, limit={}, order={}, after={}, before={}", threadId, limit, order, after, before);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public MessageObject modifyMessage(
        String threadId,
        String messageId,
        ModifyMessageRequest modifyMessageRequest
    ) {
        logger.info("Dubbo service method modifyMessage called with parameters: threadId={}, messageId={}, modifyMessageRequest={}", threadId, messageId, modifyMessageRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public RunObject modifyRun(
        String threadId,
        String runId,
        ModifyRunRequest modifyRunRequest
    ) {
        logger.info("Dubbo service method modifyRun called with parameters: threadId={}, runId={}, modifyRunRequest={}", threadId, runId, modifyRunRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public ThreadObject modifyThread(
        String threadId,
        ModifyThreadRequest modifyThreadRequest
    ) {
        logger.info("Dubbo service method modifyThread called with parameters: threadId={}, modifyThreadRequest={}", threadId, modifyThreadRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public RunObject submitToolOuputsToRun(
        String threadId,
        String runId,
        SubmitToolOutputsRunRequest submitToolOutputsRunRequest
    ) {
        logger.info("Dubbo service method submitToolOuputsToRun called with parameters: threadId={}, runId={}, submitToolOutputsRunRequest={}", threadId, runId, submitToolOutputsRunRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }
}
