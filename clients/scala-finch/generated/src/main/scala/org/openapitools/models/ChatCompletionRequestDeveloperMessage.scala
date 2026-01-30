package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestDeveloperMessageContent

/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
 * @param content 
 * @param role The role of the messages author, in this case `developer`.
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 */
case class ChatCompletionRequestDeveloperMessage(content: ChatCompletionRequestDeveloperMessageContent,
                role: String,
                name: Option[String]
                )

object ChatCompletionRequestDeveloperMessage {
    /**
     * Creates the codec for converting ChatCompletionRequestDeveloperMessage from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestDeveloperMessage] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestDeveloperMessage] = deriveEncoder
}
