package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantsNamedToolChoiceFunction
import org.openapitools.models.ChatCompletionNamedToolChoice

/**
 * Controls which (if any) tool is called by the model. `none` means the model will not call any tool and instead generates a message. `auto` means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools. Specifying a particular tool via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool.  `none` is the default when no tools are present. `auto` is the default if tools are present. 
 * @param _type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
case class ChatCompletionToolChoiceOption(_type: String,
                function: AssistantsNamedToolChoiceFunction
                )

object ChatCompletionToolChoiceOption {
    /**
     * Creates the codec for converting ChatCompletionToolChoiceOption from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionToolChoiceOption] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionToolChoiceOption] = deriveEncoder
}
