package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd` 
 */
case class CreateSpeechRequestModel()

object CreateSpeechRequestModel {
    /**
     * Creates the codec for converting CreateSpeechRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateSpeechRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateSpeechRequestModel] = deriveEncoder
}
