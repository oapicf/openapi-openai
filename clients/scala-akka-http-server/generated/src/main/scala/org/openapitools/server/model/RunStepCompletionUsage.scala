package org.openapitools.server.model


/**
 * Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
 *
 * @param completionTokens Number of completion tokens used over the course of the run step. for example: ''null''
 * @param promptTokens Number of prompt tokens used over the course of the run step. for example: ''null''
 * @param totalTokens Total number of tokens used (prompt + completion). for example: ''null''
*/
final case class RunStepCompletionUsage (
  completionTokens: Int,
  promptTokens: Int,
  totalTokens: Int
)

