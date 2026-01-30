package org.openapitools.server.model


/**
 * Breakdown of tokens used in the prompt.
 *
 * @param audioTokens Audio input tokens present in the prompt. for example: ''null''
 * @param cachedTokens Cached tokens present in the prompt. for example: ''null''
*/
final case class CompletionUsagePromptTokensDetails (
  audioTokens: Option[Int] = None,
  cachedTokens: Option[Int] = None
)

