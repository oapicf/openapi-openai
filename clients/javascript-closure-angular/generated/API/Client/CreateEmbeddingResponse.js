goog.provide('API.Client.CreateEmbeddingResponse');

/**
 * @record
 */
API.Client.CreateEmbeddingResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CreateEmbeddingResponse.prototype.object;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateEmbeddingResponse.prototype.model;

/**
 * @type {!Array<!API.Client.CreateEmbeddingResponse_data_inner>}
 * @export
 */
API.Client.CreateEmbeddingResponse.prototype.data;

/**
 * @type {!API.Client.CreateEmbeddingResponse_usage}
 * @export
 */
API.Client.CreateEmbeddingResponse.prototype.usage;

