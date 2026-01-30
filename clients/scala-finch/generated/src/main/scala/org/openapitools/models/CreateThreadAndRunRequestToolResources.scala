package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantObjectToolResourcesFileSearch
import org.openapitools.models.CreateAssistantRequestToolResourcesCodeInterpreter

/**
 * A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 * @param codeUnderscoreinterpreter 
 * @param fileUnderscoresearch 
 */
case class CreateThreadAndRunRequestToolResources(codeUnderscoreinterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
                fileUnderscoresearch: Option[AssistantObjectToolResourcesFileSearch]
                )

object CreateThreadAndRunRequestToolResources {
    /**
     * Creates the codec for converting CreateThreadAndRunRequestToolResources from and to JSON.
     */
    implicit val decoder: Decoder[CreateThreadAndRunRequestToolResources] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateThreadAndRunRequestToolResources] = deriveEncoder
}
