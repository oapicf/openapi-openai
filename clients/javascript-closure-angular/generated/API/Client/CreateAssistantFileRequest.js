goog.provide('API.Client.CreateAssistantFileRequest');

/**
 * @record
 */
API.Client.CreateAssistantFileRequest = function() {}

/**
 * A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
 * @type {!string}
 * @export
 */
API.Client.CreateAssistantFileRequest.prototype.fileId;

