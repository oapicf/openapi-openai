package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateAssistantRequestToolResourcesCodeInterpreter
import org.openapitools.models.CreateAssistantRequestToolResourcesFileSearch

/**
 * A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 * @param codeUnderscoreinterpreter 
 * @param fileUnderscoresearch 
 */
case class CreateAssistantRequestToolResources(codeUnderscoreinterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
                fileUnderscoresearch: Option[CreateAssistantRequestToolResourcesFileSearch]
                )

object CreateAssistantRequestToolResources {
    /**
     * Creates the codec for converting CreateAssistantRequestToolResources from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssistantRequestToolResources] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssistantRequestToolResources] = deriveEncoder
}
