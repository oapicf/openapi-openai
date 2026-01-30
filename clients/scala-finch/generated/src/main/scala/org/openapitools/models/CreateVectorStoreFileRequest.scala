package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ChunkingStrategyRequestParam

/**
 * 
 * @param fileUnderscoreid A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
 * @param chunkingUnderscorestrategy 
 */
case class CreateVectorStoreFileRequest(fileUnderscoreid: String,
                chunkingUnderscorestrategy: Option[ChunkingStrategyRequestParam]
                )

object CreateVectorStoreFileRequest {
    /**
     * Creates the codec for converting CreateVectorStoreFileRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateVectorStoreFileRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateVectorStoreFileRequest] = deriveEncoder
}
