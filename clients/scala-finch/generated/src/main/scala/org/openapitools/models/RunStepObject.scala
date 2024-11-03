package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepCompletionUsage
import org.openapitools.models.RunStepObjectLastError
import org.openapitools.models.RunStepObjectStepDetails

/**
 * Represents a step in execution of a run. 
 * @param id The identifier of the run step, which can be referenced in API endpoints.
 * @param _object The object type, which is always `thread.run.step`.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the run step was created.
 * @param assistantUnderscoreid The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
 * @param threadUnderscoreid The ID of the [thread](/docs/api-reference/threads) that was run.
 * @param runUnderscoreid The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
 * @param _type The type of run step, which can be either `message_creation` or `tool_calls`.
 * @param status The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
 * @param stepUnderscoredetails 
 * @param lastUnderscoreerror 
 * @param expiredUnderscoreat The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
 * @param cancelledUnderscoreat The Unix timestamp (in seconds) for when the run step was cancelled.
 * @param failedUnderscoreat The Unix timestamp (in seconds) for when the run step failed.
 * @param completedUnderscoreat The Unix timestamp (in seconds) for when the run step completed.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @param usage 
 */
case class RunStepObject(id: String,
                _object: String,
                createdUnderscoreat: Int,
                assistantUnderscoreid: String,
                threadUnderscoreid: String,
                runUnderscoreid: String,
                _type: String,
                status: String,
                stepUnderscoredetails: RunStepObjectStepDetails,
                lastUnderscoreerror: RunStepObjectLastError,
                expiredUnderscoreat: Int,
                cancelledUnderscoreat: Int,
                failedUnderscoreat: Int,
                completedUnderscoreat: Int,
                metadata: Object,
                usage: RunStepCompletionUsage
                )

object RunStepObject {
    /**
     * Creates the codec for converting RunStepObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepObject] = deriveEncoder
}
