package org.openapitools.server.model


/**
 * @param index  for example: ''null''
 * @param delta  for example: ''null''
 * @param finishReason  for example: ''null''
*/
final case class CreateChatCompletionStreamResponseChoicesInner (
  index: Option[Int] = None,
  delta: Option[ChatCompletionStreamResponseDelta] = None,
  finishReason: Option[String] = None
)

