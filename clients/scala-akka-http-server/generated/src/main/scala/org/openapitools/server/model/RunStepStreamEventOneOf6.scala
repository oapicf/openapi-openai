package org.openapitools.server.model


/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) expires.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStepStreamEventOneOf6 (
  event: String,
  data: RunStepObject
)

