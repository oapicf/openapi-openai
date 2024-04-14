package org.openapitools.server.model


/**
 * = Text =
 *
 * The text content that is part of a message.
 *
 * @param index The index of the content part in the message. for example: ''null''
 * @param `type` Always `text`. for example: ''null''
 * @param text  for example: ''null''
*/
final case class MessageDeltaContentTextObject (
  index: Int,
  `type`: String,
  text: Option[MessageDeltaContentTextObjectText] = None
)

