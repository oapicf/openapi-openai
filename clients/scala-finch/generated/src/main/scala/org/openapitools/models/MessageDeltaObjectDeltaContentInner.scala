package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaContentImageFileObject
import org.openapitools.models.MessageDeltaContentImageFileObjectImageFile
import org.openapitools.models.MessageDeltaContentImageUrlObject
import org.openapitools.models.MessageDeltaContentImageUrlObjectImageUrl
import org.openapitools.models.MessageDeltaContentRefusalObject
import org.openapitools.models.MessageDeltaContentTextObject
import org.openapitools.models.MessageDeltaContentTextObjectText

/**
 * 
 * @param index The index of the content part in the message.
 * @param _type Always `image_file`.
 * @param imageUnderscorefile 
 * @param text 
 * @param refusal 
 * @param imageUnderscoreurl 
 */
case class MessageDeltaObjectDeltaContentInner(index: Int,
                _type: String,
                imageUnderscorefile: Option[MessageDeltaContentImageFileObjectImageFile],
                text: Option[MessageDeltaContentTextObjectText],
                refusal: Option[String],
                imageUnderscoreurl: Option[MessageDeltaContentImageUrlObjectImageUrl]
                )

object MessageDeltaObjectDeltaContentInner {
    /**
     * Creates the codec for converting MessageDeltaObjectDeltaContentInner from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaObjectDeltaContentInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaObjectDeltaContentInner] = deriveEncoder
}
