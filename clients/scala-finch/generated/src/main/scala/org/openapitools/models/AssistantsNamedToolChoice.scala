package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantsNamedToolChoiceFunction

/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 * @param _type The type of the tool. If type is `function`, the function name must be set
 * @param function 
 */
case class AssistantsNamedToolChoice(_type: String,
                function: Option[AssistantsNamedToolChoiceFunction]
                )

object AssistantsNamedToolChoice {
    /**
     * Creates the codec for converting AssistantsNamedToolChoice from and to JSON.
     */
    implicit val decoder: Decoder[AssistantsNamedToolChoice] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantsNamedToolChoice] = deriveEncoder
}
