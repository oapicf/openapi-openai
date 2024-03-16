package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * ID of the model to use. You can use the `text-davinci-edit-001` or `code-davinci-edit-001` model with this endpoint.
 */
case class CreateEditRequestModel()

object CreateEditRequestModel {
    /**
     * Creates the codec for converting CreateEditRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateEditRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateEditRequestModel] = deriveEncoder
}
