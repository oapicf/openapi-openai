package org.openapitools.api

import org.openapitools.model.CreateMessageRequest
import org.openapitools.model.CreateRunRequest
import org.openapitools.model.CreateThreadAndRunRequest
import org.openapitools.model.CreateThreadRequest
import org.openapitools.model.DeleteMessageResponse
import org.openapitools.model.DeleteThreadResponse
import org.openapitools.model.ListMessagesResponse
import org.openapitools.model.ListRunStepsResponse
import org.openapitools.model.ListRunsResponse
import org.openapitools.model.MessageObject
import org.openapitools.model.ModifyMessageRequest
import org.openapitools.model.ModifyRunRequest
import org.openapitools.model.ModifyThreadRequest
import org.openapitools.model.RunObject
import org.openapitools.model.RunStepObject
import org.openapitools.model.SubmitToolOutputsRunRequest
import org.openapitools.model.ThreadObject
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ThreadsApiTest {

    private val api: ThreadsApiController = ThreadsApiController()

    /**
     * To test ThreadsApiController.cancelRun
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun cancelRunTest() {
        val threadId: kotlin.String = TODO()
        val runId: kotlin.String = TODO()
        
        val response: ResponseEntity<RunObject> = api.cancelRun(threadId, runId)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.createMessage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createMessageTest() {
        val threadId: kotlin.String = TODO()
        val createMessageRequest: CreateMessageRequest = TODO()
        
        val response: ResponseEntity<MessageObject> = api.createMessage(threadId, createMessageRequest)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.createRun
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createRunTest() {
        val threadId: kotlin.String = TODO()
        val createRunRequest: CreateRunRequest = TODO()
        val include: kotlin.collections.List<kotlin.String>? = TODO()
        
        val response: ResponseEntity<RunObject> = api.createRun(threadId, createRunRequest, include)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.createThread
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createThreadTest() {
        val createThreadRequest: CreateThreadRequest? = TODO()
        
        val response: ResponseEntity<ThreadObject> = api.createThread(createThreadRequest)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.createThreadAndRun
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createThreadAndRunTest() {
        val createThreadAndRunRequest: CreateThreadAndRunRequest = TODO()
        
        val response: ResponseEntity<RunObject> = api.createThreadAndRun(createThreadAndRunRequest)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.deleteMessage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteMessageTest() {
        val threadId: kotlin.String = TODO()
        val messageId: kotlin.String = TODO()
        
        val response: ResponseEntity<DeleteMessageResponse> = api.deleteMessage(threadId, messageId)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.deleteThread
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteThreadTest() {
        val threadId: kotlin.String = TODO()
        
        val response: ResponseEntity<DeleteThreadResponse> = api.deleteThread(threadId)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.getMessage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getMessageTest() {
        val threadId: kotlin.String = TODO()
        val messageId: kotlin.String = TODO()
        
        val response: ResponseEntity<MessageObject> = api.getMessage(threadId, messageId)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.getRun
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getRunTest() {
        val threadId: kotlin.String = TODO()
        val runId: kotlin.String = TODO()
        
        val response: ResponseEntity<RunObject> = api.getRun(threadId, runId)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.getRunStep
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getRunStepTest() {
        val threadId: kotlin.String = TODO()
        val runId: kotlin.String = TODO()
        val stepId: kotlin.String = TODO()
        val include: kotlin.collections.List<kotlin.String>? = TODO()
        
        val response: ResponseEntity<RunStepObject> = api.getRunStep(threadId, runId, stepId, include)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.getThread
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getThreadTest() {
        val threadId: kotlin.String = TODO()
        
        val response: ResponseEntity<ThreadObject> = api.getThread(threadId)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.listMessages
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listMessagesTest() {
        val threadId: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        val order: kotlin.String = TODO()
        val after: kotlin.String? = TODO()
        val before: kotlin.String? = TODO()
        val runId: kotlin.String? = TODO()
        
        val response: ResponseEntity<ListMessagesResponse> = api.listMessages(threadId, limit, order, after, before, runId)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.listRunSteps
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listRunStepsTest() {
        val threadId: kotlin.String = TODO()
        val runId: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        val order: kotlin.String = TODO()
        val after: kotlin.String? = TODO()
        val before: kotlin.String? = TODO()
        val include: kotlin.collections.List<kotlin.String>? = TODO()
        
        val response: ResponseEntity<ListRunStepsResponse> = api.listRunSteps(threadId, runId, limit, order, after, before, include)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.listRuns
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun listRunsTest() {
        val threadId: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        val order: kotlin.String = TODO()
        val after: kotlin.String? = TODO()
        val before: kotlin.String? = TODO()
        
        val response: ResponseEntity<ListRunsResponse> = api.listRuns(threadId, limit, order, after, before)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.modifyMessage
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun modifyMessageTest() {
        val threadId: kotlin.String = TODO()
        val messageId: kotlin.String = TODO()
        val modifyMessageRequest: ModifyMessageRequest = TODO()
        
        val response: ResponseEntity<MessageObject> = api.modifyMessage(threadId, messageId, modifyMessageRequest)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.modifyRun
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun modifyRunTest() {
        val threadId: kotlin.String = TODO()
        val runId: kotlin.String = TODO()
        val modifyRunRequest: ModifyRunRequest = TODO()
        
        val response: ResponseEntity<RunObject> = api.modifyRun(threadId, runId, modifyRunRequest)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.modifyThread
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun modifyThreadTest() {
        val threadId: kotlin.String = TODO()
        val modifyThreadRequest: ModifyThreadRequest = TODO()
        
        val response: ResponseEntity<ThreadObject> = api.modifyThread(threadId, modifyThreadRequest)

        // TODO: test validations
    }

    /**
     * To test ThreadsApiController.submitToolOuputsToRun
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun submitToolOuputsToRunTest() {
        val threadId: kotlin.String = TODO()
        val runId: kotlin.String = TODO()
        val submitToolOutputsRunRequest: SubmitToolOutputsRunRequest = TODO()
        
        val response: ResponseEntity<RunObject> = api.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest)

        // TODO: test validations
    }
}
