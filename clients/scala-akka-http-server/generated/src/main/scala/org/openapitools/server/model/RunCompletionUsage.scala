package org.openapitools.server.model


/**
 * Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
 *
 * @param completionTokens Number of completion tokens used over the course of the run. for example: ''null''
 * @param promptTokens Number of prompt tokens used over the course of the run. for example: ''null''
 * @param totalTokens Total number of tokens used (prompt + completion). for example: ''null''
*/
final case class RunCompletionUsage (
  completionTokens: Int,
  promptTokens: Int,
  totalTokens: Int
)

