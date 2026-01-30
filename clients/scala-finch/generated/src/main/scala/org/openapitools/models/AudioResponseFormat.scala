package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
 */
case class AudioResponseFormat()

object AudioResponseFormat {
    /**
     * Creates the codec for converting AudioResponseFormat from and to JSON.
     */
    implicit val decoder: Decoder[AudioResponseFormat] = deriveDecoder
    implicit val encoder: ObjectEncoder[AudioResponseFormat] = deriveEncoder
}
