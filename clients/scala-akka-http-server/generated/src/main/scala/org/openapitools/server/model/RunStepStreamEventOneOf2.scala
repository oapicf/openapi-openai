package org.openapitools.server.model


/**
 * Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
 *
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStepStreamEventOneOf2 (
  event: String,
  data: RunStepDeltaObject
)

