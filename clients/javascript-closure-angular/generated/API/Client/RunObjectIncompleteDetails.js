goog.provide('API.Client.RunObject_incomplete_details');

/**
 * Details on why the run is incomplete. Will be `null` if the run is not incomplete.
 * @record
 */
API.Client.RunObjectIncompleteDetails = function() {}

/**
 * The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
 * @type {!string}
 * @export
 */
API.Client.RunObjectIncompleteDetails.prototype.reason;

/** @enum {string} */
API.Client.RunObjectIncompleteDetails.ReasonEnum = { 
  max_completion_tokens: 'max_completion_tokens',
  max_prompt_tokens: 'max_prompt_tokens',
}
