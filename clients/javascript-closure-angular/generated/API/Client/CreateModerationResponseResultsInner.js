goog.provide('API.Client.CreateModerationResponse_results_inner');

/**
 * @record
 */
API.Client.CreateModerationResponseResultsInner = function() {}

/**
 * Whether any of the below categories are flagged.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInner.prototype.flagged;

/**
 * @type {!API.Client.CreateModerationResponse_results_inner_categories}
 * @export
 */
API.Client.CreateModerationResponseResultsInner.prototype.categories;

/**
 * @type {!API.Client.CreateModerationResponse_results_inner_category_scores}
 * @export
 */
API.Client.CreateModerationResponseResultsInner.prototype.categoryScores;

