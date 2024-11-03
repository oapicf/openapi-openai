package org.openapitools.server.model


/**
 * @param `object`  for example: ''list''
 * @param data  for example: ''null''
 * @param firstId  for example: ''step_abc123''
 * @param lastId  for example: ''step_abc456''
 * @param hasMore  for example: ''false''
*/
final case class ListRunStepsResponse (
  `object`: String,
  data: Seq[RunStepObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

