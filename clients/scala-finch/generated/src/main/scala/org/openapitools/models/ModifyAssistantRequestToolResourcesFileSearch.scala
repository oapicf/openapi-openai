package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param vectorUnderscorestoreUnderscoreids Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
 */
case class ModifyAssistantRequestToolResourcesFileSearch(vectorUnderscorestoreUnderscoreids: Option[Seq[String]]
                )

object ModifyAssistantRequestToolResourcesFileSearch {
    /**
     * Creates the codec for converting ModifyAssistantRequestToolResourcesFileSearch from and to JSON.
     */
    implicit val decoder: Decoder[ModifyAssistantRequestToolResourcesFileSearch] = deriveDecoder
    implicit val encoder: ObjectEncoder[ModifyAssistantRequestToolResourcesFileSearch] = deriveEncoder
}
