package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageContentImageFileObject
import org.openapitools.models.MessageContentImageFileObjectImageFile
import org.openapitools.models.MessageContentImageUrlObject
import org.openapitools.models.MessageContentImageUrlObjectImageUrl
import org.openapitools.models.MessageRequestContentTextObject

/**
 * 
 * @param _type Always `image_file`.
 * @param imageUnderscorefile 
 * @param imageUnderscoreurl 
 * @param text Text content to be sent to the model
 */
case class ArrayOfContentPartsInner(_type: String,
                imageUnderscorefile: MessageContentImageFileObjectImageFile,
                imageUnderscoreurl: MessageContentImageUrlObjectImageUrl,
                text: String
                )

object ArrayOfContentPartsInner {
    /**
     * Creates the codec for converting ArrayOfContentPartsInner from and to JSON.
     */
    implicit val decoder: Decoder[ArrayOfContentPartsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ArrayOfContentPartsInner] = deriveEncoder
}
