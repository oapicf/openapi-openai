package org.openapitools.server.model


/**
 * = Function message =
 *
 * @param role The role of the messages author, in this case `function`. for example: ''null''
 * @param content The contents of the function message. for example: ''null''
 * @param name The name of the function to call. for example: ''null''
*/
final case class ChatCompletionRequestFunctionMessage (
  role: String,
  content: String,
  name: String
)

