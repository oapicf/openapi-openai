package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.AssistantObject
import org.openapitools.server.api.model.CreateAssistantRequest
import org.openapitools.server.api.model.CreateMessageRequest
import org.openapitools.server.api.model.CreateRunRequest
import org.openapitools.server.api.model.CreateThreadAndRunRequest
import org.openapitools.server.api.model.CreateThreadRequest
import org.openapitools.server.api.model.DeleteAssistantResponse
import org.openapitools.server.api.model.DeleteMessageResponse
import org.openapitools.server.api.model.DeleteThreadResponse
import org.openapitools.server.api.model.ListAssistantsResponse
import org.openapitools.server.api.model.ListMessagesResponse
import org.openapitools.server.api.model.ListRunStepsResponse
import org.openapitools.server.api.model.ListRunsResponse
import org.openapitools.server.api.model.MessageObject
import org.openapitools.server.api.model.ModifyAssistantRequest
import org.openapitools.server.api.model.ModifyMessageRequest
import org.openapitools.server.api.model.ModifyRunRequest
import org.openapitools.server.api.model.ModifyThreadRequest
import org.openapitools.server.api.model.RunObject
import org.openapitools.server.api.model.RunStepObject
import org.openapitools.server.api.model.SubmitToolOutputsRunRequest
import org.openapitools.server.api.model.ThreadObject

