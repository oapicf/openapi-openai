package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestMessageFunctionCall

/**
 * 
 * @param role The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
 * @param content The contents of the message. `content` is required for all messages except assistant messages with function calls.
 * @param name The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
 * @param functionUnderscorecall 
 */
case class ChatCompletionRequestMessage(role: String,
                content: Option[String],
                name: Option[String],
                functionUnderscorecall: Option[ChatCompletionRequestMessageFunctionCall]
                )

object ChatCompletionRequestMessage {
    /**
     * Creates the codec for converting ChatCompletionRequestMessage from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestMessage] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestMessage] = deriveEncoder
}
