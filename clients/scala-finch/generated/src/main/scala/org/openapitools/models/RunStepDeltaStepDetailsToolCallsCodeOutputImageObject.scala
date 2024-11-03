package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage

/**
 * 
 * @param index The index of the output in the outputs array.
 * @param _type Always `image`.
 * @param image 
 */
case class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(index: Int,
                _type: String,
                image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage]
                )

object RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsToolCallsCodeOutputImageObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsToolCallsCodeOutputImageObject] = deriveEncoder
}
