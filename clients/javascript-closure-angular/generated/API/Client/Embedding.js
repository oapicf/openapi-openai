goog.provide('API.Client.Embedding');

/**
 * Represents an embedding vector returned by embedding endpoint. 
 * @record
 */
API.Client.Embedding = function() {}

/**
 * The index of the embedding in the list of embeddings.
 * @type {!number}
 * @export
 */
API.Client.Embedding.prototype.index;

/**
 * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
 * @type {!Array<!number>}
 * @export
 */
API.Client.Embedding.prototype.embedding;

/**
 * The object type, which is always \"embedding\".
 * @type {!string}
 * @export
 */
API.Client.Embedding.prototype.object;

/** @enum {string} */
API.Client.Embedding.ObjectEnum = { 
  embedding: 'embedding',
}
