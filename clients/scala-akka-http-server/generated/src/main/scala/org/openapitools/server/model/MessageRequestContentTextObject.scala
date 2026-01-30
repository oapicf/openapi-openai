package org.openapitools.server.model


/**
 * = Text =
 *
 * The text content that is part of a message.
 *
 * @param `type` Always `text`. for example: ''null''
 * @param text Text content to be sent to the model for example: ''null''
*/
final case class MessageRequestContentTextObject (
  `type`: String,
  text: String
)

