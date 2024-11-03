package org.openapitools.server.model


/**
 * Tool call objects
 *
 * @param id The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. for example: ''null''
 * @param `type` The type of tool call the output is required for. For now, this is always `function`. for example: ''null''
 * @param function  for example: ''null''
*/
final case class RunToolCallObject (
  id: String,
  `type`: String,
  function: RunToolCallObjectFunction
)

