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
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 * @param _type Always `auto`.
 * @param _static 
 */
case class ChunkingStrategyRequestParam(_type: String,
                _static: StaticChunkingStrategy
                )

object ChunkingStrategyRequestParam {
    /**
     * Creates the codec for converting ChunkingStrategyRequestParam from and to JSON.
     */
    implicit val decoder: Decoder[ChunkingStrategyRequestParam] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChunkingStrategyRequestParam] = deriveEncoder
}
