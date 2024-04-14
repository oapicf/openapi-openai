package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateTranscriptionResponseJson
import org.openapitools.models.CreateTranscriptionResponseVerboseJson
import org.openapitools.models.TranscriptionSegment
import org.openapitools.models.TranscriptionWord
import scala.collection.immutable.Seq

/**
 * 
 * @param text The transcribed text.
 * @param language The language of the input audio.
 * @param duration The duration of the input audio.
 * @param words Extracted words and their corresponding timestamps.
 * @param segments Segments of the transcribed text and their corresponding details.
 */
case class CreateTranscription200Response(text: String,
                language: String,
                duration: String,
                words: Option[Seq[TranscriptionWord]],
                segments: Option[Seq[TranscriptionSegment]]
                )

object CreateTranscription200Response {
    /**
     * Creates the codec for converting CreateTranscription200Response from and to JSON.
     */
    implicit val decoder: Decoder[CreateTranscription200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateTranscription200Response] = deriveEncoder
}
