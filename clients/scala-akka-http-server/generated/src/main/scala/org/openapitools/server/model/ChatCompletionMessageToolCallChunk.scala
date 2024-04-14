package org.openapitools.server.model


/**
 * @param index  for example: ''null''
 * @param id The ID of the tool call. for example: ''null''
 * @param `type` The type of the tool. Currently, only `function` is supported. for example: ''null''
 * @param function  for example: ''null''
*/
final case class ChatCompletionMessageToolCallChunk (
  index: Int,
  id: Option[String] = None,
  `type`: Option[String] = None,
  function: Option[ChatCompletionMessageToolCallChunkFunction] = None
)

