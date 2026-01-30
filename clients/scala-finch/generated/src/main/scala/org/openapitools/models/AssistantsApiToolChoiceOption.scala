package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantsNamedToolChoice
import org.openapitools.models.AssistantsNamedToolChoiceFunction

/**
 * Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools before responding to the user. Specifying a particular tool like `{\"type\": \"file_search\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 
 * @param _type The type of the tool. If type is `function`, the function name must be set
 * @param function 
 */
case class AssistantsApiToolChoiceOption(_type: String,
                function: Option[AssistantsNamedToolChoiceFunction]
                )

object AssistantsApiToolChoiceOption {
    /**
     * Creates the codec for converting AssistantsApiToolChoiceOption from and to JSON.
     */
    implicit val decoder: Decoder[AssistantsApiToolChoiceOption] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantsApiToolChoiceOption] = deriveEncoder
}
