package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantToolsCode
import org.openapitools.models.AssistantToolsFileSearch
import org.openapitools.models.AssistantToolsFileSearchFileSearch
import org.openapitools.models.AssistantToolsFunction
import org.openapitools.models.FunctionObject

/**
 * 
 * @param _type The type of tool being defined: `code_interpreter`
 * @param fileUnderscoresearch 
 * @param function 
 */
case class AssistantObjectToolsInner(_type: String,
                fileUnderscoresearch: Option[AssistantToolsFileSearchFileSearch],
                function: FunctionObject
                )

object AssistantObjectToolsInner {
    /**
     * Creates the codec for converting AssistantObjectToolsInner from and to JSON.
     */
    implicit val decoder: Decoder[AssistantObjectToolsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantObjectToolsInner] = deriveEncoder
}
