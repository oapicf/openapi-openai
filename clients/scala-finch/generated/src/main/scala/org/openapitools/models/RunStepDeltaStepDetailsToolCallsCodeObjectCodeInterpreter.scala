package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
import scala.collection.immutable.Seq

/**
 * The Code Interpreter tool call definition.
 * @param input The input to the Code Interpreter tool call.
 * @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
 */
case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter(input: Option[String],
                outputs: Option[Seq[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]]
                )

object RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter {
    /**
     * Creates the codec for converting RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = deriveEncoder
}
