package org.openapitools.server.model


/**
 * = FineTuneEvent =
 *
 * @param `object`  for example: ''null''
 * @param createdAt  for example: ''null''
 * @param level  for example: ''null''
 * @param message  for example: ''null''
*/
final case class FineTuneEvent (
  `object`: String,
  createdAt: Int,
  level: String,
  message: String
)

