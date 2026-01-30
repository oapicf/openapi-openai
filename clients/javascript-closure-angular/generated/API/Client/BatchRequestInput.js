goog.provide('API.Client.BatchRequestInput');

/**
 * The per-line object of the batch input file
 * @record
 */
API.Client.BatchRequestInput = function() {}

/**
 * A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
 * @type {!string}
 * @export
 */
API.Client.BatchRequestInput.prototype.customId;

/**
 * The HTTP method to be used for the request. Currently only `POST` is supported.
 * @type {!string}
 * @export
 */
API.Client.BatchRequestInput.prototype.method;

/**
 * The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
 * @type {!string}
 * @export
 */
API.Client.BatchRequestInput.prototype.url;

/** @enum {string} */
API.Client.BatchRequestInput.MethodEnum = { 
  POST: 'POST',
}
