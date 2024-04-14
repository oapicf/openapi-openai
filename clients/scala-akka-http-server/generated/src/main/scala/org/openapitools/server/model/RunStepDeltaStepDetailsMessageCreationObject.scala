package org.openapitools.server.model


/**
 * = Message creation =
 *
 * Details of the message creation by the run step.
 *
 * @param `type` Always `message_creation`. for example: ''null''
 * @param messageCreation  for example: ''null''
*/
final case class RunStepDeltaStepDetailsMessageCreationObject (
  `type`: String,
  messageCreation: Option[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = None
)

