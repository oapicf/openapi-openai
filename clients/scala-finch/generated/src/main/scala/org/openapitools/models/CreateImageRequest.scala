package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
 * @param n The number of images to generate. Must be between 1 and 10.
 * @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * @param responseUnderscoreformat The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 */
case class CreateImageRequest(prompt: String,
                n: Option[Int],
                size: Option[String],
                responseUnderscoreformat: Option[String],
                user: Option[String]
                )

object CreateImageRequest {
    /**
     * Creates the codec for converting CreateImageRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateImageRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateImageRequest] = deriveEncoder
}
