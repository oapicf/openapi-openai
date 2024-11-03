package org.openapitools.server.model


/**
 * @param index The index of the tool call in the tool calls array. for example: ''null''
 * @param id The ID of the tool call object. for example: ''null''
 * @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call. for example: ''null''
 * @param codeInterpreter  for example: ''null''
 * @param retrieval For now, this is always going to be an empty object. for example: ''null''
 * @param function  for example: ''null''
*/
final case class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner (
  index: Int,
  id: Option[String] = None,
  `type`: String,
  codeInterpreter: Option[RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter] = None,
  retrieval: Option[Any] = None,
  function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction] = None
)

