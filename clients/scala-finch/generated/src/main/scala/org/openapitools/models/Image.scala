package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Represents the url or the content of an image generated by the OpenAI API.
 * @param b64Underscorejson The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
 * @param url The URL of the generated image, if `response_format` is `url` (default).
 * @param revisedUnderscoreprompt The prompt that was used to generate the image, if there was any revision to the prompt.
 */
case class Image(b64Underscorejson: Option[String],
                url: Option[String],
                revisedUnderscoreprompt: Option[String]
                )

object Image {
    /**
     * Creates the codec for converting Image from and to JSON.
     */
    implicit val decoder: Decoder[Image] = deriveDecoder
    implicit val encoder: ObjectEncoder[Image] = deriveEncoder
}