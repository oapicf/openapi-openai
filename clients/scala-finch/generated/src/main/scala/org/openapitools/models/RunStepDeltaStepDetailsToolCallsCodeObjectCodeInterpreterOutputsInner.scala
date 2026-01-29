package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

/**
 * 
 * @param index The index of the output in the outputs array.
 * @param _type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 * @param image 
 */
case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(index: Int,
                _type: String,
                logs: Option[String],
                image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
                )

object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = deriveEncoder
}
