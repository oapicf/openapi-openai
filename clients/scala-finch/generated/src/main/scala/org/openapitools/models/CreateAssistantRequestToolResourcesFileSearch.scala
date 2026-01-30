package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
import scala.collection.immutable.Seq

/**
 * 
 * @param vectorUnderscorestoreUnderscoreids The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
 * @param vectorUnderscorestores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
 */
case class CreateAssistantRequestToolResourcesFileSearch(vectorUnderscorestoreUnderscoreids: Option[Seq[String]],
                vectorUnderscorestores: Option[Seq[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]]
                )

object CreateAssistantRequestToolResourcesFileSearch {
    /**
     * Creates the codec for converting CreateAssistantRequestToolResourcesFileSearch from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssistantRequestToolResourcesFileSearch] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssistantRequestToolResourcesFileSearch] = deriveEncoder
}
