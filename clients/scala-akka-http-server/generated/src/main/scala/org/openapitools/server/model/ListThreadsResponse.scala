package org.openapitools.server.model


/**
 * @param `object`  for example: ''list''
 * @param data  for example: ''null''
 * @param firstId  for example: ''asst_abc123''
 * @param lastId  for example: ''asst_abc456''
 * @param hasMore  for example: ''false''
*/
final case class ListThreadsResponse (
  `object`: String,
  data: Seq[ThreadObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

