package org.openapitools.server.model


/**
 * @param promptTokens  for example: ''null''
 * @param totalTokens  for example: ''null''
*/
final case class CreateEmbeddingResponseUsage (
  promptTokens: Int,
  totalTokens: Int
)

