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
case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage(fileUnderscoreid: Option[String]
                )

object RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = deriveEncoder
}
