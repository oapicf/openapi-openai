package org.openapitools.server.model


/**
 * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.
 *
 * @param `type` Always `auto`. for example: ''null''
 * @param static  for example: ''null''
*/
final case class CreateVectorStoreRequestChunkingStrategy (
  `type`: String,
  static: StaticChunkingStrategy
)

