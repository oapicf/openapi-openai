package org.openapitools.server.model


/**
 * = Code interpreter tool call =
 *
 * Details of the Code Interpreter tool call the run step was involved in.
 *
 * @param id The ID of the tool call. for example: ''null''
 * @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call. for example: ''null''
 * @param codeInterpreter  for example: ''null''
*/
final case class RunStepDetailsToolCallsCodeObject (
  id: String,
  `type`: String,
  codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter
)

