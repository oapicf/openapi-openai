package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestUserMessageContent

/**
 * Messages sent by an end user, containing prompts or additional context information. 
 * @param content 
 * @param role The role of the messages author, in this case `user`.
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 */
case class ChatCompletionRequestUserMessage(content: ChatCompletionRequestUserMessageContent,
                role: String,
                name: Option[String]
                )

object ChatCompletionRequestUserMessage {
    /**
     * Creates the codec for converting ChatCompletionRequestUserMessage from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestUserMessage] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestUserMessage] = deriveEncoder
}
