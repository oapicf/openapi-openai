package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 */
case class CreateAssistantRequestModel()

object CreateAssistantRequestModel {
    /**
     * Creates the codec for converting CreateAssistantRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssistantRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssistantRequestModel] = deriveEncoder
}
