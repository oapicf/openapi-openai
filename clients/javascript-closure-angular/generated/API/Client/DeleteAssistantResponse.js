goog.provide('API.Client.DeleteAssistantResponse');

/**
 * @record
 */
API.Client.DeleteAssistantResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteAssistantResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.DeleteAssistantResponse.prototype.deleted;

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteAssistantResponse.prototype.object;

/** @enum {string} */
API.Client.DeleteAssistantResponse.ObjectEnum = { 
  assistant.deleted: 'assistant.deleted',
}
