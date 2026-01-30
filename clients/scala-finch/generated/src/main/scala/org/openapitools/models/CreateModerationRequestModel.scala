package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
 */
case class CreateModerationRequestModel()

object CreateModerationRequestModel {
    /**
     * Creates the codec for converting CreateModerationRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationRequestModel] = deriveEncoder
}
