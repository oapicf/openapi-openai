@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class AssistantsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation cancelRun.
     *
     * @param threadId path parameter threadId pattern.
     * @param runId path parameter runId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CancelRunStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun cancelRun(threadId: StringValuePattern, runId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CancelRunStubBuilder =
        CancelRunStubBuilder(objectMapper, post(urlPathTemplate("/threads/{thread_id}/runs/{run_id}/cancel"))
            .withPathParam("thread_id", threadId)
            .withPathParam("run_id", runId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createAssistant.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateAssistantStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createAssistant(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateAssistantStubBuilder =
        CreateAssistantStubBuilder(objectMapper, post(urlPathTemplate("/assistants"))
            .configurer()
        )

    /**
     * Construct a stub for the operation createMessage.
     *
     * @param threadId path parameter threadId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateMessageStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createMessage(threadId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateMessageStubBuilder =
        CreateMessageStubBuilder(objectMapper, post(urlPathTemplate("/threads/{thread_id}/messages"))
            .withPathParam("thread_id", threadId)
            .configurer()
        )

    /**
     * Construct a stub for the operation createRun.
     *
     * @param threadId path parameter threadId pattern.
     * @param include query parameter include pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateRunStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createRun(threadId: StringValuePattern, include: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateRunStubBuilder =
        CreateRunStubBuilder(objectMapper, post(urlPathTemplate("/threads/{thread_id}/runs"))
            .withPathParam("thread_id", threadId)
            .apply { include?.let { withQueryParam("include[]", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation createThread.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateThreadStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createThread(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateThreadStubBuilder =
        CreateThreadStubBuilder(objectMapper, post(urlPathTemplate("/threads"))
            .configurer()
        )

    /**
     * Construct a stub for the operation createThreadAndRun.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CreateThreadAndRunStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun createThreadAndRun(configurer: MappingBuilder.() -> MappingBuilder = { this }): CreateThreadAndRunStubBuilder =
        CreateThreadAndRunStubBuilder(objectMapper, post(urlPathTemplate("/threads/runs"))
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteAssistant.
     *
     * @param assistantId path parameter assistantId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteAssistantStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteAssistant(assistantId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteAssistantStubBuilder =
        DeleteAssistantStubBuilder(objectMapper, delete(urlPathTemplate("/assistants/{assistant_id}"))
            .withPathParam("assistant_id", assistantId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteMessage.
     *
     * @param threadId path parameter threadId pattern.
     * @param messageId path parameter messageId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteMessageStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteMessage(threadId: StringValuePattern, messageId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteMessageStubBuilder =
        DeleteMessageStubBuilder(objectMapper, delete(urlPathTemplate("/threads/{thread_id}/messages/{message_id}"))
            .withPathParam("thread_id", threadId)
            .withPathParam("message_id", messageId)
            .configurer()
        )

    /**
     * Construct a stub for the operation deleteThread.
     *
     * @param threadId path parameter threadId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeleteThreadStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deleteThread(threadId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeleteThreadStubBuilder =
        DeleteThreadStubBuilder(objectMapper, delete(urlPathTemplate("/threads/{thread_id}"))
            .withPathParam("thread_id", threadId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getAssistant.
     *
     * @param assistantId path parameter assistantId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetAssistantStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getAssistant(assistantId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetAssistantStubBuilder =
        GetAssistantStubBuilder(objectMapper, get(urlPathTemplate("/assistants/{assistant_id}"))
            .withPathParam("assistant_id", assistantId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getMessage.
     *
     * @param threadId path parameter threadId pattern.
     * @param messageId path parameter messageId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetMessageStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getMessage(threadId: StringValuePattern, messageId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetMessageStubBuilder =
        GetMessageStubBuilder(objectMapper, get(urlPathTemplate("/threads/{thread_id}/messages/{message_id}"))
            .withPathParam("thread_id", threadId)
            .withPathParam("message_id", messageId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getRun.
     *
     * @param threadId path parameter threadId pattern.
     * @param runId path parameter runId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetRunStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getRun(threadId: StringValuePattern, runId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetRunStubBuilder =
        GetRunStubBuilder(objectMapper, get(urlPathTemplate("/threads/{thread_id}/runs/{run_id}"))
            .withPathParam("thread_id", threadId)
            .withPathParam("run_id", runId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getRunStep.
     *
     * @param threadId path parameter threadId pattern.
     * @param runId path parameter runId pattern.
     * @param stepId path parameter stepId pattern.
     * @param include query parameter include pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetRunStepStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getRunStep(threadId: StringValuePattern, runId: StringValuePattern, stepId: StringValuePattern, include: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetRunStepStubBuilder =
        GetRunStepStubBuilder(objectMapper, get(urlPathTemplate("/threads/{thread_id}/runs/{run_id}/steps/{step_id}"))
            .withPathParam("thread_id", threadId)
            .withPathParam("run_id", runId)
            .withPathParam("step_id", stepId)
            .apply { include?.let { withQueryParam("include[]", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation getThread.
     *
     * @param threadId path parameter threadId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetThreadStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getThread(threadId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetThreadStubBuilder =
        GetThreadStubBuilder(objectMapper, get(urlPathTemplate("/threads/{thread_id}"))
            .withPathParam("thread_id", threadId)
            .configurer()
        )

    /**
     * Construct a stub for the operation listAssistants.
     *
     * @param limit query parameter limit pattern.
     * @param order query parameter order pattern.
     * @param after query parameter after pattern.
     * @param before query parameter before pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListAssistantsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listAssistants(limit: StringValuePattern? = null, order: StringValuePattern? = null, after: StringValuePattern? = null, before: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListAssistantsStubBuilder =
        ListAssistantsStubBuilder(objectMapper, get(urlPathTemplate("/assistants"))
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { before?.let { withQueryParam("before", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listMessages.
     *
     * @param threadId path parameter threadId pattern.
     * @param limit query parameter limit pattern.
     * @param order query parameter order pattern.
     * @param after query parameter after pattern.
     * @param before query parameter before pattern.
     * @param runId query parameter runId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListMessagesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listMessages(threadId: StringValuePattern, limit: StringValuePattern? = null, order: StringValuePattern? = null, after: StringValuePattern? = null, before: StringValuePattern? = null, runId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListMessagesStubBuilder =
        ListMessagesStubBuilder(objectMapper, get(urlPathTemplate("/threads/{thread_id}/messages"))
            .withPathParam("thread_id", threadId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { before?.let { withQueryParam("before", it) } }
            .apply { runId?.let { withQueryParam("run_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listRunSteps.
     *
     * @param threadId path parameter threadId pattern.
     * @param runId path parameter runId pattern.
     * @param limit query parameter limit pattern.
     * @param order query parameter order pattern.
     * @param after query parameter after pattern.
     * @param before query parameter before pattern.
     * @param include query parameter include pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListRunStepsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listRunSteps(threadId: StringValuePattern, runId: StringValuePattern, limit: StringValuePattern? = null, order: StringValuePattern? = null, after: StringValuePattern? = null, before: StringValuePattern? = null, include: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListRunStepsStubBuilder =
        ListRunStepsStubBuilder(objectMapper, get(urlPathTemplate("/threads/{thread_id}/runs/{run_id}/steps"))
            .withPathParam("thread_id", threadId)
            .withPathParam("run_id", runId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { before?.let { withQueryParam("before", it) } }
            .apply { include?.let { withQueryParam("include[]", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation listRuns.
     *
     * @param threadId path parameter threadId pattern.
     * @param limit query parameter limit pattern.
     * @param order query parameter order pattern.
     * @param after query parameter after pattern.
     * @param before query parameter before pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ListRunsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun listRuns(threadId: StringValuePattern, limit: StringValuePattern? = null, order: StringValuePattern? = null, after: StringValuePattern? = null, before: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ListRunsStubBuilder =
        ListRunsStubBuilder(objectMapper, get(urlPathTemplate("/threads/{thread_id}/runs"))
            .withPathParam("thread_id", threadId)
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { after?.let { withQueryParam("after", it) } }
            .apply { before?.let { withQueryParam("before", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation modifyAssistant.
     *
     * @param assistantId path parameter assistantId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ModifyAssistantStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun modifyAssistant(assistantId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ModifyAssistantStubBuilder =
        ModifyAssistantStubBuilder(objectMapper, post(urlPathTemplate("/assistants/{assistant_id}"))
            .withPathParam("assistant_id", assistantId)
            .configurer()
        )

    /**
     * Construct a stub for the operation modifyMessage.
     *
     * @param threadId path parameter threadId pattern.
     * @param messageId path parameter messageId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ModifyMessageStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun modifyMessage(threadId: StringValuePattern, messageId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ModifyMessageStubBuilder =
        ModifyMessageStubBuilder(objectMapper, post(urlPathTemplate("/threads/{thread_id}/messages/{message_id}"))
            .withPathParam("thread_id", threadId)
            .withPathParam("message_id", messageId)
            .configurer()
        )

    /**
     * Construct a stub for the operation modifyRun.
     *
     * @param threadId path parameter threadId pattern.
     * @param runId path parameter runId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ModifyRunStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun modifyRun(threadId: StringValuePattern, runId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ModifyRunStubBuilder =
        ModifyRunStubBuilder(objectMapper, post(urlPathTemplate("/threads/{thread_id}/runs/{run_id}"))
            .withPathParam("thread_id", threadId)
            .withPathParam("run_id", runId)
            .configurer()
        )

    /**
     * Construct a stub for the operation modifyThread.
     *
     * @param threadId path parameter threadId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ModifyThreadStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun modifyThread(threadId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ModifyThreadStubBuilder =
        ModifyThreadStubBuilder(objectMapper, post(urlPathTemplate("/threads/{thread_id}"))
            .withPathParam("thread_id", threadId)
            .configurer()
        )

    /**
     * Construct a stub for the operation submitToolOuputsToRun.
     *
     * @param threadId path parameter threadId pattern.
     * @param runId path parameter runId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SubmitToolOuputsToRunStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun submitToolOuputsToRun(threadId: StringValuePattern, runId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SubmitToolOuputsToRunStubBuilder =
        SubmitToolOuputsToRunStubBuilder(objectMapper, post(urlPathTemplate("/threads/{thread_id}/runs/{run_id}/submit_tool_outputs"))
            .withPathParam("thread_id", threadId)
            .withPathParam("run_id", runId)
            .configurer()
        )
}
