package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.TranscriptionSegment
import org.openapitools.models.TranscriptionWord
import scala.collection.immutable.Seq

/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 * @param language The language of the input audio.
 * @param duration The duration of the input audio.
 * @param text The transcribed text.
 * @param words Extracted words and their corresponding timestamps.
 * @param segments Segments of the transcribed text and their corresponding details.
 */
case class CreateTranscriptionResponseVerboseJson(language: String,
                duration: String,
                text: String,
                words: Option[Seq[TranscriptionWord]],
                segments: Option[Seq[TranscriptionSegment]]
                )

object CreateTranscriptionResponseVerboseJson {
    /**
     * Creates the codec for converting CreateTranscriptionResponseVerboseJson from and to JSON.
     */
    implicit val decoder: Decoder[CreateTranscriptionResponseVerboseJson] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateTranscriptionResponseVerboseJson] = deriveEncoder
}
