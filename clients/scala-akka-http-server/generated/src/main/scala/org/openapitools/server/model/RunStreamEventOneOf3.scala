package org.openapitools.server.model


/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStreamEventOneOf3 (
  event: String,
  data: RunObject
)

