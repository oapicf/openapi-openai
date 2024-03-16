package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
 */
case class CreateCompletionRequestStop()

object CreateCompletionRequestStop {
    /**
     * Creates the codec for converting CreateCompletionRequestStop from and to JSON.
     */
    implicit val decoder: Decoder[CreateCompletionRequestStop] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateCompletionRequestStop] = deriveEncoder
}
