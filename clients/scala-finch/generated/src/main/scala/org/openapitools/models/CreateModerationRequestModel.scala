package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Two content moderations models are available: `text-moderation-stable` and `text-moderation-latest`.  The default is `text-moderation-latest` which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use `text-moderation-stable`, we will provide advanced notice before updating the model. Accuracy of `text-moderation-stable` may be slightly lower than for `text-moderation-latest`. 
 */
case class CreateModerationRequestModel()

object CreateModerationRequestModel {
    /**
     * Creates the codec for converting CreateModerationRequestModel from and to JSON.
     */
    implicit val decoder: Decoder[CreateModerationRequestModel] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateModerationRequestModel] = deriveEncoder
}
