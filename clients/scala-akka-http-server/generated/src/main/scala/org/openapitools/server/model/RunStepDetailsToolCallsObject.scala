package org.openapitools.server.model


/**
 * = Tool calls =
 *
 * Details of the tool call.
 *
 * @param `type` Always `tool_calls`. for example: ''null''
 * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.  for example: ''null''
*/
final case class RunStepDetailsToolCallsObject (
  `type`: String,
  toolCalls: Seq[RunStepDetailsToolCallsObjectToolCallsInner]
)

