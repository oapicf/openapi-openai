package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
import scala.collection.immutable.Seq

/**
 * 
 * @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
 * @param chunkingUnderscorestrategy 
 * @param metadata Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */
case class CreateThreadRequestToolResourcesFileSearchVectorStoresInner(fileUnderscoreids: Option[Seq[String]],
                chunkingUnderscorestrategy: Option[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy],
                metadata: Option[Object]
                )

object CreateThreadRequestToolResourcesFileSearchVectorStoresInner {
    /**
     * Creates the codec for converting CreateThreadRequestToolResourcesFileSearchVectorStoresInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateThreadRequestToolResourcesFileSearchVectorStoresInner] = deriveEncoder
}
