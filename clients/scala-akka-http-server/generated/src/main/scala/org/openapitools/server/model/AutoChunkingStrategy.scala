package org.openapitools.server.model


/**
 * = Auto Chunking Strategy =
 *
 * The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
 *
 * @param `type` Always `auto`. for example: ''null''
*/
final case class AutoChunkingStrategy (
  `type`: String
)

