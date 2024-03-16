package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestMessageFunctionCall

/**
 * 
 * @param role The role of the author of this message.
 * @param content The contents of the chunk message.
 * @param functionUnderscorecall 
 */
case class ChatCompletionStreamResponseDelta(role: Option[String],
                content: Option[String],
                functionUnderscorecall: Option[ChatCompletionRequestMessageFunctionCall]
                )

object ChatCompletionStreamResponseDelta {
    /**
     * Creates the codec for converting ChatCompletionStreamResponseDelta from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionStreamResponseDelta] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionStreamResponseDelta] = deriveEncoder
}
