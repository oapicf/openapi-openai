package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Up to 4 sequences where the API will stop generating further tokens. 
 */
case class CreateChatCompletionRequestStop()

object CreateChatCompletionRequestStop {
    /**
     * Creates the codec for converting CreateChatCompletionRequestStop from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionRequestStop] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionRequestStop] = deriveEncoder
}
