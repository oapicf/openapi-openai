package org.openapitools.server.model


/**
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStreamEventOneOf5 (
  event: String,
  data: RunObject
)

