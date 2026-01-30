package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepObject

/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an `in_progress` state.
 * @param event 
 * @param data 
 */
case class RunStepStreamEventOneOf1(event: String,
                data: RunStepObject
                )

object RunStepStreamEventOneOf1 {
    /**
     * Creates the codec for converting RunStepStreamEventOneOf1 from and to JSON.
     */
    implicit val decoder: Decoder[RunStepStreamEventOneOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepStreamEventOneOf1] = deriveEncoder
}
