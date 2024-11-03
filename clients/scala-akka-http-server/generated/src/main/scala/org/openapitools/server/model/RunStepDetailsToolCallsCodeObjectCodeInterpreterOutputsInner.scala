package org.openapitools.server.model


/**
 * @param `type` Always `logs`. for example: ''null''
 * @param logs The text output from the Code Interpreter tool call. for example: ''null''
 * @param image  for example: ''null''
*/
final case class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (
  `type`: String,
  logs: String,
  image: RunStepDetailsToolCallsCodeOutputImageObjectImage
)

