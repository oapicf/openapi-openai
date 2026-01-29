goog.provide('API.Client.RunStepDetailsMessageCreationObject');

/**
 * Details of the message creation by the run step.
 * @record
 */
API.Client.RunStepDetailsMessageCreationObject = function() {}

/**
 * Always `message_creation`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsMessageCreationObject.prototype.type;

/**
 * @type {!API.Client.RunStepDetailsMessageCreationObject_message_creation}
 * @export
 */
API.Client.RunStepDetailsMessageCreationObject.prototype.messageCreation;

/** @enum {string} */
API.Client.RunStepDetailsMessageCreationObject.TypeEnum = { 
  message_creation: 'message_creation',
}
