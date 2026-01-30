package org.openapitools.server.model


/**
 * @param id The ID of the tool call object. for example: ''null''
 * @param `type` The type of tool call. This is always going to be `code_interpreter` for this type of tool call. for example: ''null''
 * @param codeInterpreter  for example: ''null''
 * @param fileSearch  for example: ''null''
 * @param function  for example: ''null''
*/
final case class RunStepDetailsToolCallsObjectToolCallsInner (
  id: String,
  `type`: String,
  codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter,
  fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch,
  function: RunStepDetailsToolCallsFunctionObjectFunction
)

