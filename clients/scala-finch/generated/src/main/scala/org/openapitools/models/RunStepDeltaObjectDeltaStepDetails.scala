package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaStepDetailsMessageCreationObject
import org.openapitools.models.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsObject
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
import scala.collection.immutable.Seq

/**
 * The details of the run step.
 * @param _type Always `message_creation`.
 * @param messageUnderscorecreation 
 * @param toolUnderscorecalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
 */
case class RunStepDeltaObjectDeltaStepDetails(_type: String,
                messageUnderscorecreation: Option[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation],
                toolUnderscorecalls: Option[Seq[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]]
                )

object RunStepDeltaObjectDeltaStepDetails {
    /**
     * Creates the codec for converting RunStepDeltaObjectDeltaStepDetails from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaObjectDeltaStepDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaObjectDeltaStepDetails] = deriveEncoder
}
