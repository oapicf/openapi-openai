package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestMessageContentPartImage
import org.openapitools.models.ChatCompletionRequestMessageContentPartImageImageUrl
import org.openapitools.models.ChatCompletionRequestMessageContentPartText

/**
 * 
 * @param _type The type of the content part.
 * @param text The text content.
 * @param imageUnderscoreurl 
 */
case class ChatCompletionRequestMessageContentPart(_type: String,
                text: String,
                imageUnderscoreurl: ChatCompletionRequestMessageContentPartImageImageUrl
                )

object ChatCompletionRequestMessageContentPart {
    /**
     * Creates the codec for converting ChatCompletionRequestMessageContentPart from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestMessageContentPart] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestMessageContentPart] = deriveEncoder
}
