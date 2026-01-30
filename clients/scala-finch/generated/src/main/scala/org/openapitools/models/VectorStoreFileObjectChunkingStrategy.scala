package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OtherChunkingStrategyResponseParam
import org.openapitools.models.StaticChunkingStrategy
import org.openapitools.models.StaticChunkingStrategyResponseParam

/**
 * The strategy used to chunk the file.
 * @param _type Always `static`.
 * @param _static 
 */
case class VectorStoreFileObjectChunkingStrategy(_type: String,
                _static: StaticChunkingStrategy
                )

object VectorStoreFileObjectChunkingStrategy {
    /**
     * Creates the codec for converting VectorStoreFileObjectChunkingStrategy from and to JSON.
     */
    implicit val decoder: Decoder[VectorStoreFileObjectChunkingStrategy] = deriveDecoder
    implicit val encoder: ObjectEncoder[VectorStoreFileObjectChunkingStrategy] = deriveEncoder
}
