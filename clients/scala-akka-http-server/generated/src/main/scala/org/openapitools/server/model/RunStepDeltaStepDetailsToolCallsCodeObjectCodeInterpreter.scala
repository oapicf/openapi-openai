package org.openapitools.server.model


/**
 * The Code Interpreter tool call definition.
 *
 * @param input The input to the Code Interpreter tool call. for example: ''null''
 * @param outputs The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type. for example: ''null''
*/
final case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter (
  input: Option[String] = None,
  outputs: Option[Seq[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner]] = None
)

