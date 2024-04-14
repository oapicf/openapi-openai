package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Occurs when a stream ends.
 * @param event 
 * @param data 
 */
case class DoneEvent(event: String,
                data: String
                )

object DoneEvent {
    /**
     * Creates the codec for converting DoneEvent from and to JSON.
     */
    implicit val decoder: Decoder[DoneEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[DoneEvent] = deriveEncoder
}
