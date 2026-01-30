goog.provide('API.Client.CostsResult_amount');

/**
 * The monetary value in its associated currency.
 * @record
 */
API.Client.CostsResultAmount = function() {}

/**
 * The numeric value of the cost.
 * @type {!number}
 * @export
 */
API.Client.CostsResultAmount.prototype.value;

/**
 * Lowercase ISO-4217 currency e.g. \"usd\"
 * @type {!string}
 * @export
 */
API.Client.CostsResultAmount.prototype.currency;

