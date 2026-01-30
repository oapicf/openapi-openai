package org.openapitools.server.model


/**
 * The request counts for different statuses within the batch.
 *
 * @param total Total number of requests in the batch. for example: ''null''
 * @param completed Number of requests that have been completed successfully. for example: ''null''
 * @param failed Number of requests that have failed. for example: ''null''
*/
final case class BatchRequestCounts (
  total: Int,
  completed: Int,
  failed: Int
)

