package org.openapitools.server.model


/**
 * = Message files =
 *
 * A list of files attached to a `message`.
 *
 * @param id The identifier, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `thread.message.file`. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the message file was created. for example: ''null''
 * @param messageId The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. for example: ''null''
*/
final case class MessageFileObject (
  id: String,
  `object`: String,
  createdAt: Int,
  messageId: String
)

