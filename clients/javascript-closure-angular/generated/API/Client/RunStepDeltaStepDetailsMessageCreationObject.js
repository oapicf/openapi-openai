goog.provide('API.Client.RunStepDeltaStepDetailsMessageCreationObject');

/**
 * Details of the message creation by the run step.
 * @record
 */
API.Client.RunStepDeltaStepDetailsMessageCreationObject = function() {}

/**
 * Always `message_creation`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsMessageCreationObject.prototype.type;

/**
 * @type {!API.Client.RunStepDeltaStepDetailsMessageCreationObject_message_creation}
 * @export
 */
API.Client.RunStepDeltaStepDetailsMessageCreationObject.prototype.messageCreation;

/** @enum {string} */
API.Client.RunStepDeltaStepDetailsMessageCreationObject.TypeEnum = { 
  message_creation: 'message_creation',
}
