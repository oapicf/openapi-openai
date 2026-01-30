package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantToolsFileSearchFileSearch

/**
 * 
 * @param _type The type of tool being defined: `file_search`
 * @param fileUnderscoresearch 
 */
case class AssistantToolsFileSearch(_type: String,
                fileUnderscoresearch: Option[AssistantToolsFileSearchFileSearch]
                )

object AssistantToolsFileSearch {
    /**
     * Creates the codec for converting AssistantToolsFileSearch from and to JSON.
     */
    implicit val decoder: Decoder[AssistantToolsFileSearch] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantToolsFileSearch] = deriveEncoder
}
