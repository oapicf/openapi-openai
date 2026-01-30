package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * An object describing text to classify.
 * @param _type Always `text`.
 * @param text A string of text to classify.
 */
case class CreateModerationRequestInputOneOfInnerOneOf1(_type: String,
                text: String
                )

object CreateModerationRequestInputOneOfInnerOneOf1 {
    /**
     * Creates the codec for converting CreateModerationRequestInputOneOfInnerOneOf1 from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationRequestInputOneOfInnerOneOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationRequestInputOneOfInnerOneOf1] = deriveEncoder
}
