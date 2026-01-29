package org.openapitools.server.model


/**
 * Occurs when a [message](/docs/api-reference/messages/object) is created.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class MessageStreamEventOneOf (
  event: String,
  data: MessageObject
)

