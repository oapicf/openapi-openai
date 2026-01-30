package org.openapitools.server.model


/**
 * = System message =
 *
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. 
 *
 * @param content  for example: ''null''
 * @param role The role of the messages author, in this case `system`. for example: ''null''
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role. for example: ''null''
*/
final case class ChatCompletionRequestSystemMessage (
  content: ChatCompletionRequestSystemMessageContent,
  role: String,
  name: Option[String] = None
)

