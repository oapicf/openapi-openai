package org.openapitools.server.model


/**
 * = Code interpreter tool call =
 *
 * Details of the Code Interpreter tool call the run step was involved in.
 *
 * @param index The index of the tool call in the tool calls array. for example: ''null''
 * @param id The ID of the tool call. for example: ''null''
 * @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call. for example: ''null''
 * @param codeInterpreter  for example: ''null''
*/
final case class RunStepDeltaStepDetailsToolCallsCodeObject (
  index: Int,
  id: Option[String] = None,
  `type`: String,
  codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = None
)

