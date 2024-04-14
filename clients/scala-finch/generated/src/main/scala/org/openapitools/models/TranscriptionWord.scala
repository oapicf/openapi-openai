package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param word The text content of the word.
 * @param start Start time of the word in seconds.
 * @param end End time of the word in seconds.
 */
case class TranscriptionWord(word: String,
                start: Float,
                end: Float
                )

object TranscriptionWord {
    /**
     * Creates the codec for converting TranscriptionWord from and to JSON.
     */
    implicit val decoder: Decoder[TranscriptionWord] = deriveDecoder
    implicit val encoder: ObjectEncoder[TranscriptionWord] = deriveEncoder
}
