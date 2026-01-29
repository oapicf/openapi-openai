package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsToolCallsCodeObjectCodeInterpreter

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 * @param id The ID of the tool call.
 * @param _type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param codeUnderscoreinterpreter 
 */
case class RunStepDetailsToolCallsCodeObject(id: String,
                _type: String,
                codeUnderscoreinterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter
                )

object RunStepDetailsToolCallsCodeObject {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsCodeObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsCodeObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsCodeObject] = deriveEncoder
}
