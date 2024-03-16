package org.openapitools.server.model


/**
 * @param promptTokens  for example: ''null''
 * @param completionTokens  for example: ''null''
 * @param totalTokens  for example: ''null''
*/
final case class CreateCompletionResponseUsage (
  promptTokens: Int,
  completionTokens: Int,
  totalTokens: Int
)

