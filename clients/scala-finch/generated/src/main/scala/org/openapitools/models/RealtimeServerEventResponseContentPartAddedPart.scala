package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The content part that was added.
 * @param _type The content type (\"text\", \"audio\").
 * @param text The text content (if type is \"text\").
 * @param audio Base64-encoded audio data (if type is \"audio\").
 * @param transcript The transcript of the audio (if type is \"audio\").
 */
case class RealtimeServerEventResponseContentPartAddedPart(_type: Option[String],
                text: Option[String],
                audio: Option[String],
                transcript: Option[String]
                )

object RealtimeServerEventResponseContentPartAddedPart {
    /**
     * Creates the codec for converting RealtimeServerEventResponseContentPartAddedPart from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseContentPartAddedPart] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseContentPartAddedPart] = deriveEncoder
}
