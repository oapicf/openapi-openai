package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
 * @param completionUnderscoretokens Number of completion tokens used over the course of the run.
 * @param promptUnderscoretokens Number of prompt tokens used over the course of the run.
 * @param totalUnderscoretokens Total number of tokens used (prompt + completion).
 */
case class RunCompletionUsage(completionUnderscoretokens: Int,
                promptUnderscoretokens: Int,
                totalUnderscoretokens: Int
                )

object RunCompletionUsage {
    /**
     * Creates the codec for converting RunCompletionUsage from and to JSON.
     */
    implicit val decoder: Decoder[RunCompletionUsage] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunCompletionUsage] = deriveEncoder
}
