package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The model to use for image generation.
 */
case class CreateImageRequestModel()

object CreateImageRequestModel {
    /**
     * Creates the codec for converting CreateImageRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateImageRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateImageRequestModel] = deriveEncoder
}
