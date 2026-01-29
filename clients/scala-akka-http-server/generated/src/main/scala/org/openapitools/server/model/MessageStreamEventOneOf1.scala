package org.openapitools.server.model


/**
 * Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class MessageStreamEventOneOf1 (
  event: String,
  data: MessageObject
)

