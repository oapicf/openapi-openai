package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepObject

/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) fails.
 * @param event 
 * @param data 
 */
case class RunStepStreamEventOneOf4(event: String,
                data: RunStepObject
                )

object RunStepStreamEventOneOf4 {
    /**
     * Creates the codec for converting RunStepStreamEventOneOf4 from and to JSON.
     */
    implicit val decoder: Decoder[RunStepStreamEventOneOf4] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepStreamEventOneOf4] = deriveEncoder
}
