package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TranscriptionSegment
import scala.collection.immutable.Seq

/**
 * 
 * @param language The language of the output translation (always `english`).
 * @param duration The duration of the input audio.
 * @param text The translated text.
 * @param segments Segments of the translated text and their corresponding details.
 */
case class CreateTranslationResponseVerboseJson(language: String,
                duration: String,
                text: String,
                segments: Option[Seq[TranscriptionSegment]]
                )

object CreateTranslationResponseVerboseJson {
    /**
     * Creates the codec for converting CreateTranslationResponseVerboseJson from and to JSON.
     */
    implicit val decoder: Decoder[CreateTranslationResponseVerboseJson] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateTranslationResponseVerboseJson] = deriveEncoder
}
