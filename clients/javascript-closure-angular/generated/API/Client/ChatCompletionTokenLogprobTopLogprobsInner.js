goog.provide('API.Client.ChatCompletionTokenLogprob_top_logprobs_inner');

/**
 * @record
 */
API.Client.ChatCompletionTokenLogprobTopLogprobsInner = function() {}

/**
 * The token.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionTokenLogprobTopLogprobsInner.prototype.token;

/**
 * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
 * @type {!number}
 * @export
 */
API.Client.ChatCompletionTokenLogprobTopLogprobsInner.prototype.logprob;

/**
 * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
 * @type {!Array<!number>}
 * @export
 */
API.Client.ChatCompletionTokenLogprobTopLogprobsInner.prototype.bytes;

