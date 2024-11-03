package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageContentImageFileObjectImageFile

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 * @param _type Always `image_file`.
 * @param imageUnderscorefile 
 */
case class MessageContentImageFileObject(_type: String,
                imageUnderscorefile: MessageContentImageFileObjectImageFile
                )

object MessageContentImageFileObject {
    /**
     * Creates the codec for converting MessageContentImageFileObject from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentImageFileObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentImageFileObject] = deriveEncoder
}
