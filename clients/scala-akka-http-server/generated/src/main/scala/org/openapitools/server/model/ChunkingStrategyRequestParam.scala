package org.openapitools.server.model


/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
 *
 * @param `type` Always `auto`. for example: ''null''
 * @param static  for example: ''null''
*/
final case class ChunkingStrategyRequestParam (
  `type`: String,
  static: StaticChunkingStrategy
)

