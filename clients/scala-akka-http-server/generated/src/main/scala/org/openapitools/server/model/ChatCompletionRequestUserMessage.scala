package org.openapitools.server.model


/**
 * = User message =
 *
 * Messages sent by an end user, containing prompts or additional context information. 
 *
 * @param content  for example: ''null''
 * @param role The role of the messages author, in this case `user`. for example: ''null''
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role. for example: ''null''
*/
final case class ChatCompletionRequestUserMessage (
  content: ChatCompletionRequestUserMessageContent,
  role: String,
  name: Option[String] = None
)

