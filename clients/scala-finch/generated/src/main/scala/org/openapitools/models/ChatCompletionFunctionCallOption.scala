package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 * @param name The name of the function to call.
 */
case class ChatCompletionFunctionCallOption(name: String
                )

object ChatCompletionFunctionCallOption {
    /**
     * Creates the codec for converting ChatCompletionFunctionCallOption from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionFunctionCallOption] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionFunctionCallOption] = deriveEncoder
}
