package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param url Either a URL of the image or the base64 encoded image data.
 * @param detail Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
 */
case class ChatCompletionRequestMessageContentPartImageImageUrl(url: URI,
                detail: Option[String]
                )

object ChatCompletionRequestMessageContentPartImageImageUrl {
    /**
     * Creates the codec for converting ChatCompletionRequestMessageContentPartImageImageUrl from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionRequestMessageContentPartImageImageUrl] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionRequestMessageContentPartImageImageUrl] = deriveEncoder
}
