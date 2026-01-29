package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param role The role of the messages author, in this case `tool`.
 * @param content The contents of the tool message.
 * @param toolUnderscorecallUnderscoreid Tool call that this message is responding to.
 */
case class ChatCompletionRequestToolMessage(role: String,
                content: String,
                toolUnderscorecallUnderscoreid: String
                )

object ChatCompletionRequestToolMessage {
    /**
     * Creates the codec for converting ChatCompletionRequestToolMessage from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestToolMessage] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestToolMessage] = deriveEncoder
}
