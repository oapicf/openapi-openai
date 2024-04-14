package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Represents a transcription response returned by model, based on the provided input.
 * @param text The transcribed text.
 */
case class CreateTranscriptionResponseJson(text: String
                )

object CreateTranscriptionResponseJson {
    /**
     * Creates the codec for converting CreateTranscriptionResponseJson from and to JSON.
     */
    implicit val decoder: Decoder[CreateTranscriptionResponseJson] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateTranscriptionResponseJson] = deriveEncoder
}
