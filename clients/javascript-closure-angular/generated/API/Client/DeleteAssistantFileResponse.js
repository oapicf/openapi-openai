goog.provide('API.Client.DeleteAssistantFileResponse');

/**
 * Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
 * @record
 */
API.Client.DeleteAssistantFileResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteAssistantFileResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.DeleteAssistantFileResponse.prototype.deleted;

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteAssistantFileResponse.prototype.object;

/** @enum {string} */
API.Client.DeleteAssistantFileResponse.ObjectEnum = { 
  assistant.file.deleted: 'assistant.file.deleted',
}
