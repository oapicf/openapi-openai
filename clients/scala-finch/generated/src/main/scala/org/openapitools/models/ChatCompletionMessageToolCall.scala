package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionMessageToolCallFunction

/**
 * 
 * @param id The ID of the tool call.
 * @param _type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
case class ChatCompletionMessageToolCall(id: String,
                _type: String,
                function: ChatCompletionMessageToolCallFunction
                )

object ChatCompletionMessageToolCall {
    /**
     * Creates the codec for converting ChatCompletionMessageToolCall from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionMessageToolCall] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionMessageToolCall] = deriveEncoder
}
