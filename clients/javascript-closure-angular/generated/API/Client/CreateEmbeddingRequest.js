goog.provide('API.Client.CreateEmbeddingRequest');

/**
 * @record
 */
API.Client.CreateEmbeddingRequest = function() {}

/**
 * @type {!API.Client.CreateEmbeddingRequest_model}
 * @export
 */
API.Client.CreateEmbeddingRequest.prototype.model;

/**
 * @type {!API.Client.CreateEmbeddingRequest_input}
 * @export
 */
API.Client.CreateEmbeddingRequest.prototype.input;

/**
 * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * @type {!string}
 * @export
 */
API.Client.CreateEmbeddingRequest.prototype.user;

