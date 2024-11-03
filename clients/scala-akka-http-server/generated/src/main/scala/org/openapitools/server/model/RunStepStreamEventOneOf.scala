package org.openapitools.server.model


/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is created.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStepStreamEventOneOf (
  event: String,
  data: RunStepObject
)

