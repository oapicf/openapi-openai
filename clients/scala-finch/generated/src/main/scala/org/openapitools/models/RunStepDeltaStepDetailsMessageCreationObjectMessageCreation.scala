package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param messageUnderscoreid The ID of the message that was created by this run step.
 */
case class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation(messageUnderscoreid: Option[String]
                )

object RunStepDeltaStepDetailsMessageCreationObjectMessageCreation {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsMessageCreationObjectMessageCreation from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = deriveEncoder
}
