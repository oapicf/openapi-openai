package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionFunctionCallOption

/**
 * Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
 * @param name The name of the function to call.
 */
case class CreateChatCompletionRequestFunctionCall(name: String
                )

object CreateChatCompletionRequestFunctionCall {
    /**
     * Creates the codec for converting CreateChatCompletionRequestFunctionCall from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionRequestFunctionCall] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionRequestFunctionCall] = deriveEncoder
}
