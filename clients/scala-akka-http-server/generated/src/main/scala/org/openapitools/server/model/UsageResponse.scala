package org.openapitools.server.model


/**
 * @param `object`  for example: ''null''
 * @param data  for example: ''null''
 * @param hasMore  for example: ''null''
 * @param nextPage  for example: ''null''
*/
final case class UsageResponse (
  `object`: String,
  data: Seq[UsageTimeBucket],
  hasMore: Boolean,
  nextPage: String
)

