goog.provide('API.Client.ImagesResponse');

/**
 * @record
 */
API.Client.ImagesResponse = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ImagesResponse.prototype.created;

/**
 * @type {!Array<!API.Client.Image>}
 * @export
 */
API.Client.ImagesResponse.prototype.data;

