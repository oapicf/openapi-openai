goog.provide('API.Client.UsageVectorStoresResult');

/**
 * The aggregated vector stores usage details of the specific time bucket.
 * @record
 */
API.Client.UsageVectorStoresResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageVectorStoresResult.prototype.object;

/**
 * The vector stores usage in bytes.
 * @type {!number}
 * @export
 */
API.Client.UsageVectorStoresResult.prototype.usageBytes;

/**
 * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageVectorStoresResult.prototype.projectId;

/** @enum {string} */
API.Client.UsageVectorStoresResult.ObjectEnum = { 
  organization.usage.vector_stores.result: 'organization.usage.vector_stores.result',
}
