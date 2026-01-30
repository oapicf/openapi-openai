package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _type The type of tool being defined: `file_search`
 */
case class AssistantToolsFileSearchTypeOnly(_type: String
                )

object AssistantToolsFileSearchTypeOnly {
    /**
     * Creates the codec for converting AssistantToolsFileSearchTypeOnly from and to JSON.
     */
    implicit val decoder: Decoder[AssistantToolsFileSearchTypeOnly] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantToolsFileSearchTypeOnly] = deriveEncoder
}
