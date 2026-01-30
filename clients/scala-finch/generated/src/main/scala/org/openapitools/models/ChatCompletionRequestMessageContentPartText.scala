package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Learn about [text inputs](/docs/guides/text-generation). 
 * @param _type The type of the content part.
 * @param text The text content.
 */
case class ChatCompletionRequestMessageContentPartText(_type: String,
                text: String
                )

object ChatCompletionRequestMessageContentPartText {
    /**
     * Creates the codec for converting ChatCompletionRequestMessageContentPartText from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestMessageContentPartText] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestMessageContentPartText] = deriveEncoder
}
