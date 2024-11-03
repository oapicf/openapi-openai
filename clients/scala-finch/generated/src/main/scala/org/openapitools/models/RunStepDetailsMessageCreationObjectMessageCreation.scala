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
case class RunStepDetailsMessageCreationObjectMessageCreation(messageUnderscoreid: String
                )

object RunStepDetailsMessageCreationObjectMessageCreation {
    /**
     * Creates the codec for converting RunStepDetailsMessageCreationObjectMessageCreation from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsMessageCreationObjectMessageCreation] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsMessageCreationObjectMessageCreation] = deriveEncoder
}
