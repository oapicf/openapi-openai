package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageObject
import org.openapitools.models.MessageStreamEventOneOf
import org.openapitools.models.MessageStreamEventOneOf1
import org.openapitools.models.MessageStreamEventOneOf2
import org.openapitools.models.MessageStreamEventOneOf3
import org.openapitools.models.MessageStreamEventOneOf4

/**
 * 
 * @param event 
 * @param data 
 */
case class MessageStreamEvent(event: String,
                data: MessageObject
                )

object MessageStreamEvent {
    /**
     * Creates the codec for converting MessageStreamEvent from and to JSON.
     */
    implicit val decoder: Decoder[MessageStreamEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageStreamEvent] = deriveEncoder
}
