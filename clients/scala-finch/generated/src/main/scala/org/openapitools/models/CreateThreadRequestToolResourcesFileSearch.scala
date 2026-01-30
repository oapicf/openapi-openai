package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateThreadRequestToolResourcesFileSearchVectorStoresInner
import scala.collection.immutable.Seq

/**
 * 
 * @param vectorUnderscorestoreUnderscoreids The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
 * @param vectorUnderscorestores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
 */
case class CreateThreadRequestToolResourcesFileSearch(vectorUnderscorestoreUnderscoreids: Option[Seq[String]],
                vectorUnderscorestores: Option[Seq[CreateThreadRequestToolResourcesFileSearchVectorStoresInner]]
                )

object CreateThreadRequestToolResourcesFileSearch {
    /**
     * Creates the codec for converting CreateThreadRequestToolResourcesFileSearch from and to JSON.
     */
    implicit val decoder: Decoder[CreateThreadRequestToolResourcesFileSearch] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateThreadRequestToolResourcesFileSearch] = deriveEncoder
}
