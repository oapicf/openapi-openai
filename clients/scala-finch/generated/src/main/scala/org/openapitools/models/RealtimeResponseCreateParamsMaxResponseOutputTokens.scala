package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 
 */
case class RealtimeResponseCreateParamsMaxResponseOutputTokens()

object RealtimeResponseCreateParamsMaxResponseOutputTokens {
    /**
     * Creates the codec for converting RealtimeResponseCreateParamsMaxResponseOutputTokens from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeResponseCreateParamsMaxResponseOutputTokens] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeResponseCreateParamsMaxResponseOutputTokens] = deriveEncoder
}
