package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateImageRequestModel

/**
 * 
 * @param prompt A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
 * @param model 
 * @param n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
 * @param quality The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
 * @param responseUnderscoreformat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
 * @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
 * @param style The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
 */
case class CreateImageRequest(prompt: String,
                model: Option[CreateImageRequestModel],
                n: Option[Int],
                quality: Option[String],
                responseUnderscoreformat: Option[String],
                size: Option[String],
                style: Option[String],
                user: Option[String]
                )

object CreateImageRequest {
    /**
     * Creates the codec for converting CreateImageRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateImageRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateImageRequest] = deriveEncoder
}
