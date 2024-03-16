package org.openapitools.server.model


/**
 * @param role The role of the messages author. One of `system`, `user`, `assistant`, or `function`. for example: ''null''
 * @param content The contents of the message. `content` is required for all messages except assistant messages with function calls. for example: ''null''
 * @param name The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. for example: ''null''
 * @param functionCall  for example: ''null''
*/
final case class ChatCompletionRequestMessage (
  role: String,
  content: Option[String] = None,
  name: Option[String] = None,
  functionCall: Option[ChatCompletionRequestMessageFunctionCall] = None
)

