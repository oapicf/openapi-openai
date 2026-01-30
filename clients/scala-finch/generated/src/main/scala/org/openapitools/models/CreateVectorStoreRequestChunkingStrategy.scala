package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AutoChunkingStrategyRequestParam
import org.openapitools.models.StaticChunkingStrategy
import org.openapitools.models.StaticChunkingStrategyRequestParam

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
 * @param _type Always `auto`.
 * @param _static 
 */
case class CreateVectorStoreRequestChunkingStrategy(_type: String,
                _static: StaticChunkingStrategy
                )

object CreateVectorStoreRequestChunkingStrategy {
    /**
     * Creates the codec for converting CreateVectorStoreRequestChunkingStrategy from and to JSON.
     */
    implicit val decoder: Decoder[CreateVectorStoreRequestChunkingStrategy] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateVectorStoreRequestChunkingStrategy] = deriveEncoder
}
