package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsToolCallsObjectToolCallsInner
import scala.collection.immutable.Seq

/**
 * Details of the tool call.
 * @param _type Always `tool_calls`.
 * @param toolUnderscorecalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
 */
case class RunStepDetailsToolCallsObject(_type: String,
                toolUnderscorecalls: Seq[RunStepDetailsToolCallsObjectToolCallsInner]
                )

object RunStepDetailsToolCallsObject {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsObject from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsObject] = deriveEncoder
}
