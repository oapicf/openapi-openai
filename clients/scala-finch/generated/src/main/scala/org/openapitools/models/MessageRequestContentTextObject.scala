package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The text content that is part of a message.
 * @param _type Always `text`.
 * @param text Text content to be sent to the model
 */
case class MessageRequestContentTextObject(_type: String,
                text: String
                )

object MessageRequestContentTextObject {
    /**
     * Creates the codec for converting MessageRequestContentTextObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageRequestContentTextObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageRequestContentTextObject] = deriveEncoder
}
