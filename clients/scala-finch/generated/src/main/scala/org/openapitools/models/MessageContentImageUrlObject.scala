package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageContentImageUrlObjectImageUrl

/**
 * References an image URL in the content of a message.
 * @param _type The type of the content part.
 * @param imageUnderscoreurl 
 */
case class MessageContentImageUrlObject(_type: String,
                imageUnderscoreurl: MessageContentImageUrlObjectImageUrl
                )

object MessageContentImageUrlObject {
    /**
     * Creates the codec for converting MessageContentImageUrlObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentImageUrlObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentImageUrlObject] = deriveEncoder
}
