package org.openapitools.server.model


/**
 * @param `object`  for example: ''list''
 * @param data  for example: ''null''
 * @param firstId  for example: ''file-abc123''
 * @param lastId  for example: ''file-abc456''
 * @param hasMore  for example: ''false''
*/
final case class ListVectorStoreFilesResponse (
  `object`: String,
  data: Seq[VectorStoreFileObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

