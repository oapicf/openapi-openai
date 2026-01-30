package org.openapitools.server.model


/**
 * = Tool message =
 *
 * @param role The role of the messages author, in this case `tool`. for example: ''null''
 * @param content  for example: ''null''
 * @param toolCallId Tool call that this message is responding to. for example: ''null''
*/
final case class ChatCompletionRequestToolMessage (
  role: String,
  content: ChatCompletionRequestToolMessageContent,
  toolCallId: String
)

