package org.openapitools.server.model


/**
 * @param index The index of the output in the outputs array. for example: ''null''
 * @param `type` Always `logs`. for example: ''null''
 * @param logs The text output from the Code Interpreter tool call. for example: ''null''
 * @param image  for example: ''null''
*/
final case class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (
  index: Int,
  `type`: String,
  logs: Option[String] = None,
  image: Option[RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage] = None
)

