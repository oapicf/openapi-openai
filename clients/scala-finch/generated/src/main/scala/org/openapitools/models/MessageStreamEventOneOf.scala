package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageObject

/**
 * Occurs when a [message](/docs/api-reference/messages/object) is created.
 * @param event 
 * @param data 
 */
case class MessageStreamEventOneOf(event: String,
                data: MessageObject
                )

object MessageStreamEventOneOf {
    /**
     * Creates the codec for converting MessageStreamEventOneOf from and to JSON.
     */
    implicit val decoder: Decoder[MessageStreamEventOneOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageStreamEventOneOf] = deriveEncoder
}
