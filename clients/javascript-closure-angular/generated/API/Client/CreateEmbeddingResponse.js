goog.provide('API.Client.CreateEmbeddingResponse');

/**
 * @record
 */
API.Client.CreateEmbeddingResponse = function() {}

/**
 * The list of embeddings generated by the model.
 * @type {!Array<!API.Client.Embedding>}
 * @export
 */
API.Client.CreateEmbeddingResponse.prototype.data;

/**
 * The name of the model used to generate the embedding.
 * @type {!string}
 * @export
 */
API.Client.CreateEmbeddingResponse.prototype.model;

/**
 * The object type, which is always \"list\".
 * @type {!string}
 * @export
 */
API.Client.CreateEmbeddingResponse.prototype.object;

/**
 * @type {!API.Client.CreateEmbeddingResponse_usage}
 * @export
 */
API.Client.CreateEmbeddingResponse.prototype.usage;

/** @enum {string} */
API.Client.CreateEmbeddingResponse.ObjectEnum = { 
  list: 'list',
}