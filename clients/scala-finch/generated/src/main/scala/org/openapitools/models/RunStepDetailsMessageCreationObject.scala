package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsMessageCreationObjectMessageCreation

/**
 * Details of the message creation by the run step.
 * @param _type Always `message_creation`.
 * @param messageUnderscorecreation 
 */
case class RunStepDetailsMessageCreationObject(_type: String,
                messageUnderscorecreation: RunStepDetailsMessageCreationObjectMessageCreation
                )

object RunStepDetailsMessageCreationObject {
    /**
     * Creates the codec for converting RunStepDetailsMessageCreationObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsMessageCreationObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsMessageCreationObject] = deriveEncoder
}
