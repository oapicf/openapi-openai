package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 * @param index The index of the output in the outputs array.
 * @param _type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 */
case class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(index: Int,
                _type: String,
                logs: Option[String]
                )

object RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject] = deriveEncoder
}
