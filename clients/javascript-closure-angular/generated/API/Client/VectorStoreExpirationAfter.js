goog.provide('API.Client.VectorStoreExpirationAfter');

/**
 * The expiration policy for a vector store.
 * @record
 */
API.Client.VectorStoreExpirationAfter = function() {}

/**
 * Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
 * @type {!string}
 * @export
 */
API.Client.VectorStoreExpirationAfter.prototype.anchor;

/**
 * The number of days after the anchor time that the vector store will expire.
 * @type {!number}
 * @export
 */
API.Client.VectorStoreExpirationAfter.prototype.days;

/** @enum {string} */
API.Client.VectorStoreExpirationAfter.AnchorEnum = { 
  last_active_at: 'last_active_at',
}
