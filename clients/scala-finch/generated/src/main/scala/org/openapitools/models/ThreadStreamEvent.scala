package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ThreadObject

/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 * @param enabled Whether to enable input audio transcription.
 * @param event 
 * @param data 
 */
case class ThreadStreamEvent(enabled: Option[Boolean],
                event: String,
                data: ThreadObject
                )

object ThreadStreamEvent {
    /**
     * Creates the codec for converting ThreadStreamEvent from and to JSON.
     */
    implicit val decoder: Decoder[ThreadStreamEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[ThreadStreamEvent] = deriveEncoder
}
