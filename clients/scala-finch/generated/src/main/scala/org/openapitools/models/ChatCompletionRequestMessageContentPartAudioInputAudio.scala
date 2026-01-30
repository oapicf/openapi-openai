package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param data Base64 encoded audio data.
 * @param format The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
 */
case class ChatCompletionRequestMessageContentPartAudioInputAudio(data: String,
                format: String
                )

object ChatCompletionRequestMessageContentPartAudioInputAudio {
    /**
     * Creates the codec for converting ChatCompletionRequestMessageContentPartAudioInputAudio from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestMessageContentPartAudioInputAudio] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestMessageContentPartAudioInputAudio] = deriveEncoder
}
