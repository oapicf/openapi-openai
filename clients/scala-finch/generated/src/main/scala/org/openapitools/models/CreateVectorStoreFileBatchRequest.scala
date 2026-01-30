package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChunkingStrategyRequestParam
import scala.collection.immutable.Seq

/**
 * 
 * @param fileUnderscoreids A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
 * @param chunkingUnderscorestrategy 
 */
case class CreateVectorStoreFileBatchRequest(fileUnderscoreids: Seq[String],
                chunkingUnderscorestrategy: Option[ChunkingStrategyRequestParam]
                )

object CreateVectorStoreFileBatchRequest {
    /**
     * Creates the codec for converting CreateVectorStoreFileBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateVectorStoreFileBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateVectorStoreFileBatchRequest] = deriveEncoder
}
