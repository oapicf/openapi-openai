package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.StaticChunkingStrategy

/**
 * 
 * @param _type Always `static`.
 * @param _static 
 */
case class StaticChunkingStrategyResponseParam(_type: String,
                _static: StaticChunkingStrategy
                )

object StaticChunkingStrategyResponseParam {
    /**
     * Creates the codec for converting StaticChunkingStrategyResponseParam from and to JSON.
     */
    implicit val decoder: Decoder[StaticChunkingStrategyResponseParam] = deriveDecoder
    implicit val encoder: ObjectEncoder[StaticChunkingStrategyResponseParam] = deriveEncoder
}
