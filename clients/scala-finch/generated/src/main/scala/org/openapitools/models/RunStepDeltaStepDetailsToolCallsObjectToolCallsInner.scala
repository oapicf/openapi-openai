package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsCodeObject
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsFileSearchObject
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsFunctionObject
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

/**
 * 
 * @param index The index of the tool call in the tool calls array.
 * @param id The ID of the tool call object.
 * @param _type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param codeUnderscoreinterpreter 
 * @param fileUnderscoresearch For now, this is always going to be an empty object.
 * @param function 
 */
case class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner(index: Int,
                id: Option[String],
                _type: String,
                codeUnderscoreinterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter],
                fileUnderscoresearch: Object,
                function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
                )

object RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsToolCallsObjectToolCallsInner from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] = deriveEncoder
}
