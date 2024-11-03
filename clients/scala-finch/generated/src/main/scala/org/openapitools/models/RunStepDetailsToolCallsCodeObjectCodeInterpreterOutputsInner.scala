package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsToolCallsCodeOutputImageObject
import org.openapitools.models.RunStepDetailsToolCallsCodeOutputImageObjectImage
import org.openapitools.models.RunStepDetailsToolCallsCodeOutputLogsObject

/**
 * 
 * @param _type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 * @param image 
 */
case class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(_type: String,
                logs: String,
                image: RunStepDetailsToolCallsCodeOutputImageObjectImage
                )

object RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] = deriveEncoder
}
