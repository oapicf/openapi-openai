package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepObject
import org.openapitools.models.RunStepStreamEventOneOf
import org.openapitools.models.RunStepStreamEventOneOf1
import org.openapitools.models.RunStepStreamEventOneOf2
import org.openapitools.models.RunStepStreamEventOneOf3
import org.openapitools.models.RunStepStreamEventOneOf4
import org.openapitools.models.RunStepStreamEventOneOf5
import org.openapitools.models.RunStepStreamEventOneOf6

/**
 * 
 * @param event 
 * @param data 
 */
case class RunStepStreamEvent(event: String,
                data: RunStepObject
                )

object RunStepStreamEvent {
    /**
     * Creates the codec for converting RunStepStreamEvent from and to JSON.
     */
    implicit val decoder: Decoder[RunStepStreamEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepStreamEvent] = deriveEncoder
}
