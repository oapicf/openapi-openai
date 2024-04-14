package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
 * @param completionUnderscoretokens Number of completion tokens used over the course of the run step.
 * @param promptUnderscoretokens Number of prompt tokens used over the course of the run step.
 * @param totalUnderscoretokens Total number of tokens used (prompt + completion).
 */
case class RunStepCompletionUsage(completionUnderscoretokens: Int,
                promptUnderscoretokens: Int,
                totalUnderscoretokens: Int
                )

object RunStepCompletionUsage {
    /**
     * Creates the codec for converting RunStepCompletionUsage from and to JSON.
     */
    implicit val decoder: Decoder[RunStepCompletionUsage] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepCompletionUsage] = deriveEncoder
}
