package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
 * @param _type Always `other`.
 */
case class OtherChunkingStrategyResponseParam(_type: String
                )

object OtherChunkingStrategyResponseParam {
    /**
     * Creates the codec for converting OtherChunkingStrategyResponseParam from and to JSON.
     */
    implicit val decoder: Decoder[OtherChunkingStrategyResponseParam] = deriveDecoder
    implicit val encoder: ObjectEncoder[OtherChunkingStrategyResponseParam] = deriveEncoder
}
