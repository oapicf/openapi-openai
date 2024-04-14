package org.openapitools.server.model


/**
 * The delta containing the fields that have changed on the run step.
 *
 * @param stepDetails  for example: ''null''
*/
final case class RunStepDeltaObjectDelta (
  stepDetails: Option[RunStepDeltaObjectDeltaStepDetails] = None
)

