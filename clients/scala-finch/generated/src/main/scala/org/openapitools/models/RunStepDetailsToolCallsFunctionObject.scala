package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsToolCallsFunctionObjectFunction

/**
 * 
 * @param id The ID of the tool call object.
 * @param _type The type of tool call. This is always going to be `function` for this type of tool call.
 * @param function 
 */
case class RunStepDetailsToolCallsFunctionObject(id: String,
                _type: String,
                function: RunStepDetailsToolCallsFunctionObjectFunction
                )

object RunStepDetailsToolCallsFunctionObject {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsFunctionObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsFunctionObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsFunctionObject] = deriveEncoder
}
