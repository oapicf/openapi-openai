package org.openapitools.server.model


/**
 * Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStreamEventOneOf8 (
  event: String,
  data: RunObject
)

