package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
 */
case class CreateCompletionRequestModel()

object CreateCompletionRequestModel {
    /**
     * Creates the codec for converting CreateCompletionRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateCompletionRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateCompletionRequestModel] = deriveEncoder
}
