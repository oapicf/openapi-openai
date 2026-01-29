package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionNamedToolChoiceFunction

/**
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 * @param _type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
case class ChatCompletionNamedToolChoice(_type: String,
                function: ChatCompletionNamedToolChoiceFunction
                )

object ChatCompletionNamedToolChoice {
    /**
     * Creates the codec for converting ChatCompletionNamedToolChoice from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionNamedToolChoice] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionNamedToolChoice] = deriveEncoder
}
