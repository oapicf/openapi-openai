package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestMessageContentPartAudio
import org.openapitools.models.ChatCompletionRequestMessageContentPartAudioInputAudio
import org.openapitools.models.ChatCompletionRequestMessageContentPartImage
import org.openapitools.models.ChatCompletionRequestMessageContentPartImageImageUrl
import org.openapitools.models.ChatCompletionRequestMessageContentPartText

/**
 * 
 * @param _type The type of the content part.
 * @param text The text content.
 * @param imageUnderscoreurl 
 * @param inputUnderscoreaudio 
 */
case class ChatCompletionRequestUserMessageContentPart(_type: String,
                text: String,
                imageUnderscoreurl: ChatCompletionRequestMessageContentPartImageImageUrl,
                inputUnderscoreaudio: ChatCompletionRequestMessageContentPartAudioInputAudio
                )

object ChatCompletionRequestUserMessageContentPart {
    /**
     * Creates the codec for converting ChatCompletionRequestUserMessageContentPart from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestUserMessageContentPart] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestUserMessageContentPart] = deriveEncoder
}
