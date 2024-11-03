package org.openapitools.server.model


/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStreamEventOneOf2 (
  event: String,
  data: RunObject
)

