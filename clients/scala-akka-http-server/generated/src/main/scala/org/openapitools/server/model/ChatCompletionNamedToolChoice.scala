package org.openapitools.server.model


/**
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 *
 * @param `type` The type of the tool. Currently, only `function` is supported. for example: ''null''
 * @param function  for example: ''null''
*/
final case class ChatCompletionNamedToolChoice (
  `type`: String,
  function: ChatCompletionNamedToolChoiceFunction
)

