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
case class CreateChatCompletionRequestFunctionCallOneOf(name: String
                )

object CreateChatCompletionRequestFunctionCallOneOf {
    /**
     * Creates the codec for converting CreateChatCompletionRequestFunctionCallOneOf from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionRequestFunctionCallOneOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionRequestFunctionCallOneOf] = deriveEncoder
}
