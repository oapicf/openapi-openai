package org.openapitools.server.model


/**
 * @param index  for example: ''null''
 * @param message  for example: ''null''
 * @param finishReason  for example: ''null''
*/
final case class CreateChatCompletionResponseChoicesInner (
  index: Option[Int] = None,
  message: Option[ChatCompletionResponseMessage] = None,
  finishReason: Option[String] = None
)

