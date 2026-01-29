package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantToolsCode
import org.openapitools.models.AssistantToolsFunction
import org.openapitools.models.AssistantToolsRetrieval
import org.openapitools.models.FunctionObject

/**
 * 
 * @param _type The type of tool being defined: `code_interpreter`
 * @param function 
 */
case class CreateThreadAndRunRequestToolsInner(_type: String,
                function: FunctionObject
                )

object CreateThreadAndRunRequestToolsInner {
    /**
     * Creates the codec for converting CreateThreadAndRunRequestToolsInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateThreadAndRunRequestToolsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateThreadAndRunRequestToolsInner] = deriveEncoder
}
