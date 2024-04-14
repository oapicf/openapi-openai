package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param hasMore  for example: ''null''
 * @param `object`  for example: ''null''
*/
final case class ListPaginatedFineTuningJobsResponse (
  data: Seq[FineTuningJob],
  hasMore: Boolean,
  `object`: String
)

