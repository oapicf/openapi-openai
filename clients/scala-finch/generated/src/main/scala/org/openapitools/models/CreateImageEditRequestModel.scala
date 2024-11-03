package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The model to use for image generation. Only `dall-e-2` is supported at this time.
 */
case class CreateImageEditRequestModel()

object CreateImageEditRequestModel {
    /**
     * Creates the codec for converting CreateImageEditRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateImageEditRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateImageEditRequestModel] = deriveEncoder
}
