package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateAssistantRequestToolResourcesCodeInterpreter
import org.openapitools.models.CreateThreadRequestToolResourcesFileSearch

/**
 * A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 * @param codeUnderscoreinterpreter 
 * @param fileUnderscoresearch 
 */
case class CreateThreadRequestToolResources(codeUnderscoreinterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
                fileUnderscoresearch: Option[CreateThreadRequestToolResourcesFileSearch]
                )

object CreateThreadRequestToolResources {
    /**
     * Creates the codec for converting CreateThreadRequestToolResources from and to JSON.
     */
    implicit val decoder: Decoder[CreateThreadRequestToolResources] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateThreadRequestToolResources] = deriveEncoder
}
