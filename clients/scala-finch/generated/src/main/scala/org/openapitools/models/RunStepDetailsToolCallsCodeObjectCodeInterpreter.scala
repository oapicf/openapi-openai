package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
import scala.collection.immutable.Seq

/**
 * The Code Interpreter tool call definition.
 * @param input The input to the Code Interpreter tool call.
 * @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
 */
case class RunStepDetailsToolCallsCodeObjectCodeInterpreter(input: String,
                outputs: Seq[RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]
                )

object RunStepDetailsToolCallsCodeObjectCodeInterpreter {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsCodeObjectCodeInterpreter from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsCodeObjectCodeInterpreter] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsCodeObjectCodeInterpreter] = deriveEncoder
}
