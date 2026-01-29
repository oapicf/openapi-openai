package org.openapitools.server.model


/**
 * = Run step delta object =
 *
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 *
 * @param id The identifier of the run step, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `thread.run.step.delta`. for example: ''null''
 * @param delta  for example: ''null''
*/
final case class RunStepDeltaObject (
  id: String,
  `object`: String,
  delta: RunStepDeltaObjectDelta
)

