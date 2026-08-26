package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepCompletionUsage
import org.openapitools.server.api.model.RunStepObjectLastError
import org.openapitools.server.api.model.RunStepObjectStepDetails
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepObject(
    /** The identifier of the run step, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The object type, which is always &#x60;thread.run.step&#x60;. */
    val `object`: kotlin.String,
    /** The Unix timestamp (in seconds) for when the run step was created. */
    val createdAt: kotlin.Int,
    /** The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
    val assistantId: kotlin.String,
    /** The ID of the [thread](/docs/api-reference/threads) that was run. */
    val threadId: kotlin.String,
    /** The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
    val runId: kotlin.String,
    /** The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. */
    val type: kotlin.String,
    /** The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. */
    val status: kotlin.String,
    val stepDetails: RunStepObjectStepDetails,
    val lastError: RunStepObjectLastError,
    /** The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
    val expiredAt: kotlin.Int,
    /** The Unix timestamp (in seconds) for when the run step was cancelled. */
    val cancelledAt: kotlin.Int,
    /** The Unix timestamp (in seconds) for when the run step failed. */
    val failedAt: kotlin.Int,
    /** The Unix timestamp (in seconds) for when the run step completed. */
    val completedAt: kotlin.Int,
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any,
    val usage: RunStepCompletionUsage
)
