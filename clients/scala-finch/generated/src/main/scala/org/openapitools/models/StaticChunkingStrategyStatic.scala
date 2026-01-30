package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param maxUnderscorechunkUnderscoresizeUnderscoretokens The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
 * @param chunkUnderscoreoverlapUnderscoretokens The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
 */
case class StaticChunkingStrategyStatic(maxUnderscorechunkUnderscoresizeUnderscoretokens: Int,
                chunkUnderscoreoverlapUnderscoretokens: Int
                )

object StaticChunkingStrategyStatic {
    /**
     * Creates the codec for converting StaticChunkingStrategyStatic from and to JSON.
     */
    implicit val decoder: Decoder[StaticChunkingStrategyStatic] = deriveDecoder
    implicit val encoder: ObjectEncoder[StaticChunkingStrategyStatic] = deriveEncoder
}
