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
case class StaticChunkingStrategyRequestParam(_type: String,
                _static: StaticChunkingStrategy
                )

object StaticChunkingStrategyRequestParam {
    /**
     * Creates the codec for converting StaticChunkingStrategyRequestParam from and to JSON.
     */
    implicit val decoder: Decoder[StaticChunkingStrategyRequestParam] = deriveDecoder
    implicit val encoder: ObjectEncoder[StaticChunkingStrategyRequestParam] = deriveEncoder
}
