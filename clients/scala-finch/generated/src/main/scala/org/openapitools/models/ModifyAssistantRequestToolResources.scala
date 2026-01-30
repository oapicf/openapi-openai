package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ModifyAssistantRequestToolResourcesCodeInterpreter
import org.openapitools.models.ModifyAssistantRequestToolResourcesFileSearch

/**
 * A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 * @param codeUnderscoreinterpreter 
 * @param fileUnderscoresearch 
 */
case class ModifyAssistantRequestToolResources(codeUnderscoreinterpreter: Option[ModifyAssistantRequestToolResourcesCodeInterpreter],
                fileUnderscoresearch: Option[ModifyAssistantRequestToolResourcesFileSearch]
                )

object ModifyAssistantRequestToolResources {
    /**
     * Creates the codec for converting ModifyAssistantRequestToolResources from and to JSON.
     */
    implicit val decoder: Decoder[ModifyAssistantRequestToolResources] = deriveDecoder
    implicit val encoder: ObjectEncoder[ModifyAssistantRequestToolResources] = deriveEncoder
}
