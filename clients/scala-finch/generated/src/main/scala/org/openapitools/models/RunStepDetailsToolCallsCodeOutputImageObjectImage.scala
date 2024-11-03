package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param fileUnderscoreid The [file](/docs/api-reference/files) ID of the image.
 */
case class RunStepDetailsToolCallsCodeOutputImageObjectImage(fileUnderscoreid: String
                )

object RunStepDetailsToolCallsCodeOutputImageObjectImage {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsCodeOutputImageObjectImage from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsCodeOutputImageObjectImage] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsCodeOutputImageObjectImage] = deriveEncoder
}
