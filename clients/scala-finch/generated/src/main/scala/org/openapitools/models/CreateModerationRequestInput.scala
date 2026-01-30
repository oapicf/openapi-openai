package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateModerationRequestInputOneOfInner

/**
 * Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
 */
case class CreateModerationRequestInput()

object CreateModerationRequestInput {
    /**
     * Creates the codec for converting CreateModerationRequestInput from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationRequestInput] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationRequestInput] = deriveEncoder
}
