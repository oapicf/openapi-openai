goog.provide('API.Client.CreateModerationResponse_results_inner_category_scores');

/**
 * A list of the categories along with their scores as predicted by model.
 * @record
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores = function() {}

/**
 * The score for the category 'hate'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.hate;

/**
 * The score for the category 'hate/threatening'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.hateThreatening;

/**
 * The score for the category 'harassment'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.harassment;

/**
 * The score for the category 'harassment/threatening'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.harassmentThreatening;

/**
 * The score for the category 'illicit'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.illicit;

/**
 * The score for the category 'illicit/violent'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.illicitViolent;

/**
 * The score for the category 'self-harm'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.selfHarm;

/**
 * The score for the category 'self-harm/intent'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.selfHarmIntent;

/**
 * The score for the category 'self-harm/instructions'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.selfHarmInstructions;

/**
 * The score for the category 'sexual'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.sexual;

/**
 * The score for the category 'sexual/minors'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.sexualMinors;

/**
 * The score for the category 'violence'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.violence;

/**
 * The score for the category 'violence/graphic'.
 * @type {!number}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryScores.prototype.violenceGraphic;

