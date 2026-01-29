package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaObject

/**
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 * @param event 
 * @param data 
 */
case class MessageStreamEventOneOf2(event: String,
                data: MessageDeltaObject
                )

object MessageStreamEventOneOf2 {
    /**
     * Creates the codec for converting MessageStreamEventOneOf2 from and to JSON.
     */
    implicit val decoder: Decoder[MessageStreamEventOneOf2] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageStreamEventOneOf2] = deriveEncoder
}
