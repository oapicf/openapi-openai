package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The definition of the function that was called.
 * @param name The name of the function.
 * @param arguments The arguments passed to the function.
 * @param output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
 */
case class RunStepDetailsToolCallsFunctionObjectFunction(name: String,
                arguments: String,
                output: String
                )

object RunStepDetailsToolCallsFunctionObjectFunction {
    /**
     * Creates the codec for converting RunStepDetailsToolCallsFunctionObjectFunction from and to JSON.
     */
    implicit val decoder: Decoder[RunStepDetailsToolCallsFunctionObjectFunction] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunStepDetailsToolCallsFunctionObjectFunction] = deriveEncoder
}
