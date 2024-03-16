goog.provide('API.Client.CreateEditRequest');

/**
 * @record
 */
API.Client.CreateEditRequest = function() {}

/**
 * @type {!API.Client.CreateEditRequest_model}
 * @export
 */
API.Client.CreateEditRequest.prototype.model;

/**
 * The input text to use as a starting point for the edit.
 * @type {!string}
 * @export
 */
API.Client.CreateEditRequest.prototype.input;

/**
 * The instruction that tells the model how to edit the prompt.
 * @type {!string}
 * @export
 */
API.Client.CreateEditRequest.prototype.instruction;

/**
 * How many edits to generate for the input and instruction.
 * @type {!number}
 * @export
 */
API.Client.CreateEditRequest.prototype.n;

/**
 * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
 * @type {!number}
 * @export
 */
API.Client.CreateEditRequest.prototype.temperature;

/**
 * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
 * @type {!number}
 * @export
 */
API.Client.CreateEditRequest.prototype.topP;

