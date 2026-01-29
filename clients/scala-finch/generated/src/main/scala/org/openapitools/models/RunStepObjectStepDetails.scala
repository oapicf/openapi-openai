package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsMessageCreationObject
import org.openapitools.models.RunStepDetailsMessageCreationObjectMessageCreation
import org.openapitools.models.RunStepDetailsToolCallsObject
import org.openapitools.models.RunStepDetailsToolCallsObjectToolCallsInner
import scala.collection.immutable.Seq

/**
 * The details of the run step.
 * @param _type Always `message_creation`.
 * @param messageUnderscorecreation 
 * @param toolUnderscorecalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
 */
case class RunStepObjectStepDetails(_type: String,
                messageUnderscorecreation: RunStepDetailsMessageCreationObjectMessageCreation,
                toolUnderscorecalls: Seq[RunStepDetailsToolCallsObjectToolCallsInner]
                )

object RunStepObjectStepDetails {
    /**
     * Creates the codec for converting RunStepObjectStepDetails from and to JSON.
     */
    implicit val decoder: Decoder[RunStepObjectStepDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepObjectStepDetails] = deriveEncoder
}
