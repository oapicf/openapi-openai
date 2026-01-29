goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject');

/**
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject = function() {}

/**
 * The index of the output in the outputs array.
 * @type {!number}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.prototype.index;

/**
 * Always `image`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.prototype.type;

/**
 * @type {!API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.prototype.image;

/** @enum {string} */
API.Client.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.TypeEnum = { 
  image: 'image',
}
