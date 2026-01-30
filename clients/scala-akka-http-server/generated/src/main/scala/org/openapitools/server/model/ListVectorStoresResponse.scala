package org.openapitools.server.model


/**
 * @param `object`  for example: ''list''
 * @param data  for example: ''null''
 * @param firstId  for example: ''vs_abc123''
 * @param lastId  for example: ''vs_abc456''
 * @param hasMore  for example: ''false''
*/
final case class ListVectorStoresResponse (
  `object`: String,
  data: Seq[VectorStoreObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

