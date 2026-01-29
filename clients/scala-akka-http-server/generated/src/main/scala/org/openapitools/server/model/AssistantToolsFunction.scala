package org.openapitools.server.model


/**
 * = Function tool =
 *
 * @param `type` The type of tool being defined: `function` for example: ''null''
 * @param function  for example: ''null''
*/
final case class AssistantToolsFunction (
  `type`: String,
  function: FunctionObject
)

