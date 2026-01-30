package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestMessageContentPartImageImageUrl

/**
 * Learn about [image inputs](/docs/guides/vision). 
 * @param _type The type of the content part.
 * @param imageUnderscoreurl 
 */
case class ChatCompletionRequestMessageContentPartImage(_type: String,
                imageUnderscoreurl: ChatCompletionRequestMessageContentPartImageImageUrl
                )

object ChatCompletionRequestMessageContentPartImage {
    /**
     * Creates the codec for converting ChatCompletionRequestMessageContentPartImage from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestMessageContentPartImage] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestMessageContentPartImage] = deriveEncoder
}
