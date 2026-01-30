package org.openapitools.server.model


/**
 * The strategy used to chunk the file.
 *
 * @param `type` Always `static`. for example: ''null''
 * @param static  for example: ''null''
*/
final case class VectorStoreFileObjectChunkingStrategy (
  `type`: String,
  static: StaticChunkingStrategy
)

