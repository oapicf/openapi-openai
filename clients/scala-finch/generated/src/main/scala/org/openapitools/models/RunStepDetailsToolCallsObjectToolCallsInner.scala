package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsToolCallsCodeObject
import org.openapitools.models.RunStepDetailsToolCallsCodeObjectCodeInterpreter
import org.openapitools.models.RunStepDetailsToolCallsFunctionObject
import org.openapitools.models.RunStepDetailsToolCallsFunctionObjectFunction
import org.openapitools.models.RunStepDetailsToolCallsRetrievalObject

/**
 * 
 * @param id The ID of the tool call object.
 * @param _type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param codeUnderscoreinterpreter 
 * @param retrieval For now, this is always going to be an empty object.
 * @param function 
 */
case class RunStepDetailsToolCallsObjectToolCallsInner(id: String,
                _type: String,
                codeUnderscoreinterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter,
                retrieval: Object,
                function: RunStepDetailsToolCallsFunctionObjectFunction
                )

object RunStepDetailsToolCallsObjectToolCallsInner {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsObjectToolCallsInner from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsObjectToolCallsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsObjectToolCallsInner] = deriveEncoder
}
