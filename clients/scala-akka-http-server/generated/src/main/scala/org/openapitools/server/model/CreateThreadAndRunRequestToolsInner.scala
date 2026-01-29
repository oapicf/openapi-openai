package org.openapitools.server.model


/**
 * @param `type` The type of tool being defined: `code_interpreter` for example: ''null''
 * @param function  for example: ''null''
*/
final case class CreateThreadAndRunRequestToolsInner (
  `type`: String,
  function: FunctionObject
)

