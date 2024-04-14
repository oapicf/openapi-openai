package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FunctionObject

/**
 * 
 * @param _type The type of tool being defined: `function`
 * @param function 
 */
case class AssistantToolsFunction(_type: String,
                function: FunctionObject
                )

object AssistantToolsFunction {
    /**
     * Creates the codec for converting AssistantToolsFunction from and to JSON.
     */
    implicit val decoder: Decoder[AssistantToolsFunction] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantToolsFunction] = deriveEncoder
}
