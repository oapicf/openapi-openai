package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param `object`  for example: ''null''
 * @param firstId  for example: ''null''
 * @param lastId  for example: ''null''
 * @param hasMore  for example: ''null''
*/
final case class ListFineTuningJobCheckpointsResponse (
  data: Seq[FineTuningJobCheckpoint],
  `object`: String,
  firstId: Option[String] = None,
  lastId: Option[String] = None,
  hasMore: Boolean
)

