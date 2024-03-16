package org.openapitools.server.model


/**
 * @param `object`  for example: ''null''
 * @param data  for example: ''null''
*/
final case class ListFineTuneEventsResponse (
  `object`: String,
  data: Seq[FineTuneEvent]
)

