package org.openapitools.server.model


/**
 * The delta containing the fields that have changed on the Message.
 *
 * @param role The entity that produced the message. One of `user` or `assistant`. for example: ''null''
 * @param content The content of the message in array of text and/or images. for example: ''null''
 * @param fileIds A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. for example: ''null''
*/
final case class MessageDeltaObjectDelta (
  role: Option[String] = None,
  content: Option[Seq[MessageDeltaObjectDeltaContentInner]] = None,
  fileIds: Option[Seq[String]] = None
)

