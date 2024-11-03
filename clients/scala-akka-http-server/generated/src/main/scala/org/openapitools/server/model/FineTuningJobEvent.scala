package org.openapitools.server.model


/**
 * Fine-tuning job event object
 *
 * @param id  for example: ''null''
 * @param createdAt  for example: ''null''
 * @param level  for example: ''null''
 * @param message  for example: ''null''
 * @param `object`  for example: ''null''
*/
final case class FineTuningJobEvent (
  id: String,
  createdAt: Int,
  level: String,
  message: String,
  `object`: String
)

