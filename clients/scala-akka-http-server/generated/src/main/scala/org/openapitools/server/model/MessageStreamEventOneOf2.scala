package org.openapitools.server.model


/**
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class MessageStreamEventOneOf2 (
  event: String,
  data: MessageDeltaObject
)

