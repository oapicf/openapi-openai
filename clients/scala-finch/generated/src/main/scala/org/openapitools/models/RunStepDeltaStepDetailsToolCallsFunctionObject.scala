package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

/**
 * 
 * @param index The index of the tool call in the tool calls array.
 * @param id The ID of the tool call object.
 * @param _type The type of tool call. This is always going to be `function` for this type of tool call.
 * @param function 
 */
case class RunStepDeltaStepDetailsToolCallsFunctionObject(index: Int,
                id: Option[String],
                _type: String,
                function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
                )

object RunStepDeltaStepDetailsToolCallsFunctionObject {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsToolCallsFunctionObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsToolCallsFunctionObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsToolCallsFunctionObject] = deriveEncoder
}