@MiskTest(startService = true)
internal class AssistantsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var assistantsApi: AssistantsApiAction

    /**
     * To test AssistantsApiAction.cancelRun
     */
    @Test
    fun `should handle cancelRun`() {
        val threadId = TODO()
        val runId = TODO()
        val response: RunObject = assistantsApi.cancelRun(threadId, runId)
    }

    /**
     * To test AssistantsApiAction.createAssistant
     */
    @Test
    fun `should handle createAssistant`() {
        val createAssistantRequest = TODO()
        val response: AssistantObject = assistantsApi.createAssistant(createAssistantRequest)
    }

    /**
     * To test AssistantsApiAction.createMessage
     */
    @Test
    fun `should handle createMessage`() {
        val threadId = TODO()
        val createMessageRequest = TODO()
        val response: MessageObject = assistantsApi.createMessage(threadId, createMessageRequest)
    }

    /**
     * To test AssistantsApiAction.createRun
     */
    @Test
    fun `should handle createRun`() {
        val threadId = TODO()
        val createRunRequest = TODO()
        val include = TODO()
        val response: RunObject = assistantsApi.createRun(threadId, createRunRequest, include)
    }

    /**
     * To test AssistantsApiAction.createThread
     */
    @Test
    fun `should handle createThread`() {
        val createThreadRequest = TODO()
        val response: ThreadObject = assistantsApi.createThread(createThreadRequest)
    }

    /**
     * To test AssistantsApiAction.createThreadAndRun
     */
    @Test
    fun `should handle createThreadAndRun`() {
        val createThreadAndRunRequest = TODO()
        val response: RunObject = assistantsApi.createThreadAndRun(createThreadAndRunRequest)
    }

    /**
     * To test AssistantsApiAction.deleteAssistant
     */
    @Test
    fun `should handle deleteAssistant`() {
        val assistantId = TODO()
        val response: DeleteAssistantResponse = assistantsApi.deleteAssistant(assistantId)
    }

    /**
     * To test AssistantsApiAction.deleteMessage
     */
    @Test
    fun `should handle deleteMessage`() {
        val threadId = TODO()
        val messageId = TODO()
        val response: DeleteMessageResponse = assistantsApi.deleteMessage(threadId, messageId)
    }

    /**
     * To test AssistantsApiAction.deleteThread
     */
    @Test
    fun `should handle deleteThread`() {
        val threadId = TODO()
        val response: DeleteThreadResponse = assistantsApi.deleteThread(threadId)
    }

    /**
     * To test AssistantsApiAction.getAssistant
     */
    @Test
    fun `should handle getAssistant`() {
        val assistantId = TODO()
        val response: AssistantObject = assistantsApi.getAssistant(assistantId)
    }

    /**
     * To test AssistantsApiAction.getMessage
     */
    @Test
    fun `should handle getMessage`() {
        val threadId = TODO()
        val messageId = TODO()
        val response: MessageObject = assistantsApi.getMessage(threadId, messageId)
    }

    /**
     * To test AssistantsApiAction.getRun
     */
    @Test
    fun `should handle getRun`() {
        val threadId = TODO()
        val runId = TODO()
        val response: RunObject = assistantsApi.getRun(threadId, runId)
    }

    /**
     * To test AssistantsApiAction.getRunStep
     */
    @Test
    fun `should handle getRunStep`() {
        val threadId = TODO()
        val runId = TODO()
        val stepId = TODO()
        val include = TODO()
        val response: RunStepObject = assistantsApi.getRunStep(threadId, runId, stepId, include)
    }

    /**
     * To test AssistantsApiAction.getThread
     */
    @Test
    fun `should handle getThread`() {
        val threadId = TODO()
        val response: ThreadObject = assistantsApi.getThread(threadId)
    }

    /**
     * To test AssistantsApiAction.listAssistants
     */
    @Test
    fun `should handle listAssistants`() {
        val limit = TODO()
        val order = TODO()
        val after = TODO()
        val before = TODO()
        val response: ListAssistantsResponse = assistantsApi.listAssistants(limit, order, after, before)
    }

    /**
     * To test AssistantsApiAction.listMessages
     */
    @Test
    fun `should handle listMessages`() {
        val threadId = TODO()
        val limit = TODO()
        val order = TODO()
        val after = TODO()
        val before = TODO()
        val runId = TODO()
        val response: ListMessagesResponse = assistantsApi.listMessages(threadId, limit, order, after, before, runId)
    }

    /**
     * To test AssistantsApiAction.listRunSteps
     */
    @Test
    fun `should handle listRunSteps`() {
        val threadId = TODO()
        val runId = TODO()
        val limit = TODO()
        val order = TODO()
        val after = TODO()
        val before = TODO()
        val include = TODO()
        val response: ListRunStepsResponse = assistantsApi.listRunSteps(threadId, runId, limit, order, after, before, include)
    }

    /**
     * To test AssistantsApiAction.listRuns
     */
    @Test
    fun `should handle listRuns`() {
        val threadId = TODO()
        val limit = TODO()
        val order = TODO()
        val after = TODO()
        val before = TODO()
        val response: ListRunsResponse = assistantsApi.listRuns(threadId, limit, order, after, before)
    }

    /**
     * To test AssistantsApiAction.modifyAssistant
     */
    @Test
    fun `should handle modifyAssistant`() {
        val assistantId = TODO()
        val modifyAssistantRequest = TODO()
        val response: AssistantObject = assistantsApi.modifyAssistant(assistantId, modifyAssistantRequest)
    }

    /**
     * To test AssistantsApiAction.modifyMessage
     */
    @Test
    fun `should handle modifyMessage`() {
        val threadId = TODO()
        val messageId = TODO()
        val modifyMessageRequest = TODO()
        val response: MessageObject = assistantsApi.modifyMessage(threadId, messageId, modifyMessageRequest)
    }

    /**
     * To test AssistantsApiAction.modifyRun
     */
    @Test
    fun `should handle modifyRun`() {
        val threadId = TODO()
        val runId = TODO()
        val modifyRunRequest = TODO()
        val response: RunObject = assistantsApi.modifyRun(threadId, runId, modifyRunRequest)
    }

    /**
     * To test AssistantsApiAction.modifyThread
     */
    @Test
    fun `should handle modifyThread`() {
        val threadId = TODO()
        val modifyThreadRequest = TODO()
        val response: ThreadObject = assistantsApi.modifyThread(threadId, modifyThreadRequest)
    }

    /**
     * To test AssistantsApiAction.submitToolOuputsToRun
     */
    @Test
    fun `should handle submitToolOuputsToRun`() {
        val threadId = TODO()
        val runId = TODO()
        val submitToolOutputsRunRequest = TODO()
        val response: RunObject = assistantsApi.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest)
    }
}
