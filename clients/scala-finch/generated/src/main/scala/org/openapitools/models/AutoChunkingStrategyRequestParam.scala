package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
 * @param _type Always `auto`.
 */
case class AutoChunkingStrategyRequestParam(_type: String
                )

object AutoChunkingStrategyRequestParam {
    /**
     * Creates the codec for converting AutoChunkingStrategyRequestParam from and to JSON.
     */
    implicit val decoder: Decoder[AutoChunkingStrategyRequestParam] = deriveDecoder
    implicit val encoder: ObjectEncoder[AutoChunkingStrategyRequestParam] = deriveEncoder
}
