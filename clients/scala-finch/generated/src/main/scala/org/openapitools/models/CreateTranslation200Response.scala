package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateTranslationResponseJson
import org.openapitools.models.CreateTranslationResponseVerboseJson
import org.openapitools.models.TranscriptionSegment
import scala.collection.immutable.Seq

/**
 * 
 * @param text The translated text.
 * @param language The language of the output translation (always `english`).
 * @param duration The duration of the input audio.
 * @param segments Segments of the translated text and their corresponding details.
 */
case class CreateTranslation200Response(text: String,
                language: String,
                duration: String,
                segments: Option[Seq[TranscriptionSegment]]
                )

object CreateTranslation200Response {
    /**
     * Creates the codec for converting CreateTranslation200Response from and to JSON.
     */
    implicit val decoder: Decoder[CreateTranslation200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateTranslation200Response] = deriveEncoder
}
