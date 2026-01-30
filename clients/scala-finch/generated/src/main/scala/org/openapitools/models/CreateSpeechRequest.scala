package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CreateSpeechRequestModel

/**
 * 
 * @param model 
 * @param input The text to generate audio for. The maximum length is 4096 characters.
 * @param voice The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
 * @param responseUnderscoreformat The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
 * @param speed The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
 */
case class CreateSpeechRequest(model: CreateSpeechRequestModel,
                input: String,
                voice: String,
                responseUnderscoreformat: Option[String],
                speed: Option[BigDecimal]
                )

object CreateSpeechRequest {
    /**
     * Creates the codec for converting CreateSpeechRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateSpeechRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateSpeechRequest] = deriveEncoder
}
