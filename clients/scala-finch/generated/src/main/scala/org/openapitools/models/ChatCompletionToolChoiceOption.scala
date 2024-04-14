package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChatCompletionNamedToolChoice
import org.openapitools.models.ChatCompletionNamedToolChoiceFunction

/**
 * Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 
 * @param _type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
case class ChatCompletionToolChoiceOption(_type: String,
                function: ChatCompletionNamedToolChoiceFunction
                )

object ChatCompletionToolChoiceOption {
    /**
     * Creates the codec for converting ChatCompletionToolChoiceOption from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionToolChoiceOption] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionToolChoiceOption] = deriveEncoder
}
