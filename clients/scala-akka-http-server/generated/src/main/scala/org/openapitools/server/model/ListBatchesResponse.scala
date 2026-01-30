package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param firstId  for example: ''batch_abc123''
 * @param lastId  for example: ''batch_abc456''
 * @param hasMore  for example: ''null''
 * @param `object`  for example: ''null''
*/
final case class ListBatchesResponse (
  data: Seq[Batch],
  firstId: Option[String] = None,
  lastId: Option[String] = None,
  hasMore: Boolean,
  `object`: String
)

