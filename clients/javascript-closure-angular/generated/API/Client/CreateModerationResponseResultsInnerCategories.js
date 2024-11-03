goog.provide('API.Client.CreateModerationResponse_results_inner_categories');

/**
 * A list of the categories, and whether they are flagged or not.
 * @record
 */
API.Client.CreateModerationResponseResultsInnerCategories = function() {}

/**
 * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.hate;

/**
 * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.hateThreatening;

/**
 * Content that expresses, incites, or promotes harassing language towards any target.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.harassment;

/**
 * Harassment content that also includes violence or serious harm towards any target.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.harassmentThreatening;

/**
 * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.selfHarm;

/**
 * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.selfHarmIntent;

/**
 * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.selfHarmInstructions;

/**
 * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.sexual;

/**
 * Sexual content that includes an individual who is under 18 years old.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.sexualMinors;

/**
 * Content that depicts death, violence, or physical injury.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.violence;

/**
 * Content that depicts death, violence, or physical injury in graphic detail.
 * @type {!boolean}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategories.prototype.violenceGraphic;

