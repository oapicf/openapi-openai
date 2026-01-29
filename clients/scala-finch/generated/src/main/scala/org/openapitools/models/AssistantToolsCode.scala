package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _type The type of tool being defined: `code_interpreter`
 */
case class AssistantToolsCode(_type: String
                )

object AssistantToolsCode {
    /**
     * Creates the codec for converting AssistantToolsCode from and to JSON.
     */
    implicit val decoder: Decoder[AssistantToolsCode] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantToolsCode] = deriveEncoder
}
