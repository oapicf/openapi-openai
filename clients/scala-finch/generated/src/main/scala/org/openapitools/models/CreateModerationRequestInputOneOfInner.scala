package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateModerationRequestInputOneOfInnerOneOf
import org.openapitools.models.CreateModerationRequestInputOneOfInnerOneOf1
import org.openapitools.models.CreateModerationRequestInputOneOfInnerOneOfImageUrl

/**
 * 
 * @param _type Always `image_url`.
 * @param imageUnderscoreurl 
 * @param text A string of text to classify.
 */
case class CreateModerationRequestInputOneOfInner(_type: String,
                imageUnderscoreurl: CreateModerationRequestInputOneOfInnerOneOfImageUrl,
                text: String
                )

object CreateModerationRequestInputOneOfInner {
    /**
     * Creates the codec for converting CreateModerationRequestInputOneOfInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationRequestInputOneOfInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationRequestInputOneOfInner] = deriveEncoder
}
