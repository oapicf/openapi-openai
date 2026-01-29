package org.openapitools.server.model


/**
 * = Function tool call =
 *
 * @param index The index of the tool call in the tool calls array. for example: ''null''
 * @param id The ID of the tool call object. for example: ''null''
 * @param `type` The type of tool call. This is always going to be `function` for this type of tool call. for example: ''null''
 * @param function  for example: ''null''
*/
final case class RunStepDeltaStepDetailsToolCallsFunctionObject (
  index: Int,
  id: Option[String] = None,
  `type`: String,
  function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction] = None
)

