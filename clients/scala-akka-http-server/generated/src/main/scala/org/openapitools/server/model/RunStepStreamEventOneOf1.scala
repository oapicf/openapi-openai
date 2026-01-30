package org.openapitools.server.model


/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an `in_progress` state.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStepStreamEventOneOf1 (
  event: String,
  data: RunStepObject
)

