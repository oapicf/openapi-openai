package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param fileUnderscoreids Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
 */
case class ModifyAssistantRequestToolResourcesCodeInterpreter(fileUnderscoreids: Option[Seq[String]]
                )

object ModifyAssistantRequestToolResourcesCodeInterpreter {
    /**
     * Creates the codec for converting ModifyAssistantRequestToolResourcesCodeInterpreter from and to JSON.
     */
    implicit val decoder: Decoder[ModifyAssistantRequestToolResourcesCodeInterpreter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ModifyAssistantRequestToolResourcesCodeInterpreter] = deriveEncoder
}
