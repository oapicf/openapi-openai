package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionStreamResponseDelta

/**
 * 
 * @param index 
 * @param delta 
 * @param finishUnderscorereason 
 */
case class CreateChatCompletionStreamResponseChoicesInner(index: Option[Int],
                delta: Option[ChatCompletionStreamResponseDelta],
                finishUnderscorereason: Option[String]
                )

object CreateChatCompletionStreamResponseChoicesInner {
    /**
     * Creates the codec for converting CreateChatCompletionStreamResponseChoicesInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionStreamResponseChoicesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionStreamResponseChoicesInner] = deriveEncoder
}
