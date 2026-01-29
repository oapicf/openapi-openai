package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionNamedToolChoiceFunction

/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 * @param _type The type of the tool. If type is `function`, the function name must be set
 * @param function 
 */
case class AssistantsApiNamedToolChoice(_type: String,
                function: Option[ChatCompletionNamedToolChoiceFunction]
                )

object AssistantsApiNamedToolChoice {
    /**
     * Creates the codec for converting AssistantsApiNamedToolChoice from and to JSON.
     */
    implicit val decoder: Decoder[AssistantsApiNamedToolChoice] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantsApiNamedToolChoice] = deriveEncoder
}
