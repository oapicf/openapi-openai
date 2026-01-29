package org.openapitools.server.model


/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStreamEventOneOf1 (
  event: String,
  data: RunObject
)

