goog.provide('API.Client.CreateModerationResponse_results_inner_category_applied_input_types');

/**
 * A list of the categories along with the input type(s) that the score applies to.
 * @record
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes = function() {}

/**
 * The applied input type(s) for the category 'hate'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.hate;

/**
 * The applied input type(s) for the category 'hate/threatening'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.hateThreatening;

/**
 * The applied input type(s) for the category 'harassment'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.harassment;

/**
 * The applied input type(s) for the category 'harassment/threatening'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.harassmentThreatening;

/**
 * The applied input type(s) for the category 'illicit'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.illicit;

/**
 * The applied input type(s) for the category 'illicit/violent'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.illicitViolent;

/**
 * The applied input type(s) for the category 'self-harm'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.selfHarm;

/**
 * The applied input type(s) for the category 'self-harm/intent'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.selfHarmIntent;

/**
 * The applied input type(s) for the category 'self-harm/instructions'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.selfHarmInstructions;

/**
 * The applied input type(s) for the category 'sexual'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.sexual;

/**
 * The applied input type(s) for the category 'sexual/minors'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.sexualMinors;

/**
 * The applied input type(s) for the category 'violence'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.violence;

/**
 * The applied input type(s) for the category 'violence/graphic'.
 * @type {!Array<!string>}
 * @export
 */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.prototype.violenceGraphic;

/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!HateEnum&gt; = { 
  text: 'text',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!HateThreateningEnum&gt; = { 
  text: 'text',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!HarassmentEnum&gt; = { 
  text: 'text',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!HarassmentThreateningEnum&gt; = { 
  text: 'text',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!IllicitEnum&gt; = { 
  text: 'text',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!IllicitViolentEnum&gt; = { 
  text: 'text',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!SelfHarmEnum&gt; = { 
  text: 'text',
  image: 'image',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!SelfHarmIntentEnum&gt; = { 
  text: 'text',
  image: 'image',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!SelfHarmInstructionsEnum&gt; = { 
  text: 'text',
  image: 'image',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!SexualEnum&gt; = { 
  text: 'text',
  image: 'image',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!SexualMinorsEnum&gt; = { 
  text: 'text',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!ViolenceEnum&gt; = { 
  text: 'text',
  image: 'image',
}
/** @enum {string} */
API.Client.CreateModerationResponseResultsInnerCategoryAppliedInputTypes.Array&lt;!ViolenceGraphicEnum&gt; = { 
  text: 'text',
  image: 'image',
}
