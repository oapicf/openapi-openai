package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageContentImageFileObject
import org.openapitools.models.MessageContentImageFileObjectImageFile
import org.openapitools.models.MessageContentTextObject
import org.openapitools.models.MessageContentTextObjectText

/**
 * 
 * @param _type Always `image_file`.
 * @param imageUnderscorefile 
 * @param text 
 */
case class MessageObjectContentInner(_type: String,
                imageUnderscorefile: MessageContentImageFileObjectImageFile,
                text: MessageContentTextObjectText
                )

object MessageObjectContentInner {
    /**
     * Creates the codec for converting MessageObjectContentInner from and to JSON.
     */
    implicit val decoder: Decoder[MessageObjectContentInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageObjectContentInner] = deriveEncoder
}
