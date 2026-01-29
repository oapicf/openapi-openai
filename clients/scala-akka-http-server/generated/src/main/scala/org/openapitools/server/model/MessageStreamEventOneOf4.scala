package org.openapitools.server.model


/**
 * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class MessageStreamEventOneOf4 (
  event: String,
  data: MessageObject
)

