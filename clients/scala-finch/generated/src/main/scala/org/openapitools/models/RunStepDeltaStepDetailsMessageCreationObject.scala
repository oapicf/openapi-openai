package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation

/**
 * Details of the message creation by the run step.
 * @param _type Always `message_creation`.
 * @param messageUnderscorecreation 
 */
case class RunStepDeltaStepDetailsMessageCreationObject(_type: String,
                messageUnderscorecreation: Option[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation]
                )

object RunStepDeltaStepDetailsMessageCreationObject {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsMessageCreationObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsMessageCreationObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsMessageCreationObject] = deriveEncoder
}
