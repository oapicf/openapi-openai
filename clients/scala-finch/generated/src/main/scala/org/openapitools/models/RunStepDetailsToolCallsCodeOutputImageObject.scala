package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsToolCallsCodeOutputImageObjectImage

/**
 * 
 * @param _type Always `image`.
 * @param image 
 */
case class RunStepDetailsToolCallsCodeOutputImageObject(_type: String,
                image: RunStepDetailsToolCallsCodeOutputImageObjectImage
                )

object RunStepDetailsToolCallsCodeOutputImageObject {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsCodeOutputImageObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsCodeOutputImageObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsCodeOutputImageObject] = deriveEncoder
}
