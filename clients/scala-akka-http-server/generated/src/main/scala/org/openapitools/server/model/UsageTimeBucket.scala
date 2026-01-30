package org.openapitools.server.model


/**
 * @param `object`  for example: ''null''
 * @param startTime  for example: ''null''
 * @param endTime  for example: ''null''
 * @param result  for example: ''null''
*/
final case class UsageTimeBucket (
  `object`: String,
  startTime: Int,
  endTime: Int,
  result: Seq[UsageTimeBucketResultInner]
)

