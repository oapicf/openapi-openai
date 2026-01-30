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
case class AssistantsNamedToolChoiceFunction(name: String
                )

object AssistantsNamedToolChoiceFunction {
    /**
     * Creates the codec for converting AssistantsNamedToolChoiceFunction from and to JSON.
     */
    implicit val decoder: Decoder[AssistantsNamedToolChoiceFunction] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantsNamedToolChoiceFunction] = deriveEncoder
}
