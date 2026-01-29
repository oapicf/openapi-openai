package org.openapitools.server.model


/**
 * Occurs when a stream ends.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class DoneEvent (
  event: String,
  data: String
)

