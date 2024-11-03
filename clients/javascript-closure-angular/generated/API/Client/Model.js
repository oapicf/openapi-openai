goog.provide('API.Client.Model');

/**
 * Describes an OpenAI model offering that can be used with the API.
 * @record
 */
API.Client.Model = function() {}

/**
 * The model identifier, which can be referenced in the API endpoints.
 * @type {!string}
 * @export
 */
API.Client.Model.prototype.id;

/**
 * The Unix timestamp (in seconds) when the model was created.
 * @type {!number}
 * @export
 */
API.Client.Model.prototype.created;

/**
 * The object type, which is always \"model\".
 * @type {!string}
 * @export
 */
API.Client.Model.prototype.object;

/**
 * The organization that owns the model.
 * @type {!string}
 * @export
 */
API.Client.Model.prototype.ownedBy;

/** @enum {string} */
API.Client.Model.ObjectEnum = { 
  model: 'model',
}
