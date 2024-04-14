package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageObject

/**
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 * @param event 
 * @param data 
 */
case class MessageStreamEventOneOf3(event: String,
                data: MessageObject
                )

object MessageStreamEventOneOf3 {
    /**
     * Creates the codec for converting MessageStreamEventOneOf3 from and to JSON.
     */
    implicit val decoder: Decoder[MessageStreamEventOneOf3] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageStreamEventOneOf3] = deriveEncoder
}
