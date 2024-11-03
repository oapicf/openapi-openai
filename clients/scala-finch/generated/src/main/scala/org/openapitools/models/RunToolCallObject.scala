package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunToolCallObjectFunction

/**
 * Tool call objects
 * @param id The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
 * @param _type The type of tool call the output is required for. For now, this is always `function`.
 * @param function 
 */
case class RunToolCallObject(id: String,
                _type: String,
                function: RunToolCallObjectFunction
                )

object RunToolCallObject {
    /**
     * Creates the codec for converting RunToolCallObject from and to JSON.
     */
    implicit val decoder: Decoder[RunToolCallObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunToolCallObject] = deriveEncoder
}
