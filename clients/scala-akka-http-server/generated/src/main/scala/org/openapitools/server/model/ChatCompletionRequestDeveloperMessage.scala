package org.openapitools.server.model


/**
 * = Developer message =
 *
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
 *
 * @param content  for example: ''null''
 * @param role The role of the messages author, in this case `developer`. for example: ''null''
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role. for example: ''null''
*/
final case class ChatCompletionRequestDeveloperMessage (
  content: ChatCompletionRequestDeveloperMessageContent,
  role: String,
  name: Option[String] = None
)

