package org.openapitools.server.model


/**
 * @param `object`  for example: ''list''
 * @param data  for example: ''null''
 * @param firstId  for example: ''run_abc123''
 * @param lastId  for example: ''run_abc456''
 * @param hasMore  for example: ''false''
*/
final case class ListRunsResponse (
  `object`: String,
  data: Seq[RunObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

