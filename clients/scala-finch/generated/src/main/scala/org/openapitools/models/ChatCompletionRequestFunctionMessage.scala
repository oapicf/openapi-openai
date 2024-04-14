package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param role The role of the messages author, in this case `function`.
 * @param content The contents of the function message.
 * @param name The name of the function to call.
 */
case class ChatCompletionRequestFunctionMessage(role: String,
                content: String,
                name: String
                )

object ChatCompletionRequestFunctionMessage {
    /**
     * Creates the codec for converting ChatCompletionRequestFunctionMessage from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestFunctionMessage] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestFunctionMessage] = deriveEncoder
}
