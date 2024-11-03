package org.openapitools.server.model


/**
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStreamEventOneOf (
  event: String,
  data: RunObject
)

