goog.provide('API.Client.CostsResult');

/**
 * The aggregated costs details of the specific time bucket.
 * @record
 */
API.Client.CostsResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CostsResult.prototype.object;

/**
 * @type {!API.Client.CostsResult_amount}
 * @export
 */
API.Client.CostsResult.prototype.amount;

/**
 * When `group_by=line_item`, this field provides the line item of the grouped costs result.
 * @type {!string}
 * @export
 */
API.Client.CostsResult.prototype.lineItem;

/**
 * When `group_by=project_id`, this field provides the project ID of the grouped costs result.
 * @type {!string}
 * @export
 */
API.Client.CostsResult.prototype.projectId;

/** @enum {string} */
API.Client.CostsResult.ObjectEnum = { 
  organization.costs.result: 'organization.costs.result',
}
