goog.provide('API.Client.UsageCodeInterpreterSessionsResult');

/**
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 * @record
 */
API.Client.UsageCodeInterpreterSessionsResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageCodeInterpreterSessionsResult.prototype.object;

/**
 * The number of code interpreter sessions.
 * @type {!number}
 * @export
 */
API.Client.UsageCodeInterpreterSessionsResult.prototype.sessions;

/**
 * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageCodeInterpreterSessionsResult.prototype.projectId;

/** @enum {string} */
API.Client.UsageCodeInterpreterSessionsResult.ObjectEnum = { 
  organization.usage.code_interpreter_sessions.result: 'organization.usage.code_interpreter_sessions.result',
}
