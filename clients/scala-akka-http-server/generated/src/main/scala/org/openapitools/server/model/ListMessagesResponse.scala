package org.openapitools.server.model


/**
 * @param `object`  for example: ''list''
 * @param data  for example: ''null''
 * @param firstId  for example: ''msg_abc123''
 * @param lastId  for example: ''msg_abc123''
 * @param hasMore  for example: ''false''
*/
final case class ListMessagesResponse (
  `object`: String,
  data: Seq[MessageObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

