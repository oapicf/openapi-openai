goog.provide('API.Client.VectorStoreFileObject_last_error');

/**
 * The last error associated with this vector store file. Will be `null` if there are no errors.
 * @record
 */
API.Client.VectorStoreFileObjectLastError = function() {}

/**
 * One of `server_error` or `rate_limit_exceeded`.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileObjectLastError.prototype.code;

/**
 * A human-readable description of the error.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreFileObjectLastError.prototype.message;

/** @enum {string} */
API.Client.VectorStoreFileObjectLastError.CodeEnum = { 
  server_error: 'server_error',
  unsupported_file: 'unsupported_file',
  invalid_file: 'invalid_file',
}
