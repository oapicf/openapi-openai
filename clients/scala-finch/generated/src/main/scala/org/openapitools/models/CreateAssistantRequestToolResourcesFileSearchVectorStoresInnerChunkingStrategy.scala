package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AutoChunkingStrategy
import org.openapitools.models.StaticChunkingStrategy
import org.openapitools.models.StaticChunkingStrategyStatic

/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 * @param _type Always `auto`.
 * @param _static 
 */
case class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy(_type: String,
                _static: StaticChunkingStrategyStatic
                )

object CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy {
    /**
     * Creates the codec for converting CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy from and to JSON.
     */
    implicit val decoder: Decoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] = deriveEncoder
}
