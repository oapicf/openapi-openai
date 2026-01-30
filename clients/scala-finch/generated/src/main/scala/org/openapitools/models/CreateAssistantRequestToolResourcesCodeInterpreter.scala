package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
 */
case class CreateAssistantRequestToolResourcesCodeInterpreter(fileUnderscoreids: Option[Seq[String]]
                )

object CreateAssistantRequestToolResourcesCodeInterpreter {
    /**
     * Creates the codec for converting CreateAssistantRequestToolResourcesCodeInterpreter from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssistantRequestToolResourcesCodeInterpreter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssistantRequestToolResourcesCodeInterpreter] = deriveEncoder
}
