goog.provide('API.Client.MessageObject_incomplete_details');

/**
 * On an incomplete message, details about why the message is incomplete.
 * @record
 */
API.Client.MessageObjectIncompleteDetails = function() {}

/**
 * The reason the message is incomplete.
 * @type {!string}
 * @export
 */
API.Client.MessageObjectIncompleteDetails.prototype.reason;

/** @enum {string} */
API.Client.MessageObjectIncompleteDetails.ReasonEnum = { 
  content_filter: 'content_filter',
  max_tokens: 'max_tokens',
  run_cancelled: 'run_cancelled',
  run_expired: 'run_expired',
  run_failed: 'run_failed',
}
