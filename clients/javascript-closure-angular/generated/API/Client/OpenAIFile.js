goog.provide('API.Client.OpenAIFile');

/**
 * The `File` object represents a document that has been uploaded to OpenAI.
 * @record
 */
API.Client.OpenAIFile = function() {}

/**
 * The file identifier, which can be referenced in the API endpoints.
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.id;

/**
 * The size of the file, in bytes.
 * @type {!number}
 * @export
 */
API.Client.OpenAIFile.prototype.bytes;

/**
 * The Unix timestamp (in seconds) for when the file was created.
 * @type {!number}
 * @export
 */
API.Client.OpenAIFile.prototype.createdAt;

/**
 * The name of the file.
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.filename;

/**
 * The object type, which is always `file`.
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.object;

/**
 * The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.purpose;

/**
 * Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.status;

/**
 * Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.statusDetails;

/** @enum {string} */
API.Client.OpenAIFile.ObjectEnum = { 
  file: 'file',
}
/** @enum {string} */
API.Client.OpenAIFile.PurposeEnum = { 
  fine-tune: 'fine-tune',
  fine-tune-results: 'fine-tune-results',
  assistants: 'assistants',
  assistants_output: 'assistants_output',
}
/** @enum {string} */
API.Client.OpenAIFile.StatusEnum = { 
  uploaded: 'uploaded',
  processed: 'processed',
  error: 'error',
}
