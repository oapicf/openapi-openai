package org.openapitools.server.model


/**
 * = The message object =
 *
 * Represents a message within a [thread](/docs/api-reference/threads).
 *
 * @param id The identifier, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `thread.message`. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the message was created. for example: ''null''
 * @param threadId The [thread](/docs/api-reference/threads) ID that this message belongs to. for example: ''null''
 * @param status The status of the message, which can be either `in_progress`, `incomplete`, or `completed`. for example: ''null''
 * @param incompleteDetails  for example: ''null''
 * @param completedAt The Unix timestamp (in seconds) for when the message was completed. for example: ''null''
 * @param incompleteAt The Unix timestamp (in seconds) for when the message was marked as incomplete. for example: ''null''
 * @param role The entity that produced the message. One of `user` or `assistant`. for example: ''null''
 * @param content The content of the message in array of text and/or images. for example: ''null''
 * @param assistantId If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. for example: ''null''
 * @param runId The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. for example: ''null''
 * @param attachments A list of files attached to the message, and the tools they were added to. for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  for example: ''null''
*/
final case class MessageObject (
  id: String,
  `object`: String,
  createdAt: Int,
  threadId: String,
  status: String,
  incompleteDetails: MessageObjectIncompleteDetails,
  completedAt: Int,
  incompleteAt: Int,
  role: String,
  content: Seq[MessageObjectContentInner],
  assistantId: String,
  runId: String,
  attachments: Seq[CreateMessageRequestAttachmentsInner],
  metadata: Any
)

