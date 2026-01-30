package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaContentImageUrlObjectImageUrl

/**
 * References an image URL in the content of a message.
 * @param index The index of the content part in the message.
 * @param _type Always `image_url`.
 * @param imageUnderscoreurl 
 */
case class MessageDeltaContentImageUrlObject(index: Int,
                _type: String,
                imageUnderscoreurl: Option[MessageDeltaContentImageUrlObjectImageUrl]
                )

object MessageDeltaContentImageUrlObject {
    /**
     * Creates the codec for converting MessageDeltaContentImageUrlObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentImageUrlObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentImageUrlObject] = deriveEncoder
}
