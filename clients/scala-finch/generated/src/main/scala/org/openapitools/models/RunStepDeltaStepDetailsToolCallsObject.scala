package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
import scala.collection.immutable.Seq

/**
 * Details of the tool call.
 * @param _type Always `tool_calls`.
 * @param toolUnderscorecalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
 */
case class RunStepDeltaStepDetailsToolCallsObject(_type: String,
                toolUnderscorecalls: Option[Seq[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]]
                )

object RunStepDeltaStepDetailsToolCallsObject {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsToolCallsObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsToolCallsObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsToolCallsObject] = deriveEncoder
}
