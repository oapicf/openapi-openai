package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateModerationRequestInputOneOfInnerOneOfImageUrl

/**
 * An object describing an image to classify.
 * @param _type Always `image_url`.
 * @param imageUnderscoreurl 
 */
case class CreateModerationRequestInputOneOfInnerOneOf(_type: String,
                imageUnderscoreurl: CreateModerationRequestInputOneOfInnerOneOfImageUrl
                )

object CreateModerationRequestInputOneOfInnerOneOf {
    /**
     * Creates the codec for converting CreateModerationRequestInputOneOfInnerOneOf from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationRequestInputOneOfInnerOneOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationRequestInputOneOfInnerOneOf] = deriveEncoder
}
