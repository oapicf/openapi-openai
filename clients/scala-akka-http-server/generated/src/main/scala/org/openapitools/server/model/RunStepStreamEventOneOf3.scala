package org.openapitools.server.model


/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) is completed.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStepStreamEventOneOf3 (
  event: String,
  data: RunStepObject
)

