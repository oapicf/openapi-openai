package org.openapitools.server.model


/**
 * The delta containing the fields that have changed on the Message.
 *
 * @param role The entity that produced the message. One of `user` or `assistant`. for example: ''null''
 * @param content The content of the message in array of text and/or images. for example: ''null''
*/
final case class MessageDeltaObjectDelta (
  role: Option[String] = None,
  content: Option[Seq[MessageDeltaObjectDeltaContentInner]] = None
)

