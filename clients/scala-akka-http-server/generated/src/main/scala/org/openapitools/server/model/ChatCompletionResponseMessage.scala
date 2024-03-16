package org.openapitools.server.model


/**
 * @param role The role of the author of this message. for example: ''null''
 * @param content The contents of the message. for example: ''null''
 * @param functionCall  for example: ''null''
*/
final case class ChatCompletionResponseMessage (
  role: String,
  content: Option[String] = None,
  functionCall: Option[ChatCompletionRequestMessageFunctionCall] = None
)

