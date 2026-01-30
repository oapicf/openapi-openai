package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * Contains either an image URL or a data URL for a base64 encoded image.
 * @param url Either a URL of the image or the base64 encoded image data.
 */
case class CreateModerationRequestInputOneOfInnerOneOfImageUrl(url: URI
                )

object CreateModerationRequestInputOneOfInnerOneOfImageUrl {
    /**
     * Creates the codec for converting CreateModerationRequestInputOneOfInnerOneOfImageUrl from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationRequestInputOneOfInnerOneOfImageUrl] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationRequestInputOneOfInnerOneOfImageUrl] = deriveEncoder
}
