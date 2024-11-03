package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The input text to classify
 */
case class CreateModerationRequestInput()

object CreateModerationRequestInput {
    /**
     * Creates the codec for converting CreateModerationRequestInput from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationRequestInput] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationRequestInput] = deriveEncoder
}
