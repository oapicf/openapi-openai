package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageContentTextObjectText

/**
 * The text content that is part of a message.
 * @param _type Always `text`.
 * @param text 
 */
case class MessageContentTextObject(_type: String,
                text: MessageContentTextObjectText
                )

object MessageContentTextObject {
    /**
     * Creates the codec for converting MessageContentTextObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentTextObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentTextObject] = deriveEncoder
}
