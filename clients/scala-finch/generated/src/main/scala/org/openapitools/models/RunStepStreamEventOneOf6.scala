package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepObject

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
 * @param event 
 * @param data 
 */
case class RunStepStreamEventOneOf6(event: String,
                data: RunStepObject
                )

object RunStepStreamEventOneOf6 {
    /**
     * Creates the codec for converting RunStepStreamEventOneOf6 from and to JSON.
     */
    implicit val decoder: Decoder[RunStepStreamEventOneOf6] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepStreamEventOneOf6] = deriveEncoder
}
