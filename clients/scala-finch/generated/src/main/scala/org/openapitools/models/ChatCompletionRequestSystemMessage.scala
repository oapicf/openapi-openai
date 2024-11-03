package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param content The contents of the system message.
 * @param role The role of the messages author, in this case `system`.
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 */
case class ChatCompletionRequestSystemMessage(content: String,
                role: String,
                name: Option[String]
                )

object ChatCompletionRequestSystemMessage {
    /**
     * Creates the codec for converting ChatCompletionRequestSystemMessage from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestSystemMessage] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestSystemMessage] = deriveEncoder
}
