package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ThreadObject
import org.openapitools.models.ThreadStreamEventOneOf

/**
 * 
 * @param event 
 * @param data 
 */
case class ThreadStreamEvent(event: String,
                data: ThreadObject
                )

object ThreadStreamEvent {
    /**
     * Creates the codec for converting ThreadStreamEvent from and to JSON.
     */
    implicit val decoder: Decoder[ThreadStreamEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[ThreadStreamEvent] = deriveEncoder
}
