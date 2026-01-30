package org.openapitools.server.model


/**
 * @param inProgress The number of files that are currently being processed. for example: ''null''
 * @param completed The number of files that have been successfully processed. for example: ''null''
 * @param failed The number of files that have failed to process. for example: ''null''
 * @param cancelled The number of files that were cancelled. for example: ''null''
 * @param total The total number of files. for example: ''null''
*/
final case class VectorStoreObjectFileCounts (
  inProgress: Int,
  completed: Int,
  failed: Int,
  cancelled: Int,
  total: Int
)

