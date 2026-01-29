package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name The name of the function to call.
 */
case class ChatCompletionNamedToolChoiceFunction(name: String
                )

object ChatCompletionNamedToolChoiceFunction {
    /**
     * Creates the codec for converting ChatCompletionNamedToolChoiceFunction from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionNamedToolChoiceFunction] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionNamedToolChoiceFunction] = deriveEncoder
}
