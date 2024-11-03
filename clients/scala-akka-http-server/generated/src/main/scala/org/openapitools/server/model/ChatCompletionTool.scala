package org.openapitools.server.model


/**
 * @param `type` The type of the tool. Currently, only `function` is supported. for example: ''null''
 * @param function  for example: ''null''
*/
final case class ChatCompletionTool (
  `type`: String,
  function: FunctionObject
)

