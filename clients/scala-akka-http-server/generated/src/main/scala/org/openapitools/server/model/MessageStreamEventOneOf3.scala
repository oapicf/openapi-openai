package org.openapitools.server.model


/**
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class MessageStreamEventOneOf3 (
  event: String,
  data: MessageObject
)

