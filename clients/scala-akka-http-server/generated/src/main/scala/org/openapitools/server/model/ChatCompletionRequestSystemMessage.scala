package org.openapitools.server.model


/**
 * = System message =
 *
 * @param content The contents of the system message. for example: ''null''
 * @param role The role of the messages author, in this case `system`. for example: ''null''
 * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role. for example: ''null''
*/
final case class ChatCompletionRequestSystemMessage (
  content: String,
  role: String,
  name: Option[String] = None
)

