package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
 */
case class CreateChatCompletionRequestModel()

object CreateChatCompletionRequestModel {
    /**
     * Creates the codec for converting CreateChatCompletionRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionRequestModel] = deriveEncoder
}
