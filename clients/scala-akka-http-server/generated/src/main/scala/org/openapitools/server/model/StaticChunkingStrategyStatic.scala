package org.openapitools.server.model


/**
 * @param maxChunkSizeTokens The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`. for example: ''null''
 * @param chunkOverlapTokens The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`.  for example: ''null''
*/
final case class StaticChunkingStrategyStatic (
  maxChunkSizeTokens: Int,
  chunkOverlapTokens: Int
)

