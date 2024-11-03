package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 * @param _type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 */
case class RunStepDetailsToolCallsCodeOutputLogsObject(_type: String,
                logs: String
                )

object RunStepDetailsToolCallsCodeOutputLogsObject {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsCodeOutputLogsObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsCodeOutputLogsObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsCodeOutputLogsObject] = deriveEncoder
}
