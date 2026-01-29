package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaObjectDeltaStepDetails

/**
 * The delta containing the fields that have changed on the run step.
 * @param stepUnderscoredetails 
 */
case class RunStepDeltaObjectDelta(stepUnderscoredetails: Option[RunStepDeltaObjectDeltaStepDetails]
                )

object RunStepDeltaObjectDelta {
    /**
     * Creates the codec for converting RunStepDeltaObjectDelta from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaObjectDelta] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaObjectDelta] = deriveEncoder
}
