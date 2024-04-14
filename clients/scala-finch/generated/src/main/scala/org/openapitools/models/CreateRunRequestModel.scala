package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
 */
case class CreateRunRequestModel()

object CreateRunRequestModel {
    /**
     * Creates the codec for converting CreateRunRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateRunRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateRunRequestModel] = deriveEncoder
}
