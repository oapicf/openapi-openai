goog.provide('API.Client.PredictionContent');

/**
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 * @record
 */
API.Client.PredictionContent = function() {}

/**
 * The type of the predicted content you want to provide. This type is currently always `content`. 
 * @type {!string}
 * @export
 */
API.Client.PredictionContent.prototype.type;

/**
 * @type {!API.Client.PredictionContent_content}
 * @export
 */
API.Client.PredictionContent.prototype.content;

/** @enum {string} */
API.Client.PredictionContent.TypeEnum = { 
  content: 'content',
}
