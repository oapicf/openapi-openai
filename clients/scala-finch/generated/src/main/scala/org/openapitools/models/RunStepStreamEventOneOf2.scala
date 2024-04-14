package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaObject

/**
 * Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
 * @param event 
 * @param data 
 */
case class RunStepStreamEventOneOf2(event: String,
                data: RunStepDeltaObject
                )

object RunStepStreamEventOneOf2 {
    /**
     * Creates the codec for converting RunStepStreamEventOneOf2 from and to JSON.
     */
    implicit val decoder: Decoder[RunStepStreamEventOneOf2] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepStreamEventOneOf2] = deriveEncoder
}
