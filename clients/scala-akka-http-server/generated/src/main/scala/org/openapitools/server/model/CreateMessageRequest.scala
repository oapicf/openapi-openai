package org.openapitools.server.model


/**
 * @param role The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation.  for example: ''null''
 * @param content The content of the message. for example: ''null''
 * @param fileIds A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files. for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  for example: ''null''
*/
final case class CreateMessageRequest (
  role: String,
  content: String,
  fileIds: Option[Seq[String]] = None,
  metadata: Option[Any] = None
)

