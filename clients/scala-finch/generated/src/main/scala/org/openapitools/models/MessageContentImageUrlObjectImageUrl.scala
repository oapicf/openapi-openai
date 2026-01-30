package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param url The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
 * @param detail Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
 */
case class MessageContentImageUrlObjectImageUrl(url: URI,
                detail: Option[String]
                )

object MessageContentImageUrlObjectImageUrl {
    /**
     * Creates the codec for converting MessageContentImageUrlObjectImageUrl from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentImageUrlObjectImageUrl] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentImageUrlObjectImageUrl] = deriveEncoder
}
