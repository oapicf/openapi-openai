package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionResponseMessage

/**
 * 
 * @param index 
 * @param message 
 * @param finishUnderscorereason 
 */
case class CreateChatCompletionResponseChoicesInner(index: Option[Int],
                message: Option[ChatCompletionResponseMessage],
                finishUnderscorereason: Option[String]
                )

object CreateChatCompletionResponseChoicesInner {
    /**
     * Creates the codec for converting CreateChatCompletionResponseChoicesInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionResponseChoicesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionResponseChoicesInner] = deriveEncoder
}
