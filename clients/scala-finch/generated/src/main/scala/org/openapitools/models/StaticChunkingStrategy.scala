package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.StaticChunkingStrategyStatic

/**
 * 
 * @param _type Always `static`.
 * @param _static 
 */
case class StaticChunkingStrategy(_type: String,
                _static: StaticChunkingStrategyStatic
                )

object StaticChunkingStrategy {
    /**
     * Creates the codec for converting StaticChunkingStrategy from and to JSON.
     */
    implicit val decoder: Decoder[StaticChunkingStrategy] = deriveDecoder
    implicit val encoder: ObjectEncoder[StaticChunkingStrategy] = deriveEncoder
}
