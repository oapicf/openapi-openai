package org.openapitools.server.model


/**
 * @param event  for example: ''null''
 * @param data  for example: ''null''
*/
final case class RunStepStreamEvent (
  event: String,
  data: RunStepObject
)

