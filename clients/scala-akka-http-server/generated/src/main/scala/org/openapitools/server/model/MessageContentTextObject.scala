package org.openapitools.server.model


/**
 * = Text =
 *
 * The text content that is part of a message.
 *
 * @param `type` Always `text`. for example: ''null''
 * @param text  for example: ''null''
*/
final case class MessageContentTextObject (
  `type`: String,
  text: MessageContentTextObjectText
)

