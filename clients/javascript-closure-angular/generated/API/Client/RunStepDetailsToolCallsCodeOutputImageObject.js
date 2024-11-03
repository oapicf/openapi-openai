goog.provide('API.Client.RunStepDetailsToolCallsCodeOutputImageObject');

/**
 * @record
 */
API.Client.RunStepDetailsToolCallsCodeOutputImageObject = function() {}

/**
 * Always `image`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeOutputImageObject.prototype.type;

/**
 * @type {!API.Client.RunStepDetailsToolCallsCodeOutputImageObject_image}
 * @export
 */
API.Client.RunStepDetailsToolCallsCodeOutputImageObject.prototype.image;

/** @enum {string} */
API.Client.RunStepDetailsToolCallsCodeOutputImageObject.TypeEnum = { 
  image: 'image',
}
