package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param url The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
 * @param detail Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
 */
case class MessageDeltaContentImageUrlObjectImageUrl(url: Option[String],
                detail: Option[String]
                )

object MessageDeltaContentImageUrlObjectImageUrl {
    /**
     * Creates the codec for converting MessageDeltaContentImageUrlObjectImageUrl from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentImageUrlObjectImageUrl] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentImageUrlObjectImageUrl] = deriveEncoder
}
