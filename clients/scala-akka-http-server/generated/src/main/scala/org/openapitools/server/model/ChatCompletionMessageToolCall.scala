package org.openapitools.server.model


/**
 * @param id The ID of the tool call. for example: ''null''
 * @param `type` The type of the tool. Currently, only `function` is supported. for example: ''null''
 * @param function  for example: ''null''
*/
final case class ChatCompletionMessageToolCall (
  id: String,
  `type`: String,
  function: ChatCompletionMessageToolCallFunction
)

