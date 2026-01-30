goog.provide('API.Client.CreateEmbeddingRequest');

/**
 * @record
 */
API.Client.CreateEmbeddingRequest = function() {}

/**
 * @type {!API.Client.CreateEmbeddingRequest_input}
 * @export
 */
API.Client.CreateEmbeddingRequest.prototype.input;

/**
 * @type {!API.Client.CreateEmbeddingRequest_model}
 * @export
 */
API.Client.CreateEmbeddingRequest.prototype.model;

/**
 * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
 * @type {!string}
 * @export
 */
API.Client.CreateEmbeddingRequest.prototype.encodingFormat;

/**
 * The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
 * @type {!number}
 * @export
 */
API.Client.CreateEmbeddingRequest.prototype.dimensions;

/**
 * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
 * @type {!string}
 * @export
 */
API.Client.CreateEmbeddingRequest.prototype.user;

/** @enum {string} */
API.Client.CreateEmbeddingRequest.EncodingFormatEnum = { 
  float: 'float',
  base64: 'base64',
}
