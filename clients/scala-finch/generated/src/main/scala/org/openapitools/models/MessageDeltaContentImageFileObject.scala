package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaContentImageFileObjectImageFile

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 * @param index The index of the content part in the message.
 * @param _type Always `image_file`.
 * @param imageUnderscorefile 
 */
case class MessageDeltaContentImageFileObject(index: Int,
                _type: String,
                imageUnderscorefile: Option[MessageDeltaContentImageFileObjectImageFile]
                )

object MessageDeltaContentImageFileObject {
    /**
     * Creates the codec for converting MessageDeltaContentImageFileObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentImageFileObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentImageFileObject] = deriveEncoder
}
