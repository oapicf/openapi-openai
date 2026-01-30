package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionRequestMessageContentPartAudioInputAudio

/**
 * Learn about [audio inputs](/docs/guides/audio). 
 * @param _type The type of the content part. Always `input_audio`.
 * @param inputUnderscoreaudio 
 */
case class ChatCompletionRequestMessageContentPartAudio(_type: String,
                inputUnderscoreaudio: ChatCompletionRequestMessageContentPartAudioInputAudio
                )

object ChatCompletionRequestMessageContentPartAudio {
    /**
     * Creates the codec for converting ChatCompletionRequestMessageContentPartAudio from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestMessageContentPartAudio] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestMessageContentPartAudio] = deriveEncoder
}
