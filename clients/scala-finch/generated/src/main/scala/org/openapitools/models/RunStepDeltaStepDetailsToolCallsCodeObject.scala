package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 * @param index The index of the tool call in the tool calls array.
 * @param id The ID of the tool call.
 * @param _type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param codeUnderscoreinterpreter 
 */
case class RunStepDeltaStepDetailsToolCallsCodeObject(index: Int,
                id: Option[String],
                _type: String,
                codeUnderscoreinterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter]
                )

object RunStepDeltaStepDetailsToolCallsCodeObject {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsToolCallsCodeObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsToolCallsCodeObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsToolCallsCodeObject] = deriveEncoder
}
