package org.openapitools.server.model


/**
 * The usage information for the request.
 *
 * @param promptTokens The number of tokens used by the prompt. for example: ''null''
 * @param totalTokens The total number of tokens used by the request. for example: ''null''
*/
final case class CreateEmbeddingResponseUsage (
  promptTokens: Int,
  totalTokens: Int
)

