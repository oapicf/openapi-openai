package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageObject

/**
 * Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
 * @param event 
 * @param data 
 */
case class MessageStreamEventOneOf1(event: String,
                data: MessageObject
                )

object MessageStreamEventOneOf1 {
    /**
     * Creates the codec for converting MessageStreamEventOneOf1 from and to JSON.
     */
    implicit val decoder: Decoder[MessageStreamEventOneOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageStreamEventOneOf1] = deriveEncoder
}
