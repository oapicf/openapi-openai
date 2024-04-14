package org.openapitools.server.model


/**
 * Usage statistics for the completion request.
 *
 * @param completionTokens Number of tokens in the generated completion. for example: ''null''
 * @param promptTokens Number of tokens in the prompt. for example: ''null''
 * @param totalTokens Total number of tokens used in the request (prompt + completion). for example: ''null''
*/
final case class CompletionUsage (
  completionTokens: Int,
  promptTokens: Int,
  totalTokens: Int
)

