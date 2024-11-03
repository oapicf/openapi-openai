package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaContentTextObjectText

/**
 * The text content that is part of a message.
 * @param index The index of the content part in the message.
 * @param _type Always `text`.
 * @param text 
 */
case class MessageDeltaContentTextObject(index: Int,
                _type: String,
                text: Option[MessageDeltaContentTextObjectText]
                )

object MessageDeltaContentTextObject {
    /**
     * Creates the codec for converting MessageDeltaContentTextObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentTextObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentTextObject] = deriveEncoder
}
