package org.openapitools.server.model


/**
 * Occurs when a [run](/docs/api-reference/runs/object) is completed.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStreamEventOneOf4 (
  event: String,
  data: RunObject
)

