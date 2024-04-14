package org.openapitools.server.model


/**
 * = Function tool call =
 *
 * @param id The ID of the tool call object. for example: ''null''
 * @param `type` The type of tool call. This is always going to be `function` for this type of tool call. for example: ''null''
 * @param function  for example: ''null''
*/
final case class RunStepDetailsToolCallsFunctionObject (
  id: String,
  `type`: String,
  function: RunStepDetailsToolCallsFunctionObjectFunction
)

