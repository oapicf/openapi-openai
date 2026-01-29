package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The function definition.
 * @param name The name of the function.
 * @param arguments The arguments that the model expects you to pass to the function.
 */
case class RunToolCallObjectFunction(name: String,
                arguments: String
                )

object RunToolCallObjectFunction {
    /**
     * Creates the codec for converting RunToolCallObjectFunction from and to JSON.
     */
    implicit val decoder: Decoder[RunToolCallObjectFunction] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunToolCallObjectFunction] = deriveEncoder
}
